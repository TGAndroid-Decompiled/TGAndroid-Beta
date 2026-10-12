package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c4 extends LinearLayout {
    public boolean f24797a;
    public final yd0 f24798b;
    public final yd0 f24799c;
    public final yd0 d;

    public c4(Context context, yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        super(context);
        this.f24798b = yd0Var;
        this.f24799c = yd0Var2;
        this.d = yd0Var3;
        this.f24797a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f24797a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        yd0 yd0Var = this.f24798b;
        yd0Var.setItemCount(i12);
        yd0 yd0Var2 = this.f24799c;
        yd0Var2.setItemCount(i12);
        yd0 yd0Var3 = this.d;
        yd0Var3.setItemCount(i12);
        yd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        yd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        yd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f24797a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f24797a) {
            return;
        }
        super.requestLayout();
    }
}
