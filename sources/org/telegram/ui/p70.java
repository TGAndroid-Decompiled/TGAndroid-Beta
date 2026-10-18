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
public final class p70 extends org.telegram.ui.Components.hm0 {
    public final Context f40000c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f40001f;
    public boolean h;
    public final t70 f40002n;

    public p70(t70 t70Var, Context context) {
        this.f40002n = t70Var;
        this.f40000c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45958a;
        if (view instanceof org.telegram.ui.Cells.o4) {
            ((org.telegram.ui.Cells.o4) view).f22726a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45961f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f40001f;
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
        this.f40001f = timer2;
        timer2.schedule(new o70(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f40002n.f41635w.size() + 2;
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
        t70 t70Var = this.f40002n;
        p70 p70Var = t70Var.f41634s;
        if (p70Var != null && !t70Var.E) {
            int h = p70Var.h();
            org.telegram.ui.Components.rx0 rx0Var = t70Var.f41633r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            rx0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (b1Var.f45961f == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) b1Var.f45958a;
            boolean z10 = this.h;
            t70 t70Var = this.f40002n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) t70Var.f41635w.get(i10 - 2);
                charSequence = null;
            }
            o4Var.f22729f = contact;
            o4Var.h = charSequence;
            o4Var.a();
            boolean containsKey = t70Var.F.containsKey(contact.key);
            org.telegram.ui.Components.xp xpVar = o4Var.e;
            if (xpVar != null) {
                xpVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.q8 q8Var;
        Context context = this.f40000c;
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
