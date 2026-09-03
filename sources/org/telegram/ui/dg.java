package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class dg implements h5.d {
    public final int f33461a;
    public final zn f33462b;

    public dg(zn znVar, int i10) {
        this.f33461a = i10;
        this.f33462b = znVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f33461a) {
            case 0:
                this.f33462b.B1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z4 = view instanceof org.telegram.ui.Cells.s1;
                zn znVar = this.f33462b;
                if (z4) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                    s1Var.B8 = znVar.t9();
                    s1Var.C8 = znVar.C9();
                    boolean B9 = znVar.B9();
                    if (s1Var.D8 != B9) {
                        s1Var.D8 = B9;
                        znVar.f40759u0.getClass();
                        int R = RecyclerView.R(view);
                        s1Var.f22056k8 = true;
                        s1Var.forceLayout();
                        if (R >= 0) {
                            znVar.f40800x0.m(R);
                        }
                    }
                    s1Var.E8 = znVar.Q8();
                    int R8 = znVar.R8();
                    if (s1Var.F8 != R8) {
                        s1Var.F8 = R8;
                        s1Var.y4();
                        s1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    v0Var.f22396b0 = znVar.t9();
                    v0Var.f22409f0 = znVar.C9();
                    znVar.B9();
                    znVar.Q8();
                    int R82 = znVar.R8();
                    if (v0Var.f22412g0 != R82) {
                        v0Var.f22412g0 = R82;
                        v0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(znVar.R8() / 2.0f);
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
                    zn znVar2 = this.f33462b;
                    znVar2.A1 = tL_premium_boostsStatus;
                    znVar2.getMessagesController().getBoostsController().userCanBoostChannel(znVar2.Q5, tL_premium_boostsStatus, new dg(znVar2, 0));
                    return;
                }
                return;
        }
    }
}
