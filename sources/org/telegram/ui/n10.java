package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class n10 extends org.telegram.ui.Components.ll0 {
    public final u10 f35419c;

    public n10(u10 u10Var) {
        this.f35419c = u10Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        u10 u10Var = this.f35419c;
        if (u10Var.f37852f.isEmpty()) {
            return 0;
        }
        return u10Var.f37852f.size() + (!u10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f35419c.f37852f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        if (c1Var.f42630f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) c1Var.f42627a;
            u10 u10Var = this.f35419c;
            MessageObject messageObject = (MessageObject) u10Var.f37852f.get(i10);
            r2Var.O = u10Var.f37863p0;
            r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            r2Var.f20724s2 = z10;
            if (r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            r2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.nk(this, r2Var, messageObject, z11, 1));
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
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(viewGroup.getContext(), null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(1);
                a0Var = u00Var;
            }
        } else {
            a0Var = new gg.a0(2, viewGroup.getContext(), true);
        }
        return com.google.android.gms.internal.vision.e2.k(a0Var, a0Var, -1, -2);
    }
}
