package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y4 extends LinearLayout {
    public boolean f33140a;
    public final ud0 f33141b;

    public y4(Context context, ud0 ud0Var) {
        super(context);
        this.f33141b = ud0Var;
        this.f33140a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f33140a = true;
        this.f33141b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f33140a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f33140a) {
            return;
        }
        super.requestLayout();
    }
}
