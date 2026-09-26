package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a4 extends LinearLayout {
    public boolean f22589a;
    public final ed0 f22590b;
    public final ed0 f22591c;
    public final ed0 d;

    public a4(Context context, ed0 ed0Var, ed0 ed0Var2, ed0 ed0Var3) {
        super(context);
        this.f22590b = ed0Var;
        this.f22591c = ed0Var2;
        this.d = ed0Var3;
        this.f22589a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f22589a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        ed0 ed0Var = this.f22590b;
        ed0Var.setItemCount(i12);
        ed0 ed0Var2 = this.f22591c;
        ed0Var2.setItemCount(i12);
        ed0 ed0Var3 = this.d;
        ed0Var3.setItemCount(i12);
        ed0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        ed0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        ed0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f22589a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f22589a) {
            return;
        }
        super.requestLayout();
    }
}
