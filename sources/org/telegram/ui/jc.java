package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jc extends a61 {
    public final ec f38532e2;
    public final r51[] f38533f2;
    public final bd f38534g2;

    public jc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, ec ecVar, r51[] r51VarArr) {
        super(bdVar2, activity, true, num, i10, true, g6Var, i11, i12);
        this.f38534g2 = bdVar;
        this.f38532e2 = ecVar;
        this.f38533f2 = r51VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f38534g2.f36015a;
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
        this.f38532e2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        r51 r51Var = this.f38533f2[0];
        if (r51Var != null) {
            this.f38534g2.Q = null;
            r51Var.dismiss();
        }
    }
}
