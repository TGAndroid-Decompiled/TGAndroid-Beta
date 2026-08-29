package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e5 extends FrameLayout {
    public boolean f27927a;
    public int f27928b;
    public o6 f27929c;
    public o6 d;

    public o6 getSubtitleTextView() {
        return this.d;
    }

    public o6 getTitle() {
        return this.f27929c;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        o6 o6Var = this.d;
        o6 o6Var2 = this.f27929c;
        int x4 = org.telegram.ui.b.x(42.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
        if (this.f27927a) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = x4 + i14;
        int i16 = this.f27928b;
        if (o6Var.getVisibility() != 8) {
            o6Var2.layout(i16, (AndroidUtilities.dp(1.0f) + i15) - o6Var2.getPaddingTop(), o6Var2.getMeasuredWidth() + i16, o6Var2.getPaddingBottom() + ((AndroidUtilities.dp(1.3f) + (o6Var2.getTextHeight() + i15)) - o6Var2.getPaddingTop()));
        } else {
            o6Var2.layout(i16, (AndroidUtilities.dp(11.0f) + i15) - o6Var2.getPaddingTop(), o6Var2.getMeasuredWidth() + i16, o6Var2.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (o6Var2.getTextHeight() + i15)) - o6Var2.getPaddingTop()));
        }
        o6Var.layout(i16, AndroidUtilities.dp(20.0f) + i15, o6Var.getMeasuredWidth() + i16, AndroidUtilities.dp(24.0f) + o6Var.getTextHeight() + i15);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        o6 o6Var = this.f27929c;
        int paddingRight = o6Var.getPaddingRight() + size;
        int dp = paddingRight - AndroidUtilities.dp(16.0f);
        o6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(o6Var.getPaddingRight() + AndroidUtilities.dp(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
