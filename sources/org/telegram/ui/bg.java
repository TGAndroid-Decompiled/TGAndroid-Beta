package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class bg implements h5.d {
    public final int f32952a;
    public final xn f32953b;

    public bg(xn xnVar, int i10) {
        this.f32952a = i10;
        this.f32953b = xnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f32952a) {
            case 0:
                this.f32953b.B1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z4 = view instanceof org.telegram.ui.Cells.t1;
                xn xnVar = this.f32953b;
                if (z4) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    t1Var.B8 = xnVar.t9();
                    t1Var.C8 = xnVar.C9();
                    boolean B9 = xnVar.B9();
                    if (t1Var.D8 != B9) {
                        t1Var.D8 = B9;
                        xnVar.f40193u0.getClass();
                        int R = RecyclerView.R(view);
                        t1Var.f22119k8 = true;
                        t1Var.forceLayout();
                        if (R >= 0) {
                            xnVar.f40234x0.m(R);
                        }
                    }
                    t1Var.E8 = xnVar.Q8();
                    int R8 = xnVar.R8();
                    if (t1Var.F8 != R8) {
                        t1Var.F8 = R8;
                        t1Var.y4();
                        t1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                    v0Var.f22428b0 = xnVar.t9();
                    v0Var.f22441f0 = xnVar.C9();
                    xnVar.B9();
                    xnVar.Q8();
                    int R82 = xnVar.R8();
                    if (v0Var.f22444g0 != R82) {
                        v0Var.f22444g0 = R82;
                        v0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v1) {
                    ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(xnVar.R8() / 2.0f);
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
                    xn xnVar2 = this.f32953b;
                    xnVar2.A1 = tL_premium_boostsStatus;
                    xnVar2.getMessagesController().getBoostsController().userCanBoostChannel(xnVar2.Q5, tL_premium_boostsStatus, new bg(xnVar2, 0));
                    return;
                }
                return;
        }
    }
}
