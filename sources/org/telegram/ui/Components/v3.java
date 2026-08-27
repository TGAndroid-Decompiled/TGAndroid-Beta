package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class v3 extends LinearLayout {

    public boolean f33257a;

    public final fc0 f33258b;

    public final fc0 f33259c;
    public final fc0 d;

    public v3(Context context, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3) {
        super(context);
        this.f33258b = fc0Var;
        this.f33259c = fc0Var2;
        this.d = fc0Var3;
        this.f33257a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f33257a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        fc0 fc0Var = this.f33258b;
        fc0Var.setItemCount(i12);
        fc0 fc0Var2 = this.f33259c;
        fc0Var2.setItemCount(i12);
        fc0 fc0Var3 = this.d;
        fc0Var3.setItemCount(i12);
        fc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f33257a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f33257a) {
            return;
        }
        super.requestLayout();
    }
}
