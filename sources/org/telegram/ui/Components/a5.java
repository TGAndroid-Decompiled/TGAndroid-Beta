package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a5 extends FrameLayout {
    public boolean f26662a;
    public int f26663b;
    public j6 f26664c;
    public j6 d;

    public j6 getSubtitleTextView() {
        return this.d;
    }

    public j6 getTitle() {
        return this.f26664c;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        j6 j6Var = this.d;
        j6 j6Var2 = this.f26664c;
        int y10 = org.telegram.messenger.ll.y(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
        if (this.f26662a) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = y10 + i13;
        int i15 = this.f26663b;
        if (j6Var.getVisibility() != 8) {
            j6Var2.layout(i15, (AndroidUtilities.dp(1.0f) + i14) - j6Var2.getPaddingTop(), j6Var2.getMeasuredWidth() + i15, j6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (j6Var2.getTextHeight() + i14)) - j6Var2.getPaddingTop()));
        } else {
            j6Var2.layout(i15, (AndroidUtilities.dp(11.0f) + i14) - j6Var2.getPaddingTop(), j6Var2.getMeasuredWidth() + i15, j6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (j6Var2.getTextHeight() + i14)) - j6Var2.getPaddingTop()));
        }
        j6Var.layout(i15, AndroidUtilities.dp(20.0f) + i14, j6Var.getMeasuredWidth() + i15, AndroidUtilities.dp(24.0f) + j6Var.getTextHeight() + i14);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        j6 j6Var = this.f26664c;
        int paddingRight = j6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        j6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(j6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i10));
    }
}
