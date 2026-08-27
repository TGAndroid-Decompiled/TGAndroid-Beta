package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class q41 implements org.telegram.ui.Components.sk0 {

    public final int f41518a;

    public final Context f41519b;

    public final org.telegram.ui.ActionBar.c6 f41520c;
    public final Integer d;

    public final a61 f41521e;

    public q41(a61 a61Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        this.f41521e = a61Var;
        this.f41518a = i10;
        this.f41519b = context;
        this.f41520c = c6Var;
        this.d = num;
    }

    @Override
    public final boolean mo5c(float f10, float f11, int i10, View view) {
        a61 a61Var = this.f41521e;
        int i11 = a61Var.R;
        int i12 = this.f41518a;
        if (i12 != 11 && i12 != 13 && a61Var.f36393d1) {
            boolean z10 = view instanceof j51;
            if (z10 && (i12 == 1 || i12 == 8)) {
                a61Var.l();
                try {
                    a61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                j51 j51Var = (j51) view;
                if (!j51Var.f39263s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.t5 t5Var = j51Var.f39259e;
                    TLRPC.Document documentF = t5Var.document;
                    if (documentF == null) {
                        documentF = org.telegram.ui.Components.k5.f(i11, t5Var.documentId);
                    }
                    a61Var.p(j51Var, Long.valueOf(j51Var.f39259e.documentId), documentF, j51Var.v, null);
                    return true;
                }
                a61Var.O0 = j51Var;
                a61Var.Q0 = 0.0f;
                a61Var.P0 = false;
                if (j51Var.f39263s) {
                    a61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(a61Var.O0.f39265x.f11412f);
                    if (tL_availableReaction != null) {
                        a61Var.R0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", a61Var.O0.f39265x, 0);
                    }
                } else {
                    a61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.k5(4, i11, a61Var.O0.f39259e.documentId));
                }
                a61Var.f36392d0.invalidate();
                a61Var.m();
                return true;
            }
            if (z10) {
                j51 j51Var2 = (j51) view;
                if (j51Var2.f39259e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = j51Var2.v;
                    p41 p41Var = new p41(this, this.f41519b, a61Var.P1, a61Var, j51Var2, this.f41520c, view, tL_starGiftUnique);
                    a61Var.T0 = p41Var;
                    p41Var.show();
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
    public final void i() {
        a61 a61Var = this.f41521e;
        if (a61Var.O0 != null) {
            a61Var.P0 = true;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(a61Var.Q0, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new w01(this, 8));
            valueAnimatorOfFloat.addListener(new f50(this, 27));
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.f28122f);
            valueAnimatorOfFloat.start();
        }
    }

    @Override
    public final void s(float f10) {
    }
}
