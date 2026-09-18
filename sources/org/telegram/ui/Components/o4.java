package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o4 extends LinearLayout {
    public boolean f26845a;
    public final dd0 f26846b;
    public final dd0 f26847c;
    public final dd0 d;

    public o4(Context context, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3) {
        super(context);
        this.f26846b = dd0Var;
        this.f26847c = dd0Var2;
        this.d = dd0Var3;
        this.f26845a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f26845a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        dd0 dd0Var = this.f26846b;
        dd0Var.setItemCount(i12);
        dd0 dd0Var2 = this.f26847c;
        dd0Var2.setItemCount(i12);
        dd0 dd0Var3 = this.d;
        dd0Var3.setItemCount(i12);
        dd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        dd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        dd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f26845a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26845a) {
            return;
        }
        super.requestLayout();
    }
}
