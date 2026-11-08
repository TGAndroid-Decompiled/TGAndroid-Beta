package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ms0 extends q11 {
    public final bi.p5 f47872e2;
    public final h11[] f47873f2;
    public final PremiumPreviewFragment f47874g2;

    public ms0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, bi.p5 p5Var, h11[] h11VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i7, true, f6Var, i10);
        this.f47874g2 = premiumPreviewFragment;
        this.f47872e2 = p5Var;
        this.f47873f2 = h11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f47872e2.a(l10, num);
        h11 h11Var = this.f47873f2[0];
        if (h11Var != null) {
            this.f47874g2.f41632u0 = null;
            h11Var.dismiss();
        }
    }
}
