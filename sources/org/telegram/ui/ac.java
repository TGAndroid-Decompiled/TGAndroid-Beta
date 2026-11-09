package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ac extends s11 {
    public final vb f43664e2;
    public final j11[] f43665f2;
    public final rc f43666g2;

    public ac(rc rcVar, rc rcVar2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10, int i11, vb vbVar, j11[] j11VarArr) {
        super(rcVar2, activity, true, num, i7, true, g6Var, i10, i11);
        this.f43666g2 = rcVar;
        this.f43664e2 = vbVar;
        this.f43665f2 = j11VarArr;
    }

    @Override
    public final long getDialogId() {
        return this.f43666g2.f49406a;
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
        this.f43664e2.a(Long.valueOf(longValue), num, tL_starGiftUnique);
        j11 j11Var = this.f43665f2[0];
        if (j11Var != null) {
            this.f43666g2.Q = null;
            j11Var.dismiss();
        }
    }
}
