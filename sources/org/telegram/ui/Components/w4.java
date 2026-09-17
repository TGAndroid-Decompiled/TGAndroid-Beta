package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends LinearLayout {
    public boolean f32114a;
    public final vc0 f32115b;

    public w4(Context context, vc0 vc0Var) {
        super(context);
        this.f32115b = vc0Var;
        this.f32114a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32114a = true;
        this.f32115b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f32114a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32114a) {
            return;
        }
        super.requestLayout();
    }
}
