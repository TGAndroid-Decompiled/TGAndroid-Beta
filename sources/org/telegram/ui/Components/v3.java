package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v3 extends LinearLayout {
    public boolean f33555a;
    public final s3 f33556b;
    public final u3 f33557c;

    public v3(Context context, s3 s3Var, u3 u3Var) {
        super(context);
        this.f33556b = s3Var;
        this.f33557c = u3Var;
        this.f33555a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f33555a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        s3 s3Var = this.f33556b;
        s3Var.setItemCount(i12);
        u3 u3Var = this.f33557c;
        u3Var.setItemCount(i12);
        s3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        u3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f33555a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f33555a) {
            return;
        }
        super.requestLayout();
    }
}
