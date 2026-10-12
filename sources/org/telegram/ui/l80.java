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
public final class l80 extends org.telegram.ui.Components.lm0 {
    public final Context f37888c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f37889f;
    public boolean h;
    public final p80 f37890n;

    public l80(p80 p80Var, Context context) {
        this.f37890n = p80Var;
        this.f37888c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).f21697a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f37889f;
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
        this.f37889f = timer2;
        timer2.schedule(new k80(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f37890n.f39149w.size() + 2;
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
        p80 p80Var = this.f37890n;
        l80 l80Var = p80Var.f39148s;
        if (l80Var != null && !p80Var.E) {
            int h = l80Var.h();
            org.telegram.ui.Components.wx0 wx0Var = p80Var.f39147r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            wx0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (b1Var.f44841f == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) b1Var.f44838a;
            boolean z10 = this.h;
            p80 p80Var = this.f37890n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) p80Var.f39149w.get(i10 - 2);
                charSequence = null;
            }
            p4Var.f21700f = contact;
            p4Var.h = charSequence;
            p4Var.a();
            boolean containsKey = p80Var.F.containsKey(contact.key);
            org.telegram.ui.Components.aq aqVar = p4Var.e;
            if (aqVar != null) {
                aqVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        Context context = this.f37888c;
        if (i10 == 1) {
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            r8Var2.e(i11, i11);
            r8Var2.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            r8Var = r8Var2;
        } else if (i10 == 2) {
            r8Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
        } else {
            r8Var = new org.telegram.ui.Cells.p4(context, true);
        }
        return new s4.b1(r8Var);
    }
}
