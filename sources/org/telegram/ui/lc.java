package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lc extends l71 {
    public final gc f34639d2;
    public final c71[] f34640e2;
    public final cd f34641f2;

    public lc(cd cdVar, cd cdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, gc gcVar, c71[] c71VarArr) {
        super(cdVar2, activity, true, num, i10, true, f6Var, i11, i12);
        this.f34641f2 = cdVar;
        this.f34639d2 = gcVar;
        this.f34640e2 = c71VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f34641f2.f31608a;
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
        this.f34639d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        c71 c71Var = this.f34640e2[0];
        if (c71Var != null) {
            this.f34641f2.Q = null;
            c71Var.dismiss();
        }
    }
}
