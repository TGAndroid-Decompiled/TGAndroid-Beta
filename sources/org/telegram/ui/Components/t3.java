package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class t3 extends LinearLayout {
    public boolean f28292a;
    public final q3 f28293b;
    public final s3 f28294c;

    public t3(Context context, q3 q3Var, s3 s3Var) {
        super(context);
        this.f28293b = q3Var;
        this.f28294c = s3Var;
        this.f28292a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f28292a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        q3 q3Var = this.f28293b;
        q3Var.setItemCount(i12);
        s3 s3Var = this.f28294c;
        s3Var.setItemCount(i12);
        q3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        s3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f28292a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f28292a) {
            return;
        }
        super.requestLayout();
    }
}
