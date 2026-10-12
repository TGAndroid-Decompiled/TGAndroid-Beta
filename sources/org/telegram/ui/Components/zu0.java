package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class zu0 extends ka implements ai.t9 {
    public int f33495b3;
    public int f33496c3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f33495b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f33496c3;
    }
}
