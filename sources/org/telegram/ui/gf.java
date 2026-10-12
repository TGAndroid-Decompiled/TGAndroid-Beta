package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class gf implements Utilities.Callback {
    public final int f38032a;
    public final eo f38033b;

    public gf(eo eoVar, int i10) {
        this.f38032a = i10;
        this.f38033b = eoVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f38032a;
        eo eoVar = this.f38033b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                eo eoVar2 = this.f38033b;
                eoVar2.f37271g5 = messageSuggestionParams;
                eoVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                eoVar2.Cb(true, null, eoVar2.p5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                eoVar.zb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    eoVar.finishFragment();
                    return;
                }
                return;
            case 2:
                eoVar.ia((String) obj, false);
                return;
            case 3:
                eoVar.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 4:
                eoVar.Hb((MessageSuggestionParams) obj);
                return;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    eoVar.D1 = tL_premium_boostsStatus;
                    eoVar.getMessagesController().getBoostsController().userCanBoostChannel(eoVar.T5, tL_premium_boostsStatus, new gf(eoVar, 3));
                    return;
                }
                return;
            case 6:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = eoVar.y9();
                    u1Var.F8 = eoVar.H9();
                    boolean G9 = eoVar.G9();
                    if (u1Var.G8 != G9) {
                        u1Var.G8 = G9;
                        eoVar.f37478x0.getClass();
                        int R = RecyclerView.R(view);
                        u1Var.f23072n8 = true;
                        u1Var.forceLayout();
                        if (R >= 0) {
                            eoVar.A0.m(R);
                        }
                    }
                    u1Var.H8 = eoVar.V8();
                    int W8 = eoVar.W8();
                    if (u1Var.I8 != W8) {
                        u1Var.I8 = W8;
                        u1Var.y4();
                        u1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    w0Var.f23353e0 = eoVar.y9();
                    w0Var.f23366i0 = eoVar.H9();
                    eoVar.G9();
                    eoVar.V8();
                    int W82 = eoVar.W8();
                    if (w0Var.f23369j0 != W82) {
                        w0Var.f23369j0 = W82;
                        w0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w1) {
                    ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(eoVar.W8() / 2.0f);
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
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.h41 h41Var = eoVar.R1;
                if (h41Var != null) {
                    h41Var.m(l4.longValue(), true);
                    return;
                }
                return;
            case 8:
                is isVar = eoVar.f37228d0;
                isVar.f38986c.add(((org.telegram.ui.ActionBar.u0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = eo.Hc;
                eoVar.Fa(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = eo.Hc;
                eoVar.Fa(intValue2);
                return;
        }
    }
}
