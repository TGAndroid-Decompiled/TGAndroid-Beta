package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n4 extends LinearLayout {
    public boolean f26623a;
    public final fd0 f26624b;
    public final fd0 f26625c;
    public final fd0 d;

    public n4(Context context, fd0 fd0Var, fd0 fd0Var2, fd0 fd0Var3) {
        super(context);
        this.f26624b = fd0Var;
        this.f26625c = fd0Var2;
        this.d = fd0Var3;
        this.f26623a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f26623a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        fd0 fd0Var = this.f26624b;
        fd0Var.setItemCount(i12);
        fd0 fd0Var2 = this.f26625c;
        fd0Var2.setItemCount(i12);
        fd0 fd0Var3 = this.d;
        fd0Var3.setItemCount(i12);
        fd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f26623a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26623a) {
            return;
        }
        super.requestLayout();
    }
}
