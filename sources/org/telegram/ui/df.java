package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class df implements Utilities.Callback {
    public final int f32952a;
    public final xn f32953b;

    public df(xn xnVar, int i10) {
        this.f32952a = i10;
        this.f32953b = xnVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f32952a;
        xn xnVar = this.f32953b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                xn xnVar2 = this.f32953b;
                xnVar2.f39770g5 = messageSuggestionParams;
                xnVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                xnVar2.yb(true, null, xnVar2.p5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                xnVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    xnVar.finishFragment();
                    return;
                }
                return;
            case 2:
                xnVar.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 3:
                xnVar.da((String) obj, false);
                return;
            case 4:
                xnVar.Db((MessageSuggestionParams) obj);
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = xnVar.t9();
                    u1Var.F8 = xnVar.C9();
                    boolean B9 = xnVar.B9();
                    if (u1Var.G8 != B9) {
                        u1Var.G8 = B9;
                        xnVar.f39977x0.getClass();
                        int S = RecyclerView.S(view);
                        u1Var.f21452n8 = true;
                        u1Var.forceLayout();
                        if (S >= 0) {
                            xnVar.A0.m(S);
                        }
                    }
                    u1Var.H8 = xnVar.Q8();
                    int R8 = xnVar.R8();
                    if (u1Var.I8 != R8) {
                        u1Var.I8 = R8;
                        u1Var.y4();
                        u1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    w0Var.f21732e0 = xnVar.t9();
                    w0Var.f21745i0 = xnVar.C9();
                    xnVar.B9();
                    xnVar.Q8();
                    int R82 = xnVar.R8();
                    if (w0Var.f21748j0 != R82) {
                        w0Var.f21748j0 = R82;
                        w0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w1) {
                    ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(xnVar.R8() / 2.0f);
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
                    xnVar.getMessagesController().getBoostsController().userCanBoostChannel(xnVar.T5, tL_premium_boostsStatus, new df(xnVar, 2));
                    return;
                }
                return;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.m31 m31Var = xnVar.R1;
                if (m31Var != null) {
                    m31Var.m(l4.longValue(), true);
                    return;
                }
                return;
            case 8:
                es esVar = xnVar.f39728d0;
                esVar.f33310c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
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
