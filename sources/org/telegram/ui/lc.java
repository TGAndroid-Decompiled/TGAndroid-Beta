package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lc extends i71 {
    public final gc f35494d2;
    public final z61[] f35495e2;
    public final cd f35496f2;

    public lc(cd cdVar, cd cdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, gc gcVar, z61[] z61VarArr) {
        super(cdVar2, activity, true, num, i10, true, f6Var, i11, i12);
        this.f35496f2 = cdVar;
        this.f35494d2 = gcVar;
        this.f35495e2 = z61VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f35496f2.f32724a;
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
        this.f35494d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        z61 z61Var = this.f35495e2[0];
        if (z61Var != null) {
            this.f35496f2.Q = null;
            z61Var.dismiss();
        }
    }
}
