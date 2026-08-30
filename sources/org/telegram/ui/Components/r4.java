package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r4 extends LinearLayout {
    public boolean f28382a;
    public final wc0 f28383b;

    public r4(Context context, wc0 wc0Var) {
        super(context);
        this.f28383b = wc0Var;
        this.f28382a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f28382a = true;
        this.f28383b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f28382a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f28382a) {
            return;
        }
        super.requestLayout();
    }
}
