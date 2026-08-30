package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class pt0 extends aa implements nh.a7 {
    public int f27982a3;
    public int f27983b3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f27982a3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f27983b3;
    }
}
