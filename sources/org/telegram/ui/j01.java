package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j01 implements org.telegram.ui.Components.tj0 {
    public final int f48854a;
    public final Context f48855b;
    public final org.telegram.ui.ActionBar.h6 f48856c;
    public final Integer d;
    public final s11 f48857e;

    public j01(s11 s11Var, int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, Integer num) {
        this.f48857e = s11Var;
        this.f48854a = i7;
        this.f48855b = context;
        this.f48856c = h6Var;
        this.d = num;
    }

    @Override
    public final boolean mo23f(float f10, float f11, int i7, View view) {
        s11 s11Var = this.f48857e;
        int i10 = s11Var.W;
        int i11 = this.f48854a;
        if (i11 != 11 && i11 != 13 && s11Var.f51841i1) {
            boolean z10 = view instanceof c11;
            if (z10 && (i11 == 1 || i11 == 8)) {
                s11Var.l();
                try {
                    s11Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                c11 c11Var = (c11) view;
                if (!c11Var.f46385s && !org.telegram.messenger.j10.i(i10).q()) {
                    org.telegram.ui.Components.y5 y5Var = c11Var.f46381e;
                    TLRPC.Document document = y5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.p5.e(i10, y5Var.documentId);
                    }
                    s11Var.p(c11Var, Long.valueOf(c11Var.f46381e.documentId), document, c11Var.f46386w, null);
                    return true;
                }
                s11Var.T0 = c11Var;
                s11Var.V0 = 0.0f;
                s11Var.U0 = false;
                if (c11Var.f46385s) {
                    s11Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(i10).f26661r.get(s11Var.T0.f46388y.f5504f);
                    if (tL_availableReaction != null) {
                        s11Var.W0.r0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", s11Var.T0.f46388y, 0);
                    }
                } else {
                    s11Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.p5(4, i10, s11Var.T0.f46381e.documentId));
                }
                s11Var.f51840i0.invalidate();
                s11Var.m();
                return true;
            } else if (z10) {
                c11 c11Var2 = (c11) view;
                if (c11Var2.f46381e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = c11Var2.f46386w;
                    i01 i01Var = new i01(this, this.f48855b, s11Var.V1, s11Var, c11Var2, this.f48856c, view, tL_starGiftUnique);
                    s11Var.Y0 = i01Var;
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
    public final void j() {
        s11 s11Var = this.f48857e;
        if (s11Var.T0 != null) {
            s11Var.U0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(s11Var.V0, 0.0f);
            ofFloat.addUpdateListener(new iz0(this, 4));
            ofFloat.addListener(new ay(this, 27));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.nr.f37956f);
            ofFloat.start();
        }
    }

    @Override
    public final void r(float f10) {
    }
}
