package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class h4 extends LinearLayout {
    public final int f29050a;
    public boolean f29051b;
    public final qc0 f29052c;

    public h4(Context context, qc0 qc0Var, int i10) {
        super(context);
        this.f29050a = i10;
        this.f29052c = qc0Var;
        this.f29051b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        switch (this.f29050a) {
            case 0:
                g4 g4Var = (g4) this.f29052c;
                this.f29051b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                g4Var.setItemCount(i12);
                g4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f29051b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                l4 l4Var = (l4) this.f29052c;
                this.f29051b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                l4Var.setItemCount(i13);
                l4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f29051b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f29050a) {
            case 0:
                if (!this.f29051b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f29051b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
