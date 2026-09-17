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
public final class h80 extends org.telegram.ui.Components.kl0 {
    public final Context f36947c;
    public ArrayList d = new ArrayList();
    public ArrayList f36948e = new ArrayList();
    public Timer f36949f;
    public boolean h;
    public final l80 f36950n;

    public h80(l80 l80Var, Context context) {
        this.f36950n = l80Var;
        this.f36947c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f45767a;
        if (view instanceof org.telegram.ui.Cells.o4) {
            ((org.telegram.ui.Cells.o4) view).f22459a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45771f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f36949f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (str == null) {
            this.d.clear();
            this.f36948e.clear();
            l();
            return;
        }
        Timer timer2 = new Timer();
        this.f36949f = timer2;
        timer2.schedule(new g80(this, str), 200L, 300L);
    }

    @Override
    public final int h() {
        if (this.h) {
            return this.d.size();
        }
        return this.f36950n.f38255w.size() + 2;
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
        l80 l80Var = this.f36950n;
        h80 h80Var = l80Var.f38254s;
        if (h80Var != null && !l80Var.E) {
            int h = h80Var.h();
            org.telegram.ui.Components.xw0 xw0Var = l80Var.f38253r;
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
        if (c1Var.f45771f == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) c1Var.f45767a;
            boolean z10 = this.h;
            l80 l80Var = this.f36950n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.f36948e.get(i10);
            } else {
                contact = (ContactsController.Contact) l80Var.f38255w.get(i10 - 2);
                charSequence = null;
            }
            o4Var.f22463f = contact;
            o4Var.h = charSequence;
            o4Var.a();
            boolean containsKey = l80Var.F.containsKey(contact.key);
            org.telegram.ui.Components.mp mpVar = o4Var.f22462e;
            if (mpVar != null) {
                mpVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        Context context = this.f36947c;
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
