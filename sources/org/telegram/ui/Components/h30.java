package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class h30 extends FrameLayout {
    public final m30 f25320a;

    public h30(m30 m30Var, Context context) {
        super(context);
        this.f25320a = m30Var;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        m30.m(this.f25320a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z4 = true;
        } else {
            z4 = false;
        }
        m30 m30Var = this.f25320a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) m30Var.f26931c.getLayoutParams();
        if (z4) {
            int dp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp;
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
        }
        int x10 = org.telegram.ui.b.x(200.0f, View.MeasureSpec.getSize(i10), 2);
        m30Var.f26930b.setPadding(x10, 0, x10, 0);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(370.0f), 1073741824));
        measureChildWithMargins(m30Var.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), 0);
    }
}
