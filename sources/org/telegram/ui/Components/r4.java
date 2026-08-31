package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r4 extends LinearLayout {
    public boolean f30586a;
    public final yc0 f30587b;

    public r4(Context context, yc0 yc0Var) {
        super(context);
        this.f30587b = yc0Var;
        this.f30586a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f30586a = true;
        this.f30587b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f30586a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f30586a) {
            return;
        }
        super.requestLayout();
    }
}
