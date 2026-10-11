package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class o10 extends org.telegram.ui.Components.qm0 {
    public final v10 f40414c;

    public o10(v10 v10Var) {
        this.f40414c = v10Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        v10 v10Var = this.f40414c;
        if (v10Var.f42871f.isEmpty()) {
            return 0;
        }
        return v10Var.f42871f.size() + (!v10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f40414c.f42871f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        boolean z11;
        if (d1Var.f47786f == 0) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) d1Var.f47782a;
            v10 v10Var = this.f40414c;
            MessageObject messageObject = (MessageObject) v10Var.f42871f.get(i10);
            s2Var.O = v10Var.f42882p0;
            s2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s2Var.f22885s2 = z10;
            if (s2Var.getMessage() != null && s2Var.getMessage().getId() == messageObject.getId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            s2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.qk(this, s2Var, messageObject, z11, 1));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        gg.z zVar;
        if (i10 != 0) {
            if (i10 != 3) {
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
                zVar = v3Var;
            } else {
                org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(viewGroup.getContext(), null);
                k10Var.setIsSingleCell(true);
                k10Var.setViewType(1);
                zVar = k10Var;
            }
        } else {
            zVar = new gg.z(2, viewGroup.getContext(), true);
        }
        return com.google.android.gms.internal.vision.e2.k(zVar, zVar, -1, -2);
    }
}
