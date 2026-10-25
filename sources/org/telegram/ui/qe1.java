package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class qe1 extends FrameLayout {
    public TextView f42820a;
    public float f42821b;
    public boolean f42822c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f42822c) {
            float f7 = this.f42821b + 0.013333334f;
            this.f42821b = f7;
            if (f7 > 1.0f) {
                this.f42822c = false;
                this.f42821b = 1.0f;
            }
        } else {
            float f10 = this.f42821b - 0.013333334f;
            this.f42821b = f10;
            if (f10 < 0.0f) {
                this.f42822c = true;
                this.f42821b = 0.0f;
            }
        }
        TextView textView = this.f42820a;
        float interpolation = org.telegram.ui.Components.ds.f27584f.getInterpolation(this.f42821b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
