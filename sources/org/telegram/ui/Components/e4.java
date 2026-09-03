package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e4 extends LinearLayout {
    public final int f26437a;
    public boolean f26438b;
    public final yc0 f26439c;

    public e4(Context context, yc0 yc0Var, int i10) {
        super(context);
        this.f26437a = i10;
        this.f26439c = yc0Var;
        this.f26438b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        switch (this.f26437a) {
            case 0:
                d4 d4Var = (d4) this.f26439c;
                this.f26438b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                d4Var.setItemCount(i12);
                d4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f26438b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                i4 i4Var = (i4) this.f26439c;
                this.f26438b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                i4Var.setItemCount(i13);
                i4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f26438b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f26437a) {
            case 0:
                if (!this.f26438b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f26438b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
