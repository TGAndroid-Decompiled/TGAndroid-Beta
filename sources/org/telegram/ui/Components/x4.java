package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x4 extends LinearLayout {
    public boolean f34612a;
    public final md0 f34613b;

    public x4(Context context, md0 md0Var) {
        super(context);
        this.f34613b = md0Var;
        this.f34612a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f34612a = true;
        this.f34613b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f34612a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f34612a) {
            return;
        }
        super.requestLayout();
    }
}
