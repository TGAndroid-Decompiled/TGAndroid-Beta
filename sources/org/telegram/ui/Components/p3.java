package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p3 extends LinearLayout {
    public boolean f29951a;
    public final m3 f29952b;
    public final o3 f29953c;

    public p3(Context context, m3 m3Var, o3 o3Var) {
        super(context);
        this.f29952b = m3Var;
        this.f29953c = o3Var;
        this.f29951a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f29951a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        m3 m3Var = this.f29952b;
        m3Var.setItemCount(i12);
        o3 o3Var = this.f29953c;
        o3Var.setItemCount(i12);
        m3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        o3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f29951a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29951a) {
            return;
        }
        super.requestLayout();
    }
}
