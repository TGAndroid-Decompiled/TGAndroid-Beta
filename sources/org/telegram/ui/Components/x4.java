package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x4 extends LinearLayout {
    public boolean f34659a;
    public final nd0 f34660b;

    public x4(Context context, nd0 nd0Var) {
        super(context);
        this.f34660b = nd0Var;
        this.f34659a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f34659a = true;
        this.f34660b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f34659a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f34659a) {
            return;
        }
        super.requestLayout();
    }
}
