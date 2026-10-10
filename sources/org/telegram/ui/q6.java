package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class q6 extends FrameLayout {
    public org.telegram.ui.Components.r6 f41071a;
    public p6 f41072b;

    public final void a(float f7) {
        org.telegram.ui.Components.r6 r6Var = this.f41071a;
        r6Var.a();
        r6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.o.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        p6 p6Var = this.f41072b;
        p6Var.d = f7;
        p6Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
