package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class bp0 extends b61 {
    public final ep0 f36150e2;
    public final s51[] f36151f2;
    public final fp0 f36152g2;

    public bp0(fp0 fp0Var, org.telegram.ui.ActionBar.o2 o2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, ep0 ep0Var, s51[] s51VarArr) {
        super(o2Var, context, true, num, i10, true, g6Var, i11, i12);
        this.f36152g2 = fp0Var;
        this.f36150e2 = ep0Var;
        this.f36151f2 = s51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        fp0 fp0Var = this.f36152g2;
        if (tL_starGiftUnique != null) {
            if (fp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    fp0Var.f37404s = (TLRPC.TL_peerColorCollectible) peerColor;
                    fp0Var.f37403r = null;
                } else {
                    return;
                }
            } else {
                fp0Var.f37404s = null;
                fp0Var.f37403r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            fp0Var.I = null;
            fp0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            fp0Var.f37399n = longValue;
            fp0Var.f37403r = null;
            fp0Var.f37404s = null;
            fp0Var.I = null;
        }
        ep0 ep0Var = this.f36150e2;
        if (ep0Var != null) {
            ep0Var.b(true);
        }
        fp0Var.j(true);
        fp0Var.i();
        fp0Var.f(true);
        s51 s51Var = this.f36151f2[0];
        if (s51Var != null) {
            fp0Var.f37401o0 = null;
            s51Var.dismiss();
        }
    }
}
