package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class he1 extends FrameLayout {
    public TextView f37586a;
    public float f37587b;
    public boolean f37588c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f37588c) {
            float f7 = this.f37587b + 0.013333334f;
            this.f37587b = f7;
            if (f7 > 1.0f) {
                this.f37588c = false;
                this.f37587b = 1.0f;
            }
        } else {
            float f10 = this.f37587b - 0.013333334f;
            this.f37587b = f10;
            if (f10 < 0.0f) {
                this.f37588c = true;
                this.f37587b = 0.0f;
            }
        }
        TextView textView = this.f37586a;
        float interpolation = org.telegram.ui.Components.bs.f25021f.getInterpolation(this.f37587b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
