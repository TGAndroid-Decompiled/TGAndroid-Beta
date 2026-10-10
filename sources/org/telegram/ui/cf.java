package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class cf implements Utilities.Callback {
    public final int f36689a;
    public final zn f36690b;

    public cf(zn znVar, int i10) {
        this.f36689a = i10;
        this.f36690b = znVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f36689a;
        zn znVar = this.f36690b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                zn znVar2 = this.f36690b;
                znVar2.f44827g5 = messageSuggestionParams;
                znVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                znVar2.Cb(true, null, znVar2.p5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                znVar.zb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    znVar.finishFragment();
                    return;
                }
                return;
            case 2:
                znVar.ia((String) obj, false);
                return;
            case 3:
                znVar.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            case 4:
                znVar.Hb((MessageSuggestionParams) obj);
                return;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    znVar.D1 = tL_premium_boostsStatus;
                    znVar.getMessagesController().getBoostsController().userCanBoostChannel(znVar.T5, tL_premium_boostsStatus, new cf(znVar, 3));
                    return;
                }
                return;
            case 6:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = znVar.y9();
                    u1Var.F8 = znVar.H9();
                    boolean G9 = znVar.G9();
                    if (u1Var.G8 != G9) {
                        u1Var.G8 = G9;
                        znVar.f45034x0.getClass();
                        int R = RecyclerView.R(view);
                        u1Var.f23304n8 = true;
                        u1Var.forceLayout();
                        if (R >= 0) {
                            znVar.A0.m(R);
                        }
                    }
                    u1Var.H8 = znVar.V8();
                    int W8 = znVar.W8();
                    if (u1Var.I8 != W8) {
                        u1Var.I8 = W8;
                        u1Var.y4();
                        u1Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    w0Var.f23595e0 = znVar.y9();
                    w0Var.f23608i0 = znVar.H9();
                    znVar.G9();
                    znVar.V8();
                    int W82 = znVar.W8();
                    if (w0Var.f23611j0 != W82) {
                        w0Var.f23611j0 = W82;
                        w0Var.invalidate();
                        return;
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.w1) {
                    ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(znVar.W8() / 2.0f);
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
                org.telegram.ui.Components.d41 d41Var = znVar.R1;
                if (d41Var != null) {
                    d41Var.m(l4.longValue(), true);
                    return;
                }
                return;
            case 8:
                fs fsVar = znVar.f44784d0;
                fsVar.f37717c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                return;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = zn.Hc;
                znVar.Fa(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = zn.Hc;
                znVar.Fa(intValue2);
                return;
        }
    }
}
