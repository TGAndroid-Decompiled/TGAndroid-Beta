package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class ku0 extends ia implements ci.p7 {
    public int f27993b3;
    public int f27994c3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f27993b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f27994c3;
    }
}
