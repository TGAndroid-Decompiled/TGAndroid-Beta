package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e5 extends FrameLayout {
    public boolean f23482a;
    public int f23483b;
    public n6 f23484c;
    public n6 d;

    public n6 getSubtitleTextView() {
        return this.d;
    }

    public n6 getTitle() {
        return this.f23484c;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        n6 n6Var = this.d;
        n6 n6Var2 = this.f23484c;
        int y3 = org.telegram.messenger.wl.y(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
        if (this.f23482a) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = y3 + i14;
        int i16 = this.f23483b;
        if (n6Var.getVisibility() != 8) {
            n6Var2.layout(i16, (AndroidUtilities.dp(1.0f) + i15) - n6Var2.getPaddingTop(), n6Var2.getMeasuredWidth() + i16, n6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (n6Var2.getTextHeight() + i15)) - n6Var2.getPaddingTop()));
        } else {
            n6Var2.layout(i16, (AndroidUtilities.dp(11.0f) + i15) - n6Var2.getPaddingTop(), n6Var2.getMeasuredWidth() + i16, n6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (n6Var2.getTextHeight() + i15)) - n6Var2.getPaddingTop()));
        }
        n6Var.layout(i16, AndroidUtilities.dp(20.0f) + i15, n6Var.getMeasuredWidth() + i16, AndroidUtilities.dp(24.0f) + n6Var.getTextHeight() + i15);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        n6 n6Var = this.f23484c;
        int paddingRight = n6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        n6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(n6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
