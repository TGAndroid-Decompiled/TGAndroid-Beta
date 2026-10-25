package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lw0 extends c61 {
    public final bi.m5 f41381e2;
    public final t51[] f41382f2;
    public final PremiumPreviewFragment f41383g2;

    public lw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, bi.m5 m5Var, t51[] t51VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, u6Var, i11);
        this.f41383g2 = premiumPreviewFragment;
        this.f41381e2 = m5Var;
        this.f41382f2 = t51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f41381e2.run(l4, num);
        t51 t51Var = this.f41382f2[0];
        if (t51Var != null) {
            this.f41383g2.f35889v0 = null;
            t51Var.dismiss();
        }
    }
}
