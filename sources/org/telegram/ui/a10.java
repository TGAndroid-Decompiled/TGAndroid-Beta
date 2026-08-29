package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class a10 extends org.telegram.ui.Components.il0 {
    public final h10 f36394c;

    public a10(h10 h10Var) {
        this.f36394c = h10Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final int h() {
        h10 h10Var = this.f36394c;
        if (h10Var.f38727f.isEmpty()) {
            return 0;
        }
        return h10Var.f38727f.size() + (!h10Var.J ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f36394c.f38727f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        boolean z11;
        if (n1Var.f6436f == 0) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) n1Var.f6432a;
            h10 h10Var = this.f36394c;
            MessageObject messageObject = (MessageObject) h10Var.f38727f.get(i10);
            p2Var.K = h10Var.f38734l0;
            p2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            p2Var.f24898o2 = z10;
            if (p2Var.getMessage() != null && p2Var.getMessage().getId() == messageObject.getId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            p2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.hk(this, p2Var, messageObject, z11, 1));
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.au0 au0Var;
        if (i10 != 0) {
            if (i10 != 3) {
                org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(viewGroup.getContext(), null);
                s3Var.setText(LocaleController.getString(R.string.SearchMessages));
                au0Var = s3Var;
            } else {
                org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(viewGroup.getContext(), null);
                p00Var.setIsSingleCell(true);
                p00Var.setViewType(1);
                au0Var = p00Var;
            }
        } else {
            au0Var = new org.telegram.ui.Components.au0(1, viewGroup.getContext(), true);
        }
        return th.m(au0Var, au0Var, -1, -2);
    }
}
