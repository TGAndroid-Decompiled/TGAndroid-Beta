package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r3 extends LinearLayout {
    public boolean f27523a;
    public final o3 f27524b;
    public final q3 f27525c;

    public r3(Context context, o3 o3Var, q3 q3Var) {
        super(context);
        this.f27524b = o3Var;
        this.f27525c = q3Var;
        this.f27523a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f27523a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        o3 o3Var = this.f27524b;
        o3Var.setItemCount(i12);
        q3 q3Var = this.f27525c;
        q3Var.setItemCount(i12);
        o3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        q3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f27523a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27523a) {
            return;
        }
        super.requestLayout();
    }
}
