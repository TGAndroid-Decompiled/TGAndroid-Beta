package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class qt0 extends aa implements oh.a7 {
    public int f30477a3;
    public int f30478b3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f30477a3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f30478b3;
    }
}
