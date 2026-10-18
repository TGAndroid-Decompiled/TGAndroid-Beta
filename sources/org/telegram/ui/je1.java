package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class je1 extends FrameLayout {
    public TextView f38144a;
    public float f38145b;
    public boolean f38146c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f38146c) {
            float f7 = this.f38145b + 0.013333334f;
            this.f38145b = f7;
            if (f7 > 1.0f) {
                this.f38146c = false;
                this.f38145b = 1.0f;
            }
        } else {
            float f10 = this.f38145b - 0.013333334f;
            this.f38145b = f10;
            if (f10 < 0.0f) {
                this.f38146c = true;
                this.f38145b = 0.0f;
            }
        }
        TextView textView = this.f38144a;
        float interpolation = org.telegram.ui.Components.bs.f25037f.getInterpolation(this.f38145b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
