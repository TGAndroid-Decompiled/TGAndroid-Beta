package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class eu0 extends ja implements ai.s9 {
    public int f24048k3;
    public int f24049l3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f24048k3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f24049l3;
    }
}
