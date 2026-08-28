package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ec extends b61 {
    public final zb Z1;
    public final s51[] a2;
    public final xc f37897b2;

    public ec(xc xcVar, xc xcVar2, Activity activity, Integer num, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10, int i11, zb zbVar, s51[] s51VarArr) {
        super(xcVar2, activity, true, num, i9, true, b6Var, i10, i11);
        this.f37897b2 = xcVar;
        this.Z1 = zbVar;
        this.a2 = s51VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f37897b2.f44460a;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        if (l10 == null) {
            longValue = 0;
        } else {
            longValue = l10.longValue();
        }
        this.Z1.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        s51 s51Var = this.a2[0];
        if (s51Var != null) {
            this.f37897b2.M = null;
            s51Var.dismiss();
        }
    }
}
