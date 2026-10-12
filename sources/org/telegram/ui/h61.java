package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h61 implements org.telegram.ui.Components.dm0 {
    public final int f36628a;
    public final Context f36629b;
    public final org.telegram.ui.ActionBar.c6 f36630c;
    public final Integer d;
    public final r71 e;

    public h61(r71 r71Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        this.e = r71Var;
        this.f36628a = i10;
        this.f36629b = context;
        this.f36630c = c6Var;
        this.d = num;
    }

    @Override
    public final boolean mo17d(float f7, float f10, int i10, View view) {
        r71 r71Var = this.e;
        int i11 = r71Var.V;
        int i12 = this.f36628a;
        if (i12 != 11 && i12 != 13 && r71Var.f39638h1) {
            boolean z10 = view instanceof a71;
            if (z10 && (i12 == 1 || i12 == 8)) {
                r71Var.l();
                try {
                    r71Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                a71 a71Var = (a71) view;
                if (!a71Var.f34069s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.b6 b6Var = a71Var.e;
                    TLRPC.Document document = b6Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.s5.f(i11, b6Var.documentId);
                    }
                    r71Var.p(a71Var, Long.valueOf(a71Var.e.documentId), document, a71Var.v, null);
                    return true;
                }
                r71Var.S0 = a71Var;
                r71Var.U0 = 0.0f;
                r71Var.T0 = false;
                if (a71Var.f34069s) {
                    r71Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(r71Var.S0.f34071x.f779f);
                    if (tL_availableReaction != null) {
                        r71Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", r71Var.S0.f34071x, 0);
                    }
                } else {
                    r71Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.s5(4, i11, r71Var.S0.e.documentId));
                }
                r71Var.f39637h0.invalidate();
                r71Var.m();
                return true;
            } else if (z10) {
                a71 a71Var2 = (a71) view;
                if (a71Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = a71Var2.v;
                    g61 g61Var = new g61(this, this.f36629b, r71Var.T1, r71Var, a71Var2, this.f36630c, view, tL_starGiftUnique);
                    r71Var.X0 = g61Var;
                    g61Var.show();
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
        r71 r71Var = this.e;
        if (r71Var.S0 != null) {
            r71Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(r71Var.U0, 0.0f);
            ofFloat.addUpdateListener(new f21(this, 8));
            ofFloat.addListener(new lj0(this, 23));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.es.f24771f);
            ofFloat.start();
        }
    }

    @Override
    public final void q(float f7) {
    }
}
