package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k3 extends di.t4 {
    public boolean f34206c0;
    public final n3 f34207d0;

    public k3(n3 n3Var, Context context) {
        super(context);
        this.f34207d0 = n3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f34206c0 = true;
        setOffsetY(View.MeasureSpec.getSize(i11) * 0.4f);
        this.f34206c0 = false;
        int size = View.MeasureSpec.getSize(i11);
        w3 w3Var = this.f34207d0.K.K;
        if (w3Var != null) {
            w3Var.getClass();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(56.0f)) - AndroidUtilities.statusBarHeight, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (!this.f34206c0) {
            super.requestLayout();
        }
    }
}
