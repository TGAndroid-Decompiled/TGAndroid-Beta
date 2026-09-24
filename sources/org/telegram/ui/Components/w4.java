package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends LinearLayout {
    public boolean f29875a;
    public final ed0 f29876b;

    public w4(Context context, ed0 ed0Var) {
        super(context);
        this.f29876b = ed0Var;
        this.f29875a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f29875a = true;
        this.f29876b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f29875a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29875a) {
            return;
        }
        super.requestLayout();
    }
}
