package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a4 extends LinearLayout {
    public boolean f22352a;
    public final tc0 f22353b;
    public final tc0 f22354c;
    public final tc0 d;

    public a4(Context context, tc0 tc0Var, tc0 tc0Var2, tc0 tc0Var3) {
        super(context);
        this.f22353b = tc0Var;
        this.f22354c = tc0Var2;
        this.d = tc0Var3;
        this.f22352a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f22352a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        tc0 tc0Var = this.f22353b;
        tc0Var.setItemCount(i12);
        tc0 tc0Var2 = this.f22354c;
        tc0Var2.setItemCount(i12);
        tc0 tc0Var3 = this.d;
        tc0Var3.setItemCount(i12);
        tc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        tc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        tc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f22352a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f22352a) {
            return;
        }
        super.requestLayout();
    }
}
