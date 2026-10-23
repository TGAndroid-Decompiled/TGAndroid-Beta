package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends LinearLayout {
    public boolean f32148a;
    public final qd0 f32149b;

    public w4(Context context, qd0 qd0Var) {
        super(context);
        this.f32149b = qd0Var;
        this.f32148a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32148a = true;
        this.f32149b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f32148a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32148a) {
            return;
        }
        super.requestLayout();
    }
}
