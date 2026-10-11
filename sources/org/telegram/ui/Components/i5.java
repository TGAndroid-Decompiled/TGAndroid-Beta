package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class i5 extends FrameLayout {
    public boolean f27323a;
    public int f27324b;
    public r6 f27325c;
    public r6 d;

    public r6 getSubtitleTextView() {
        return this.d;
    }

    public r6 getTitle() {
        return this.f27325c;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        r6 r6Var = this.d;
        r6 r6Var2 = this.f27325c;
        int A = org.telegram.messenger.ai.A(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
        if (this.f27323a) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = A + i14;
        int i16 = this.f27324b;
        if (r6Var.getVisibility() != 8) {
            r6Var2.layout(i16, (AndroidUtilities.dp(1.0f) + i15) - r6Var2.getPaddingTop(), r6Var2.getMeasuredWidth() + i16, r6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (r6Var2.getTextHeight() + i15)) - r6Var2.getPaddingTop()));
        } else {
            r6Var2.layout(i16, (AndroidUtilities.dp(11.0f) + i15) - r6Var2.getPaddingTop(), r6Var2.getMeasuredWidth() + i16, r6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (r6Var2.getTextHeight() + i15)) - r6Var2.getPaddingTop()));
        }
        r6Var.layout(i16, AndroidUtilities.dp(20.0f) + i15, r6Var.getMeasuredWidth() + i16, AndroidUtilities.dp(24.0f) + r6Var.getTextHeight() + i15);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        r6 r6Var = this.f27325c;
        int paddingRight = r6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        r6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(r6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
