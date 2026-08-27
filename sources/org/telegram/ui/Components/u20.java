package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class u20 extends FrameLayout {

    public final z20 f32954a;

    public u20(z20 z20Var, Context context) {
        super(context);
        this.f32954a = z20Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        z20.m(this.f32954a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        z20 z20Var = this.f32954a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) z20Var.f35136c.getLayoutParams();
        if (z10) {
            int iDp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = iDp;
            marginLayoutParams.rightMargin = iDp;
        } else {
            int iDp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = iDp2;
            marginLayoutParams.rightMargin = iDp2;
        }
        int iX = org.telegram.messenger.rl.x(200.0f, View.MeasureSpec.getSize(i10), 2);
        z20Var.f35135b.setPadding(iX, 0, iX, 0);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(370.0f), 1073741824));
        measureChildWithMargins(z20Var.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), 0);
    }
}
