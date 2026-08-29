package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u4 extends LinearLayout {
    public boolean f33122a;
    public final qc0 f33123b;

    public u4(Context context, qc0 qc0Var) {
        super(context);
        this.f33123b = qc0Var;
        this.f33122a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f33122a = true;
        this.f33123b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f33122a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f33122a) {
            return;
        }
        super.requestLayout();
    }
}
