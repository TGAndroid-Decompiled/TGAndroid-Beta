package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class of1 extends FrameLayout {
    public TextView f39184a;
    public float f39185b;
    public boolean f39186c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f39186c) {
            float f7 = this.f39185b + 0.013333334f;
            this.f39185b = f7;
            if (f7 > 1.0f) {
                this.f39186c = false;
                this.f39185b = 1.0f;
            }
        } else {
            float f10 = this.f39185b - 0.013333334f;
            this.f39185b = f10;
            if (f10 < 0.0f) {
                this.f39186c = true;
                this.f39185b = 0.0f;
            }
        }
        TextView textView = this.f39184a;
        float interpolation = org.telegram.ui.Components.tr.f31147f.getInterpolation(this.f39185b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
