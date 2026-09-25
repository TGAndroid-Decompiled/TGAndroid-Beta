package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ic extends a71 {
    public final dc f34485d2;
    public final r61[] f34486e2;
    public final ad f34487f2;

    public ic(ad adVar, ad adVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, dc dcVar, r61[] r61VarArr) {
        super(adVar2, activity, true, num, i10, true, d6Var, i11, i12);
        this.f34487f2 = adVar;
        this.f34485d2 = dcVar;
        this.f34486e2 = r61VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f34487f2.f32100a;
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
        this.f34485d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        r61 r61Var = this.f34486e2[0];
        if (r61Var != null) {
            this.f34487f2.Q = null;
            r61Var.dismiss();
        }
    }
}
