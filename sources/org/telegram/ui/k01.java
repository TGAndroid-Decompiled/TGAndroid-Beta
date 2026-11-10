package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k01 implements org.telegram.ui.Components.ej0 {
    public final int f47128a;
    public final Context f47129b;
    public final org.telegram.ui.ActionBar.h6 f47130c;
    public final Integer d;
    public final t11 f47131e;

    public k01(t11 t11Var, int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, Integer num) {
        this.f47131e = t11Var;
        this.f47128a = i7;
        this.f47129b = context;
        this.f47130c = h6Var;
        this.d = num;
    }

    @Override
    public final boolean mo19f(float f10, float f11, int i7, View view) {
        t11 t11Var = this.f47131e;
        int i10 = t11Var.V;
        int i11 = this.f47128a;
        if (i11 != 11 && i11 != 13 && t11Var.f50037h1) {
            boolean z9 = view instanceof d11;
            if (z9 && (i11 == 1 || i11 == 8)) {
                t11Var.l();
                try {
                    t11Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                d11 d11Var = (d11) view;
                if (!d11Var.f44878s && !org.telegram.messenger.p10.i(i10).q()) {
                    org.telegram.ui.Components.q5 q5Var = d11Var.f44874e;
                    TLRPC.Document document = q5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.h5.e(i10, q5Var.documentId);
                    }
                    t11Var.p(d11Var, Long.valueOf(d11Var.f44874e.documentId), document, d11Var.f44879w, null);
                    return true;
                }
                t11Var.S0 = d11Var;
                t11Var.U0 = 0.0f;
                t11Var.T0 = false;
                if (d11Var.f44878s) {
                    t11Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i10).f25840r.get(t11Var.S0.f44881y.f6359f);
                    if (tL_availableReaction != null) {
                        t11Var.V0.r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", t11Var.S0.f44881y, 0);
                    }
                } else {
                    t11Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.h5(4, i10, t11Var.S0.f44874e.documentId));
                }
                t11Var.f50036h0.invalidate();
                t11Var.m();
                return true;
            } else if (z9) {
                d11 d11Var2 = (d11) view;
                if (d11Var2.f44874e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = d11Var2.f44879w;
                    j01 j01Var = new j01(this, this.f47129b, t11Var.U1, t11Var, d11Var2, this.f47130c, view, tL_starGiftUnique);
                    t11Var.X0 = j01Var;
                    j01Var.show();
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
        t11 t11Var = this.f47131e;
        if (t11Var.S0 != null) {
            t11Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(t11Var.U0, 0.0f);
            ofFloat.addUpdateListener(new kz0(this, 4));
            ofFloat.addListener(new g30(this, 26));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.wq.f40046f);
            ofFloat.start();
        }
    }

    @Override
    public final void q(float f10) {
    }
}
