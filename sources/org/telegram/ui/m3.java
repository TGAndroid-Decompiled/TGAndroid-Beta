package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m3 extends mh.f4 {
    public boolean V;
    public final p3 W;

    public m3(p3 p3Var, Context context) {
        super(context);
        this.W = p3Var;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        this.V = true;
        setOffsetY(View.MeasureSpec.getSize(i10) * 0.4f);
        this.V = false;
        int size = View.MeasureSpec.getSize(i10);
        y3 y3Var = this.W.G.G;
        if (y3Var != null) {
            y3Var.getClass();
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(56.0f)) - AndroidUtilities.statusBarHeight, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (!this.V) {
            super.requestLayout();
        }
    }
}
