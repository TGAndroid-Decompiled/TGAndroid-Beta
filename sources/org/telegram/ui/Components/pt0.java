package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class pt0 extends ia implements bi.b9 {
    public int f29515d3;
    public int f29516e3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f29515d3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f29516e3;
    }
}
