package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x4 extends LinearLayout {
    public boolean f32332a;
    public final od0 f32333b;

    public x4(Context context, od0 od0Var) {
        super(context);
        this.f32333b = od0Var;
        this.f32332a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32332a = true;
        this.f32333b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f32332a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32332a) {
            return;
        }
        super.requestLayout();
    }
}
