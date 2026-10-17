package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fw0 extends z51 {
    public final ai.q5 f37046d2;
    public final q51[] f37047e2;
    public final PremiumPreviewFragment f37048f2;

    public fw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, ai.q5 q5Var, q51[] q51VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, d6Var, i11);
        this.f37048f2 = premiumPreviewFragment;
        this.f37046d2 = q5Var;
        this.f37047e2 = q51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f37046d2.run(l4, num);
        q51 q51Var = this.f37047e2[0];
        if (q51Var != null) {
            this.f37048f2.f33509s0 = null;
            q51Var.dismiss();
        }
    }
}
