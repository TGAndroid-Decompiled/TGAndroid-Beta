package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i01 implements org.telegram.ui.Components.rj0 {
    public final int f48555a;
    public final Context f48556b;
    public final org.telegram.ui.ActionBar.i6 f48557c;
    public final Integer d;
    public final r11 f48558e;

    public i01(r11 r11Var, int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, Integer num) {
        this.f48558e = r11Var;
        this.f48555a = i7;
        this.f48556b = context;
        this.f48557c = i6Var;
        this.d = num;
    }

    @Override
    public final boolean mo23f(float f10, float f11, int i7, View view) {
        r11 r11Var = this.f48558e;
        int i10 = r11Var.W;
        int i11 = this.f48555a;
        if (i11 != 11 && i11 != 13 && r11Var.f51439i1) {
            boolean z10 = view instanceof b11;
            if (z10 && (i11 == 1 || i11 == 8)) {
                r11Var.l();
                try {
                    r11Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                b11 b11Var = (b11) view;
                if (!b11Var.f45728s && !org.telegram.messenger.j10.i(i10).q()) {
                    org.telegram.ui.Components.x5 x5Var = b11Var.f45724e;
                    TLRPC.Document document = x5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.o5.e(i10, x5Var.documentId);
                    }
                    r11Var.p(b11Var, Long.valueOf(b11Var.f45724e.documentId), document, b11Var.f45729w, null);
                    return true;
                }
                r11Var.T0 = b11Var;
                r11Var.V0 = 0.0f;
                r11Var.U0 = false;
                if (b11Var.f45728s) {
                    r11Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(i10).f26635r.get(r11Var.T0.f45731y.f5478f);
                    if (tL_availableReaction != null) {
                        r11Var.W0.r0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", r11Var.T0.f45731y, 0);
                    }
                } else {
                    r11Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.o5(4, i10, r11Var.T0.f45724e.documentId));
                }
                r11Var.f51438i0.invalidate();
                r11Var.m();
                return true;
            } else if (z10) {
                b11 b11Var2 = (b11) view;
                if (b11Var2.f45724e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = b11Var2.f45729w;
                    h01 h01Var = new h01(this, this.f48556b, r11Var.V1, r11Var, b11Var2, this.f48557c, view, tL_starGiftUnique);
                    r11Var.Y0 = h01Var;
                    h01Var.show();
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
    public final void j() {
        r11 r11Var = this.f48558e;
        if (r11Var.T0 != null) {
            r11Var.U0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(r11Var.V0, 0.0f);
            ofFloat.addUpdateListener(new iz0(this, 4));
            ofFloat.addListener(new ay(this, 27));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.lr.f37208f);
            ofFloat.start();
        }
    }

    @Override
    public final void r(float f10) {
    }
}
