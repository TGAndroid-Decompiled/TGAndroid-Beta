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
public final class a80 extends org.telegram.ui.Components.ql0 {
    public final Context f32511c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f32512f;
    public boolean h;
    public final e80 f32513n;

    public a80(e80 e80Var, Context context) {
        this.f32513n = e80Var;
        this.f32511c = context;
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.o4) {
            ((org.telegram.ui.Cells.o4) view).f21480a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f32512f;
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
        this.f32512f = timer2;
        timer2.schedule(new z70(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f32513n.f33740w.size() + 2;
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
        e80 e80Var = this.f32513n;
        a80 a80Var = e80Var.f33739s;
        if (a80Var != null && !e80Var.B) {
            int h = a80Var.h();
            org.telegram.ui.Components.zw0 zw0Var = e80Var.f33738r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            zw0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (l1Var.f5777f == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) l1Var.f5774a;
            boolean z4 = this.h;
            e80 e80Var = this.f32513n;
            if (z4) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) e80Var.f33740w.get(i10 - 2);
                charSequence = null;
            }
            o4Var.f21483f = contact;
            o4Var.h = charSequence;
            o4Var.a();
            boolean containsKey = e80Var.C.containsKey(contact.key);
            org.telegram.ui.Components.kp kpVar = o4Var.e;
            if (kpVar != null) {
                kpVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n8 n8Var;
        Context context = this.f32511c;
        if (i10 == 1) {
            org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(context);
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            n8Var2.e(i11, i11);
            n8Var2.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            n8Var = n8Var2;
        } else if (i10 == 2) {
            n8Var = new org.telegram.ui.Cells.y6(context, (b) null);
        } else {
            n8Var = new org.telegram.ui.Cells.o4(context, true);
        }
        return new f2.l1(n8Var);
    }
}
