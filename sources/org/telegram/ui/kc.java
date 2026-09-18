package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class kc extends g71 {
    public final fc f35032d2;
    public final x61[] f35033e2;
    public final bd f35034f2;

    public kc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12, fc fcVar, x61[] x61VarArr) {
        super(bdVar2, activity, true, num, i10, true, e6Var, i11, i12);
        this.f35034f2 = bdVar;
        this.f35032d2 = fcVar;
        this.f35033e2 = x61VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f35034f2.f32310a;
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
        this.f35032d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        x61 x61Var = this.f35033e2[0];
        if (x61Var != null) {
            this.f35034f2.Q = null;
            x61Var.dismiss();
        }
    }
}
