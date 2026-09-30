package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends LinearLayout {
    public boolean f29813a;
    public final hd0 f29814b;

    public w4(Context context, hd0 hd0Var) {
        super(context);
        this.f29814b = hd0Var;
        this.f29813a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f29813a = true;
        this.f29814b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f29813a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29813a) {
            return;
        }
        super.requestLayout();
    }
}
