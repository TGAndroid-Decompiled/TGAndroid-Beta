package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jp0 extends f61 {
    public final mp0 f40576e2;
    public final w51[] f40577f2;
    public final np0 f40578g2;

    public jp0(np0 np0Var, org.telegram.ui.ActionBar.r2 r2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, int i12, mp0 mp0Var, w51[] w51VarArr) {
        super(r2Var, context, true, num, i10, true, u6Var, i11, i12);
        this.f40578g2 = np0Var;
        this.f40576e2 = mp0Var;
        this.f40577f2 = w51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        np0 np0Var = this.f40578g2;
        if (tL_starGiftUnique != null) {
            if (np0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    np0Var.f41858s = (TLRPC.TL_peerColorCollectible) peerColor;
                    np0Var.f41857r = null;
                } else {
                    return;
                }
            } else {
                np0Var.f41858s = null;
                np0Var.f41857r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            np0Var.I = null;
            np0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            np0Var.f41853n = longValue;
            np0Var.f41857r = null;
            np0Var.f41858s = null;
            np0Var.I = null;
        }
        mp0 mp0Var = this.f40576e2;
        if (mp0Var != null) {
            mp0Var.b(true);
        }
        np0Var.j(true);
        np0Var.i();
        np0Var.f(true);
        w51 w51Var = this.f40577f2[0];
        if (w51Var != null) {
            np0Var.f41855o0 = null;
            w51Var.dismiss();
        }
    }
}
