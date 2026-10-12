package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class jf implements Utilities.Callback {
    public final int f37368a;
    public final fo f37369b;

    public jf(fo foVar, int i10) {
        this.f37368a = i10;
        this.f37369b = foVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f37368a;
        fo foVar = this.f37369b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                fo foVar2 = this.f37369b;
                foVar2.f35952g5 = messageSuggestionParams;
                foVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                foVar2.Cb(true, null, foVar2.p5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                foVar.zb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    foVar.finishFragment();
                    return;
                }
                return;
            case 2:
                foVar.ia((String) obj, false);
                return;
            case 3:
                foVar.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 4:
                foVar.Hb((MessageSuggestionParams) obj);
                return;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    foVar.D1 = tL_premium_boostsStatus;
                    foVar.getMessagesController().getBoostsController().userCanBoostChannel(foVar.T5, tL_premium_boostsStatus, new jf(foVar, 3));
                    return;
                }
                return;
            case 6:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = foVar.y9();
                    u1Var.F8 = foVar.H9();
                    boolean G9 = foVar.G9();
                    if (u1Var.G8 != G9) {
                        u1Var.G8 = G9;
                        foVar.f36160x0.getClass();
                        int R = RecyclerView.R(view);
                        u1Var.f22329n8 = true;
                        u1Var.forceLayout();
                        if (R >= 0) {
                            foVar.A0.m(R);
                        }
                    }
                    u1Var.H8 = foVar.V8();
                    int W8 = foVar.W8();
                    if (u1Var.I8 != W8) {
                        u1Var.I8 = W8;
                        u1Var.y4();
                        u1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.x0) {
                    org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) view;
                    x0Var.f22670e0 = foVar.y9();
                    x0Var.f22683i0 = foVar.H9();
                    foVar.G9();
                    foVar.V8();
                    int W82 = foVar.W8();
                    if (x0Var.f22686j0 != W82) {
                        x0Var.f22686j0 = W82;
                        x0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w1) {
                    ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(foVar.W8() / 2.0f);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.b0) {
                    view.invalidate();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.i0) {
                    view.invalidate();
                    return;
                } else {
                    return;
                }
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.y31 y31Var = foVar.R1;
                if (y31Var != null) {
                    y31Var.m(l4.longValue(), true);
                    return;
                }
                return;
            case 8:
                ls lsVar = foVar.f35911d0;
                lsVar.f38079c.add(((org.telegram.ui.ActionBar.u0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = fo.Hc;
                foVar.Fa(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = fo.Hc;
                foVar.Fa(intValue2);
                return;
        }
    }
}
