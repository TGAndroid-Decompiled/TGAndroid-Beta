package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n4 extends LinearLayout {
    public boolean f25402a;
    public final dd0 f25403b;
    public final dd0 f25404c;
    public final dd0 d;

    public n4(Context context, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3) {
        super(context);
        this.f25403b = dd0Var;
        this.f25404c = dd0Var2;
        this.d = dd0Var3;
        this.f25402a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f25402a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        dd0 dd0Var = this.f25403b;
        dd0Var.setItemCount(i12);
        dd0 dd0Var2 = this.f25404c;
        dd0Var2.setItemCount(i12);
        dd0 dd0Var3 = this.d;
        dd0Var3.setItemCount(i12);
        dd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        dd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        dd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f25402a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f25402a) {
            return;
        }
        super.requestLayout();
    }
}
