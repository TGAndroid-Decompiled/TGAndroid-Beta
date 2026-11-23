package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h01 implements org.telegram.ui.Components.tj0 {
    public final int f48390a;
    public final Context f48391b;
    public final org.telegram.ui.ActionBar.i6 f48392c;
    public final Integer d;
    public final q11 f48393e;

    public h01(q11 q11Var, int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, Integer num) {
        this.f48393e = q11Var;
        this.f48390a = i7;
        this.f48391b = context;
        this.f48392c = i6Var;
        this.d = num;
    }

    @Override
    public final boolean mo24g(float f10, float f11, int i7, View view) {
        q11 q11Var = this.f48393e;
        int i10 = q11Var.W;
        int i11 = this.f48390a;
        if (i11 != 11 && i11 != 13 && q11Var.f51248i1) {
            boolean z10 = view instanceof a11;
            if (z10 && (i11 == 1 || i11 == 8)) {
                q11Var.l();
                try {
                    q11Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                a11 a11Var = (a11) view;
                if (!a11Var.f45553s && !org.telegram.messenger.i10.i(i10).q()) {
                    org.telegram.ui.Components.x5 x5Var = a11Var.f45549e;
                    TLRPC.Document document = x5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.o5.e(i10, x5Var.documentId);
                    }
                    q11Var.p(a11Var, Long.valueOf(a11Var.f45549e.documentId), document, a11Var.f45554w, null);
                    return true;
                }
                q11Var.T0 = a11Var;
                q11Var.V0 = 0.0f;
                q11Var.U0 = false;
                if (a11Var.f45553s) {
                    q11Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(i10).f26734r.get(q11Var.T0.f45556y.f5470f);
                    if (tL_availableReaction != null) {
                        q11Var.W0.s0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", q11Var.T0.f45556y, 0);
                    }
                } else {
                    q11Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.o5(4, i10, q11Var.T0.f45549e.documentId));
                }
                q11Var.f51247i0.invalidate();
                q11Var.m();
                return true;
            } else if (z10) {
                a11 a11Var2 = (a11) view;
                if (a11Var2.f45549e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = a11Var2.f45554w;
                    g01 g01Var = new g01(this, this.f48391b, q11Var.V1, q11Var, a11Var2, this.f48392c, view, tL_starGiftUnique);
                    q11Var.Y0 = g01Var;
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
    public final void h() {
        q11 q11Var = this.f48393e;
        if (q11Var.T0 != null) {
            q11Var.U0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(q11Var.V0, 0.0f);
            ofFloat.addUpdateListener(new hz0(this, 4));
            ofFloat.addListener(new zx(this, 27));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.kr.f36858f);
            ofFloat.start();
        }
    }

    @Override
    public final void l(float f10) {
    }
}
