package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends LinearLayout {
    public boolean f29891a;
    public final ed0 f29892b;

    public w4(Context context, ed0 ed0Var) {
        super(context);
        this.f29892b = ed0Var;
        this.f29891a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f29891a = true;
        this.f29892b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f29891a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29891a) {
            return;
        }
        super.requestLayout();
    }
}
