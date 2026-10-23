package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x4 extends LinearLayout {
    public boolean f32337a;
    public final od0 f32338b;

    public x4(Context context, od0 od0Var) {
        super(context);
        this.f32338b = od0Var;
        this.f32337a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32337a = true;
        this.f32338b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f32337a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32337a) {
            return;
        }
        super.requestLayout();
    }
}
