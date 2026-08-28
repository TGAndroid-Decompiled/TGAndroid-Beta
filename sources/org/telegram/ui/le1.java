package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class le1 extends FrameLayout {
    public TextView f40121a;
    public float f40122b;
    public boolean f40123c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i9 = 1;
        if (this.f40123c) {
            float f10 = this.f40122b + 0.013333334f;
            this.f40122b = f10;
            if (f10 > 1.0f) {
                this.f40123c = false;
                this.f40122b = 1.0f;
            }
        } else {
            float f11 = this.f40122b - 0.013333334f;
            this.f40122b = f11;
            if (f11 < 0.0f) {
                this.f40123c = true;
                this.f40122b = 0.0f;
            }
        }
        TextView textView = this.f40121a;
        float interpolation = org.telegram.ui.Components.gr.f28844f.getInterpolation(this.f40122b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i9 = -1;
        }
        textView.setTranslationX(interpolation * i9);
        invalidate();
    }
}
