package org.telegram.ui;

import android.content.Context;
public final class ea1 extends org.telegram.ui.Components.wm0 {
    public int V2;
    public final db1 W2;

    public ea1(db1 db1Var, Context context) {
        super(context, null);
        this.W2 = db1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ia1 ia1Var;
        super.onMeasure(i10, i11);
        if (this.V2 != getMeasuredHeight() && (ia1Var = this.W2.X) != null) {
            ia1Var.l();
        }
        this.V2 = getMeasuredHeight();
    }
}
