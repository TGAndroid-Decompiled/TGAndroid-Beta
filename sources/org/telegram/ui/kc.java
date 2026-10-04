package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class kc extends c71 {
    public final fc f37927d2;
    public final t61[] f37928e2;
    public final cd f37929f2;

    public kc(cd cdVar, cd cdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, fc fcVar, t61[] t61VarArr) {
        super(cdVar2, activity, true, num, i10, true, d6Var, i11, i12);
        this.f37929f2 = cdVar;
        this.f37927d2 = fcVar;
        this.f37928e2 = t61VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f37929f2.f35414a;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        if (l4 == null) {
            longValue = 0;
        } else {
            longValue = l4.longValue();
        }
        this.f37927d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        t61 t61Var = this.f37928e2[0];
        if (t61Var != null) {
            this.f37929f2.Q = null;
            t61Var.dismiss();
        }
    }
}
