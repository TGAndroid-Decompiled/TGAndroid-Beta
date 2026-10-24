package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public class ou0 extends ga implements ci.o7 {
    public int f29391e3;
    public int f29392f3;

    public ou0(Context context) {
        super(context, null);
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.f29391e3;
        iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.f29392f3;
    }
}
