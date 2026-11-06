package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h01 implements org.telegram.ui.Components.ej0 {
    public final int f46157a;
    public final Context f46158b;
    public final org.telegram.ui.ActionBar.f6 f46159c;
    public final Integer d;
    public final q11 f46160e;

    public h01(q11 q11Var, int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        this.f46160e = q11Var;
        this.f46157a = i7;
        this.f46158b = context;
        this.f46159c = f6Var;
        this.d = num;
    }

    @Override
    public final boolean mo19f(float f10, float f11, int i7, View view) {
        q11 q11Var = this.f46160e;
        int i10 = q11Var.V;
        int i11 = this.f46157a;
        if (i11 != 11 && i11 != 13 && q11Var.f49009h1) {
            boolean z9 = view instanceof a11;
            if (z9 && (i11 == 1 || i11 == 8)) {
                q11Var.l();
                try {
                    q11Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                a11 a11Var = (a11) view;
                if (!a11Var.f43512s && !org.telegram.messenger.p10.i(i10).q()) {
                    org.telegram.ui.Components.r5 r5Var = a11Var.f43508e;
                    TLRPC.Document document = r5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.i5.e(i10, r5Var.documentId);
                    }
                    q11Var.p(a11Var, Long.valueOf(a11Var.f43508e.documentId), document, a11Var.f43513w, null);
                    return true;
                }
                q11Var.S0 = a11Var;
                q11Var.U0 = 0.0f;
                q11Var.T0 = false;
                if (a11Var.f43512s) {
                    q11Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i10).f25825r.get(q11Var.S0.f43515y.f6356f);
                    if (tL_availableReaction != null) {
                        q11Var.V0.r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", q11Var.S0.f43515y, 0);
                    }
                } else {
                    q11Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.i5(4, i10, q11Var.S0.f43508e.documentId));
                }
                q11Var.f49008h0.invalidate();
                q11Var.m();
                return true;
            } else if (z9) {
                a11 a11Var2 = (a11) view;
                if (a11Var2.f43508e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = a11Var2.f43513w;
                    g01 g01Var = new g01(this, this.f46158b, q11Var.U1, q11Var, a11Var2, this.f46159c, view, tL_starGiftUnique);
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
        q11 q11Var = this.f46160e;
        if (q11Var.S0 != null) {
            q11Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(q11Var.U0, 0.0f);
            ofFloat.addUpdateListener(new gz0(this, 4));
            ofFloat.addListener(new d30(this, 26));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.xq.f40310f);
            ofFloat.start();
        }
    }

    @Override
    public final void q(float f10) {
    }
}
