package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j01 implements org.telegram.ui.Components.fj0 {
    public final int f46805a;
    public final Context f46806b;
    public final org.telegram.ui.ActionBar.g6 f46807c;
    public final Integer d;
    public final s11 f46808e;

    public j01(s11 s11Var, int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        this.f46808e = s11Var;
        this.f46805a = i7;
        this.f46806b = context;
        this.f46807c = g6Var;
        this.d = num;
    }

    @Override
    public final boolean mo19f(float f10, float f11, int i7, View view) {
        s11 s11Var = this.f46808e;
        int i10 = s11Var.V;
        int i11 = this.f46805a;
        if (i11 != 11 && i11 != 13 && s11Var.f49681h1) {
            boolean z9 = view instanceof c11;
            if (z9 && (i11 == 1 || i11 == 8)) {
                s11Var.l();
                try {
                    s11Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                c11 c11Var = (c11) view;
                if (!c11Var.f44195s && !org.telegram.messenger.p10.i(i10).q()) {
                    org.telegram.ui.Components.r5 r5Var = c11Var.f44191e;
                    TLRPC.Document document = r5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.i5.e(i10, r5Var.documentId);
                    }
                    s11Var.p(c11Var, Long.valueOf(c11Var.f44191e.documentId), document, c11Var.f44196w, null);
                    return true;
                }
                s11Var.S0 = c11Var;
                s11Var.U0 = 0.0f;
                s11Var.T0 = false;
                if (c11Var.f44195s) {
                    s11Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i10).f25836r.get(s11Var.S0.f44198y.f6354f);
                    if (tL_availableReaction != null) {
                        s11Var.V0.r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", s11Var.S0.f44198y, 0);
                    }
                } else {
                    s11Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.i5(4, i10, s11Var.S0.f44191e.documentId));
                }
                s11Var.f49680h0.invalidate();
                s11Var.m();
                return true;
            } else if (z9) {
                c11 c11Var2 = (c11) view;
                if (c11Var2.f44191e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = c11Var2.f44196w;
                    i01 i01Var = new i01(this, this.f46806b, s11Var.U1, s11Var, c11Var2, this.f46807c, view, tL_starGiftUnique);
                    s11Var.X0 = i01Var;
                    i01Var.show();
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
        s11 s11Var = this.f46808e;
        if (s11Var.S0 != null) {
            s11Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(s11Var.U0, 0.0f);
            ofFloat.addUpdateListener(new jz0(this, 4));
            ofFloat.addListener(new f30(this, 26));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.xq.f40458f);
            ofFloat.start();
        }
    }

    @Override
    public final void q(float f10) {
    }
}
