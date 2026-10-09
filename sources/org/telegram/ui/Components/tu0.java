package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class tu0 extends la implements ai.t9 {
    public int f31279b3;
    public int f31280c3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f31279b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f31280c3;
    }
}
