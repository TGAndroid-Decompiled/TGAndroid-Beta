package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class b10 extends org.telegram.ui.Components.lm0 {
    public final i10 f35819c;

    public b10(i10 i10Var) {
        this.f35819c = i10Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        i10 i10Var = this.f35819c;
        if (i10Var.f38018f.isEmpty()) {
            return 0;
        }
        return i10Var.f38018f.size() + (!i10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f35819c.f38018f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        if (b1Var.f46346f == 0) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) b1Var.f46343a;
            i10 i10Var = this.f35819c;
            MessageObject messageObject = (MessageObject) i10Var.f38018f.get(i10);
            q2Var.O = i10Var.f38029p0;
            q2Var.V(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            q2Var.f23010s2 = z10;
            if (q2Var.getMessage() != null && q2Var.getMessage().getId() == messageObject.getId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            q2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, q2Var, messageObject, z11, 1));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        hg.z zVar;
        if (i10 != 0) {
            if (i10 != 3) {
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
                zVar = u3Var;
            } else {
                org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(viewGroup.getContext(), null);
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(1);
                zVar = b10Var;
            }
        } else {
            zVar = new hg.z(2, viewGroup.getContext(), true);
        }
        return com.google.android.gms.internal.play_billing.k3.l(zVar, zVar, -1, -2);
    }
}
