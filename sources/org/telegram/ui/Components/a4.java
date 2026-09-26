package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a4 extends LinearLayout {
    public boolean f22528a;
    public final fd0 f22529b;
    public final fd0 f22530c;
    public final fd0 d;

    public a4(Context context, fd0 fd0Var, fd0 fd0Var2, fd0 fd0Var3) {
        super(context);
        this.f22529b = fd0Var;
        this.f22530c = fd0Var2;
        this.d = fd0Var3;
        this.f22528a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f22528a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        fd0 fd0Var = this.f22529b;
        fd0Var.setItemCount(i12);
        fd0 fd0Var2 = this.f22530c;
        fd0Var2.setItemCount(i12);
        fd0 fd0Var3 = this.d;
        fd0Var3.setItemCount(i12);
        fd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f22528a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f22528a) {
            return;
        }
        super.requestLayout();
    }
}
