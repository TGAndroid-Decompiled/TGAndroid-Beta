package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class m10 extends org.telegram.ui.Components.rl0 {
    public final t10 f38826c;

    public m10(t10 t10Var) {
        this.f38826c = t10Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        t10 t10Var = this.f38826c;
        if (t10Var.f41364f.isEmpty()) {
            return 0;
        }
        return t10Var.f41364f.size() + (!t10Var.K ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f38826c.f41364f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        boolean z10;
        if (m1Var.f5879f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) m1Var.f5875a;
            t10 t10Var = this.f38826c;
            MessageObject messageObject = (MessageObject) t10Var.f41364f.get(i10);
            r2Var.L = t10Var.m0;
            r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i10 != h() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            r2Var.f23488p2 = z4;
            if (r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            r2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.hk(this, r2Var, messageObject, z10, 1));
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.iu0 iu0Var;
        if (i10 != 0) {
            if (i10 != 3) {
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
                iu0Var = u3Var;
            } else {
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(viewGroup.getContext(), null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(1);
                iu0Var = u00Var;
            }
        } else {
            iu0Var = new org.telegram.ui.Components.iu0(1, viewGroup.getContext(), true);
        }
        return yh.o(iu0Var, iu0Var, -1, -2);
    }
}
