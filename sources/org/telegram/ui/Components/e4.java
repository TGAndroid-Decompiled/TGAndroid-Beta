package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e4 extends LinearLayout {
    public final int f24455a;
    public boolean f24456b;
    public final xc0 f24457c;

    public e4(Context context, xc0 xc0Var, int i10) {
        super(context);
        this.f24455a = i10;
        this.f24457c = xc0Var;
        this.f24456b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        switch (this.f24455a) {
            case 0:
                d4 d4Var = (d4) this.f24457c;
                this.f24456b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                d4Var.setItemCount(i12);
                d4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f24456b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                i4 i4Var = (i4) this.f24457c;
                this.f24456b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                i4Var.setItemCount(i13);
                i4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f24456b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f24455a) {
            case 0:
                if (!this.f24456b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f24456b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
