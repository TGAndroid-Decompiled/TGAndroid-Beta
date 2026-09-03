package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class n10 extends org.telegram.ui.Components.ql0 {
    public final u10 f36308c;

    public n10(u10 u10Var) {
        this.f36308c = u10Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        u10 u10Var = this.f36308c;
        if (u10Var.f38646f.isEmpty()) {
            return 0;
        }
        return u10Var.f38646f.size() + (!u10Var.K ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f36308c.f38646f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        boolean z10;
        if (l1Var.f5777f == 0) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) l1Var.f5774a;
            u10 u10Var = this.f36308c;
            MessageObject messageObject = (MessageObject) u10Var.f38646f.get(i10);
            q2Var.L = u10Var.m0;
            q2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i10 != h() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            q2Var.f21628p2 = z4;
            if (q2Var.getMessage() != null && q2Var.getMessage().getId() == messageObject.getId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            q2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.fk(this, q2Var, messageObject, z10, 1));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.iu0 iu0Var;
        if (i10 != 0) {
            if (i10 != 3) {
                org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(viewGroup.getContext(), null);
                t3Var.setText(LocaleController.getString(R.string.SearchMessages));
                iu0Var = t3Var;
            } else {
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(viewGroup.getContext(), null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(1);
                iu0Var = u00Var;
            }
        } else {
            iu0Var = new org.telegram.ui.Components.iu0(1, viewGroup.getContext(), true);
        }
        return ai.n(iu0Var, iu0Var, -1, -2);
    }
}
