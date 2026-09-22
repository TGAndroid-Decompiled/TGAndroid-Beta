package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class qt0 extends ga implements ai.s9 {
    public int f27441d3;
    public int f27442e3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f27441d3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f27442e3;
    }
}
