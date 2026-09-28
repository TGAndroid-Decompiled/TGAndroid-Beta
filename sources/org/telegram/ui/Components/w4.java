package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends LinearLayout {
    public boolean f29811a;
    public final gd0 f29812b;

    public w4(Context context, gd0 gd0Var) {
        super(context);
        this.f29812b = gd0Var;
        this.f29811a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f29811a = true;
        this.f29812b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f29811a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29811a) {
            return;
        }
        super.requestLayout();
    }
}
