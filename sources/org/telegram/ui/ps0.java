package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ps0 extends t11 {
    public final bi.p5 f48829e2;
    public final k11[] f48830f2;
    public final PremiumPreviewFragment f48831g2;

    public ps0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, bi.p5 p5Var, k11[] k11VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i7, true, h6Var, i10);
        this.f48831g2 = premiumPreviewFragment;
        this.f48829e2 = p5Var;
        this.f48830f2 = k11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f48829e2.a(l10, num);
        k11 k11Var = this.f48830f2[0];
        if (k11Var != null) {
            this.f48831g2.f41630u0 = null;
            k11Var.dismiss();
        }
    }
}
