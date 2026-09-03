package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j4 extends LinearLayout {
    public boolean f25821a;
    public final xc0 f25822b;
    public final xc0 f25823c;
    public final xc0 d;

    public j4(Context context, xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3) {
        super(context);
        this.f25822b = xc0Var;
        this.f25823c = xc0Var2;
        this.d = xc0Var3;
        this.f25821a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f25821a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        xc0 xc0Var = this.f25822b;
        xc0Var.setItemCount(i12);
        xc0 xc0Var2 = this.f25823c;
        xc0Var2.setItemCount(i12);
        xc0 xc0Var3 = this.d;
        xc0Var3.setItemCount(i12);
        xc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        xc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        xc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f25821a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f25821a) {
            return;
        }
        super.requestLayout();
    }
}
