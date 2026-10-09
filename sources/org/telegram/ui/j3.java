package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j3 extends ei.o4 {
    public boolean f38816c0;
    public final m3 f38817d0;

    public j3(m3 m3Var, Context context) {
        super(context);
        this.f38817d0 = m3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f38816c0 = true;
        setOffsetY(View.MeasureSpec.getSize(i11) * 0.4f);
        this.f38816c0 = false;
        int size = View.MeasureSpec.getSize(i11);
        v3 v3Var = this.f38817d0.K.K;
        if (v3Var != null) {
            v3Var.getClass();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(56.0f)) - AndroidUtilities.statusBarHeight, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (!this.f38816c0) {
            super.requestLayout();
        }
    }
}
