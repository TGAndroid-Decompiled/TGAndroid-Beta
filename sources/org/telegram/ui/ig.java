package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class ig implements e2.h {
    public final int f33675a;
    public final eo f33676b;

    public ig(eo eoVar, int i10) {
        this.f33675a = i10;
        this.f33676b = eoVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f33675a) {
            case 0:
                this.f33676b.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z10 = view instanceof org.telegram.ui.Cells.t1;
                eo eoVar = this.f33676b;
                if (z10) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    t1Var.E8 = eoVar.t9();
                    t1Var.F8 = eoVar.C9();
                    boolean B9 = eoVar.B9();
                    if (t1Var.G8 != B9) {
                        t1Var.G8 = B9;
                        eoVar.f32542x0.getClass();
                        int R = RecyclerView.R(view);
                        t1Var.f20245n8 = true;
                        t1Var.forceLayout();
                        if (R >= 0) {
                            eoVar.A0.m(R);
                        }
                    }
                    t1Var.H8 = eoVar.Q8();
                    int R8 = eoVar.R8();
                    if (t1Var.I8 != R8) {
                        t1Var.I8 = R8;
                        t1Var.y4();
                        t1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    w0Var.f20595e0 = eoVar.t9();
                    w0Var.f20608i0 = eoVar.C9();
                    eoVar.B9();
                    eoVar.Q8();
                    int R82 = eoVar.R8();
                    if (w0Var.f20611j0 != R82) {
                        w0Var.f20611j0 = R82;
                        w0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v1) {
                    ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(eoVar.R8() / 2.0f);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.b0) {
                    view.invalidate();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h0) {
                    view.invalidate();
                    return;
                } else {
                    return;
                }
            default:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    eo eoVar2 = this.f33676b;
                    eoVar2.D1 = tL_premium_boostsStatus;
                    eoVar2.getMessagesController().getBoostsController().userCanBoostChannel(eoVar2.T5, tL_premium_boostsStatus, new ig(eoVar2, 0));
                    return;
                }
                return;
        }
    }
}
