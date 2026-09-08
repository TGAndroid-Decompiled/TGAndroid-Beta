package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class hg implements e2.h {
    public final int f37020a;
    public final co f37021b;

    public hg(co coVar, int i10) {
        this.f37020a = i10;
        this.f37021b = coVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37020a) {
            case 0:
                this.f37021b.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z10 = view instanceof org.telegram.ui.Cells.t1;
                co coVar = this.f37021b;
                if (z10) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    t1Var.E8 = coVar.t9();
                    t1Var.F8 = coVar.C9();
                    boolean B9 = coVar.B9();
                    if (t1Var.G8 != B9) {
                        t1Var.G8 = B9;
                        coVar.f35500x0.getClass();
                        int R = RecyclerView.R(view);
                        t1Var.f23074n8 = true;
                        t1Var.forceLayout();
                        if (R >= 0) {
                            coVar.A0.m(R);
                        }
                    }
                    t1Var.H8 = coVar.Q8();
                    int R8 = coVar.R8();
                    if (t1Var.I8 != R8) {
                        t1Var.I8 = R8;
                        t1Var.y4();
                        t1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    w0Var.f23437e0 = coVar.t9();
                    w0Var.f23450i0 = coVar.C9();
                    coVar.B9();
                    coVar.Q8();
                    int R82 = coVar.R8();
                    if (w0Var.f23453j0 != R82) {
                        w0Var.f23453j0 = R82;
                        w0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v1) {
                    ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(coVar.R8() / 2.0f);
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
                    co coVar2 = this.f37021b;
                    coVar2.D1 = tL_premium_boostsStatus;
                    coVar2.getMessagesController().getBoostsController().userCanBoostChannel(coVar2.T5, tL_premium_boostsStatus, new hg(coVar2, 0));
                    return;
                }
                return;
        }
    }
}
