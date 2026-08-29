package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class n3 extends ph.m3 {
    public boolean V;
    public final q3 W;

    public n3(q3 q3Var, Context context) {
        super(context);
        this.W = q3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.V = true;
        setOffsetY(View.MeasureSpec.getSize(i11) * 0.4f);
        this.V = false;
        int size = View.MeasureSpec.getSize(i11);
        z3 z3Var = this.W.G.G;
        if (z3Var != null) {
            z3Var.getClass();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(56.0f)) - AndroidUtilities.statusBarHeight, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (!this.V) {
            super.requestLayout();
        }
    }
}
