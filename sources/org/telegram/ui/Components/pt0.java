package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class pt0 extends aa implements oh.a7 {
    public int f30186a3;
    public int f30187b3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f30186a3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f30187b3;
    }
}
