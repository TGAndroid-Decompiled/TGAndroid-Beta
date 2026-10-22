package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x4 extends LinearLayout {
    public boolean f32336a;
    public final od0 f32337b;

    public x4(Context context, od0 od0Var) {
        super(context);
        this.f32337b = od0Var;
        this.f32336a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32336a = true;
        this.f32337b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f32336a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32336a) {
            return;
        }
        super.requestLayout();
    }
}
