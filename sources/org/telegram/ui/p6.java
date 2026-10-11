package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class p6 extends FrameLayout {
    public org.telegram.ui.Components.r6 f40799a;
    public o6 f40800b;

    public final void a(float f7) {
        org.telegram.ui.Components.r6 r6Var = this.f40799a;
        r6Var.a();
        r6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.o.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        o6 o6Var = this.f40800b;
        o6Var.d = f7;
        o6Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
