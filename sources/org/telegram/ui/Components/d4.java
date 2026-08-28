package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d4 extends LinearLayout {
    public final int f27648a;
    public boolean f27649b;
    public final bc0 f27650c;

    public d4(Context context, bc0 bc0Var, int i9) {
        super(context);
        this.f27648a = i9;
        this.f27650c = bc0Var;
        this.f27649b = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        switch (this.f27648a) {
            case 0:
                c4 c4Var = (c4) this.f27650c;
                this.f27649b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                c4Var.setItemCount(i11);
                c4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
                this.f27649b = false;
                super.onMeasure(i9, i10);
                return;
            default:
                h4 h4Var = (h4) this.f27650c;
                this.f27649b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                h4Var.setItemCount(i12);
                h4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f27649b = false;
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f27648a) {
            case 0:
                if (!this.f27649b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f27649b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
