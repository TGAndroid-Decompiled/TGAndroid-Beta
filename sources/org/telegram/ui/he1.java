package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class he1 extends FrameLayout {
    public TextView f37591a;
    public float f37592b;
    public boolean f37593c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f37593c) {
            float f7 = this.f37592b + 0.013333334f;
            this.f37592b = f7;
            if (f7 > 1.0f) {
                this.f37593c = false;
                this.f37592b = 1.0f;
            }
        } else {
            float f10 = this.f37592b - 0.013333334f;
            this.f37592b = f10;
            if (f10 < 0.0f) {
                this.f37593c = true;
                this.f37592b = 0.0f;
            }
        }
        TextView textView = this.f37591a;
        float interpolation = org.telegram.ui.Components.bs.f25025f.getInterpolation(this.f37592b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
