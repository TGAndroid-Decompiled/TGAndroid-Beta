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
public final class j80 extends org.telegram.ui.Components.vm0 {
    public final Context f39149c;
    public ArrayList d = new ArrayList();
    public ArrayList f39150e = new ArrayList();
    public Timer f39151f;
    public boolean h;
    public final n80 f39152n;

    public j80(n80 n80Var, Context context) {
        this.f39152n = n80Var;
        this.f39149c = context;
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47897a;
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).f22415a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47901f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f39151f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (str == null) {
            this.d.clear();
            this.f39150e.clear();
            l();
            return;
        }
        Timer timer2 = new Timer();
        this.f39151f = timer2;
        timer2.schedule(new i80(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f39152n.f40326w.size() + 2;
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
        n80 n80Var = this.f39152n;
        j80 j80Var = n80Var.f40325s;
        if (j80Var != null && !n80Var.E) {
            int h = j80Var.h();
            org.telegram.ui.Components.gy0 gy0Var = n80Var.f40324r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            gy0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (d1Var.f47901f == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) d1Var.f47897a;
            boolean z10 = this.h;
            n80 n80Var = this.f39152n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.f39150e.get(i10);
            } else {
                contact = (ContactsController.Contact) n80Var.f40326w.get(i10 - 2);
                charSequence = null;
            }
            p4Var.f22419f = contact;
            p4Var.h = charSequence;
            p4Var.a();
            boolean containsKey = n80Var.F.containsKey(contact.key);
            org.telegram.ui.Components.fq fqVar = p4Var.f22418e;
            if (fqVar != null) {
                fqVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        Context context = this.f39149c;
        if (i10 == 1) {
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            int i11 = org.telegram.ui.ActionBar.h6.G6;
            r8Var2.e(i11, i11);
            r8Var2.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            r8Var = r8Var2;
        } else if (i10 == 2) {
            r8Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
        } else {
            r8Var = new org.telegram.ui.Cells.p4(context, true);
        }
        return new s4.d1(r8Var);
    }
}
