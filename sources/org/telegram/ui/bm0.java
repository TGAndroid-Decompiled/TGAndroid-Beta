package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class bm0 extends r11 {
    public final em0 f45919f2;
    public final i11[] f45920g2;
    public final fm0 f45921h2;

    public bm0(fm0 fm0Var, org.telegram.ui.ActionBar.h2 h2Var, Context context, Integer num, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10, int i11, em0 em0Var, i11[] i11VarArr) {
        super(h2Var, context, true, num, i7, true, i6Var, i10, i11);
        this.f45921h2 = fm0Var;
        this.f45919f2 = em0Var;
        this.f45920g2 = i11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        fm0 fm0Var = this.f45921h2;
        if (tL_starGiftUnique != null) {
            if (fm0Var.f47748n0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    fm0Var.f47753s = (TLRPC.TL_peerColorCollectible) peerColor;
                    fm0Var.f47752r = null;
                } else {
                    return;
                }
            } else {
                fm0Var.f47753s = null;
                fm0Var.f47752r = org.telegram.messenger.mp.r0(tL_starGiftUnique);
            }
            fm0Var.J = null;
            fm0Var.h = -1;
        } else {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            fm0Var.f47747n = longValue;
            fm0Var.f47752r = null;
            fm0Var.f47753s = null;
            fm0Var.J = null;
        }
        em0 em0Var = this.f45919f2;
        if (em0Var != null) {
            em0Var.b(true);
        }
        fm0Var.j(true);
        fm0Var.i();
        fm0Var.f(true);
        i11 i11Var = this.f45920g2[0];
        if (i11Var != null) {
            fm0Var.f47750p0 = null;
            i11Var.dismiss();
        }
    }
}
