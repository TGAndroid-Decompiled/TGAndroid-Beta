package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class nw0 extends f61 {
    public final bi.m5 f41907e2;
    public final w51[] f41908f2;
    public final PremiumPreviewFragment f41909g2;

    public nw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, bi.m5 m5Var, w51[] w51VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, u6Var, i11);
        this.f41909g2 = premiumPreviewFragment;
        this.f41907e2 = m5Var;
        this.f41908f2 = w51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f41907e2.run(l4, num);
        w51 w51Var = this.f41908f2[0];
        if (w51Var != null) {
            this.f41909g2.f35916v0 = null;
            w51Var.dismiss();
        }
    }
}
