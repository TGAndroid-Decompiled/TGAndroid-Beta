package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class dc extends d61 {
    public final yb Z1;
    public final u51[] a2;
    public final vc f37491b2;

    public dc(vc vcVar, vc vcVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, yb ybVar, u51[] u51VarArr) {
        super(vcVar2, activity, true, num, i10, true, c6Var, i11, i12);
        this.f37491b2 = vcVar;
        this.Z1 = ybVar;
        this.a2 = u51VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f37491b2.f43502a;
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
        u51 u51Var = this.a2[0];
        if (u51Var != null) {
            this.f37491b2.M = null;
            u51Var.dismiss();
        }
    }
}
