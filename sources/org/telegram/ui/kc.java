package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class kc extends f61 {
    public final fc f40729e2;
    public final w51[] f40730f2;
    public final bd f40731g2;

    public kc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, int i12, fc fcVar, w51[] w51VarArr) {
        super(bdVar2, activity, true, num, i10, true, u6Var, i11, i12);
        this.f40731g2 = bdVar;
        this.f40729e2 = fcVar;
        this.f40730f2 = w51VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f40731g2.f37977a;
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
        this.f40729e2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        w51 w51Var = this.f40730f2[0];
        if (w51Var != null) {
            this.f40731g2.Q = null;
            w51Var.dismiss();
        }
    }
}
