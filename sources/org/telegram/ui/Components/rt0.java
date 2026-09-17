package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class rt0 extends ga implements ai.s9 {
    public int f27689d3;
    public int f27690e3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f27689d3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f27690e3;
    }
}
