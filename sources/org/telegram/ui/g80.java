package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g80 extends org.telegram.ui.Components.rm0 {
    public final Context f37984c;
    public ArrayList d = new ArrayList();
    public ArrayList f37985e = new ArrayList();
    public Timer f37986f;
    public boolean h;
    public final k80 f37987n;

    public g80(k80 k80Var, Context context) {
        this.f37987n = k80Var;
        this.f37984c = context;
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47748a;
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).f22643a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47752f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f37986f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (str == null) {
            this.d.clear();
            this.f37985e.clear();
            l();
            return;
        }
        Timer timer2 = new Timer();
        this.f37986f = timer2;
        timer2.schedule(new f80(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f37987n.f39230w.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (!this.h) {
            if (i10 == 0) {
                return 1;
            }
            if (i10 == 1) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void l() {
        int i10;
        super.l();
        k80 k80Var = this.f37987n;
        g80 g80Var = k80Var.f39229s;
        if (g80Var != null && !k80Var.E) {
            int h = g80Var.h();
            org.telegram.ui.Components.cy0 cy0Var = k80Var.f39228r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            cy0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (d1Var.f47752f == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) d1Var.f47748a;
            boolean z10 = this.h;
            k80 k80Var = this.f37987n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.f37985e.get(i10);
            } else {
                contact = (ContactsController.Contact) k80Var.f39230w.get(i10 - 2);
                charSequence = null;
            }
            p4Var.f22647f = contact;
            p4Var.h = charSequence;
            p4Var.a();
            boolean containsKey = k80Var.F.containsKey(contact.key);
            org.telegram.ui.Components.dq dqVar = p4Var.f22646e;
            if (dqVar != null) {
                dqVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        Context context = this.f37984c;
        if (i10 == 1) {
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            int i11 = org.telegram.ui.ActionBar.h6.G6;
            r8Var2.e(i11, i11);
            r8Var2.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            r8Var = r8Var2;
        } else if (i10 == 2) {
            r8Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        } else {
            r8Var = new org.telegram.ui.Cells.p4(context, true);
        }
        return new s4.d1(r8Var);
    }
}
