package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class pt0 extends ia implements bi.b9 {
    public int f29516d3;
    public int f29517e3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f29516d3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f29517e3;
    }
}
