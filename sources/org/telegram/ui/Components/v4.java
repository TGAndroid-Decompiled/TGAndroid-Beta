package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v4 extends LinearLayout {
    public boolean f28926a;
    public final cd0 f28927b;

    public v4(Context context, cd0 cd0Var) {
        super(context);
        this.f28927b = cd0Var;
        this.f28926a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f28926a = true;
        this.f28927b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f28926a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f28926a) {
            return;
        }
        super.requestLayout();
    }
}
