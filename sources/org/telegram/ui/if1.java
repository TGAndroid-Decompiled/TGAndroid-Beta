package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class if1 extends FrameLayout {
    public TextView f37651a;
    public float f37652b;
    public boolean f37653c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f37653c) {
            float f10 = this.f37652b + 0.013333334f;
            this.f37652b = f10;
            if (f10 > 1.0f) {
                this.f37653c = false;
                this.f37652b = 1.0f;
            }
        } else {
            float f11 = this.f37652b - 0.013333334f;
            this.f37652b = f11;
            if (f11 < 0.0f) {
                this.f37653c = true;
                this.f37652b = 0.0f;
            }
        }
        TextView textView = this.f37651a;
        float interpolation = org.telegram.ui.Components.pr.f30168f.getInterpolation(this.f37652b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
