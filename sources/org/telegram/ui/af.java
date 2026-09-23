package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class af implements Utilities.Callback {
    public final int f31778a;
    public final xn f31779b;

    public af(xn xnVar, int i10) {
        this.f31778a = i10;
        this.f31779b = xnVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f31778a;
        xn xnVar = this.f31779b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                xn xnVar2 = this.f31779b;
                xnVar2.f39390g5 = messageSuggestionParams;
                xnVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                xnVar2.yb(true, null, xnVar2.p5, null, null, null, false, true);
                return;
            case 1:
                xnVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    xnVar.finishFragment();
                    return;
                }
                return;
            case 2:
                xnVar.da((String) obj, false);
                return;
            case 3:
                xnVar.Db((MessageSuggestionParams) obj);
                return;
            case 4:
                xnVar.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    t1Var.E8 = xnVar.t9();
                    t1Var.F8 = xnVar.C9();
                    boolean B9 = xnVar.B9();
                    if (t1Var.G8 != B9) {
                        t1Var.G8 = B9;
                        xnVar.f39596x0.getClass();
                        int R = RecyclerView.R(view);
                        t1Var.f21134n8 = true;
                        t1Var.forceLayout();
                        if (R >= 0) {
                            xnVar.A0.m(R);
                        }
                    }
                    t1Var.H8 = xnVar.Q8();
                    int R8 = xnVar.R8();
                    if (t1Var.I8 != R8) {
                        t1Var.I8 = R8;
                        t1Var.y4();
                        t1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    w0Var.f21480e0 = xnVar.t9();
                    w0Var.f21493i0 = xnVar.C9();
                    xnVar.B9();
                    xnVar.Q8();
                    int R82 = xnVar.R8();
                    if (w0Var.f21496j0 != R82) {
                        w0Var.f21496j0 = R82;
                        w0Var.invalidate();
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
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    xnVar.D1 = tL_premium_boostsStatus;
                    xnVar.getMessagesController().getBoostsController().userCanBoostChannel(xnVar.T5, tL_premium_boostsStatus, new af(xnVar, 4));
                    return;
                }
                return;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.w21 w21Var = xnVar.R1;
                if (w21Var != null) {
                    w21Var.m(l4.longValue(), true);
                    return;
                }
                return;
            case 8:
                cs csVar = xnVar.f39348d0;
                csVar.f32396c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = xn.Gc;
                xnVar.Ba(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = xn.Gc;
                xnVar.Ba(intValue2);
                return;
        }
    }
}
