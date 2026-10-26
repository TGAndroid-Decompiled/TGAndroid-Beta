package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c4 extends LinearLayout {
    public boolean f27054a;
    public final md0 f27055b;
    public final md0 f27056c;
    public final md0 d;

    public c4(Context context, md0 md0Var, md0 md0Var2, md0 md0Var3) {
        super(context);
        this.f27055b = md0Var;
        this.f27056c = md0Var2;
        this.d = md0Var3;
        this.f27054a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f27054a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        md0 md0Var = this.f27055b;
        md0Var.setItemCount(i12);
        md0 md0Var2 = this.f27056c;
        md0Var2.setItemCount(i12);
        md0 md0Var3 = this.d;
        md0Var3.setItemCount(i12);
        md0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        md0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        md0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f27054a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27054a) {
            return;
        }
        super.requestLayout();
    }
}
