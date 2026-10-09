package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jc extends k71 {
    public final ec f38905d2;
    public final b71[] f38906e2;
    public final bd f38907f2;

    public jc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12, ec ecVar, b71[] b71VarArr) {
        super(bdVar2, activity, true, num, i10, true, e6Var, i11, i12);
        this.f38907f2 = bdVar;
        this.f38905d2 = ecVar;
        this.f38906e2 = b71VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f38907f2.f36247a;
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
        this.f38905d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        b71 b71Var = this.f38906e2[0];
        if (b71Var != null) {
            this.f38907f2.Q = null;
            b71Var.dismiss();
        }
    }
}
