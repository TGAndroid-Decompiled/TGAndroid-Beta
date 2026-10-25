package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class kc extends c61 {
    public final fc f40879e2;
    public final t51[] f40880f2;
    public final bd f40881g2;

    public kc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, int i12, fc fcVar, t51[] t51VarArr) {
        super(bdVar2, activity, true, num, i10, true, u6Var, i11, i12);
        this.f40881g2 = bdVar;
        this.f40879e2 = fcVar;
        this.f40880f2 = t51VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f40881g2.f38032a;
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
        this.f40879e2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        t51 t51Var = this.f40880f2[0];
        if (t51Var != null) {
            this.f40881g2.Q = null;
            t51Var.dismiss();
        }
    }
}
