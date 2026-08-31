package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j4 extends LinearLayout {
    public boolean f27986a;
    public final yc0 f27987b;
    public final yc0 f27988c;
    public final yc0 d;

    public j4(Context context, yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3) {
        super(context);
        this.f27987b = yc0Var;
        this.f27988c = yc0Var2;
        this.d = yc0Var3;
        this.f27986a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f27986a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        yc0 yc0Var = this.f27987b;
        yc0Var.setItemCount(i12);
        yc0 yc0Var2 = this.f27988c;
        yc0Var2.setItemCount(i12);
        yc0 yc0Var3 = this.d;
        yc0Var3.setItemCount(i12);
        yc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        yc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        yc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f27986a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27986a) {
            return;
        }
        super.requestLayout();
    }
}
