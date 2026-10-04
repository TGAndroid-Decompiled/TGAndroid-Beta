package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class q10 extends org.telegram.ui.Components.yl0 {
    public final x10 f39579c;

    public q10(x10 x10Var) {
        this.f39579c = x10Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        x10 x10Var = this.f39579c;
        if (x10Var.f42697f.isEmpty()) {
            return 0;
        }
        return x10Var.f42697f.size() + (!x10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f39579c.f42697f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        if (c1Var.f46535f == 0) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) c1Var.f46531a;
            x10 x10Var = this.f39579c;
            MessageObject messageObject = (MessageObject) x10Var.f42697f.get(i10);
            s2Var.O = x10Var.f42708p0;
            s2Var.U(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s2Var.f22865s2 = z10;
            if (s2Var.getMessage() != null && s2Var.getMessage().getId() == messageObject.getId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            s2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.pk(this, s2Var, messageObject, z11, 1));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        gg.a0 a0Var;
        if (i10 != 0) {
            if (i10 != 3) {
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
                a0Var = v3Var;
            } else {
                org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(viewGroup.getContext(), null);
                w00Var.setIsSingleCell(true);
                w00Var.setViewType(1);
                a0Var = w00Var;
            }
        } else {
            a0Var = new gg.a0(2, viewGroup.getContext(), true);
        }
        return com.google.android.gms.internal.vision.e2.k(a0Var, a0Var, -1, -2);
    }
}
