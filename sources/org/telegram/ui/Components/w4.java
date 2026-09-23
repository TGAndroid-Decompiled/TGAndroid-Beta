package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends LinearLayout {
    public boolean f29510a;
    public final tc0 f29511b;

    public w4(Context context, tc0 tc0Var) {
        super(context);
        this.f29511b = tc0Var;
        this.f29510a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f29510a = true;
        this.f29511b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f29510a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29510a) {
            return;
        }
        super.requestLayout();
    }
}
