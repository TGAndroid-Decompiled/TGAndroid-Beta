package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class lf implements e2.h {
    public final int f35363a;
    public final zn f35364b;

    public lf(zn znVar, int i10) {
        this.f35363a = i10;
        this.f35364b = znVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f35363a) {
            case 0:
                this.f35364b.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z10 = view instanceof org.telegram.ui.Cells.u1;
                zn znVar = this.f35364b;
                if (z10) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = znVar.t9();
                    u1Var.F8 = znVar.C9();
                    boolean B9 = znVar.B9();
                    if (u1Var.G8 != B9) {
                        u1Var.G8 = B9;
                        znVar.f40488x0.getClass();
                        int S = RecyclerView.S(view);
                        u1Var.f21414n8 = true;
                        u1Var.forceLayout();
                        if (S >= 0) {
                            znVar.A0.m(S);
                        }
                    }
                    u1Var.H8 = znVar.Q8();
                    int R8 = znVar.R8();
                    if (u1Var.I8 != R8) {
                        u1Var.I8 = R8;
                        u1Var.y4();
                        u1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    w0Var.f21694e0 = znVar.t9();
                    w0Var.f21707i0 = znVar.C9();
                    znVar.B9();
                    znVar.Q8();
                    int R82 = znVar.R8();
                    if (w0Var.f21710j0 != R82) {
                        w0Var.f21710j0 = R82;
                        w0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w1) {
                    ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(znVar.R8() / 2.0f);
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
                    zn znVar2 = this.f35364b;
                    znVar2.D1 = tL_premium_boostsStatus;
                    znVar2.getMessagesController().getBoostsController().userCanBoostChannel(znVar2.T5, tL_premium_boostsStatus, new lf(znVar2, 0));
                    return;
                }
                return;
        }
    }
}
