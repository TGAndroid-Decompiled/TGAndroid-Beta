package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a4 extends LinearLayout {
    public boolean f24452a;
    public final gd0 f24453b;
    public final gd0 f24454c;
    public final gd0 d;

    public a4(Context context, gd0 gd0Var, gd0 gd0Var2, gd0 gd0Var3) {
        super(context);
        this.f24453b = gd0Var;
        this.f24454c = gd0Var2;
        this.d = gd0Var3;
        this.f24452a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f24452a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        gd0 gd0Var = this.f24453b;
        gd0Var.setItemCount(i12);
        gd0 gd0Var2 = this.f24454c;
        gd0Var2.setItemCount(i12);
        gd0 gd0Var3 = this.d;
        gd0Var3.setItemCount(i12);
        gd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        gd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        gd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f24452a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f24452a) {
            return;
        }
        super.requestLayout();
    }
}
