package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y4 extends LinearLayout {
    public boolean f31147a;
    public final ud0 f31148b;

    public y4(Context context, ud0 ud0Var) {
        super(context);
        this.f31148b = ud0Var;
        this.f31147a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f31147a = true;
        this.f31148b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f31147a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f31147a) {
            return;
        }
        super.requestLayout();
    }
}
