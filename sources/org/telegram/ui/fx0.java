package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fx0 extends r71 {
    public final bi.f0 f36016d2;
    public final i71[] f36017e2;
    public final PremiumPreviewFragment f36018f2;

    public fx0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, bi.f0 f0Var, i71[] i71VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, c6Var, i11);
        this.f36018f2 = premiumPreviewFragment;
        this.f36016d2 = f0Var;
        this.f36017e2 = i71VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f36016d2.run(l4, num);
        i71 i71Var = this.f36017e2[0];
        if (i71Var != null) {
            this.f36018f2.f32171s0 = null;
            i71Var.dismiss();
        }
    }
}
