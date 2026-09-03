package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class dp0 extends w61 {
    public final gp0 a2;
    public final n61[] f36236b2;
    public final hp0 f36237c2;

    public dp0(hp0 hp0Var, org.telegram.ui.ActionBar.p2 p2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, gp0 gp0Var, n61[] n61VarArr) {
        super(p2Var, context, true, num, i10, true, g6Var, i11, i12);
        this.f36237c2 = hp0Var;
        this.a2 = gp0Var;
        this.f36236b2 = n61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        hp0 hp0Var = this.f36237c2;
        if (tL_starGiftUnique != null) {
            if (hp0Var.f37455j0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    hp0Var.f37460s = (TLRPC.TL_peerColorCollectible) peerColor;
                    hp0Var.f37459r = null;
                } else {
                    return;
                }
            } else {
                hp0Var.f37460s = null;
                hp0Var.f37459r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            hp0Var.F = null;
            hp0Var.h = -1;
        } else {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            hp0Var.f37458n = longValue;
            hp0Var.f37459r = null;
            hp0Var.f37460s = null;
            hp0Var.F = null;
        }
        gp0 gp0Var = this.a2;
        if (gp0Var != null) {
            gp0Var.b(true);
        }
        hp0Var.j(true);
        hp0Var.i();
        hp0Var.f(true);
        n61 n61Var = this.f36236b2[0];
        if (n61Var != null) {
            hp0Var.f37457l0 = null;
            n61Var.dismiss();
        }
    }
}
