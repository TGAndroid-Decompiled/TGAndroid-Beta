package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class js0 extends n11 {
    public final bi.e4 f48407f2;
    public final e11[] f48408g2;
    public final PremiumPreviewFragment f48409h2;

    public js0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10, bi.e4 e4Var, e11[] e11VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i7, true, e6Var, i10);
        this.f48409h2 = premiumPreviewFragment;
        this.f48407f2 = e4Var;
        this.f48408g2 = e11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f48407f2.a(l10, num);
        e11 e11Var = this.f48408g2[0];
        if (e11Var != null) {
            this.f48409h2.f43003v0 = null;
            e11Var.dismiss();
        }
    }
}
