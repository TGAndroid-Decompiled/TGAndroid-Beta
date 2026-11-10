package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ac extends t11 {
    public final vb f43631e2;
    public final k11[] f43632f2;
    public final rc f43633g2;

    public ac(rc rcVar, rc rcVar2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, int i11, vb vbVar, k11[] k11VarArr) {
        super(rcVar2, activity, true, num, i7, true, h6Var, i10, i11);
        this.f43633g2 = rcVar;
        this.f43631e2 = vbVar;
        this.f43632f2 = k11VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f43633g2.f49351a;
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
        this.f43631e2.a(Long.valueOf(longValue), num, tL_starGiftUnique);
        k11 k11Var = this.f43632f2[0];
        if (k11Var != null) {
            this.f43633g2.Q = null;
            k11Var.dismiss();
        }
    }
}
