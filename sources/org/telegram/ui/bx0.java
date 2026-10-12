package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class bx0 extends n71 {
    public final ai.m0 f36274d2;
    public final e71[] f36275e2;
    public final PremiumPreviewFragment f36276f2;

    public bx0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, ai.m0 m0Var, e71[] e71VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, c6Var, i11);
        this.f36276f2 = premiumPreviewFragment;
        this.f36274d2 = m0Var;
        this.f36275e2 = e71VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f36274d2.run(l4, num);
        e71 e71Var = this.f36275e2[0];
        if (e71Var != null) {
            this.f36276f2.f33989s0 = null;
            e71Var.dismiss();
        }
    }
}
