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
public final class j80 extends org.telegram.ui.Components.ll0 {
    public final Context f34818c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f34819f;
    public boolean h;
    public final n80 f34820n;

    public j80(n80 n80Var, Context context) {
        this.f34820n = n80Var;
        this.f34818c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42702a;
        if (view instanceof org.telegram.ui.Cells.o4) {
            ((org.telegram.ui.Cells.o4) view).f20571a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42705f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f34819f;
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
        this.f34819f = timer2;
        timer2.schedule(new i80(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f34820n.f35979w.size() + 2;
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
        n80 n80Var = this.f34820n;
        j80 j80Var = n80Var.f35978s;
        if (j80Var != null && !n80Var.E) {
            int h = j80Var.h();
            org.telegram.ui.Components.zw0 zw0Var = n80Var.f35977r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            zw0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (c1Var.f42705f == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) c1Var.f42702a;
            boolean z10 = this.h;
            n80 n80Var = this.f34820n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) n80Var.f35979w.get(i10 - 2);
                charSequence = null;
            }
            o4Var.f20574f = contact;
            o4Var.h = charSequence;
            o4Var.a();
            boolean containsKey = n80Var.F.containsKey(contact.key);
            org.telegram.ui.Components.np npVar = o4Var.e;
            if (npVar != null) {
                npVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        Context context = this.f34818c;
        if (i10 == 1) {
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            r8Var2.e(i11, i11);
            r8Var2.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            r8Var = r8Var2;
        } else if (i10 == 2) {
            r8Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
        } else {
            r8Var = new org.telegram.ui.Cells.o4(context, true);
        }
        return new s4.c1(r8Var);
    }
}
