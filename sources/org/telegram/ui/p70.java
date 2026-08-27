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

public final class p70 extends org.telegram.ui.Components.yk0 {

    public final Context f41289c;
    public ArrayList d = new ArrayList();

    public ArrayList f41290e = new ArrayList();

    public Timer f41291f;
    public boolean h;

    public final t70 f41292n;

    public p70(t70 t70Var, Context context) {
        this.f41292n = t70Var;
        this.f41289c = context;
    }

    @Override
    public final void A(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.m4) {
            ((org.telegram.ui.Cells.m4) view).f24679a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f != 2;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f41291f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (str == null) {
            this.d.clear();
            this.f41290e.clear();
            l();
        } else {
            Timer timer2 = new Timer();
            this.f41291f = timer2;
            timer2.schedule(new o70(this, str), 200L, 300L);
        }
    }

    @Override
    public final int h() {
        return this.h ? this.d.size() : this.f41292n.f42802w.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (this.h) {
            return 0;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10 == 1 ? 2 : 0;
    }

    @Override
    public final void l() {
        super.l();
        t70 t70Var = this.f41292n;
        p70 p70Var = t70Var.f42801s;
        if (p70Var == null || t70Var.A) {
            return;
        }
        t70Var.f42800r.setVisibility(p70Var.h() == 2 ? 0 : 4);
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (o1Var.f5793f == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) o1Var.f5789a;
            boolean z10 = this.h;
            t70 t70Var = this.f41292n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.f41290e.get(i10);
            } else {
                contact = (ContactsController.Contact) t70Var.f42802w.get(i10 - 2);
                charSequence = null;
            }
            m4Var.f24683f = contact;
            m4Var.h = charSequence;
            m4Var.a();
            boolean zContainsKey = t70Var.B.containsKey(contact.key);
            org.telegram.ui.Components.bp bpVar = m4Var.f24682e;
            if (bpVar != null) {
                bpVar.a(zContainsKey, false);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View w6Var;
        Context context = this.f41289c;
        if (i10 == 1) {
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            l8Var.e(i11, i11);
            l8Var.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            w6Var = l8Var;
        } else {
            w6Var = i10 == 2 ? new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null) : new org.telegram.ui.Cells.m4(context, true);
        }
        return new org.telegram.ui.Components.lk0(w6Var);
    }
}
