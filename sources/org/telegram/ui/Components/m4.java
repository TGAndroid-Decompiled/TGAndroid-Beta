package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m4 extends LinearLayout {
    public boolean f30567a;
    public final qc0 f30568b;
    public final qc0 f30569c;
    public final qc0 d;

    public m4(Context context, qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3) {
        super(context);
        this.f30568b = qc0Var;
        this.f30569c = qc0Var2;
        this.d = qc0Var3;
        this.f30567a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f30567a = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        qc0 qc0Var = this.f30568b;
        qc0Var.setItemCount(i12);
        qc0 qc0Var2 = this.f30569c;
        qc0Var2.setItemCount(i12);
        qc0 qc0Var3 = this.d;
        qc0Var3.setItemCount(i12);
        qc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        qc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        qc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.f30567a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f30567a) {
            return;
        }
        super.requestLayout();
    }
}
