package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y3 extends LinearLayout {
    public boolean f30114a;
    public final uc0 f30115b;
    public final uc0 f30116c;
    public final uc0 d;

    public y3(Context context, uc0 uc0Var, uc0 uc0Var2, uc0 uc0Var3) {
        super(context);
        this.f30115b = uc0Var;
        this.f30116c = uc0Var2;
        this.d = uc0Var3;
        this.f30114a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f30114a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        uc0 uc0Var = this.f30115b;
        uc0Var.setItemCount(i12);
        uc0 uc0Var2 = this.f30116c;
        uc0Var2.setItemCount(i12);
        uc0 uc0Var3 = this.d;
        uc0Var3.setItemCount(i12);
        uc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        uc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        uc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f30114a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f30114a) {
            return;
        }
        super.requestLayout();
    }
}
