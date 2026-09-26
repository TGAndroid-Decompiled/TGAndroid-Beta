package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class g5 extends FrameLayout {
    public boolean f24400a;
    public int f24401b;
    public p6 f24402c;
    public p6 d;

    public p6 getSubtitleTextView() {
        return this.d;
    }

    public p6 getTitle() {
        return this.f24402c;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        p6 p6Var = this.d;
        p6 p6Var2 = this.f24402c;
        int A = org.telegram.messenger.ok.A(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
        if (this.f24400a) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = A + i14;
        int i16 = this.f24401b;
        if (p6Var.getVisibility() != 8) {
            p6Var2.layout(i16, (AndroidUtilities.dp(1.0f) + i15) - p6Var2.getPaddingTop(), p6Var2.getMeasuredWidth() + i16, p6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (p6Var2.getTextHeight() + i15)) - p6Var2.getPaddingTop()));
        } else {
            p6Var2.layout(i16, (AndroidUtilities.dp(11.0f) + i15) - p6Var2.getPaddingTop(), p6Var2.getMeasuredWidth() + i16, p6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (p6Var2.getTextHeight() + i15)) - p6Var2.getPaddingTop()));
        }
        p6Var.layout(i16, AndroidUtilities.dp(20.0f) + i15, p6Var.getMeasuredWidth() + i16, AndroidUtilities.dp(24.0f) + p6Var.getTextHeight() + i15);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        p6 p6Var = this.f24402c;
        int paddingRight = p6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        p6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(p6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
