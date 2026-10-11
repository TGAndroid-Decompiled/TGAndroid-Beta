package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ic extends j71 {
    public final dc f38685d2;
    public final a71[] f38686e2;
    public final ad f38687f2;

    public ic(ad adVar, ad adVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, dc dcVar, a71[] a71VarArr) {
        super(adVar2, activity, true, num, i10, true, d6Var, i11, i12);
        this.f38687f2 = adVar;
        this.f38685d2 = dcVar;
        this.f38686e2 = a71VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f38687f2.f36038a;
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
        this.f38685d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        a71 a71Var = this.f38686e2[0];
        if (a71Var != null) {
            this.f38687f2.Q = null;
            a71Var.dismiss();
        }
    }
}
