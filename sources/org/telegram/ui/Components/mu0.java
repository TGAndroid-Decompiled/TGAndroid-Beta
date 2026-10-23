package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class mu0 extends ia implements ci.p7 {
    public int f28604b3;
    public int f28605c3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f28604b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f28605c3;
    }
}
