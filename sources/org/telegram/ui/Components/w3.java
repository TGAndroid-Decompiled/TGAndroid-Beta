package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w3 extends LinearLayout {
    public boolean f32631a;
    public final yc0 f32632b;
    public final yc0 f32633c;
    public final yc0 d;

    public w3(Context context, yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3) {
        super(context);
        this.f32632b = yc0Var;
        this.f32633c = yc0Var2;
        this.d = yc0Var3;
        this.f32631a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f32631a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        yc0 yc0Var = this.f32632b;
        yc0Var.setItemCount(i12);
        yc0 yc0Var2 = this.f32633c;
        yc0Var2.setItemCount(i12);
        yc0 yc0Var3 = this.d;
        yc0Var3.setItemCount(i12);
        yc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        yc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        yc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f32631a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32631a) {
            return;
        }
        super.requestLayout();
    }
}
