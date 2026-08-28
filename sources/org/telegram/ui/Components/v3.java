package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v3 extends LinearLayout {
    public boolean f33245a;
    public final bc0 f33246b;
    public final bc0 f33247c;
    public final bc0 d;

    public v3(Context context, bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3) {
        super(context);
        this.f33246b = bc0Var;
        this.f33247c = bc0Var2;
        this.d = bc0Var3;
        this.f33245a = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        this.f33245a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        bc0 bc0Var = this.f33246b;
        bc0Var.setItemCount(i11);
        bc0 bc0Var2 = this.f33247c;
        bc0Var2.setItemCount(i11);
        bc0 bc0Var3 = this.d;
        bc0Var3.setItemCount(i11);
        bc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
        bc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
        bc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
        this.f33245a = false;
        super.onMeasure(i9, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f33245a) {
            return;
        }
        super.requestLayout();
    }
}
