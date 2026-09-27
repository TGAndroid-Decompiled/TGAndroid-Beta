package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class kc extends c71 {
    public final fc f34996d2;
    public final t61[] f34997e2;
    public final cd f34998f2;

    public kc(cd cdVar, cd cdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12, fc fcVar, t61[] t61VarArr) {
        super(cdVar2, activity, true, num, i10, true, e6Var, i11, i12);
        this.f34998f2 = cdVar;
        this.f34996d2 = fcVar;
        this.f34997e2 = t61VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f34998f2.f32661a;
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
        this.f34996d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        t61 t61Var = this.f34997e2[0];
        if (t61Var != null) {
            this.f34998f2.Q = null;
            t61Var.dismiss();
        }
    }
}
