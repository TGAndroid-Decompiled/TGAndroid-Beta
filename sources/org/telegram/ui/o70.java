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
public final class o70 extends org.telegram.ui.Components.il0 {
    public final Context f40994c;
    public ArrayList d = new ArrayList();
    public ArrayList f40995e = new ArrayList();
    public Timer f40996f;
    public boolean h;
    public final s70 f40997n;

    public o70(s70 s70Var, Context context) {
        this.f40997n = s70Var;
        this.f40994c = context;
    }

    @Override
    public final void A(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.n4) {
            ((org.telegram.ui.Cells.n4) view).f24745a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f40996f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (str == null) {
            this.d.clear();
            this.f40995e.clear();
            l();
            return;
        }
        Timer timer2 = new Timer();
        this.f40996f = timer2;
        timer2.schedule(new n70(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f40997n.f42301w.size() + 2;
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
        s70 s70Var = this.f40997n;
        o70 o70Var = s70Var.f42300s;
        if (o70Var != null && !s70Var.A) {
            int h = o70Var.h();
            org.telegram.ui.Components.qw0 qw0Var = s70Var.f42299r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            qw0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (n1Var.f6436f == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) n1Var.f6432a;
            boolean z10 = this.h;
            s70 s70Var = this.f40997n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.f40995e.get(i10);
            } else {
                contact = (ContactsController.Contact) s70Var.f42301w.get(i10 - 2);
                charSequence = null;
            }
            n4Var.f24749f = contact;
            n4Var.h = charSequence;
            n4Var.a();
            boolean containsKey = s70Var.B.containsKey(contact.key);
            org.telegram.ui.Components.hp hpVar = n4Var.f24748e;
            if (hpVar != null) {
                hpVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        Context context = this.f40994c;
        if (i10 == 1) {
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context);
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            m8Var2.e(i11, i11);
            m8Var2.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            m8Var = m8Var2;
        } else if (i10 == 2) {
            m8Var = new org.telegram.ui.Cells.x6(context, (b) null);
        } else {
            m8Var = new org.telegram.ui.Cells.n4(context, true);
        }
        return new f2.n1(m8Var);
    }
}
