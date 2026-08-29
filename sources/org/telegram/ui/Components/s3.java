package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class s3 extends LinearLayout {
    public boolean f32466a;
    public final p3 f32467b;
    public final r3 f32468c;

    public s3(Context context, p3 p3Var, r3 r3Var) {
        super(context);
        this.f32467b = p3Var;
        this.f32468c = r3Var;
        this.f32466a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f32466a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        p3 p3Var = this.f32467b;
        p3Var.setItemCount(i12);
        r3 r3Var = this.f32468c;
        r3Var.setItemCount(i12);
        p3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        r3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f32466a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f32466a) {
            return;
        }
        super.requestLayout();
    }
}
