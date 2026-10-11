package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class uu0 extends ka implements ai.t9 {
    public int f31720b3;
    public int f31721c3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f31720b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f31721c3;
    }
}
