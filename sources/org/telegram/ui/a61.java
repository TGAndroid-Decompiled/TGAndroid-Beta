package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a61 implements org.telegram.ui.Components.im0 {
    public final int f35896a;
    public final Context f35897b;
    public final org.telegram.ui.ActionBar.e6 f35898c;
    public final Integer d;
    public final k71 f35899e;

    public a61(k71 k71Var, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        this.f35899e = k71Var;
        this.f35896a = i10;
        this.f35897b = context;
        this.f35898c = e6Var;
        this.d = num;
    }

    @Override
    public final boolean mo17c(float f7, float f10, int i10, View view) {
        k71 k71Var = this.f35899e;
        int i11 = k71Var.V;
        int i12 = this.f35896a;
        if (i12 != 11 && i12 != 13 && k71Var.f39177h1) {
            boolean z10 = view instanceof t61;
            if (z10 && (i12 == 1 || i12 == 8)) {
                k71Var.l();
                try {
                    k71Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                t61 t61Var = (t61) view;
                if (!t61Var.f41921s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.b6 b6Var = t61Var.f41917e;
                    TLRPC.Document document = b6Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.s5.f(i11, b6Var.documentId);
                    }
                    k71Var.p(t61Var, Long.valueOf(t61Var.f41917e.documentId), document, t61Var.v, null);
                    return true;
                }
                k71Var.S0 = t61Var;
                k71Var.U0 = 0.0f;
                k71Var.T0 = false;
                if (t61Var.f41921s) {
                    k71Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(k71Var.S0.f41923x.f54661f);
                    if (tL_availableReaction != null) {
                        k71Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", k71Var.S0.f41923x, 0);
                    }
                } else {
                    k71Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.s5(4, i11, k71Var.S0.f41917e.documentId));
                }
                k71Var.f39176h0.invalidate();
                k71Var.m();
                return true;
            } else if (z10) {
                t61 t61Var2 = (t61) view;
                if (t61Var2.f41917e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = t61Var2.v;
                    z51 z51Var = new z51(this, this.f35897b, k71Var.T1, k71Var, t61Var2, this.f35898c, view, tL_starGiftUnique);
                    k71Var.X0 = z51Var;
                    z51Var.show();
                    try {
                        view.performHapticFeedback(0, 1);
                    } catch (Exception unused2) {
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void h() {
        k71 k71Var = this.f35899e;
        if (k71Var.S0 != null) {
            k71Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(k71Var.U0, 0.0f);
            ofFloat.addUpdateListener(new y11(this, 8));
            ofFloat.addListener(new ep0(this, 20));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.is.f27443f);
            ofFloat.start();
        }
    }

    @Override
    public final void q(float f7) {
    }
}
