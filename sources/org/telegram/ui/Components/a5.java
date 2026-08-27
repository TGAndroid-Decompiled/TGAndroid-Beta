package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class a5 extends FrameLayout {

    public boolean f26629a;

    public int f26630b;

    public j6 f26631c;
    public j6 d;

    public j6 getSubtitleTextView() {
        return this.d;
    }

    public j6 getTitle() {
        return this.f26631c;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        j6 j6Var = this.d;
        j6 j6Var2 = this.f26631c;
        int iX = org.telegram.messenger.rl.x(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2) + (this.f26629a ? AndroidUtilities.statusBarHeight : 0);
        int i14 = this.f26630b;
        if (j6Var.getVisibility() != 8) {
            j6Var2.layout(i14, (AndroidUtilities.dp(1.0f) + iX) - j6Var2.getPaddingTop(), j6Var2.getMeasuredWidth() + i14, j6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (j6Var2.getTextHeight() + iX)) - j6Var2.getPaddingTop()));
        } else {
            j6Var2.layout(i14, (AndroidUtilities.dp(11.0f) + iX) - j6Var2.getPaddingTop(), j6Var2.getMeasuredWidth() + i14, j6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (j6Var2.getTextHeight() + iX)) - j6Var2.getPaddingTop()));
        }
        j6Var.layout(i14, AndroidUtilities.dp(20.0f) + iX, j6Var.getMeasuredWidth() + i14, AndroidUtilities.dp(24.0f) + j6Var.getTextHeight() + iX);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        j6 j6Var = this.f26631c;
        int paddingRight = j6Var.getPaddingRight() + size;
        int iDp = paddingRight - AndroidUtilities.dp(16.0f);
        j6Var.measure(View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(j6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
