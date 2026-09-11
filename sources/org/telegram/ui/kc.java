package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class kc extends j71 {
    public final ec f38000d2;
    public final a71[] f38001e2;
    public final bd f38002f2;

    public kc(bd bdVar, bd bdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, ec ecVar, a71[] a71VarArr) {
        super(bdVar2, activity, true, num, i10, true, f6Var, i11, i12);
        this.f38002f2 = bdVar;
        this.f38000d2 = ecVar;
        this.f38001e2 = a71VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f38002f2.f34734a;
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
        this.f38000d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        a71 a71Var = this.f38001e2[0];
        if (a71Var != null) {
            this.f38002f2.Q = null;
            a71Var.dismiss();
        }
    }
}
