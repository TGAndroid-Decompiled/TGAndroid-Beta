package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class mp0 extends c71 {
    public final pp0 f38701d2;
    public final t61[] f38702e2;
    public final qp0 f38703f2;

    public mp0(qp0 qp0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, pp0 pp0Var, t61[] t61VarArr) {
        super(n2Var, context, true, num, i10, true, d6Var, i11, i12);
        this.f38703f2 = qp0Var;
        this.f38701d2 = pp0Var;
        this.f38702e2 = t61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        qp0 qp0Var = this.f38703f2;
        if (tL_starGiftUnique != null) {
            if (qp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    qp0Var.f39784s = (TLRPC.TL_peerColorCollectible) peerColor;
                    qp0Var.f39783r = null;
                } else {
                    return;
                }
            } else {
                qp0Var.f39784s = null;
                qp0Var.f39783r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            qp0Var.I = null;
            qp0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            qp0Var.f39779n = longValue;
            qp0Var.f39783r = null;
            qp0Var.f39784s = null;
            qp0Var.I = null;
        }
        pp0 pp0Var = this.f38701d2;
        if (pp0Var != null) {
            pp0Var.b(true);
        }
        qp0Var.j(true);
        qp0Var.i();
        qp0Var.f(true);
        t61 t61Var = this.f38702e2[0];
        if (t61Var != null) {
            qp0Var.f39781o0 = null;
            t61Var.dismiss();
        }
    }
}
