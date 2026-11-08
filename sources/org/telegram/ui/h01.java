package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h01 implements org.telegram.ui.Components.ej0 {
    public final int f46178a;
    public final Context f46179b;
    public final org.telegram.ui.ActionBar.f6 f46180c;
    public final Integer d;
    public final q11 f46181e;

    public h01(q11 q11Var, int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        this.f46181e = q11Var;
        this.f46178a = i7;
        this.f46179b = context;
        this.f46180c = f6Var;
        this.d = num;
    }

    @Override
    public final boolean mo19f(float f10, float f11, int i7, View view) {
        q11 q11Var = this.f46181e;
        int i10 = q11Var.V;
        int i11 = this.f46178a;
        if (i11 != 11 && i11 != 13 && q11Var.f49038h1) {
            boolean z9 = view instanceof a11;
            if (z9 && (i11 == 1 || i11 == 8)) {
                q11Var.l();
                try {
                    q11Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                a11 a11Var = (a11) view;
                if (!a11Var.f43539s && !org.telegram.messenger.p10.i(i10).q()) {
                    org.telegram.ui.Components.r5 r5Var = a11Var.f43535e;
                    TLRPC.Document document = r5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.i5.e(i10, r5Var.documentId);
                    }
                    q11Var.p(a11Var, Long.valueOf(a11Var.f43535e.documentId), document, a11Var.f43540w, null);
                    return true;
                }
                q11Var.S0 = a11Var;
                q11Var.U0 = 0.0f;
                q11Var.T0 = false;
                if (a11Var.f43539s) {
                    q11Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i10).f25836r.get(q11Var.S0.f43542y.f6356f);
                    if (tL_availableReaction != null) {
                        q11Var.V0.r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", q11Var.S0.f43542y, 0);
                    }
                } else {
                    q11Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.i5(4, i10, q11Var.S0.f43535e.documentId));
                }
                q11Var.f49037h0.invalidate();
                q11Var.m();
                return true;
            } else if (z9) {
                a11 a11Var2 = (a11) view;
                if (a11Var2.f43535e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = a11Var2.f43540w;
                    g01 g01Var = new g01(this, this.f46179b, q11Var.U1, q11Var, a11Var2, this.f46180c, view, tL_starGiftUnique);
                    q11Var.X0 = g01Var;
                    g01Var.show();
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
        q11 q11Var = this.f46181e;
        if (q11Var.S0 != null) {
            q11Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(q11Var.U0, 0.0f);
            ofFloat.addUpdateListener(new gz0(this, 4));
            ofFloat.addListener(new d30(this, 26));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.xq.f40366f);
            ofFloat.start();
        }
    }

    @Override
    public final void q(float f10) {
    }
}
