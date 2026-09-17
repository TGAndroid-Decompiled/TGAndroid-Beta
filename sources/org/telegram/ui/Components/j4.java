package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j4 extends LinearLayout {
    public final int f27332a;
    public boolean f27333b;
    public final vc0 f27334c;

    public j4(Context context, vc0 vc0Var, int i10) {
        super(context);
        this.f27332a = i10;
        this.f27334c = vc0Var;
        this.f27333b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        switch (this.f27332a) {
            case 0:
                i4 i4Var = (i4) this.f27334c;
                this.f27333b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                i4Var.setItemCount(i12);
                i4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f27333b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                n4 n4Var = (n4) this.f27334c;
                this.f27333b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                n4Var.setItemCount(i13);
                n4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f27333b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f27332a) {
            case 0:
                if (!this.f27333b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f27333b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
