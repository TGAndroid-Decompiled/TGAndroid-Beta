package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a4 extends LinearLayout {
    public boolean f22488a;
    public final dd0 f22489b;
    public final dd0 f22490c;
    public final dd0 d;

    public a4(Context context, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3) {
        super(context);
        this.f22489b = dd0Var;
        this.f22490c = dd0Var2;
        this.d = dd0Var3;
        this.f22488a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f22488a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        dd0 dd0Var = this.f22489b;
        dd0Var.setItemCount(i12);
        dd0 dd0Var2 = this.f22490c;
        dd0Var2.setItemCount(i12);
        dd0 dd0Var3 = this.d;
        dd0Var3.setItemCount(i12);
        dd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        dd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        dd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f22488a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f22488a) {
            return;
        }
        super.requestLayout();
    }
}
