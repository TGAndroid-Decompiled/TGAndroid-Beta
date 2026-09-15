package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u4 extends LinearLayout {
    public boolean f28281a;
    public final uc0 f28282b;

    public u4(Context context, uc0 uc0Var) {
        super(context);
        this.f28282b = uc0Var;
        this.f28281a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f28281a = true;
        this.f28282b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f28281a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f28281a) {
            return;
        }
        super.requestLayout();
    }
}
