package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class dw0 extends x51 {
    public final ai.r5 f36447d2;
    public final o51[] f36448e2;
    public final PremiumPreviewFragment f36449f2;

    public dw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, ai.r5 r5Var, o51[] o51VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, d6Var, i11);
        this.f36449f2 = premiumPreviewFragment;
        this.f36447d2 = r5Var;
        this.f36448e2 = o51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f36447d2.run(l4, num);
        o51 o51Var = this.f36448e2[0];
        if (o51Var != null) {
            this.f36449f2.f33515s0 = null;
            o51Var.dismiss();
        }
    }
}
