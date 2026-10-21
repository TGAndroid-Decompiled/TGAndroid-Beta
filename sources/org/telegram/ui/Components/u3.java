package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u3 extends LinearLayout {
    public boolean f30828a;
    public final r3 f30829b;
    public final t3 f30830c;

    public u3(Context context, r3 r3Var, t3 t3Var) {
        super(context);
        this.f30829b = r3Var;
        this.f30830c = t3Var;
        this.f30828a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f30828a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        r3 r3Var = this.f30829b;
        r3Var.setItemCount(i12);
        t3 t3Var = this.f30830c;
        t3Var.setItemCount(i12);
        r3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        t3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f30828a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f30828a) {
            return;
        }
        super.requestLayout();
    }
}
