package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q51 implements org.telegram.ui.Components.nl0 {
    public final int f36799a;
    public final Context f36800b;
    public final org.telegram.ui.ActionBar.d6 f36801c;
    public final Integer d;
    public final a71 e;

    public q51(a71 a71Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        this.e = a71Var;
        this.f36799a = i10;
        this.f36800b = context;
        this.f36801c = d6Var;
        this.d = num;
    }

    @Override
    public final boolean mo18c(float f7, float f10, int i10, View view) {
        a71 a71Var = this.e;
        int i11 = a71Var.V;
        int i12 = this.f36799a;
        if (i12 != 11 && i12 != 13 && a71Var.f32028h1) {
            boolean z10 = view instanceof j61;
            if (z10 && (i12 == 1 || i12 == 8)) {
                a71Var.l();
                try {
                    a71Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                j61 j61Var = (j61) view;
                if (!j61Var.f34668s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.z5 z5Var = j61Var.e;
                    TLRPC.Document document = z5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.q5.f(i11, z5Var.documentId);
                    }
                    a71Var.p(j61Var, Long.valueOf(j61Var.e.documentId), document, j61Var.v, null);
                    return true;
                }
                a71Var.S0 = j61Var;
                a71Var.U0 = 0.0f;
                a71Var.T0 = false;
                if (j61Var.f34668s) {
                    a71Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(a71Var.S0.f34670x.f49396f);
                    if (tL_availableReaction != null) {
                        a71Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", a71Var.S0.f34670x, 0);
                    }
                } else {
                    a71Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.q5(4, i11, a71Var.S0.e.documentId));
                }
                a71Var.f32027h0.invalidate();
                a71Var.m();
                return true;
            } else if (z10) {
                j61 j61Var2 = (j61) view;
                if (j61Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = j61Var2.v;
                    p51 p51Var = new p51(this, this.f36800b, a71Var.T1, a71Var, j61Var2, this.f36801c, view, tL_starGiftUnique);
                    a71Var.X0 = p51Var;
                    p51Var.show();
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
    public final void g() {
        a71 a71Var = this.e;
        if (a71Var.S0 != null) {
            a71Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(a71Var.U0, 0.0f);
            ofFloat.addUpdateListener(new q11(this, 8));
            ofFloat.addListener(new xo0(this, 20));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.rr.f28030f);
            ofFloat.start();
        }
    }

    @Override
    public final void q(float f7) {
    }
}
