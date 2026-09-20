package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z3 extends LinearLayout {
    public boolean f30697a;
    public final cd0 f30698b;
    public final cd0 f30699c;
    public final cd0 d;

    public z3(Context context, cd0 cd0Var, cd0 cd0Var2, cd0 cd0Var3) {
        super(context);
        this.f30698b = cd0Var;
        this.f30699c = cd0Var2;
        this.d = cd0Var3;
        this.f30697a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f30697a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        cd0 cd0Var = this.f30698b;
        cd0Var.setItemCount(i12);
        cd0 cd0Var2 = this.f30699c;
        cd0Var2.setItemCount(i12);
        cd0 cd0Var3 = this.d;
        cd0Var3.setItemCount(i12);
        cd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        cd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        cd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f30697a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f30697a) {
            return;
        }
        super.requestLayout();
    }
}
