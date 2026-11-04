package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class cs0 extends g11 {
    public final ai.q4 f44428f2;
    public final x01[] f44429g2;
    public final PremiumPreviewFragment f44430h2;

    public cs0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10, ai.q4 q4Var, x01[] x01VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i3, true, e6Var, i10);
        this.f44430h2 = premiumPreviewFragment;
        this.f44428f2 = q4Var;
        this.f44429g2 = x01VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f44428f2.a(l10, num);
        x01 x01Var = this.f44429g2[0];
        if (x01Var != null) {
            this.f44430h2.f41660v0 = null;
            x01Var.dismiss();
        }
    }
}
