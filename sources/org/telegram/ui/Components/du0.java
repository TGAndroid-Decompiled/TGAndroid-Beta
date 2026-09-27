package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class du0 extends ia implements ai.s9 {
    public int f23731d3;
    public int f23732e3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f23731d3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f23732e3;
    }
}
