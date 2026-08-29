package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class oe1 extends FrameLayout {
    public TextView f41104a;
    public float f41105b;
    public boolean f41106c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f41106c) {
            float f9 = this.f41105b + 0.013333334f;
            this.f41105b = f9;
            if (f9 > 1.0f) {
                this.f41106c = false;
                this.f41105b = 1.0f;
            }
        } else {
            float f10 = this.f41105b - 0.013333334f;
            this.f41105b = f10;
            if (f10 < 0.0f) {
                this.f41106c = true;
                this.f41105b = 0.0f;
            }
        }
        TextView textView = this.f41104a;
        float interpolation = org.telegram.ui.Components.jr.f29800f.getInterpolation(this.f41105b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
