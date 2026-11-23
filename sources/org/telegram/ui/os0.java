package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class os0 extends r11 {
    public final bi.r6 f50629f2;
    public final i11[] f50630g2;
    public final PremiumPreviewFragment f50631h2;

    public os0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, bi.r6 r6Var, i11[] i11VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i7, true, h6Var, i10);
        this.f50631h2 = premiumPreviewFragment;
        this.f50629f2 = r6Var;
        this.f50630g2 = i11VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f50629f2.a(l10, num);
        i11 i11Var = this.f50630g2[0];
        if (i11Var != null) {
            this.f50631h2.f43458v0 = null;
            i11Var.dismiss();
        }
    }
}
