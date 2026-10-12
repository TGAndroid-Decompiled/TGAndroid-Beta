package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a7 extends w7 {
    public final int f34059w;
    public final Object f34060x;

    public a7(Object obj, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        super(context, m2Var);
        this.f34059w = i10;
        this.f34060x = obj;
    }

    public void e(boolean z10) {
        d7 d7Var = ((b7) this.f34060x).e;
        if (z10) {
            d7.b0(d7Var, true);
            d7.d0(d7Var).O(null, null);
            return;
        }
        d7.e0(d7Var).s();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f34059w) {
            case 0:
                super.onMeasure(i10, org.telegram.messenger.yh.z(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((ov) this.f34060x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                return;
        }
    }
}
