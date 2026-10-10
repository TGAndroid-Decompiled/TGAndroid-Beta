package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y4 extends LinearLayout {
    public boolean f33102a;
    public final vd0 f33103b;

    public y4(Context context, vd0 vd0Var) {
        super(context);
        this.f33103b = vd0Var;
        this.f33102a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f33102a = true;
        this.f33103b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f33102a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f33102a) {
            return;
        }
        super.requestLayout();
    }
}
