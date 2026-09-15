package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jc extends g71 {
    public final ec f34850d2;
    public final x61[] f34851e2;
    public final ad f34852f2;

    public jc(ad adVar, ad adVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12, ec ecVar, x61[] x61VarArr) {
        super(adVar2, activity, true, num, i10, true, e6Var, i11, i12);
        this.f34852f2 = adVar;
        this.f34850d2 = ecVar;
        this.f34851e2 = x61VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f34852f2.f31753a;
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
        this.f34850d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        x61 x61Var = this.f34851e2[0];
        if (x61Var != null) {
            this.f34852f2.Q = null;
            x61Var.dismiss();
        }
    }
}
