package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p41 implements org.telegram.ui.Components.zl0 {
    public final int f39936a;
    public final Context f39937b;
    public final org.telegram.ui.ActionBar.d6 f39938c;
    public final Integer d;
    public final z51 e;

    public p41(z51 z51Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        this.e = z51Var;
        this.f39936a = i10;
        this.f39937b = context;
        this.f39938c = d6Var;
        this.d = num;
    }

    @Override
    public final boolean mo17d(float f7, float f10, int i10, View view) {
        z51 z51Var = this.e;
        int i11 = z51Var.V;
        int i12 = this.f39936a;
        if (i12 != 11 && i12 != 13 && z51Var.f43587h1) {
            boolean z10 = view instanceof i51;
            if (z10 && (i12 == 1 || i12 == 8)) {
                z51Var.l();
                try {
                    z51Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                i51 i51Var = (i51) view;
                if (!i51Var.f37730s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.a6 a6Var = i51Var.e;
                    TLRPC.Document document = a6Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.r5.f(i11, a6Var.documentId);
                    }
                    z51Var.p(i51Var, Long.valueOf(i51Var.e.documentId), document, i51Var.v, null);
                    return true;
                }
                z51Var.S0 = i51Var;
                z51Var.U0 = 0.0f;
                z51Var.T0 = false;
                if (i51Var.f37730s) {
                    z51Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(z51Var.S0.f37732x.f785f);
                    if (tL_availableReaction != null) {
                        z51Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", z51Var.S0.f37732x, 0);
                    }
                } else {
                    z51Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.r5(4, i11, z51Var.S0.e.documentId));
                }
                z51Var.f43586h0.invalidate();
                z51Var.m();
                return true;
            } else if (z10) {
                i51 i51Var2 = (i51) view;
                if (i51Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = i51Var2.v;
                    o41 o41Var = new o41(this, this.f39937b, z51Var.T1, z51Var, i51Var2, this.f39938c, view, tL_starGiftUnique);
                    z51Var.X0 = o41Var;
                    o41Var.show();
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
        z51 z51Var = this.e;
        if (z51Var.S0 != null) {
            z51Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z51Var.U0, 0.0f);
            ofFloat.addUpdateListener(new e11(this, 6));
            ofFloat.addListener(new bc0(this, 24));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.bs.f25030f);
            ofFloat.start();
        }
    }

    @Override
    public final void o(float f7) {
    }
}
