package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class k4 extends LinearLayout {
    public final int f27730a;
    public boolean f27731b;
    public final od0 f27732c;

    public k4(Context context, od0 od0Var, int i10) {
        super(context);
        this.f27730a = i10;
        this.f27732c = od0Var;
        this.f27731b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        switch (this.f27730a) {
            case 0:
                j4 j4Var = (j4) this.f27732c;
                this.f27731b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                j4Var.setItemCount(i12);
                j4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f27731b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                o4 o4Var = (o4) this.f27732c;
                this.f27731b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                o4Var.setItemCount(i13);
                o4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f27731b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f27730a) {
            case 0:
                if (!this.f27731b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f27731b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
