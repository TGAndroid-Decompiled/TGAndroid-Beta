package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class pc extends r71 {
    public final kc f39179d2;
    public final i71[] f39180e2;
    public final hd f39181f2;

    public pc(hd hdVar, hd hdVar2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, kc kcVar, i71[] i71VarArr) {
        super(hdVar2, activity, true, num, i10, true, c6Var, i11, i12);
        this.f39181f2 = hdVar;
        this.f39179d2 = kcVar;
        this.f39180e2 = i71VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f39181f2.f36724a;
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
        this.f39179d2.run(Long.valueOf(longValue), num, tL_starGiftUnique);
        i71 i71Var = this.f39180e2[0];
        if (i71Var != null) {
            this.f39181f2.Q = null;
            i71Var.dismiss();
        }
    }
}
