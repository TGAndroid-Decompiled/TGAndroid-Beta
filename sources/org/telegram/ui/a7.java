package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a7 extends w7 {
    public final int f32481w;
    public final Object f32482x;

    public a7(Object obj, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        super(context, p2Var);
        this.f32481w = i10;
        this.f32482x = obj;
    }

    public void e(boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        d7 d7Var = ((b7) this.f32482x).e;
        if (!z4) {
            kVar = ((org.telegram.ui.ActionBar.p2) d7Var).actionBar;
            kVar.r();
            return;
        }
        d7.b0(d7Var, true);
        kVar2 = ((org.telegram.ui.ActionBar.p2) d7Var).actionBar;
        kVar2.O(null, null);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f32481w) {
            case 0:
                super.onMeasure(i10, b.d(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((iv) this.f32482x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
        }
    }
}
