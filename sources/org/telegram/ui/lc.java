package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lc extends z51 {
    public final gc f38837d2;
    public final q51[] f38838e2;
    public final dd f38839f2;

    public lc(dd ddVar, dd ddVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, gc gcVar, q51[] q51VarArr) {
        super(ddVar2, activity, true, num, i10, true, d6Var, i11, i12);
        this.f38839f2 = ddVar;
        this.f38837d2 = gcVar;
        this.f38838e2 = q51VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f38839f2.f36157a;
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
        this.f38837d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        q51 q51Var = this.f38838e2[0];
        if (q51Var != null) {
            this.f38839f2.Q = null;
            q51Var.dismiss();
        }
    }
}
