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
public final class h80 extends org.telegram.ui.Components.pm0 {
    public final Context f38224c;
    public ArrayList d = new ArrayList();
    public ArrayList f38225e = new ArrayList();
    public Timer f38226f;
    public boolean h;
    public final l80 f38227n;

    public h80(l80 l80Var, Context context) {
        this.f38227n = l80Var;
        this.f38224c = context;
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47656a;
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).f22651a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47660f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f38226f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (str == null) {
            this.d.clear();
            this.f38225e.clear();
            l();
            return;
        }
        Timer timer2 = new Timer();
        this.f38226f = timer2;
        timer2.schedule(new g80(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f38227n.f39468w.size() + 2;
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
        l80 l80Var = this.f38227n;
        h80 h80Var = l80Var.f39467s;
        if (h80Var != null && !l80Var.E) {
            int h = h80Var.h();
            org.telegram.ui.Components.ay0 ay0Var = l80Var.f39466r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ay0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (d1Var.f47660f == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) d1Var.f47656a;
            boolean z10 = this.h;
            l80 l80Var = this.f38227n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.f38225e.get(i10);
            } else {
                contact = (ContactsController.Contact) l80Var.f39468w.get(i10 - 2);
                charSequence = null;
            }
            p4Var.f22655f = contact;
            p4Var.h = charSequence;
            p4Var.a();
            boolean containsKey = l80Var.F.containsKey(contact.key);
            org.telegram.ui.Components.dq dqVar = p4Var.f22654e;
            if (dqVar != null) {
                dqVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        Context context = this.f38224c;
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
        return new s4.d1(r8Var);
    }
}
