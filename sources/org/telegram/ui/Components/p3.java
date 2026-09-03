package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p3 extends LinearLayout {
    public boolean f27715a;
    public final m3 f27716b;
    public final o3 f27717c;

    public p3(Context context, m3 m3Var, o3 o3Var) {
        super(context);
        this.f27716b = m3Var;
        this.f27717c = o3Var;
        this.f27715a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f27715a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        m3 m3Var = this.f27716b;
        m3Var.setItemCount(i12);
        o3 o3Var = this.f27717c;
        o3Var.setItemCount(i12);
        m3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        o3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f27715a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27715a) {
            return;
        }
        super.requestLayout();
    }
}
