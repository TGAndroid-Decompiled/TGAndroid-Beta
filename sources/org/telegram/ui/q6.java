package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class q6 extends FrameLayout {
    public org.telegram.ui.Components.j6 f41693a;
    public p6 f41694b;

    public final void a(float f10) {
        org.telegram.ui.Components.j6 j6Var = this.f41693a;
        j6Var.a();
        j6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(g7.n.a(f10, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        p6 p6Var = this.f41694b;
        p6Var.d = f10;
        p6Var.invalidate();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
