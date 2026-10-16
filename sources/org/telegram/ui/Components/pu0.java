package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class pu0 extends ka implements bi.e9 {
    public int f28108b3;
    public int f28109c3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f28108b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f28109c3;
    }
}
