package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class a10 extends org.telegram.ui.Components.lm0 {
    public final h10 f37612c;

    public a10(h10 h10Var) {
        this.f37612c = h10Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        h10 h10Var = this.f37612c;
        if (h10Var.f39831f.isEmpty()) {
            return 0;
        }
        return h10Var.f39831f.size() + (!h10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f37612c.f39831f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        boolean z11;
        if (e1Var.f47738f == 0) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) e1Var.f47735a;
            h10 h10Var = this.f37612c;
            MessageObject messageObject = (MessageObject) h10Var.f39831f.get(i10);
            p2Var.O = h10Var.f39842p0;
            p2Var.V(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            p2Var.f24719s2 = z10;
            if (p2Var.getMessage() != null && p2Var.getMessage().getId() == messageObject.getId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            p2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, p2Var, messageObject, z11, 1));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        ig.z zVar;
        if (i10 != 0) {
            if (i10 != 3) {
                org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(viewGroup.getContext(), null);
                z3Var.setText(LocaleController.getString(R.string.SearchMessages));
                zVar = z3Var;
            } else {
                org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(viewGroup.getContext(), null);
                c10Var.setIsSingleCell(true);
                c10Var.setViewType(1);
                zVar = c10Var;
            }
        } else {
            zVar = new ig.z(2, viewGroup.getContext(), true);
        }
        return ic.a.n(zVar, zVar, -1, -2);
    }
}
