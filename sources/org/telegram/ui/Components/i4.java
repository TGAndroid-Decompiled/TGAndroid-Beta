package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class i4 extends LinearLayout {

    public boolean f29214a;

    public final fc0 f29215b;

    public final fc0 f29216c;
    public final fc0 d;

    public i4(Context context, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3) {
        super(context);
        this.f29215b = fc0Var;
        this.f29216c = fc0Var2;
        this.d = fc0Var3;
        this.f29214a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f29214a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        fc0 fc0Var = this.f29215b;
        fc0Var.setItemCount(i12);
        fc0 fc0Var2 = this.f29216c;
        fc0Var2.setItemCount(i12);
        fc0 fc0Var3 = this.d;
        fc0Var3.setItemCount(i12);
        fc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f29214a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29214a) {
            return;
        }
        super.requestLayout();
    }
}
