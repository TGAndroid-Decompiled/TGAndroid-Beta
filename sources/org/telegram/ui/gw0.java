package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class gw0 extends a61 {
    public final ai.r5 f37671e2;
    public final r51[] f37672f2;
    public final PremiumPreviewFragment f37673g2;

    public gw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, ai.r5 r5Var, r51[] r51VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, g6Var, i11);
        this.f37673g2 = premiumPreviewFragment;
        this.f37671e2 = r5Var;
        this.f37672f2 = r51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f37671e2.run(l4, num);
        r51 r51Var = this.f37672f2[0];
        if (r51Var != null) {
            this.f37673g2.f33828v0 = null;
            r51Var.dismiss();
        }
    }
}
