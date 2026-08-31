package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class gw0 extends r61 {
    public final eh.w a2;
    public final i61[] f37280b2;
    public final PremiumPreviewFragment f37281c2;

    public gw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, eh.w wVar, i61[] i61VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, g6Var, i11);
        this.f37281c2 = premiumPreviewFragment;
        this.a2 = wVar;
        this.f37280b2 = i61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.a2.run(l10, num);
        i61 i61Var = this.f37280b2[0];
        if (i61Var != null) {
            this.f37281c2.f34500p0 = null;
            i61Var.dismiss();
        }
    }
}
