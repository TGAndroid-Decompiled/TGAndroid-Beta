package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ns0 extends s11 {
    public final bi.o6 f50312f2;
    public final j11[] f50313g2;
    public final PremiumPreviewFragment f50314h2;

    public ns0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, bi.o6 o6Var, j11[] j11VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i7, true, h6Var, i10);
        this.f50314h2 = premiumPreviewFragment;
        this.f50312f2 = o6Var;
        this.f50313g2 = j11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f50312f2.a(l10, num);
        j11 j11Var = this.f50313g2[0];
        if (j11Var != null) {
            this.f50314h2.f43493v0 = null;
            j11Var.dismiss();
        }
    }
}
