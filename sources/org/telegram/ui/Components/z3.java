package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z3 extends LinearLayout {
    public boolean f29577a;
    public final dd0 f29578b;
    public final dd0 f29579c;
    public final dd0 d;

    public z3(Context context, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3) {
        super(context);
        this.f29578b = dd0Var;
        this.f29579c = dd0Var2;
        this.d = dd0Var3;
        this.f29577a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f29577a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        dd0 dd0Var = this.f29578b;
        dd0Var.setItemCount(i12);
        dd0 dd0Var2 = this.f29579c;
        dd0Var2.setItemCount(i12);
        dd0 dd0Var3 = this.d;
        dd0Var3.setItemCount(i12);
        dd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        dd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        dd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f29577a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f29577a) {
            return;
        }
        super.requestLayout();
    }
}
