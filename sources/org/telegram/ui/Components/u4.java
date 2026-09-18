package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u4 extends LinearLayout {
    public boolean f28273a;
    public final uc0 f28274b;

    public u4(Context context, uc0 uc0Var) {
        super(context);
        this.f28274b = uc0Var;
        this.f28273a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f28273a = true;
        this.f28274b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f28273a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f28273a) {
            return;
        }
        super.requestLayout();
    }
}
