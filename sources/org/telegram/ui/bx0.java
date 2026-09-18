package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class bx0 extends i71 {
    public final ai.m0 f32599d2;
    public final z61[] f32600e2;
    public final PremiumPreviewFragment f32601f2;

    public bx0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, ai.m0 m0Var, z61[] z61VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, f6Var, i11);
        this.f32601f2 = premiumPreviewFragment;
        this.f32599d2 = m0Var;
        this.f32600e2 = z61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f32599d2.run(l4, num);
        z61 z61Var = this.f32600e2[0];
        if (z61Var != null) {
            this.f32601f2.f31196s0 = null;
            z61Var.dismiss();
        }
    }
}
