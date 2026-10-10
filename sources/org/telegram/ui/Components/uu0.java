package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class uu0 extends la implements ai.t9 {
    public int f31638b3;
    public int f31639c3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f31638b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f31639c3;
    }
}
