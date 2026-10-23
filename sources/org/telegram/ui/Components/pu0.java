package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public class pu0 extends ia implements ci.o7 {
    public int f29671e3;
    public int f29672f3;

    public pu0(Context context) {
        super(context, null);
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f29671e3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f29672f3;
    }
}
