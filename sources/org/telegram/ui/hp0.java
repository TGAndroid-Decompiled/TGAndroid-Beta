package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class hp0 extends c61 {
    public final kp0 f40051e2;
    public final t51[] f40052f2;
    public final lp0 f40053g2;

    public hp0(lp0 lp0Var, org.telegram.ui.ActionBar.r2 r2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, int i12, kp0 kp0Var, t51[] t51VarArr) {
        super(r2Var, context, true, num, i10, true, u6Var, i11, i12);
        this.f40053g2 = lp0Var;
        this.f40051e2 = kp0Var;
        this.f40052f2 = t51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        lp0 lp0Var = this.f40053g2;
        if (tL_starGiftUnique != null) {
            if (lp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    lp0Var.f41335s = (TLRPC.TL_peerColorCollectible) peerColor;
                    lp0Var.f41334r = null;
                } else {
                    return;
                }
            } else {
                lp0Var.f41335s = null;
                lp0Var.f41334r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            lp0Var.I = null;
            lp0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            lp0Var.f41330n = longValue;
            lp0Var.f41334r = null;
            lp0Var.f41335s = null;
            lp0Var.I = null;
        }
        kp0 kp0Var = this.f40051e2;
        if (kp0Var != null) {
            kp0Var.b(true);
        }
        lp0Var.j(true);
        lp0Var.i();
        lp0Var.f(true);
        t51 t51Var = this.f40052f2[0];
        if (t51Var != null) {
            lp0Var.f41332o0 = null;
            t51Var.dismiss();
        }
    }
}
