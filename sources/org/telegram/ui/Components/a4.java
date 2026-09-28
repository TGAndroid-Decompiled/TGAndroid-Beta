package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a4 extends LinearLayout {
    public boolean f22540a;
    public final gd0 f22541b;
    public final gd0 f22542c;
    public final gd0 d;

    public a4(Context context, gd0 gd0Var, gd0 gd0Var2, gd0 gd0Var3) {
        super(context);
        this.f22541b = gd0Var;
        this.f22542c = gd0Var2;
        this.d = gd0Var3;
        this.f22540a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f22540a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        gd0 gd0Var = this.f22541b;
        gd0Var.setItemCount(i12);
        gd0 gd0Var2 = this.f22542c;
        gd0Var2.setItemCount(i12);
        gd0 gd0Var3 = this.d;
        gd0Var3.setItemCount(i12);
        gd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        gd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        gd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f22540a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f22540a) {
            return;
        }
        super.requestLayout();
    }
}
