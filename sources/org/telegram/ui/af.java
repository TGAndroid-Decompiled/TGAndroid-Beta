package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class af implements Utilities.Callback {
    public final int f32150a;
    public final wn f32151b;

    public af(wn wnVar, int i10) {
        this.f32150a = i10;
        this.f32151b = wnVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f32150a;
        wn wnVar = this.f32151b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                wn wnVar2 = this.f32151b;
                wnVar2.f39490g5 = messageSuggestionParams;
                wnVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                wnVar2.yb(true, null, wnVar2.p5, null, null, null, false, true);
                return;
            case 1:
                wnVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    wnVar.finishFragment();
                    return;
                }
                return;
            case 2:
                wnVar.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 3:
                wnVar.da((String) obj, false);
                return;
            case 4:
                wnVar.Db((MessageSuggestionParams) obj);
                return;
            case 5:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = wnVar.t9();
                    u1Var.F8 = wnVar.C9();
                    boolean B9 = wnVar.B9();
                    if (u1Var.G8 != B9) {
                        u1Var.G8 = B9;
                        wnVar.f39696x0.getClass();
                        int R = RecyclerView.R(view);
                        u1Var.f21450n8 = true;
                        u1Var.forceLayout();
                        if (R >= 0) {
                            wnVar.A0.m(R);
                        }
                    }
                    u1Var.H8 = wnVar.Q8();
                    int R8 = wnVar.R8();
                    if (u1Var.I8 != R8) {
                        u1Var.I8 = R8;
                        u1Var.y4();
                        u1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    w0Var.f21730e0 = wnVar.t9();
                    w0Var.f21743i0 = wnVar.C9();
                    wnVar.B9();
                    wnVar.Q8();
                    int R82 = wnVar.R8();
                    if (w0Var.f21746j0 != R82) {
                        w0Var.f21746j0 = R82;
                        w0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w1) {
                    ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(wnVar.R8() / 2.0f);
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
                    wnVar.D1 = tL_premium_boostsStatus;
                    wnVar.getMessagesController().getBoostsController().userCanBoostChannel(wnVar.T5, tL_premium_boostsStatus, new af(wnVar, 2));
                    return;
                }
                return;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.k31 k31Var = wnVar.R1;
                if (k31Var != null) {
                    k31Var.m(l4.longValue(), true);
                    return;
                }
                return;
            case 8:
                bs bsVar = wnVar.f39448d0;
                bsVar.f32474c.add(((org.telegram.ui.ActionBar.u0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = wn.Gc;
                wnVar.Ba(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = wn.Gc;
                wnVar.Ba(intValue2);
                return;
        }
    }
}
