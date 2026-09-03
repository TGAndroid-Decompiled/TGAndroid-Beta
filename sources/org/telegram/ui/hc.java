package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class hc extends w61 {
    public final cc a2;
    public final n61[] f37321b2;
    public final bd f37322c2;

    public hc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, cc ccVar, n61[] n61VarArr) {
        super(bdVar2, activity, true, num, i10, true, g6Var, i11, i12);
        this.f37322c2 = bdVar;
        this.a2 = ccVar;
        this.f37321b2 = n61VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f37322c2.f35436a;
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
        n61 n61Var = this.f37321b2[0];
        if (n61Var != null) {
            this.f37322c2.N = null;
            n61Var.dismiss();
        }
    }
}
