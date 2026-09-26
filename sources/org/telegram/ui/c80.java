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
public final class c80 extends org.telegram.ui.Components.wl0 {
    public final Context f32593c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f32594f;
    public boolean h;
    public final g80 f32595n;

    public c80(g80 g80Var, Context context) {
        this.f32595n = g80Var;
        this.f32593c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42959a;
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).f20810a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42962f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f32594f;
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
        this.f32594f = timer2;
        timer2.schedule(new b80(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f32595n.f33855w.size() + 2;
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
        g80 g80Var = this.f32595n;
        c80 c80Var = g80Var.f33854s;
        if (c80Var != null && !g80Var.E) {
            int h = c80Var.h();
            org.telegram.ui.Components.jx0 jx0Var = g80Var.f33853r;
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
        if (c1Var.f42962f == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) c1Var.f42959a;
            boolean z10 = this.h;
            g80 g80Var = this.f32595n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) g80Var.f33855w.get(i10 - 2);
                charSequence = null;
            }
            p4Var.f20813f = contact;
            p4Var.h = charSequence;
            p4Var.a();
            boolean containsKey = g80Var.F.containsKey(contact.key);
            org.telegram.ui.Components.pp ppVar = p4Var.e;
            if (ppVar != null) {
                ppVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        Context context = this.f32593c;
        if (i10 == 1) {
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            int i11 = org.telegram.ui.ActionBar.h6.G6;
            r8Var2.e(i11, i11);
            r8Var2.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            r8Var = r8Var2;
        } else if (i10 == 2) {
            r8Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        } else {
            r8Var = new org.telegram.ui.Cells.p4(context, true);
        }
        return new s4.c1(r8Var);
    }
}
