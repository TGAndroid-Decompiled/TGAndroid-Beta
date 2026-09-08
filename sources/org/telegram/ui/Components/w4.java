package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends LinearLayout {
    public boolean f32140a;
    public final vc0 f32141b;

    public w4(Context context, vc0 vc0Var) {
        super(context);
        this.f32141b = vc0Var;
        this.f32140a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32140a = true;
        this.f32141b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f32140a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32140a) {
            return;
        }
        super.requestLayout();
    }
}
