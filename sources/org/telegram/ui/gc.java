package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class gc extends g31 {
    public final bc f37446e2;
    public final x21[] f37447f2;
    public final zc f37448g2;

    public gc(zc zcVar, zc zcVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12, bc bcVar, x21[] x21VarArr) {
        super(zcVar2, activity, true, num, i10, true, p6Var, i11, i12);
        this.f37448g2 = zcVar;
        this.f37446e2 = bcVar;
        this.f37447f2 = x21VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f37448g2.f43889a;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        if (l4 == null) {
            longValue = 0;
        } else {
            longValue = l4.longValue();
        }
        this.f37446e2.a(Long.valueOf(longValue), num, tL_starGiftUnique);
        x21 x21Var = this.f37447f2[0];
        if (x21Var != null) {
            this.f37448g2.Q = null;
            x21Var.dismiss();
        }
    }
}
