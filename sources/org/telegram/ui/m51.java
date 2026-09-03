package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m51 implements org.telegram.ui.Components.kl0 {
    public final int f35984a;
    public final Context f35985b;
    public final org.telegram.ui.ActionBar.f6 f35986c;
    public final Integer d;
    public final x61 e;

    public m51(x61 x61Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        this.e = x61Var;
        this.f35984a = i10;
        this.f35985b = context;
        this.f35986c = f6Var;
        this.d = num;
    }

    @Override
    public final boolean mo17c(float f10, float f11, int i10, View view) {
        x61 x61Var = this.e;
        int i11 = x61Var.S;
        int i12 = this.f35984a;
        if (i12 != 11 && i12 != 13 && x61Var.f39863e1) {
            boolean z4 = view instanceof f61;
            if (z4 && (i12 == 1 || i12 == 8)) {
                x61Var.l();
                try {
                    x61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                f61 f61Var = (f61) view;
                if (!f61Var.f33969s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.u5 u5Var = f61Var.e;
                    TLRPC.Document document = u5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.l5.f(i11, u5Var.documentId);
                    }
                    x61Var.p(f61Var, Long.valueOf(f61Var.e.documentId), document, f61Var.v, null);
                    return true;
                }
                x61Var.P0 = f61Var;
                x61Var.R0 = 0.0f;
                x61Var.Q0 = false;
                if (f61Var.f33969s) {
                    x61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(x61Var.P0.f33971x.f14095f);
                    if (tL_availableReaction != null) {
                        x61Var.S0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", x61Var.P0.f33971x, 0);
                    }
                } else {
                    x61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.l5(4, i11, x61Var.P0.e.documentId));
                }
                x61Var.f39862e0.invalidate();
                x61Var.m();
                return true;
            } else if (z4) {
                f61 f61Var2 = (f61) view;
                if (f61Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = f61Var2.v;
                    l51 l51Var = new l51(this, this.f35985b, x61Var.Q1, x61Var, f61Var2, this.f35986c, view, tL_starGiftUnique);
                    x61Var.U0 = l51Var;
                    l51Var.show();
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
        x61 x61Var = this.e;
        if (x61Var.P0 != null) {
            x61Var.Q0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(x61Var.R0, 0.0f);
            ofFloat.addUpdateListener(new o11(this, 8));
            ofFloat.addListener(new ss0(this, 18));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.mr.f27122f);
            ofFloat.start();
        }
    }

    @Override
    public final void p(float f10) {
    }
}
