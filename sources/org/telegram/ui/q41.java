package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q41 implements org.telegram.ui.Components.cm0 {
    public final int f40709a;
    public final Context f40710b;
    public final org.telegram.ui.ActionBar.g6 f40711c;
    public final Integer d;
    public final a61 e;

    public q41(a61 a61Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        this.e = a61Var;
        this.f40709a = i10;
        this.f40710b = context;
        this.f40711c = g6Var;
        this.d = num;
    }

    @Override
    public final boolean mo17c(float f7, float f10, int i10, View view) {
        a61 a61Var = this.e;
        int i11 = a61Var.V;
        int i12 = this.f40709a;
        if (i12 != 11 && i12 != 13 && a61Var.f35623h1) {
            boolean z10 = view instanceof j51;
            if (z10 && (i12 == 1 || i12 == 8)) {
                a61Var.l();
                try {
                    a61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                j51 j51Var = (j51) view;
                if (!j51Var.f38468s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.y5 y5Var = j51Var.e;
                    TLRPC.Document document = y5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.p5.f(i11, y5Var.documentId);
                    }
                    a61Var.p(j51Var, Long.valueOf(j51Var.e.documentId), document, j51Var.v, null);
                    return true;
                }
                a61Var.S0 = j51Var;
                a61Var.U0 = 0.0f;
                a61Var.T0 = false;
                if (j51Var.f38468s) {
                    a61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(a61Var.S0.f38470x.f784f);
                    if (tL_availableReaction != null) {
                        a61Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", a61Var.S0.f38470x, 0);
                    }
                } else {
                    a61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.p5(4, i11, a61Var.S0.e.documentId));
                }
                a61Var.f35622h0.invalidate();
                a61Var.m();
                return true;
            } else if (z10) {
                j51 j51Var2 = (j51) view;
                if (j51Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = j51Var2.v;
                    p41 p41Var = new p41(this, this.f40710b, a61Var.U1, a61Var, j51Var2, this.f40711c, view, tL_starGiftUnique);
                    a61Var.X0 = p41Var;
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
    public final void h() {
        a61 a61Var = this.e;
        if (a61Var.S0 != null) {
            a61Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(a61Var.U0, 0.0f);
            ofFloat.addUpdateListener(new f11(this, 6));
            ofFloat.addListener(new v70(this, 25));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.zr.f33337f);
            ofFloat.start();
        }
    }

    @Override
    public final void o(float f7) {
    }
}
