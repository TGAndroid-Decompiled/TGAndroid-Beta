package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class cu0 extends ia implements ai.s9 {
    public int f23328d3;
    public int f23329e3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f23328d3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f23329e3;
    }
}
