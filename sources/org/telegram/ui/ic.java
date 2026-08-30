package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ic extends q61 {
    public final dc a2;
    public final g61[] f35087b2;
    public final bd f35088c2;

    public ic(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, dc dcVar, g61[] g61VarArr) {
        super(bdVar2, activity, true, num, i10, true, f6Var, i11, i12);
        this.f35088c2 = bdVar;
        this.a2 = dcVar;
        this.f35087b2 = g61VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f35088c2.f32910a;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        if (l10 == null) {
            longValue = 0;
        } else {
            longValue = l10.longValue();
        }
        this.a2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        g61 g61Var = this.f35087b2[0];
        if (g61Var != null) {
            this.f35088c2.N = null;
            g61Var.dismiss();
        }
    }
}
