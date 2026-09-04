package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends LinearLayout {
    public boolean f32113a;
    public final vc0 f32114b;

    public w4(Context context, vc0 vc0Var) {
        super(context);
        this.f32114b = vc0Var;
        this.f32113a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32113a = true;
        this.f32114b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f32113a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32113a) {
            return;
        }
        super.requestLayout();
    }
}
