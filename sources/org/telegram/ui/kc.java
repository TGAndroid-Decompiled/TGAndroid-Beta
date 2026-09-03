package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class kc extends x61 {
    public final ec a2;
    public final n61[] f35500b2;
    public final dd f35501c2;

    public kc(dd ddVar, dd ddVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, ec ecVar, n61[] n61VarArr) {
        super(ddVar2, activity, true, num, i10, true, f6Var, i11, i12);
        this.f35501c2 = ddVar;
        this.a2 = ecVar;
        this.f35500b2 = n61VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f35501c2.f33416a;
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
        this.a2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        n61 n61Var = this.f35500b2[0];
        if (n61Var != null) {
            this.f35501c2.N = null;
            n61Var.dismiss();
        }
    }
}
