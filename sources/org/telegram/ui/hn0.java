package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class hn0 extends g31 {
    public final kn0 f37840e2;
    public final x21[] f37841f2;
    public final ln0 f37842g2;

    public hn0(ln0 ln0Var, org.telegram.ui.ActionBar.k2 k2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12, kn0 kn0Var, x21[] x21VarArr) {
        super(k2Var, context, true, num, i10, true, p6Var, i11, i12);
        this.f37842g2 = ln0Var;
        this.f37840e2 = kn0Var;
        this.f37841f2 = x21VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        ln0 ln0Var = this.f37842g2;
        if (tL_starGiftUnique != null) {
            if (ln0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    ln0Var.f39336s = (TLRPC.TL_peerColorCollectible) peerColor;
                    ln0Var.f39335r = null;
                } else {
                    return;
                }
            } else {
                ln0Var.f39336s = null;
                ln0Var.f39335r = org.telegram.messenger.wp.q0(tL_starGiftUnique);
            }
            ln0Var.I = null;
            ln0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            ln0Var.f39331n = longValue;
            ln0Var.f39335r = null;
            ln0Var.f39336s = null;
            ln0Var.I = null;
        }
        kn0 kn0Var = this.f37840e2;
        if (kn0Var != null) {
            kn0Var.b(true);
        }
        ln0Var.j(true);
        ln0Var.i();
        ln0Var.f(true);
        x21 x21Var = this.f37841f2[0];
        if (x21Var != null) {
            ln0Var.f39333o0 = null;
            x21Var.dismiss();
        }
    }
}
