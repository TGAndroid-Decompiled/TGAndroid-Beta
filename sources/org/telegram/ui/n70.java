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
public final class n70 extends org.telegram.ui.Components.im0 {
    public final Context f39446c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f39447f;
    public boolean h;
    public final r70 f39448n;

    public n70(r70 r70Var, Context context) {
        this.f39448n = r70Var;
        this.f39446c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45920a;
        if (view instanceof org.telegram.ui.Cells.o4) {
            ((org.telegram.ui.Cells.o4) view).f22726a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45923f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f39447f;
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
        this.f39447f = timer2;
        timer2.schedule(new m70(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f39448n.f41084w.size() + 2;
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
        r70 r70Var = this.f39448n;
        n70 n70Var = r70Var.f41083s;
        if (n70Var != null && !r70Var.E) {
            int h = n70Var.h();
            org.telegram.ui.Components.tx0 tx0Var = r70Var.f41082r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            tx0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (b1Var.f45923f == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) b1Var.f45920a;
            boolean z10 = this.h;
            r70 r70Var = this.f39448n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) r70Var.f41084w.get(i10 - 2);
                charSequence = null;
            }
            o4Var.f22729f = contact;
            o4Var.h = charSequence;
            o4Var.a();
            boolean containsKey = r70Var.F.containsKey(contact.key);
            org.telegram.ui.Components.xp xpVar = o4Var.e;
            if (xpVar != null) {
                xpVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.q8 q8Var;
        Context context = this.f39446c;
        if (i10 == 1) {
            org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context);
            int i11 = org.telegram.ui.ActionBar.h6.G6;
            q8Var2.e(i11, i11);
            q8Var2.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            q8Var = q8Var2;
        } else if (i10 == 2) {
            q8Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
        } else {
            q8Var = new org.telegram.ui.Cells.o4(context, true);
        }
        return new s4.b1(q8Var);
    }
}
