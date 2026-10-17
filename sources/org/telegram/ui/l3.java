package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l3 extends gi.e4 {
    public boolean f38730c0;
    public final o3 f38731d0;

    public l3(o3 o3Var, Context context) {
        super(context);
        this.f38731d0 = o3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f38730c0 = true;
        setOffsetY(View.MeasureSpec.getSize(i11) * 0.4f);
        this.f38730c0 = false;
        int size = View.MeasureSpec.getSize(i11);
        x3 x3Var = this.f38731d0.K.K;
        if (x3Var != null) {
            x3Var.getClass();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(56.0f)) - AndroidUtilities.statusBarHeight, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (!this.f38730c0) {
            super.requestLayout();
        }
    }
}
