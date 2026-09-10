package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class q6 extends FrameLayout {
    public org.telegram.ui.Components.o6 f35976a;
    public og.p f35977b;

    public final void a(float f7) {
        org.telegram.ui.Components.o6 o6Var = this.f35976a;
        o6Var.a();
        o6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.q.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        og.p pVar = this.f35977b;
        pVar.d = f7;
        pVar.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
    }
}
