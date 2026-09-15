package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r3 extends LinearLayout {
    public boolean f27526a;
    public final o3 f27527b;
    public final q3 f27528c;

    public r3(Context context, o3 o3Var, q3 q3Var) {
        super(context);
        this.f27527b = o3Var;
        this.f27528c = q3Var;
        this.f27526a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f27526a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        o3 o3Var = this.f27527b;
        o3Var.setItemCount(i12);
        q3 q3Var = this.f27528c;
        q3Var.setItemCount(i12);
        o3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        q3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f27526a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27526a) {
            return;
        }
        super.requestLayout();
    }
}
