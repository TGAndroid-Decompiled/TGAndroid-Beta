package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class jg implements e2.h {
    public final int f34873a;
    public final bo f34874b;

    public jg(bo boVar, int i10) {
        this.f34873a = i10;
        this.f34874b = boVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f34873a) {
            case 0:
                this.f34874b.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z10 = view instanceof org.telegram.ui.Cells.t1;
                bo boVar = this.f34874b;
                if (z10) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    t1Var.E8 = boVar.t9();
                    t1Var.F8 = boVar.C9();
                    boolean B9 = boVar.B9();
                    if (t1Var.G8 != B9) {
                        t1Var.G8 = B9;
                        boVar.f32502x0.getClass();
                        int S = RecyclerView.S(view);
                        t1Var.f21174n8 = true;
                        t1Var.forceLayout();
                        if (S >= 0) {
                            boVar.A0.m(S);
                        }
                    }
                    t1Var.H8 = boVar.Q8();
                    int R8 = boVar.R8();
                    if (t1Var.I8 != R8) {
                        t1Var.I8 = R8;
                        t1Var.y4();
                        t1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    w0Var.f21520e0 = boVar.t9();
                    w0Var.f21533i0 = boVar.C9();
                    boVar.B9();
                    boVar.Q8();
                    int R82 = boVar.R8();
                    if (w0Var.f21536j0 != R82) {
                        w0Var.f21536j0 = R82;
                        w0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v1) {
                    ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(boVar.R8() / 2.0f);
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
                    bo boVar2 = this.f34874b;
                    boVar2.D1 = tL_premium_boostsStatus;
                    boVar2.getMessagesController().getBoostsController().userCanBoostChannel(boVar2.T5, tL_premium_boostsStatus, new jg(boVar2, 0));
                    return;
                }
                return;
        }
    }
}
