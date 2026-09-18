package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r3 extends LinearLayout {
    public boolean f27509a;
    public final o3 f27510b;
    public final q3 f27511c;

    public r3(Context context, o3 o3Var, q3 q3Var) {
        super(context);
        this.f27510b = o3Var;
        this.f27511c = q3Var;
        this.f27509a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f27509a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        o3 o3Var = this.f27510b;
        o3Var.setItemCount(i12);
        q3 q3Var = this.f27511c;
        q3Var.setItemCount(i12);
        o3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        q3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f27509a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27509a) {
            return;
        }
        super.requestLayout();
    }
}
