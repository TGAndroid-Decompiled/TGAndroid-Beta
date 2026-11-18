package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ns0 extends r11 {
    public final bi.m6 f50317f2;
    public final i11[] f50318g2;
    public final PremiumPreviewFragment f50319h2;

    public ns0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10, bi.m6 m6Var, i11[] i11VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i7, true, i6Var, i10);
        this.f50319h2 = premiumPreviewFragment;
        this.f50317f2 = m6Var;
        this.f50318g2 = i11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f50317f2.a(l10, num);
        i11 i11Var = this.f50318g2[0];
        if (i11Var != null) {
            this.f50319h2.f43448v0 = null;
            i11Var.dismiss();
        }
    }
}
