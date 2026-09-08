package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class q10 extends org.telegram.ui.Components.kl0 {
    public final x10 f39696c;

    public q10(x10 x10Var) {
        this.f39696c = x10Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        x10 x10Var = this.f39696c;
        if (x10Var.f42571f.isEmpty()) {
            return 0;
        }
        return x10Var.f42571f.size() + (!x10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f39696c.f42571f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        if (c1Var.f45770f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) c1Var.f45766a;
            x10 x10Var = this.f39696c;
            MessageObject messageObject = (MessageObject) x10Var.f42571f.get(i10);
            r2Var.O = x10Var.f42582p0;
            r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            r2Var.f22652s2 = z10;
            if (r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            r2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.mk(this, r2Var, messageObject, z11, 1));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        hg.a0 a0Var;
        if (i10 != 0) {
            if (i10 != 3) {
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
                a0Var = u3Var;
            } else {
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(viewGroup.getContext(), null);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(1);
                a0Var = t00Var;
            }
        } else {
            a0Var = new hg.a0(2, viewGroup.getContext(), true);
        }
        return com.google.android.gms.internal.vision.e2.l(a0Var, a0Var, -1, -2);
    }
}
