package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o4 extends LinearLayout {
    public boolean f26582a;
    public final tc0 f26583b;
    public final tc0 f26584c;
    public final tc0 d;

    public o4(Context context, tc0 tc0Var, tc0 tc0Var2, tc0 tc0Var3) {
        super(context);
        this.f26583b = tc0Var;
        this.f26584c = tc0Var2;
        this.d = tc0Var3;
        this.f26582a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f26582a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        tc0 tc0Var = this.f26583b;
        tc0Var.setItemCount(i12);
        tc0 tc0Var2 = this.f26584c;
        tc0Var2.setItemCount(i12);
        tc0 tc0Var3 = this.d;
        tc0Var3.setItemCount(i12);
        tc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        tc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        tc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f26582a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26582a) {
            return;
        }
        super.requestLayout();
    }
}
