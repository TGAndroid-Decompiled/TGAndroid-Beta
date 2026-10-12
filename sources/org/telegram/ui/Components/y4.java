package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y4 extends LinearLayout {
    public boolean f32945a;
    public final yd0 f32946b;

    public y4(Context context, yd0 yd0Var) {
        super(context);
        this.f32946b = yd0Var;
        this.f32945a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32945a = true;
        this.f32946b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f32945a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32945a) {
            return;
        }
        super.requestLayout();
    }
}
