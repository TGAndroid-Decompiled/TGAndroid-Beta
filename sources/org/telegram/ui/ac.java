package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ac extends q11 {
    public final vb f43620e2;
    public final h11[] f43621f2;
    public final rc f43622g2;

    public ac(rc rcVar, rc rcVar2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11, vb vbVar, h11[] h11VarArr) {
        super(rcVar2, activity, true, num, i7, true, f6Var, i10, i11);
        this.f43622g2 = rcVar;
        this.f43620e2 = vbVar;
        this.f43621f2 = h11VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f43622g2.f49433a;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        if (l10 == null) {
            longValue = 0;
        } else {
            longValue = l10.longValue();
        }
        this.f43620e2.a(Long.valueOf(longValue), num, tL_starGiftUnique);
        h11 h11Var = this.f43621f2[0];
        if (h11Var != null) {
            this.f43622g2.Q = null;
            h11Var.dismiss();
        }
    }
}
