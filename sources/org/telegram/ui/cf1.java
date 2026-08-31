package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class cf1 extends FrameLayout {
    public TextView f35795a;
    public float f35796b;
    public boolean f35797c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f35797c) {
            float f10 = this.f35796b + 0.013333334f;
            this.f35796b = f10;
            if (f10 > 1.0f) {
                this.f35797c = false;
                this.f35796b = 1.0f;
            }
        } else {
            float f11 = this.f35796b - 0.013333334f;
            this.f35796b = f11;
            if (f11 < 0.0f) {
                this.f35797c = true;
                this.f35796b = 0.0f;
            }
        }
        TextView textView = this.f35795a;
        float interpolation = org.telegram.ui.Components.pr.f30183f.getInterpolation(this.f35796b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
