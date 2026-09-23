package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class kp0 extends z61 {
    public final np0 f34779d2;
    public final q61[] f34780e2;
    public final op0 f34781f2;

    public kp0(op0 op0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, np0 np0Var, q61[] q61VarArr) {
        super(n2Var, context, true, num, i10, true, d6Var, i11, i12);
        this.f34781f2 = op0Var;
        this.f34779d2 = np0Var;
        this.f34780e2 = q61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        op0 op0Var = this.f34781f2;
        if (tL_starGiftUnique != null) {
            if (op0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    op0Var.f35940s = (TLRPC.TL_peerColorCollectible) peerColor;
                    op0Var.f35939r = null;
                } else {
                    return;
                }
            } else {
                op0Var.f35940s = null;
                op0Var.f35939r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            op0Var.I = null;
            op0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            op0Var.f35935n = longValue;
            op0Var.f35939r = null;
            op0Var.f35940s = null;
            op0Var.I = null;
        }
        np0 np0Var = this.f34779d2;
        if (np0Var != null) {
            np0Var.b(true);
        }
        op0Var.j(true);
        op0Var.i();
        op0Var.f(true);
        q61 q61Var = this.f34780e2[0];
        if (q61Var != null) {
            op0Var.f35937o0 = null;
            q61Var.dismiss();
        }
    }
}
