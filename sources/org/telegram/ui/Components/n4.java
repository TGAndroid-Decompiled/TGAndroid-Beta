package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n4 extends LinearLayout {
    public boolean f26555a;
    public final cd0 f26556b;
    public final cd0 f26557c;
    public final cd0 d;

    public n4(Context context, cd0 cd0Var, cd0 cd0Var2, cd0 cd0Var3) {
        super(context);
        this.f26556b = cd0Var;
        this.f26557c = cd0Var2;
        this.d = cd0Var3;
        this.f26555a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f26555a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        cd0 cd0Var = this.f26556b;
        cd0Var.setItemCount(i12);
        cd0 cd0Var2 = this.f26557c;
        cd0Var2.setItemCount(i12);
        cd0 cd0Var3 = this.d;
        cd0Var3.setItemCount(i12);
        cd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        cd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        cd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f26555a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f26555a) {
            return;
        }
        super.requestLayout();
    }
}
