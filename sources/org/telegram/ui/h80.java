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
public final class h80 extends org.telegram.ui.Components.ul0 {
    public final Context f34139c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f34140f;
    public boolean h;
    public final l80 f34141n;

    public h80(l80 l80Var, Context context) {
        this.f34141n = l80Var;
        this.f34139c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42974a;
        if (view instanceof org.telegram.ui.Cells.q4) {
            ((org.telegram.ui.Cells.q4) view).f20845a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42977f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f34140f;
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
        this.f34140f = timer2;
        timer2.schedule(new g80(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f34141n.f35352w.size() + 2;
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
        l80 l80Var = this.f34141n;
        h80 h80Var = l80Var.f35351s;
        if (h80Var != null && !l80Var.E) {
            int h = h80Var.h();
            org.telegram.ui.Components.jx0 jx0Var = l80Var.f35350r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            jx0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (c1Var.f42977f == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) c1Var.f42974a;
            boolean z10 = this.h;
            l80 l80Var = this.f34141n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) l80Var.f35352w.get(i10 - 2);
                charSequence = null;
            }
            q4Var.f20848f = contact;
            q4Var.h = charSequence;
            q4Var.a();
            boolean containsKey = l80Var.F.containsKey(contact.key);
            org.telegram.ui.Components.np npVar = q4Var.e;
            if (npVar != null) {
                npVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s8 s8Var;
        Context context = this.f34139c;
        if (i10 == 1) {
            org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context);
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            s8Var2.e(i11, i11);
            s8Var2.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            s8Var = s8Var2;
        } else if (i10 == 2) {
            s8Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
        } else {
            s8Var = new org.telegram.ui.Cells.q4(context, true);
        }
        return new s4.c1(s8Var);
    }
}
