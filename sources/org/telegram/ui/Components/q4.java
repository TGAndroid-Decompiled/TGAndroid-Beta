package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class q4 extends LinearLayout {

    public boolean f31779a;

    public final fc0 f31780b;

    public q4(Context context, fc0 fc0Var) {
        super(context);
        this.f31780b = fc0Var;
        this.f31779a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f31779a = true;
        this.f31780b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f31779a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f31779a) {
            return;
        }
        super.requestLayout();
    }
}
