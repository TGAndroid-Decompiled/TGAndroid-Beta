package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class o3 extends LinearLayout {

    public boolean f31145a;

    public final l3 f31146b;

    public final n3 f31147c;

    public o3(Context context, l3 l3Var, n3 n3Var) {
        super(context);
        this.f31146b = l3Var;
        this.f31147c = n3Var;
        this.f31145a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f31145a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        l3 l3Var = this.f31146b;
        l3Var.setItemCount(i12);
        n3 n3Var = this.f31147c;
        n3Var.setItemCount(i12);
        l3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        n3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f31145a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f31145a) {
            return;
        }
        super.requestLayout();
    }
}
