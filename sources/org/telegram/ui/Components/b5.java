package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b5 extends FrameLayout {
    public boolean f25502a;
    public int f25503b;
    public k6 f25504c;
    public k6 d;

    public k6 getSubtitleTextView() {
        return this.d;
    }

    public k6 getTitle() {
        return this.f25504c;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        k6 k6Var = this.d;
        k6 k6Var2 = this.f25504c;
        int x10 = org.telegram.ui.b.x(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
        if (this.f25502a) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = x10 + i14;
        int i16 = this.f25503b;
        if (k6Var.getVisibility() != 8) {
            k6Var2.layout(i16, (AndroidUtilities.dp(1.0f) + i15) - k6Var2.getPaddingTop(), k6Var2.getMeasuredWidth() + i16, k6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (k6Var2.getTextHeight() + i15)) - k6Var2.getPaddingTop()));
        } else {
            k6Var2.layout(i16, (AndroidUtilities.dp(11.0f) + i15) - k6Var2.getPaddingTop(), k6Var2.getMeasuredWidth() + i16, k6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (k6Var2.getTextHeight() + i15)) - k6Var2.getPaddingTop()));
        }
        k6Var.layout(i16, AndroidUtilities.dp(20.0f) + i15, k6Var.getMeasuredWidth() + i16, AndroidUtilities.dp(24.0f) + k6Var.getTextHeight() + i15);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        k6 k6Var = this.f25504c;
        int paddingRight = k6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        k6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(k6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
