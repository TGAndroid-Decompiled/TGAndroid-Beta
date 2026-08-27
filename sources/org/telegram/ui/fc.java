package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class fc extends a61 {
    public final ac Z1;
    public final r51[] a2;

    public final xc f38068b2;

    public fc(xc xcVar, xc xcVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, ac acVar, r51[] r51VarArr) {
        super(xcVar2, activity, true, num, i10, true, c6Var, i11, i12);
        this.f38068b2 = xcVar;
        this.Z1 = acVar;
        this.a2 = r51VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f38068b2.f44380a;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.Z1.run(Long.valueOf(l10 == null ? 0L : l10.longValue()), num, tL_starGiftUnique);
        r51 r51Var = this.a2[0];
        if (r51Var != null) {
            this.f38068b2.M = null;
            r51Var.dismiss();
        }
    }
}
