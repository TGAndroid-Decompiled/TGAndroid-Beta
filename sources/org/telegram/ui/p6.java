package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class p6 extends FrameLayout {
    public org.telegram.ui.Components.o6 f41301a;
    public ag.s f41302b;

    public final void a(float f9) {
        org.telegram.ui.Components.o6 o6Var = this.f41301a;
        o6Var.a();
        o6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(i7.w.a(f9, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        ag.s sVar = this.f41302b;
        sVar.d = f9;
        sVar.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
