package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d30 extends FrameLayout {
    public final i30 f27648a;

    public d30(i30 i30Var, Context context) {
        super(context);
        this.f27648a = i30Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i30.m(this.f27648a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        i30 i30Var = this.f27648a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i30Var.f29307c.getLayoutParams();
        if (z10) {
            int dp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp;
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
        }
        int x4 = org.telegram.ui.b.x(200.0f, View.MeasureSpec.getSize(i10), 2);
        i30Var.f29306b.setPadding(x4, 0, x4, 0);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(370.0f), 1073741824));
        measureChildWithMargins(i30Var.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), 0);
    }
}
