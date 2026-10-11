package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public class vu0 extends ka implements ai.t9 {
    public int f32484b3;
    public int f32485c3;

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f32484b3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f32485c3;
    }
}
