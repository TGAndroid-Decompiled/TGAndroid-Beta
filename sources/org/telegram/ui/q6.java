package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class q6 extends FrameLayout {
    public org.telegram.ui.Components.p6 f36801a;
    public p6 f36802b;

    public final void a(float f7) {
        org.telegram.ui.Components.p6 p6Var = this.f36801a;
        p6Var.a();
        p6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.q.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        p6 p6Var2 = this.f36802b;
        p6Var2.d = f7;
        p6Var2.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
