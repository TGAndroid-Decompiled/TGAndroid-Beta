package org.telegram.ui;

import android.app.Activity;
public final class ii extends org.telegram.ui.Cells.w0 {
    public final qn f39165g2;

    public ii(Activity activity, org.telegram.ui.ActionBar.b6 b6Var, qn qnVar) {
        super(activity, b6Var, false);
        this.f39165g2 = qnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        float y10 = getY();
        qn qnVar = this.f39165g2;
        V(qnVar.N0.getY() + y10, qnVar.T0.getBackgroundSizeY());
    }
}
