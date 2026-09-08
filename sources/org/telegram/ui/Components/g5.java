package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class g5 extends FrameLayout {
    public boolean f26281a;
    public int f26282b;
    public q6 f26283c;
    public q6 d;

    public q6 getSubtitleTextView() {
        return this.d;
    }

    public q6 getTitle() {
        return this.f26283c;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        q6 q6Var = this.d;
        q6 q6Var2 = this.f26283c;
        int y3 = org.telegram.messenger.wl.y(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
        if (this.f26281a) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = y3 + i14;
        int i16 = this.f26282b;
        if (q6Var.getVisibility() != 8) {
            q6Var2.layout(i16, (AndroidUtilities.dp(1.0f) + i15) - q6Var2.getPaddingTop(), q6Var2.getMeasuredWidth() + i16, q6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (q6Var2.getTextHeight() + i15)) - q6Var2.getPaddingTop()));
        } else {
            q6Var2.layout(i16, (AndroidUtilities.dp(11.0f) + i15) - q6Var2.getPaddingTop(), q6Var2.getMeasuredWidth() + i16, q6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (q6Var2.getTextHeight() + i15)) - q6Var2.getPaddingTop()));
        }
        q6Var.layout(i16, AndroidUtilities.dp(20.0f) + i15, q6Var.getMeasuredWidth() + i16, AndroidUtilities.dp(24.0f) + q6Var.getTextHeight() + i15);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        q6 q6Var = this.f26283c;
        int paddingRight = q6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        q6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(q6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
