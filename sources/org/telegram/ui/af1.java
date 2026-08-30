package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class af1 extends FrameLayout {
    public TextView f32575a;
    public float f32576b;
    public boolean f32577c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f32577c) {
            float f10 = this.f32576b + 0.013333334f;
            this.f32576b = f10;
            if (f10 > 1.0f) {
                this.f32577c = false;
                this.f32576b = 1.0f;
            }
        } else {
            float f11 = this.f32576b - 0.013333334f;
            this.f32576b = f11;
            if (f11 < 0.0f) {
                this.f32577c = true;
                this.f32576b = 0.0f;
            }
        }
        TextView textView = this.f32575a;
        float interpolation = org.telegram.ui.Components.nr.f27346f.getInterpolation(this.f32576b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
