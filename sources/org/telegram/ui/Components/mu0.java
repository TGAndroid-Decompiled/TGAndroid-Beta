package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class mu0 extends ia implements ci.p7 {
    public int f28600b3;
    public int f28601c3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f28600b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f28601c3;
    }
}
