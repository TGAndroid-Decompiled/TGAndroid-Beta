package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z3 extends LinearLayout {
    public boolean f30809a;
    public final fd0 f30810b;
    public final fd0 f30811c;
    public final fd0 d;

    public z3(Context context, fd0 fd0Var, fd0 fd0Var2, fd0 fd0Var3) {
        super(context);
        this.f30810b = fd0Var;
        this.f30811c = fd0Var2;
        this.d = fd0Var3;
        this.f30809a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f30809a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        fd0 fd0Var = this.f30810b;
        fd0Var.setItemCount(i12);
        fd0 fd0Var2 = this.f30811c;
        fd0Var2.setItemCount(i12);
        fd0 fd0Var3 = this.d;
        fd0Var3.setItemCount(i12);
        fd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f30809a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f30809a) {
            return;
        }
        super.requestLayout();
    }
}
