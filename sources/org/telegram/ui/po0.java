package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class po0 extends d61 {
    public final so0 Z1;
    public final u51[] a2;
    public final to0 f41441b2;

    public po0(to0 to0Var, org.telegram.ui.ActionBar.o2 o2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, so0 so0Var, u51[] u51VarArr) {
        super(o2Var, context, true, num, i10, true, c6Var, i11, i12);
        this.f41441b2 = to0Var;
        this.Z1 = so0Var;
        this.a2 = u51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        to0 to0Var = this.f41441b2;
        if (tL_starGiftUnique != null) {
            if (to0Var.f43072c0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    to0Var.v = (TLRPC.TL_peerColorCollectible) peerColor;
                    to0Var.f43080s = null;
                } else {
                    return;
                }
            } else {
                to0Var.v = null;
                to0Var.f43080s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            to0Var.f43083y = null;
            to0Var.f43078n = -1;
        } else {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            to0Var.f43079r = longValue;
            to0Var.f43080s = null;
            to0Var.v = null;
            to0Var.f43083y = null;
        }
        so0 so0Var = this.Z1;
        if (so0Var != null) {
            so0Var.b(true);
        }
        to0Var.i(true);
        to0Var.h();
        to0Var.f();
        u51 u51Var = this.a2[0];
        if (u51Var != null) {
            to0Var.f43075e0 = null;
            u51Var.dismiss();
        }
    }
}
