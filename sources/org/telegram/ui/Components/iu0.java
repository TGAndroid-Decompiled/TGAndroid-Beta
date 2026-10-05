package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class iu0 extends ja implements ai.s9 {
    public int f27598k3;
    public int f27599l3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f27598k3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f27599l3;
    }
}
