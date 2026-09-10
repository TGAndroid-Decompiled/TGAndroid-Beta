package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class zt0 extends ha implements zh.q5 {
    public int f29808d3;
    public int f29809e3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f29808d3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f29809e3;
    }
}
