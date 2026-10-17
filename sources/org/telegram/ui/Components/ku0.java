package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class ku0 extends ia implements ci.p7 {
    public int f27986b3;
    public int f27987c3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f27986b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f27987c3;
    }
}
