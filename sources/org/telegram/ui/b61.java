package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b61 implements org.telegram.ui.Components.ml0 {
    public final int f31167a;
    public final Context f31168b;
    public final org.telegram.ui.ActionBar.f6 f31169c;
    public final Integer d;
    public final l71 e;

    public b61(l71 l71Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        this.e = l71Var;
        this.f31167a = i10;
        this.f31168b = context;
        this.f31169c = f6Var;
        this.d = num;
    }

    @Override
    public final boolean mo18c(float f7, float f10, int i10, View view) {
        l71 l71Var = this.e;
        int i11 = l71Var.V;
        int i12 = this.f31167a;
        if (i12 != 11 && i12 != 13 && l71Var.f34571h1) {
            boolean z10 = view instanceof u61;
            if (z10 && (i12 == 1 || i12 == 8)) {
                l71Var.l();
                try {
                    l71Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                u61 u61Var = (u61) view;
                if (!u61Var.f37133s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.y5 y5Var = u61Var.e;
                    TLRPC.Document document = y5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.p5.f(i11, y5Var.documentId);
                    }
                    l71Var.p(u61Var, Long.valueOf(u61Var.e.documentId), document, u61Var.v, null);
                    return true;
                }
                l71Var.S0 = u61Var;
                l71Var.U0 = 0.0f;
                l71Var.T0 = false;
                if (u61Var.f37133s) {
                    l71Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(l71Var.S0.f37135x.f47101f);
                    if (tL_availableReaction != null) {
                        l71Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", l71Var.S0.f37135x, 0);
                    }
                } else {
                    l71Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.p5(4, i11, l71Var.S0.e.documentId));
                }
                l71Var.f34570h0.invalidate();
                l71Var.m();
                return true;
            } else if (z10) {
                u61 u61Var2 = (u61) view;
                if (u61Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = u61Var2.v;
                    a61 a61Var = new a61(this, this.f31168b, l71Var.T1, l71Var, u61Var2, this.f31169c, view, tL_starGiftUnique);
                    l71Var.X0 = a61Var;
                    a61Var.show();
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
        l71 l71Var = this.e;
        if (l71Var.S0 != null) {
            l71Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(l71Var.U0, 0.0f);
            ofFloat.addUpdateListener(new f21(this, 8));
            ofFloat.addListener(new mv0(this, 9));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.wr.f28819f);
            ofFloat.start();
        }
    }

    @Override
    public final void p(float f7) {
    }
}
