package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class hu0 extends ja implements ai.s9 {
    public int f27236k3;
    public int f27237l3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f27236k3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f27237l3;
    }
}
