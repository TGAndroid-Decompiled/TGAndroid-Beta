package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v3 extends LinearLayout {
    public boolean f31655a;
    public final s3 f31656b;
    public final u3 f31657c;

    public v3(Context context, s3 s3Var, u3 u3Var) {
        super(context);
        this.f31656b = s3Var;
        this.f31657c = u3Var;
        this.f31655a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f31655a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        s3 s3Var = this.f31656b;
        s3Var.setItemCount(i12);
        u3 u3Var = this.f31657c;
        u3Var.setItemCount(i12);
        s3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        u3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f31655a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f31655a) {
            return;
        }
        super.requestLayout();
    }
}
