package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends LinearLayout {
    public boolean f29854a;
    public final dd0 f29855b;

    public w4(Context context, dd0 dd0Var) {
        super(context);
        this.f29855b = dd0Var;
        this.f29854a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f29854a = true;
        this.f29855b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f29854a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29854a) {
            return;
        }
        super.requestLayout();
    }
}
