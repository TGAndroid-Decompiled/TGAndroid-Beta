package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ap0 extends z51 {
    public final dp0 f35462d2;
    public final q51[] f35463e2;
    public final ep0 f35464f2;

    public ap0(ep0 ep0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, dp0 dp0Var, q51[] q51VarArr) {
        super(n2Var, context, true, num, i10, true, d6Var, i11, i12);
        this.f35464f2 = ep0Var;
        this.f35462d2 = dp0Var;
        this.f35463e2 = q51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        ep0 ep0Var = this.f35464f2;
        if (tL_starGiftUnique != null) {
            if (ep0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    ep0Var.f36585s = (TLRPC.TL_peerColorCollectible) peerColor;
                    ep0Var.f36584r = null;
                } else {
                    return;
                }
            } else {
                ep0Var.f36585s = null;
                ep0Var.f36584r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            ep0Var.I = null;
            ep0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            ep0Var.f36580n = longValue;
            ep0Var.f36584r = null;
            ep0Var.f36585s = null;
            ep0Var.I = null;
        }
        dp0 dp0Var = this.f35462d2;
        if (dp0Var != null) {
            dp0Var.b(true);
        }
        ep0Var.j(true);
        ep0Var.i();
        ep0Var.f(true);
        q51 q51Var = this.f35463e2[0];
        if (q51Var != null) {
            ep0Var.f36582o0 = null;
            q51Var.dismiss();
        }
    }
}
