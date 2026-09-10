package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class bx0 extends l71 {
    public final bi.k6 f31462d2;
    public final c71[] f31463e2;
    public final PremiumPreviewFragment f31464f2;

    public bx0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, bi.k6 k6Var, c71[] c71VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, f6Var, i11);
        this.f31464f2 = premiumPreviewFragment;
        this.f31462d2 = k6Var;
        this.f31463e2 = c71VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f31462d2.run(l4, num);
        c71 c71Var = this.f31463e2[0];
        if (c71Var != null) {
            this.f31464f2.f30291s0 = null;
            c71Var.dismiss();
        }
    }
}
