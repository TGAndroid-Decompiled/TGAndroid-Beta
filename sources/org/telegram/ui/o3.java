package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o3 extends rh.m3 {
    public boolean W;
    public final r3 f36640a0;

    public o3(r3 r3Var, Context context) {
        super(context);
        this.f36640a0 = r3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.W = true;
        setOffsetY(View.MeasureSpec.getSize(i11) * 0.4f);
        this.W = false;
        int size = View.MeasureSpec.getSize(i11);
        a4 a4Var = this.f36640a0.H.H;
        if (a4Var != null) {
            a4Var.getClass();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(56.0f)) - AndroidUtilities.statusBarHeight, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (!this.W) {
            super.requestLayout();
        }
    }
}
