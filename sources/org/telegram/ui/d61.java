package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d61 implements org.telegram.ui.Components.nm0 {
    public final int f36662a;
    public final Context f36663b;
    public final org.telegram.ui.ActionBar.c6 f36664c;
    public final Integer d;
    public final n71 f36665e;

    public d61(n71 n71Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        this.f36665e = n71Var;
        this.f36662a = i10;
        this.f36663b = context;
        this.f36664c = c6Var;
        this.d = num;
    }

    @Override
    public final boolean mo17c(float f7, float f10, int i10, View view) {
        n71 n71Var = this.f36665e;
        int i11 = n71Var.V;
        int i12 = this.f36662a;
        if (i12 != 11 && i12 != 13 && n71Var.f40273h1) {
            boolean z10 = view instanceof w61;
            if (z10 && (i12 == 1 || i12 == 8)) {
                n71Var.l();
                try {
                    n71Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                w61 w61Var = (w61) view;
                if (!w61Var.f43059s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.b6 b6Var = w61Var.f43055e;
                    TLRPC.Document document = b6Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.s5.f(i11, b6Var.documentId);
                    }
                    n71Var.p(w61Var, Long.valueOf(w61Var.f43055e.documentId), document, w61Var.v, null);
                    return true;
                }
                n71Var.S0 = w61Var;
                n71Var.U0 = 0.0f;
                n71Var.T0 = false;
                if (w61Var.f43059s) {
                    n71Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(n71Var.S0.f43061x.f54841f);
                    if (tL_availableReaction != null) {
                        n71Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", n71Var.S0.f43061x, 0);
                    }
                } else {
                    n71Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.s5(4, i11, n71Var.S0.f43055e.documentId));
                }
                n71Var.f40272h0.invalidate();
                n71Var.m();
                return true;
            } else if (z10) {
                w61 w61Var2 = (w61) view;
                if (w61Var2.f43055e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = w61Var2.v;
                    c61 c61Var = new c61(this, this.f36663b, n71Var.T1, n71Var, w61Var2, this.f36664c, view, tL_starGiftUnique);
                    n71Var.X0 = c61Var;
                    c61Var.show();
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
        n71 n71Var = this.f36665e;
        if (n71Var.S0 != null) {
            n71Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(n71Var.U0, 0.0f);
            ofFloat.addUpdateListener(new a21(this, 8));
            ofFloat.addListener(new gp0(this, 20));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.js.f27627f);
            ofFloat.start();
        }
    }

    @Override
    public final void q(float f7) {
    }
}
