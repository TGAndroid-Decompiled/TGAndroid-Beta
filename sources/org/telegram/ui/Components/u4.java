package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u4 extends LinearLayout {
    public boolean f31014a;
    public final od0 f31015b;

    public u4(Context context, od0 od0Var) {
        super(context);
        this.f31015b = od0Var;
        this.f31014a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f31014a = true;
        this.f31015b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f31014a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f31014a) {
            return;
        }
        super.requestLayout();
    }
}
