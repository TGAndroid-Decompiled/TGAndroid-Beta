package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a4 extends LinearLayout {
    public boolean f24622a;
    public final qd0 f24623b;
    public final qd0 f24624c;
    public final qd0 d;

    public a4(Context context, qd0 qd0Var, qd0 qd0Var2, qd0 qd0Var3) {
        super(context);
        this.f24623b = qd0Var;
        this.f24624c = qd0Var2;
        this.d = qd0Var3;
        this.f24622a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f24622a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        qd0 qd0Var = this.f24623b;
        qd0Var.setItemCount(i12);
        qd0 qd0Var2 = this.f24624c;
        qd0Var2.setItemCount(i12);
        qd0 qd0Var3 = this.d;
        qd0Var3.setItemCount(i12);
        qd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        qd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        qd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f24622a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f24622a) {
            return;
        }
        super.requestLayout();
    }
}
