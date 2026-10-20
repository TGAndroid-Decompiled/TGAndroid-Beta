package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class k4 extends LinearLayout {
    public final int f27735a;
    public boolean f27736b;
    public final od0 f27737c;

    public k4(Context context, od0 od0Var, int i10) {
        super(context);
        this.f27735a = i10;
        this.f27737c = od0Var;
        this.f27736b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        switch (this.f27735a) {
            case 0:
                j4 j4Var = (j4) this.f27737c;
                this.f27736b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                j4Var.setItemCount(i12);
                j4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f27736b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                o4 o4Var = (o4) this.f27737c;
                this.f27736b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                o4Var.setItemCount(i13);
                o4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f27736b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f27735a) {
            case 0:
                if (!this.f27736b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f27736b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
