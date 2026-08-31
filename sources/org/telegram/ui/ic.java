package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ic extends r61 {
    public final cc a2;
    public final i61[] f37794b2;
    public final bd f37795c2;

    public ic(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, cc ccVar, i61[] i61VarArr) {
        super(bdVar2, activity, true, num, i10, true, g6Var, i11, i12);
        this.f37795c2 = bdVar;
        this.a2 = ccVar;
        this.f37794b2 = i61VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f37795c2.f35420a;
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
        i61 i61Var = this.f37794b2[0];
        if (i61Var != null) {
            this.f37795c2.N = null;
            i61Var.dismiss();
        }
    }
}
