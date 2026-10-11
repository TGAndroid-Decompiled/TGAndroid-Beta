package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i3 extends ei.o4 {
    public boolean f38567c0;
    public final l3 f38568d0;

    public i3(l3 l3Var, Context context) {
        super(context);
        this.f38568d0 = l3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f38567c0 = true;
        setOffsetY(View.MeasureSpec.getSize(i11) * 0.4f);
        this.f38567c0 = false;
        int size = View.MeasureSpec.getSize(i11);
        u3 u3Var = this.f38568d0.K.K;
        if (u3Var != null) {
            u3Var.getClass();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(56.0f)) - AndroidUtilities.statusBarHeight, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (!this.f38567c0) {
            super.requestLayout();
        }
    }
}
