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
public final class n70 extends org.telegram.ui.Components.hm0 {
    public final Context f39437c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f39438f;
    public boolean h;
    public final r70 f39439n;

    public n70(r70 r70Var, Context context) {
        this.f39439n = r70Var;
        this.f39437c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45912a;
        if (view instanceof org.telegram.ui.Cells.o4) {
            ((org.telegram.ui.Cells.o4) view).f22720a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45915f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f39438f;
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
        this.f39438f = timer2;
        timer2.schedule(new m70(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f39439n.f41075w.size() + 2;
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
        r70 r70Var = this.f39439n;
        n70 n70Var = r70Var.f41074s;
        if (n70Var != null && !r70Var.E) {
            int h = n70Var.h();
            org.telegram.ui.Components.sx0 sx0Var = r70Var.f41073r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            sx0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (b1Var.f45915f == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) b1Var.f45912a;
            boolean z10 = this.h;
            r70 r70Var = this.f39439n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) r70Var.f41075w.get(i10 - 2);
                charSequence = null;
            }
            o4Var.f22723f = contact;
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
        Context context = this.f39437c;
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
