package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l4 extends LinearLayout {
    public final int f30053a;
    public boolean f30054b;
    public final md0 f30055c;

    public l4(Context context, md0 md0Var, int i10) {
        super(context);
        this.f30053a = i10;
        this.f30055c = md0Var;
        this.f30054b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        switch (this.f30053a) {
            case 0:
                k4 k4Var = (k4) this.f30055c;
                this.f30054b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                k4Var.setItemCount(i12);
                k4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f30054b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                p4 p4Var = (p4) this.f30055c;
                this.f30054b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                p4Var.setItemCount(i13);
                p4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f30054b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f30053a) {
            case 0:
                if (!this.f30054b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f30054b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
