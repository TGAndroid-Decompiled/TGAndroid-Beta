package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y4 extends LinearLayout {
    public boolean f31485a;
    public final ud0 f31486b;

    public y4(Context context, ud0 ud0Var) {
        super(context);
        this.f31486b = ud0Var;
        this.f31485a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f31485a = true;
        this.f31486b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f31485a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f31485a) {
            return;
        }
        super.requestLayout();
    }
}
