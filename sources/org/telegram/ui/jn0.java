package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jn0 extends i31 {
    public final mn0 f38554e2;
    public final z21[] f38555f2;
    public final nn0 f38556g2;

    public jn0(nn0 nn0Var, org.telegram.ui.ActionBar.k2 k2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12, mn0 mn0Var, z21[] z21VarArr) {
        super(k2Var, context, true, num, i10, true, p6Var, i11, i12);
        this.f38556g2 = nn0Var;
        this.f38554e2 = mn0Var;
        this.f38555f2 = z21VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        nn0 nn0Var = this.f38556g2;
        if (tL_starGiftUnique != null) {
            if (nn0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    nn0Var.f40003s = (TLRPC.TL_peerColorCollectible) peerColor;
                    nn0Var.f40002r = null;
                } else {
                    return;
                }
            } else {
                nn0Var.f40003s = null;
                nn0Var.f40002r = org.telegram.messenger.vp.q0(tL_starGiftUnique);
            }
            nn0Var.I = null;
            nn0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            nn0Var.f39998n = longValue;
            nn0Var.f40002r = null;
            nn0Var.f40003s = null;
            nn0Var.I = null;
        }
        mn0 mn0Var = this.f38554e2;
        if (mn0Var != null) {
            mn0Var.b(true);
        }
        nn0Var.j(true);
        nn0Var.i();
        nn0Var.f(true);
        z21 z21Var = this.f38555f2[0];
        if (z21Var != null) {
            nn0Var.f40000o0 = null;
            z21Var.dismiss();
        }
    }
}
