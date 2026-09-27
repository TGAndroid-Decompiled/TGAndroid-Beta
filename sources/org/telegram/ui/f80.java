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
public final class f80 extends org.telegram.ui.Components.xl0 {
    public final Context f33453c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f33454f;
    public boolean h;
    public final j80 f33455n;

    public f80(j80 j80Var, Context context) {
        this.f33455n = j80Var;
        this.f33453c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f43005a;
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).f20812a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43008f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f33454f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            l();
            return;
        }
        Timer timer2 = new Timer();
        this.f33454f = timer2;
        timer2.schedule(new e80(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f33455n.f34665w.size() + 2;
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
        j80 j80Var = this.f33455n;
        f80 f80Var = j80Var.f34664s;
        if (f80Var != null && !j80Var.E) {
            int h = f80Var.h();
            org.telegram.ui.Components.kx0 kx0Var = j80Var.f34663r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            kx0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (c1Var.f43008f == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) c1Var.f43005a;
            boolean z10 = this.h;
            j80 j80Var = this.f33455n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) j80Var.f34665w.get(i10 - 2);
                charSequence = null;
            }
            p4Var.f20815f = contact;
            p4Var.h = charSequence;
            p4Var.a();
            boolean containsKey = j80Var.F.containsKey(contact.key);
            org.telegram.ui.Components.pp ppVar = p4Var.e;
            if (ppVar != null) {
                ppVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        Context context = this.f33453c;
        if (i10 == 1) {
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            int i11 = org.telegram.ui.ActionBar.i6.G6;
            r8Var2.e(i11, i11);
            r8Var2.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            r8Var = r8Var2;
        } else if (i10 == 2) {
            r8Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        } else {
            r8Var = new org.telegram.ui.Cells.p4(context, true);
        }
        return new s4.c1(r8Var);
    }
}
