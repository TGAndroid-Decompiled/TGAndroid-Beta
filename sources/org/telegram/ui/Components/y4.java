package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y4 extends LinearLayout {
    public boolean f32952a;
    public final yd0 f32953b;

    public y4(Context context, yd0 yd0Var) {
        super(context);
        this.f32953b = yd0Var;
        this.f32952a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32952a = true;
        this.f32953b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f32952a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32952a) {
            return;
        }
        super.requestLayout();
    }
}
