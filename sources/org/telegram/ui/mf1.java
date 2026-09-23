package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class mf1 extends FrameLayout {
    public TextView f35287a;
    public float f35288b;
    public boolean f35289c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f35289c) {
            float f7 = this.f35288b + 0.013333334f;
            this.f35288b = f7;
            if (f7 > 1.0f) {
                this.f35289c = false;
                this.f35288b = 1.0f;
            }
        } else {
            float f10 = this.f35288b - 0.013333334f;
            this.f35288b = f10;
            if (f10 < 0.0f) {
                this.f35289c = true;
                this.f35288b = 0.0f;
            }
        }
        TextView textView = this.f35287a;
        float interpolation = org.telegram.ui.Components.rr.f27701f.getInterpolation(this.f35288b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
