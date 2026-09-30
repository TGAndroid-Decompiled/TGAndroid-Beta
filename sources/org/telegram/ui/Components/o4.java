package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o4 extends LinearLayout {
    public boolean f26970a;
    public final hd0 f26971b;
    public final hd0 f26972c;
    public final hd0 d;

    public o4(Context context, hd0 hd0Var, hd0 hd0Var2, hd0 hd0Var3) {
        super(context);
        this.f26971b = hd0Var;
        this.f26972c = hd0Var2;
        this.d = hd0Var3;
        this.f26970a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f26970a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        hd0 hd0Var = this.f26971b;
        hd0Var.setItemCount(i12);
        hd0 hd0Var2 = this.f26972c;
        hd0Var2.setItemCount(i12);
        hd0 hd0Var3 = this.d;
        hd0Var3.setItemCount(i12);
        hd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        hd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        hd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f26970a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26970a) {
            return;
        }
        super.requestLayout();
    }
}
