package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class oc extends r71 {
    public final jc f38602d2;
    public final i71[] f38603e2;
    public final gd f38604f2;

    public oc(gd gdVar, gd gdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, jc jcVar, i71[] i71VarArr) {
        super(gdVar2, activity, true, num, i10, true, c6Var, i11, i12);
        this.f38604f2 = gdVar;
        this.f38602d2 = jcVar;
        this.f38603e2 = i71VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f38604f2.f36137a;
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
        this.f38602d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        i71 i71Var = this.f38603e2[0];
        if (i71Var != null) {
            this.f38604f2.Q = null;
            i71Var.dismiss();
        }
    }
}
