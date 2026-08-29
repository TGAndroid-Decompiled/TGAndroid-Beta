package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class ht0 extends fa implements lh.z6 {
    public int Z2;
    public int f29229a3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.Z2;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f29229a3;
    }
}
