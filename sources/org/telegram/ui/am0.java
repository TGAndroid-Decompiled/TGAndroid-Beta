package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class am0 extends t11 {
    public final dm0 f43722e2;
    public final k11[] f43723f2;
    public final em0 f43724g2;

    public am0(em0 em0Var, org.telegram.ui.ActionBar.f2 f2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, int i11, dm0 dm0Var, k11[] k11VarArr) {
        super(f2Var, context, true, num, i7, true, h6Var, i10, i11);
        this.f43724g2 = em0Var;
        this.f43722e2 = dm0Var;
        this.f43723f2 = k11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        em0 em0Var = this.f43724g2;
        if (tL_starGiftUnique != null) {
            if (em0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    em0Var.f45403s = (TLRPC.TL_peerColorCollectible) peerColor;
                    em0Var.f45402r = null;
                } else {
                    return;
                }
            } else {
                em0Var.f45403s = null;
                em0Var.f45402r = org.telegram.messenger.qp.q0(tL_starGiftUnique);
            }
            em0Var.I = null;
            em0Var.h = -1;
        } else {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            em0Var.f45398n = longValue;
            em0Var.f45402r = null;
            em0Var.f45403s = null;
            em0Var.I = null;
        }
        dm0 dm0Var = this.f43722e2;
        if (dm0Var != null) {
            dm0Var.b(true);
        }
        em0Var.j(true);
        em0Var.i();
        em0Var.f(true);
        k11 k11Var = this.f43723f2[0];
        if (k11Var != null) {
            em0Var.f45400o0 = null;
            k11Var.dismiss();
        }
    }
}
