package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class bm0 extends s11 {
    public final em0 f45937f2;
    public final j11[] f45938g2;
    public final fm0 f45939h2;

    public bm0(fm0 fm0Var, org.telegram.ui.ActionBar.g2 g2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, int i11, em0 em0Var, j11[] j11VarArr) {
        super(g2Var, context, true, num, i7, true, h6Var, i10, i11);
        this.f45939h2 = fm0Var;
        this.f45937f2 = em0Var;
        this.f45938g2 = j11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        fm0 fm0Var = this.f45939h2;
        if (tL_starGiftUnique != null) {
            if (fm0Var.f47783n0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    fm0Var.f47788s = (TLRPC.TL_peerColorCollectible) peerColor;
                    fm0Var.f47787r = null;
                } else {
                    return;
                }
            } else {
                fm0Var.f47788s = null;
                fm0Var.f47787r = org.telegram.messenger.np.r0(tL_starGiftUnique);
            }
            fm0Var.J = null;
            fm0Var.h = -1;
        } else {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            fm0Var.f47782n = longValue;
            fm0Var.f47787r = null;
            fm0Var.f47788s = null;
            fm0Var.J = null;
        }
        em0 em0Var = this.f45937f2;
        if (em0Var != null) {
            em0Var.b(true);
        }
        fm0Var.j(true);
        fm0Var.i();
        fm0Var.f(true);
        j11 j11Var = this.f45938g2[0];
        if (j11Var != null) {
            fm0Var.f47785p0 = null;
            j11Var.dismiss();
        }
    }
}
