package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ms0 extends q11 {
    public final bi.r6 f50106f2;
    public final h11[] f50107g2;
    public final PremiumPreviewFragment f50108h2;

    public ms0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10, bi.r6 r6Var, h11[] h11VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i7, true, i6Var, i10);
        this.f50108h2 = premiumPreviewFragment;
        this.f50106f2 = r6Var;
        this.f50107g2 = h11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f50106f2.a(l10, num);
        h11 h11Var = this.f50107g2[0];
        if (h11Var != null) {
            this.f50108h2.f43574v0 = null;
            h11Var.dismiss();
        }
    }
}
