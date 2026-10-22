package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jc extends x51 {
    public final ec f38230d2;
    public final o51[] f38231e2;
    public final bd f38232f2;

    public jc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, ec ecVar, o51[] o51VarArr) {
        super(bdVar2, activity, true, num, i10, true, d6Var, i11, i12);
        this.f38232f2 = bdVar;
        this.f38230d2 = ecVar;
        this.f38231e2 = o51VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f38232f2.f35576a;
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
        this.f38230d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        o51 o51Var = this.f38231e2[0];
        if (o51Var != null) {
            this.f38232f2.Q = null;
            o51Var.dismiss();
        }
    }
}
