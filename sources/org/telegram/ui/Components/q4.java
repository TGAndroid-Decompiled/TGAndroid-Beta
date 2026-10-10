package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q4 extends LinearLayout {
    public boolean f30003a;
    public final vd0 f30004b;
    public final vd0 f30005c;
    public final vd0 d;

    public q4(Context context, vd0 vd0Var, vd0 vd0Var2, vd0 vd0Var3) {
        super(context);
        this.f30004b = vd0Var;
        this.f30005c = vd0Var2;
        this.d = vd0Var3;
        this.f30003a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f30003a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        vd0 vd0Var = this.f30004b;
        vd0Var.setItemCount(i12);
        vd0 vd0Var2 = this.f30005c;
        vd0Var2.setItemCount(i12);
        vd0 vd0Var3 = this.d;
        vd0Var3.setItemCount(i12);
        vd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        vd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        vd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f30003a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f30003a) {
            return;
        }
        super.requestLayout();
    }
}
