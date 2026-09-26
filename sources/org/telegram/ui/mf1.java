package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class mf1 extends FrameLayout {
    public TextView f35551a;
    public float f35552b;
    public boolean f35553c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f35553c) {
            float f7 = this.f35552b + 0.013333334f;
            this.f35552b = f7;
            if (f7 > 1.0f) {
                this.f35553c = false;
                this.f35552b = 1.0f;
            }
        } else {
            float f10 = this.f35552b - 0.013333334f;
            this.f35552b = f10;
            if (f10 < 0.0f) {
                this.f35553c = true;
                this.f35552b = 0.0f;
            }
        }
        TextView textView = this.f35551a;
        float interpolation = org.telegram.ui.Components.sr.f28339f.getInterpolation(this.f35552b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
