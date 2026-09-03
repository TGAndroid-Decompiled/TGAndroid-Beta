package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r4 extends LinearLayout {
    public boolean f30639a;
    public final yc0 f30640b;

    public r4(Context context, yc0 yc0Var) {
        super(context);
        this.f30640b = yc0Var;
        this.f30639a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f30639a = true;
        this.f30640b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f30639a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f30639a) {
            return;
        }
        super.requestLayout();
    }
}
