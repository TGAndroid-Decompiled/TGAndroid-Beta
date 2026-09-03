package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w3 extends LinearLayout {
    public boolean f30134a;
    public final xc0 f30135b;
    public final xc0 f30136c;
    public final xc0 d;

    public w3(Context context, xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3) {
        super(context);
        this.f30135b = xc0Var;
        this.f30136c = xc0Var2;
        this.d = xc0Var3;
        this.f30134a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f30134a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        xc0 xc0Var = this.f30135b;
        xc0Var.setItemCount(i12);
        xc0 xc0Var2 = this.f30136c;
        xc0Var2.setItemCount(i12);
        xc0 xc0Var3 = this.d;
        xc0Var3.setItemCount(i12);
        xc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        xc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        xc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f30134a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f30134a) {
            return;
        }
        super.requestLayout();
    }
}
