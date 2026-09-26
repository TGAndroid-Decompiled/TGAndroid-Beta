package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jp0 extends a71 {
    public final mp0 f34847d2;
    public final r61[] f34848e2;
    public final np0 f34849f2;

    public jp0(np0 np0Var, org.telegram.ui.ActionBar.m2 m2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, mp0 mp0Var, r61[] r61VarArr) {
        super(m2Var, context, true, num, i10, true, d6Var, i11, i12);
        this.f34849f2 = np0Var;
        this.f34847d2 = mp0Var;
        this.f34848e2 = r61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        np0 np0Var = this.f34849f2;
        if (tL_starGiftUnique != null) {
            if (np0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    np0Var.f35956s = (TLRPC.TL_peerColorCollectible) peerColor;
                    np0Var.f35955r = null;
                } else {
                    return;
                }
            } else {
                np0Var.f35956s = null;
                np0Var.f35955r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            np0Var.I = null;
            np0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            np0Var.f35951n = longValue;
            np0Var.f35955r = null;
            np0Var.f35956s = null;
            np0Var.I = null;
        }
        mp0 mp0Var = this.f34847d2;
        if (mp0Var != null) {
            mp0Var.b(true);
        }
        np0Var.j(true);
        np0Var.i();
        np0Var.f(true);
        r61 r61Var = this.f34848e2[0];
        if (r61Var != null) {
            np0Var.f35953o0 = null;
            r61Var.dismiss();
        }
    }
}
