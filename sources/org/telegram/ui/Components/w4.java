package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends LinearLayout {
    public boolean f32514a;
    public final gd0 f32515b;

    public w4(Context context, gd0 gd0Var) {
        super(context);
        this.f32515b = gd0Var;
        this.f32514a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32514a = true;
        this.f32515b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.f32514a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32514a) {
            return;
        }
        super.requestLayout();
    }
}
