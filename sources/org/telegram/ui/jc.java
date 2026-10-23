package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jc extends b61 {
    public final ec f38523e2;
    public final s51[] f38524f2;
    public final bd f38525g2;

    public jc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, ec ecVar, s51[] s51VarArr) {
        super(bdVar2, activity, true, num, i10, true, g6Var, i11, i12);
        this.f38525g2 = bdVar;
        this.f38523e2 = ecVar;
        this.f38524f2 = s51VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f38525g2.f36017a;
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
        this.f38523e2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        s51 s51Var = this.f38524f2[0];
        if (s51Var != null) {
            this.f38525g2.Q = null;
            s51Var.dismiss();
        }
    }
}
