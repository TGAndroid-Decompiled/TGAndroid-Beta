package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

public final class b10 extends org.telegram.ui.Components.yk0 {

    public final i10 f36664c;

    public b10(i10 i10Var) {
        this.f36664c = i10Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        i10 i10Var = this.f36664c;
        if (i10Var.f38943f.isEmpty()) {
            return 0;
        }
        return i10Var.f38943f.size() + (!i10Var.J ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        return i10 >= this.f36664c.f38943f.size() ? 3 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f5793f == 0) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) o1Var.f5789a;
            i10 i10Var = this.f36664c;
            MessageObject messageObject = (MessageObject) i10Var.f38943f.get(i10);
            p2Var.K = i10Var.f38950l0;
            p2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            p2Var.f24907o2 = i10 != h() - 1;
            p2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.zj(this, p2Var, messageObject, p2Var.getMessage() != null && p2Var.getMessage().getId() == messageObject.getId(), 1));
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View rt0Var;
        if (i10 == 0) {
            rt0Var = new org.telegram.ui.Components.rt0(1, viewGroup.getContext(), true);
        } else if (i10 != 3) {
            org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(viewGroup.getContext(), null);
            s3Var.setText(LocaleController.getString(R.string.SearchMessages));
            rt0Var = s3Var;
        } else {
            org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(viewGroup.getContext(), null);
            h00Var.setIsSingleCell(true);
            h00Var.setViewType(1);
            rt0Var = h00Var;
        }
        return org.telegram.ui.Cells.pa.l(rt0Var, rt0Var, -1, -2);
    }
}
