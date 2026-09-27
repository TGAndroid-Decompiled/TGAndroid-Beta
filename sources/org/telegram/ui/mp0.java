package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class mp0 extends c71 {
    public final pp0 f35739d2;
    public final t61[] f35740e2;
    public final qp0 f35741f2;

    public mp0(qp0 qp0Var, org.telegram.ui.ActionBar.o2 o2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12, pp0 pp0Var, t61[] t61VarArr) {
        super(o2Var, context, true, num, i10, true, e6Var, i11, i12);
        this.f35741f2 = qp0Var;
        this.f35739d2 = pp0Var;
        this.f35740e2 = t61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        qp0 qp0Var = this.f35741f2;
        if (tL_starGiftUnique != null) {
            if (qp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    qp0Var.f36809s = (TLRPC.TL_peerColorCollectible) peerColor;
                    qp0Var.f36808r = null;
                } else {
                    return;
                }
            } else {
                qp0Var.f36809s = null;
                qp0Var.f36808r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            qp0Var.I = null;
            qp0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            qp0Var.f36804n = longValue;
            qp0Var.f36808r = null;
            qp0Var.f36809s = null;
            qp0Var.I = null;
        }
        pp0 pp0Var = this.f35739d2;
        if (pp0Var != null) {
            pp0Var.b(true);
        }
        qp0Var.j(true);
        qp0Var.i();
        qp0Var.f(true);
        t61 t61Var = this.f35740e2[0];
        if (t61Var != null) {
            qp0Var.f36806o0 = null;
            t61Var.dismiss();
        }
    }
}
