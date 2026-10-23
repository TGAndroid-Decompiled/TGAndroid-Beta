package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o4 extends LinearLayout {
    public boolean f29091a;
    public final qd0 f29092b;
    public final qd0 f29093c;
    public final qd0 d;

    public o4(Context context, qd0 qd0Var, qd0 qd0Var2, qd0 qd0Var3) {
        super(context);
        this.f29092b = qd0Var;
        this.f29093c = qd0Var2;
        this.d = qd0Var3;
        this.f29091a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f29091a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        qd0 qd0Var = this.f29092b;
        qd0Var.setItemCount(i12);
        qd0 qd0Var2 = this.f29093c;
        qd0Var2.setItemCount(i12);
        qd0 qd0Var3 = this.d;
        qd0Var3.setItemCount(i12);
        qd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        qd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        qd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f29091a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29091a) {
            return;
        }
        super.requestLayout();
    }
}
