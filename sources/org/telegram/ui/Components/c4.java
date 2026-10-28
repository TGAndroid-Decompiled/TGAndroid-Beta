package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c4 extends LinearLayout {
    public boolean f27053a;
    public final nd0 f27054b;
    public final nd0 f27055c;
    public final nd0 d;

    public c4(Context context, nd0 nd0Var, nd0 nd0Var2, nd0 nd0Var3) {
        super(context);
        this.f27054b = nd0Var;
        this.f27055c = nd0Var2;
        this.d = nd0Var3;
        this.f27053a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f27053a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        nd0 nd0Var = this.f27054b;
        nd0Var.setItemCount(i12);
        nd0 nd0Var2 = this.f27055c;
        nd0Var2.setItemCount(i12);
        nd0 nd0Var3 = this.d;
        nd0Var3.setItemCount(i12);
        nd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        nd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        nd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f27053a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f27053a) {
            return;
        }
        super.requestLayout();
    }
}
