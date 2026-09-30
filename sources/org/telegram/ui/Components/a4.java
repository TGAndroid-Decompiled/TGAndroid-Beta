package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a4 extends LinearLayout {
    public boolean f22551a;
    public final hd0 f22552b;
    public final hd0 f22553c;
    public final hd0 d;

    public a4(Context context, hd0 hd0Var, hd0 hd0Var2, hd0 hd0Var3) {
        super(context);
        this.f22552b = hd0Var;
        this.f22553c = hd0Var2;
        this.d = hd0Var3;
        this.f22551a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f22551a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        hd0 hd0Var = this.f22552b;
        hd0Var.setItemCount(i12);
        hd0 hd0Var2 = this.f22553c;
        hd0Var2.setItemCount(i12);
        hd0 hd0Var3 = this.d;
        hd0Var3.setItemCount(i12);
        hd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        hd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        hd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f22551a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f22551a) {
            return;
        }
        super.requestLayout();
    }
}
