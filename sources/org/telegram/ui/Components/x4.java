package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x4 extends LinearLayout {
    public boolean f34609a;
    public final md0 f34610b;

    public x4(Context context, md0 md0Var) {
        super(context);
        this.f34610b = md0Var;
        this.f34609a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f34609a = true;
        this.f34610b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f34609a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f34609a) {
            return;
        }
        super.requestLayout();
    }
}
