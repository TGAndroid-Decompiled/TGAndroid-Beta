package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class i5 extends FrameLayout {
    public boolean f25826a;
    public int f25827b;
    public s6 f25828c;
    public s6 d;

    public s6 getSubtitleTextView() {
        return this.d;
    }

    public s6 getTitle() {
        return this.f25828c;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        s6 s6Var = this.d;
        s6 s6Var2 = this.f25828c;
        int B = org.telegram.messenger.yh.B(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
        if (this.f25826a) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = B + i14;
        int i16 = this.f25827b;
        if (s6Var.getVisibility() != 8) {
            s6Var2.layout(i16, (AndroidUtilities.dp(1.0f) + i15) - s6Var2.getPaddingTop(), s6Var2.getMeasuredWidth() + i16, s6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (s6Var2.getTextHeight() + i15)) - s6Var2.getPaddingTop()));
        } else {
            s6Var2.layout(i16, (AndroidUtilities.dp(11.0f) + i15) - s6Var2.getPaddingTop(), s6Var2.getMeasuredWidth() + i16, s6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (s6Var2.getTextHeight() + i15)) - s6Var2.getPaddingTop()));
        }
        s6Var.layout(i16, AndroidUtilities.dp(20.0f) + i15, s6Var.getMeasuredWidth() + i16, AndroidUtilities.dp(24.0f) + s6Var.getTextHeight() + i15);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        s6 s6Var = this.f25828c;
        int paddingRight = s6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        s6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(s6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
