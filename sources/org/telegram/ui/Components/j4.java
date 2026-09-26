package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j4 extends LinearLayout {
    public final int f25250a;
    public boolean f25251b;
    public final fd0 f25252c;

    public j4(Context context, fd0 fd0Var, int i10) {
        super(context);
        this.f25250a = i10;
        this.f25252c = fd0Var;
        this.f25251b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        switch (this.f25250a) {
            case 0:
                i4 i4Var = (i4) this.f25252c;
                this.f25251b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                i4Var.setItemCount(i12);
                i4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f25251b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                n4 n4Var = (n4) this.f25252c;
                this.f25251b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                n4Var.setItemCount(i13);
                n4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f25251b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f25250a) {
            case 0:
                if (!this.f25251b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f25251b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
