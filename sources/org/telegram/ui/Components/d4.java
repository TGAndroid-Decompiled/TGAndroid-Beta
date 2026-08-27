package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class d4 extends LinearLayout {

    public final int f27641a;

    public boolean f27642b;

    public final fc0 f27643c;

    public d4(Context context, fc0 fc0Var, int i10) {
        super(context);
        this.f27641a = i10;
        this.f27643c = fc0Var;
        this.f27642b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f27641a) {
            case 0:
                c4 c4Var = (c4) this.f27643c;
                this.f27642b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                c4Var.setItemCount(i12);
                c4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f27642b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                h4 h4Var = (h4) this.f27643c;
                this.f27642b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                h4Var.setItemCount(i13);
                h4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f27642b = false;
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f27641a) {
            case 0:
                if (!this.f27642b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                if (!this.f27642b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }
}
