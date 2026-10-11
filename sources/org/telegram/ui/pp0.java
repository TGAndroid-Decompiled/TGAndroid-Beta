package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class pp0 extends j71 {
    public final sp0 f40966d2;
    public final a71[] f40967e2;
    public final tp0 f40968f2;

    public pp0(tp0 tp0Var, org.telegram.ui.ActionBar.m2 m2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, sp0 sp0Var, a71[] a71VarArr) {
        super(m2Var, context, true, num, i10, true, d6Var, i11, i12);
        this.f40968f2 = tp0Var;
        this.f40966d2 = sp0Var;
        this.f40967e2 = a71VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        tp0 tp0Var = this.f40968f2;
        if (tL_starGiftUnique != null) {
            if (tp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tp0Var.f42277s = (TLRPC.TL_peerColorCollectible) peerColor;
                    tp0Var.f42276r = null;
                } else {
                    return;
                }
            } else {
                tp0Var.f42277s = null;
                tp0Var.f42276r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            tp0Var.I = null;
            tp0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            tp0Var.f42272n = longValue;
            tp0Var.f42276r = null;
            tp0Var.f42277s = null;
            tp0Var.I = null;
        }
        sp0 sp0Var = this.f40966d2;
        if (sp0Var != null) {
            sp0Var.b(true);
        }
        tp0Var.j(true);
        tp0Var.i();
        tp0Var.f(true);
        a71 a71Var = this.f40967e2[0];
        if (a71Var != null) {
            tp0Var.f42274o0 = null;
            a71Var.dismiss();
        }
    }
}
