package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m51 implements org.telegram.ui.Components.ll0 {
    public final int f38857a;
    public final Context f38858b;
    public final org.telegram.ui.ActionBar.g6 f38859c;
    public final Integer d;
    public final w61 f38860e;

    public m51(w61 w61Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        this.f38860e = w61Var;
        this.f38857a = i10;
        this.f38858b = context;
        this.f38859c = g6Var;
        this.d = num;
    }

    @Override
    public final boolean mo17c(float f10, float f11, int i10, View view) {
        w61 w61Var = this.f38860e;
        int i11 = w61Var.S;
        int i12 = this.f38857a;
        if (i12 != 11 && i12 != 13 && w61Var.f42315e1) {
            boolean z4 = view instanceof f61;
            if (z4 && (i12 == 1 || i12 == 8)) {
                w61Var.l();
                try {
                    w61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                f61 f61Var = (f61) view;
                if (!f61Var.f36684s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.u5 u5Var = f61Var.f36680e;
                    TLRPC.Document document = u5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.l5.f(i11, u5Var.documentId);
                    }
                    w61Var.p(f61Var, Long.valueOf(f61Var.f36680e.documentId), document, f61Var.v, null);
                    return true;
                }
                w61Var.P0 = f61Var;
                w61Var.R0 = 0.0f;
                w61Var.Q0 = false;
                if (f61Var.f36684s) {
                    w61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(w61Var.P0.f36686x.f16180f);
                    if (tL_availableReaction != null) {
                        w61Var.S0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", w61Var.P0.f36686x, 0);
                    }
                } else {
                    w61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.l5(4, i11, w61Var.P0.f36680e.documentId));
                }
                w61Var.f42314e0.invalidate();
                w61Var.m();
                return true;
            } else if (z4) {
                f61 f61Var2 = (f61) view;
                if (f61Var2.f36680e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = f61Var2.v;
                    l51 l51Var = new l51(this, this.f38858b, w61Var.Q1, w61Var, f61Var2, this.f38859c, view, tL_starGiftUnique);
                    w61Var.U0 = l51Var;
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
        w61 w61Var = this.f38860e;
        if (w61Var.P0 != null) {
            w61Var.Q0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(w61Var.R0, 0.0f);
            ofFloat.addUpdateListener(new n11(this, 8));
            ofFloat.addListener(new ss0(this, 18));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.pr.f30168f);
            ofFloat.start();
        }
    }

    @Override
    public final void p(float f10) {
    }
}
