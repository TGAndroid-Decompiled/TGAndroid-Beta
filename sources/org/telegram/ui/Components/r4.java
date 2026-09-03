package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r4 extends LinearLayout {
    public boolean f28400a;
    public final xc0 f28401b;

    public r4(Context context, xc0 xc0Var) {
        super(context);
        this.f28401b = xc0Var;
        this.f28400a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f28400a = true;
        this.f28401b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f28400a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f28400a) {
            return;
        }
        super.requestLayout();
    }
}
