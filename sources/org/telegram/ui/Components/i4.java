package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class i4 extends LinearLayout {
    public final int f24870a;
    public boolean f24871b;
    public final cd0 f24872c;

    public i4(Context context, cd0 cd0Var, int i10) {
        super(context);
        this.f24870a = i10;
        this.f24872c = cd0Var;
        this.f24871b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        switch (this.f24870a) {
            case 0:
                h4 h4Var = (h4) this.f24872c;
                this.f24871b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                h4Var.setItemCount(i12);
                h4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f24871b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                m4 m4Var = (m4) this.f24872c;
                this.f24871b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                m4Var.setItemCount(i13);
                m4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f24871b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f24870a) {
            case 0:
                if (!this.f24871b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f24871b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
