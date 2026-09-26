package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o4 extends LinearLayout {
    public boolean f26932a;
    public final fd0 f26933b;
    public final fd0 f26934c;
    public final fd0 d;

    public o4(Context context, fd0 fd0Var, fd0 fd0Var2, fd0 fd0Var3) {
        super(context);
        this.f26933b = fd0Var;
        this.f26934c = fd0Var2;
        this.d = fd0Var3;
        this.f26932a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f26932a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        fd0 fd0Var = this.f26933b;
        fd0Var.setItemCount(i12);
        fd0 fd0Var2 = this.f26934c;
        fd0Var2.setItemCount(i12);
        fd0 fd0Var3 = this.d;
        fd0Var3.setItemCount(i12);
        fd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f26932a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26932a) {
            return;
        }
        super.requestLayout();
    }
}
