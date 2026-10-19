package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x4 extends LinearLayout {
    public boolean f32299a;
    public final od0 f32300b;

    public x4(Context context, od0 od0Var) {
        super(context);
        this.f32300b = od0Var;
        this.f32299a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32299a = true;
        this.f32300b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f32299a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32299a) {
            return;
        }
        super.requestLayout();
    }
}
