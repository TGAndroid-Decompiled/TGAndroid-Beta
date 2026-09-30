package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ip0 extends a71 {
    public final lp0 f34653d2;
    public final r61[] f34654e2;
    public final mp0 f34655f2;

    public ip0(mp0 mp0Var, org.telegram.ui.ActionBar.m2 m2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, lp0 lp0Var, r61[] r61VarArr) {
        super(m2Var, context, true, num, i10, true, d6Var, i11, i12);
        this.f34655f2 = mp0Var;
        this.f34653d2 = lp0Var;
        this.f34654e2 = r61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        mp0 mp0Var = this.f34655f2;
        if (tL_starGiftUnique != null) {
            if (mp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    mp0Var.f35753s = (TLRPC.TL_peerColorCollectible) peerColor;
                    mp0Var.f35752r = null;
                } else {
                    return;
                }
            } else {
                mp0Var.f35753s = null;
                mp0Var.f35752r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            mp0Var.I = null;
            mp0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            mp0Var.f35748n = longValue;
            mp0Var.f35752r = null;
            mp0Var.f35753s = null;
            mp0Var.I = null;
        }
        lp0 lp0Var = this.f34653d2;
        if (lp0Var != null) {
            lp0Var.b(true);
        }
        mp0Var.j(true);
        mp0Var.i();
        mp0Var.f(true);
        r61 r61Var = this.f34654e2[0];
        if (r61Var != null) {
            mp0Var.f35750o0 = null;
            r61Var.dismiss();
        }
    }
}
