package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o3 extends LinearLayout {
    public boolean f31275a;
    public final l3 f31276b;
    public final n3 f31277c;

    public o3(Context context, l3 l3Var, n3 n3Var) {
        super(context);
        this.f31276b = l3Var;
        this.f31277c = n3Var;
        this.f31275a = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        this.f31275a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        l3 l3Var = this.f31276b;
        l3Var.setItemCount(i11);
        n3 n3Var = this.f31277c;
        n3Var.setItemCount(i11);
        l3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
        n3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
        this.f31275a = false;
        super.onMeasure(i9, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f31275a) {
            return;
        }
        super.requestLayout();
    }
}
