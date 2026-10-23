package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class hw0 extends b61 {
    public final ai.r5 f37974e2;
    public final s51[] f37975f2;
    public final PremiumPreviewFragment f37976g2;

    public hw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, ai.r5 r5Var, s51[] s51VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, g6Var, i11);
        this.f37976g2 = premiumPreviewFragment;
        this.f37974e2 = r5Var;
        this.f37975f2 = s51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f37974e2.run(l4, num);
        s51 s51Var = this.f37975f2[0];
        if (s51Var != null) {
            this.f37976g2.f33826v0 = null;
            s51Var.dismiss();
        }
    }
}
