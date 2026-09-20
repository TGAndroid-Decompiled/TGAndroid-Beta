package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class bu0 extends ha implements ai.s9 {
    public int f23052d3;
    public int f23053e3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f23052d3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f23053e3;
    }
}
