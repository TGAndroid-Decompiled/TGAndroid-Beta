package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class p10 extends org.telegram.ui.Components.xl0 {
    public final w10 f36290c;

    public p10(w10 w10Var) {
        this.f36290c = w10Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        w10 w10Var = this.f36290c;
        if (w10Var.f38763f.isEmpty()) {
            return 0;
        }
        return w10Var.f38763f.size() + (!w10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f36290c.f38763f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        if (c1Var.f43008f == 0) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) c1Var.f43005a;
            w10 w10Var = this.f36290c;
            MessageObject messageObject = (MessageObject) w10Var.f38763f.get(i10);
            s2Var.O = w10Var.f38774p0;
            s2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s2Var.f21014s2 = z10;
            if (s2Var.getMessage() != null && s2Var.getMessage().getId() == messageObject.getId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            s2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.ok(this, s2Var, messageObject, z11, 1));
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
                org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(viewGroup.getContext(), null);
                v00Var.setIsSingleCell(true);
                v00Var.setViewType(1);
                a0Var = v00Var;
            }
        } else {
            a0Var = new gg.a0(2, viewGroup.getContext(), true);
        }
        return com.google.android.gms.internal.vision.e2.k(a0Var, a0Var, -1, -2);
    }
}
