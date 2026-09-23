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
public final class e80 extends org.telegram.ui.Components.ll0 {
    public final Context f32845c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f32846f;
    public boolean h;
    public final i80 f32847n;

    public e80(i80 i80Var, Context context) {
        this.f32847n = i80Var;
        this.f32845c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42627a;
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).f20559a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42630f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f32846f;
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
        this.f32846f = timer2;
        timer2.schedule(new d80(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f32847n.f34070w.size() + 2;
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
        i80 i80Var = this.f32847n;
        e80 e80Var = i80Var.f34069s;
        if (e80Var != null && !i80Var.E) {
            int h = e80Var.h();
            org.telegram.ui.Components.xw0 xw0Var = i80Var.f34068r;
            if (h == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            xw0Var.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (c1Var.f42630f == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) c1Var.f42627a;
            boolean z10 = this.h;
            i80 i80Var = this.f32847n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) i80Var.f34070w.get(i10 - 2);
                charSequence = null;
            }
            p4Var.f20562f = contact;
            p4Var.h = charSequence;
            p4Var.a();
            boolean containsKey = i80Var.F.containsKey(contact.key);
            org.telegram.ui.Components.op opVar = p4Var.e;
            if (opVar != null) {
                opVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s8 s8Var;
        Context context = this.f32845c;
        if (i10 == 1) {
            org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context);
            int i11 = org.telegram.ui.ActionBar.h6.G6;
            s8Var2.e(i11, i11);
            s8Var2.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            s8Var = s8Var2;
        } else if (i10 == 2) {
            s8Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
        } else {
            s8Var = new org.telegram.ui.Cells.p4(context, true);
        }
        return new s4.c1(s8Var);
    }
}
