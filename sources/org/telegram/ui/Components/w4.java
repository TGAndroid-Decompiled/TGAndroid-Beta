package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends LinearLayout {
    public boolean f32464a;
    public final gd0 f32465b;

    public w4(Context context, gd0 gd0Var) {
        super(context);
        this.f32465b = gd0Var;
        this.f32464a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32464a = true;
        this.f32465b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f32464a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32464a) {
            return;
        }
        super.requestLayout();
    }
}
