package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m3 extends sh.m3 {
    public boolean W;
    public final p3 f38952a0;

    public m3(p3 p3Var, Context context) {
        super(context);
        this.f38952a0 = p3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.W = true;
        setOffsetY(View.MeasureSpec.getSize(i11) * 0.4f);
        this.W = false;
        int size = View.MeasureSpec.getSize(i11);
        y3 y3Var = this.f38952a0.H.H;
        if (y3Var != null) {
            y3Var.getClass();
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
