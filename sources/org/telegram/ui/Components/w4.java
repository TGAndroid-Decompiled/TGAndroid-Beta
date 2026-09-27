package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends LinearLayout {
    public boolean f29848a;
    public final ed0 f29849b;

    public w4(Context context, ed0 ed0Var) {
        super(context);
        this.f29849b = ed0Var;
        this.f29848a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f29848a = true;
        this.f29849b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f29848a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29848a) {
            return;
        }
        super.requestLayout();
    }
}
