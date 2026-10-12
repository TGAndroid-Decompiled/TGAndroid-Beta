package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class nc extends n71 {
    public final hc f40369d2;
    public final e71[] f40370e2;
    public final fd f40371f2;

    public nc(fd fdVar, fd fdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, hc hcVar, e71[] e71VarArr) {
        super(fdVar2, activity, true, num, i10, true, c6Var, i11, i12);
        this.f40371f2 = fdVar;
        this.f40369d2 = hcVar;
        this.f40370e2 = e71VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f40371f2.f37720a;
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
        this.f40369d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        e71 e71Var = this.f40370e2[0];
        if (e71Var != null) {
            this.f40371f2.Q = null;
            e71Var.dismiss();
        }
    }
}
