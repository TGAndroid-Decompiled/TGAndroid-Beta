package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class me1 extends FrameLayout {
    public TextView f39576a;
    public float f39577b;
    public boolean f39578c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f39578c) {
            float f7 = this.f39577b + 0.013333334f;
            this.f39577b = f7;
            if (f7 > 1.0f) {
                this.f39578c = false;
                this.f39577b = 1.0f;
            }
        } else {
            float f10 = this.f39577b - 0.013333334f;
            this.f39577b = f10;
            if (f10 < 0.0f) {
                this.f39578c = true;
                this.f39577b = 0.0f;
            }
        }
        TextView textView = this.f39576a;
        float interpolation = org.telegram.ui.Components.zr.f33337f.getInterpolation(this.f39577b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
