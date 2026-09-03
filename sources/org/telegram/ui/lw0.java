package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lw0 extends w61 {
    public final eh.w a2;
    public final n61[] f38795b2;
    public final PremiumPreviewFragment f38796c2;

    public lw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, eh.w wVar, n61[] n61VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, g6Var, i11);
        this.f38796c2 = premiumPreviewFragment;
        this.a2 = wVar;
        this.f38795b2 = n61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.a2.run(l10, num);
        n61 n61Var = this.f38795b2[0];
        if (n61Var != null) {
            this.f38796c2.f34500p0 = null;
            n61Var.dismiss();
        }
    }
}
