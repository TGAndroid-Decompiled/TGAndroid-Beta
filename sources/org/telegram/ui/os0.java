package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class os0 extends s11 {
    public final bi.p5 f48513e2;
    public final j11[] f48514f2;
    public final PremiumPreviewFragment f48515g2;

    public os0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10, bi.p5 p5Var, j11[] j11VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i7, true, g6Var, i10);
        this.f48515g2 = premiumPreviewFragment;
        this.f48513e2 = p5Var;
        this.f48514f2 = j11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f48513e2.a(l10, num);
        j11 j11Var = this.f48514f2[0];
        if (j11Var != null) {
            this.f48515g2.f41639u0 = null;
            j11Var.dismiss();
        }
    }
}
