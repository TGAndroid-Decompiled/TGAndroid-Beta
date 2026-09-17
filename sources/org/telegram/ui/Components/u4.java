package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u4 extends LinearLayout {
    public boolean f28270a;
    public final uc0 f28271b;

    public u4(Context context, uc0 uc0Var) {
        super(context);
        this.f28271b = uc0Var;
        this.f28270a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f28270a = true;
        this.f28271b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f28270a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f28270a) {
            return;
        }
        super.requestLayout();
    }
}
