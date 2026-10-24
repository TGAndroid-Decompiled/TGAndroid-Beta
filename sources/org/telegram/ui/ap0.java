package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ap0 extends a61 {
    public final dp0 f35822e2;
    public final r51[] f35823f2;
    public final ep0 f35824g2;

    public ap0(ep0 ep0Var, org.telegram.ui.ActionBar.o2 o2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, dp0 dp0Var, r51[] r51VarArr) {
        super(o2Var, context, true, num, i10, true, g6Var, i11, i12);
        this.f35824g2 = ep0Var;
        this.f35822e2 = dp0Var;
        this.f35823f2 = r51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        ep0 ep0Var = this.f35824g2;
        if (tL_starGiftUnique != null) {
            if (ep0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    ep0Var.f36985s = (TLRPC.TL_peerColorCollectible) peerColor;
                    ep0Var.f36984r = null;
                } else {
                    return;
                }
            } else {
                ep0Var.f36985s = null;
                ep0Var.f36984r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            ep0Var.I = null;
            ep0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            ep0Var.f36980n = longValue;
            ep0Var.f36984r = null;
            ep0Var.f36985s = null;
            ep0Var.I = null;
        }
        dp0 dp0Var = this.f35822e2;
        if (dp0Var != null) {
            dp0Var.b(true);
        }
        ep0Var.j(true);
        ep0Var.i();
        ep0Var.f(true);
        r51 r51Var = this.f35823f2[0];
        if (r51Var != null) {
            ep0Var.f36982o0 = null;
            r51Var.dismiss();
        }
    }
}
