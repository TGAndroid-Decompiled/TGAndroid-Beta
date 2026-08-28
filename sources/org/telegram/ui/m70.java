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
public final class m70 extends org.telegram.ui.Components.vk0 {
    public final Context f40341c;
    public ArrayList d = new ArrayList();
    public ArrayList f40342e = new ArrayList();
    public Timer f40343f;
    public boolean h;
    public final q70 f40344n;

    public m70(q70 q70Var, Context context) {
        this.f40344n = q70Var;
        this.f40341c = context;
    }

    @Override
    public final void A(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).f24867a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f40343f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (str == null) {
            this.d.clear();
            this.f40342e.clear();
            l();
            return;
        }
        Timer timer2 = new Timer();
        this.f40343f = timer2;
        timer2.schedule(new l70(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f40344n.f41708w.size() + 2;
    }

    @Override
    public final int j(int i9) {
        if (!this.h) {
            if (i9 == 0) {
                return 1;
            }
            if (i9 == 1) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void l() {
        int i9;
        super.l();
        q70 q70Var = this.f40344n;
        m70 m70Var = q70Var.f41707s;
        if (m70Var != null && !q70Var.A) {
            int h = m70Var.h();
            org.telegram.ui.Components.gw0 gw0Var = q70Var.f41706r;
            if (h == 2) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            gw0Var.setVisibility(i9);
        }
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (q1Var.f5505f == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) q1Var.f5501a;
            boolean z10 = this.h;
            q70 q70Var = this.f40344n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i9);
                charSequence = (CharSequence) this.f40342e.get(i9);
            } else {
                contact = (ContactsController.Contact) q70Var.f41708w.get(i9 - 2);
                charSequence = null;
            }
            p4Var.f24871f = contact;
            p4Var.h = charSequence;
            p4Var.a();
            boolean containsKey = q70Var.B.containsKey(contact.key);
            org.telegram.ui.Components.dp dpVar = p4Var.f24870e;
            if (dpVar != null) {
                dpVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.p8 p8Var;
        Context context = this.f40341c;
        if (i9 == 1) {
            org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(context);
            int i10 = org.telegram.ui.ActionBar.f6.G6;
            p8Var2.e(i10, i10);
            p8Var2.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            p8Var = p8Var2;
        } else if (i9 == 2) {
            p8Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        } else {
            p8Var = new org.telegram.ui.Cells.p4(context, true);
        }
        return new f2.q1(p8Var);
    }
}
