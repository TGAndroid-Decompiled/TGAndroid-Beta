package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class mf1 extends FrameLayout {
    public TextView f35556a;
    public float f35557b;
    public boolean f35558c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f35558c) {
            float f7 = this.f35557b + 0.013333334f;
            this.f35557b = f7;
            if (f7 > 1.0f) {
                this.f35558c = false;
                this.f35557b = 1.0f;
            }
        } else {
            float f10 = this.f35557b - 0.013333334f;
            this.f35557b = f10;
            if (f10 < 0.0f) {
                this.f35558c = true;
                this.f35557b = 0.0f;
            }
        }
        TextView textView = this.f35556a;
        float interpolation = org.telegram.ui.Components.sr.f28346f.getInterpolation(this.f35557b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
