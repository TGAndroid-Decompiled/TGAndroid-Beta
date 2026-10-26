package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class qe1 extends FrameLayout {
    public TextView f42823a;
    public float f42824b;
    public boolean f42825c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f42825c) {
            float f7 = this.f42824b + 0.013333334f;
            this.f42824b = f7;
            if (f7 > 1.0f) {
                this.f42825c = false;
                this.f42824b = 1.0f;
            }
        } else {
            float f10 = this.f42824b - 0.013333334f;
            this.f42824b = f10;
            if (f10 < 0.0f) {
                this.f42825c = true;
                this.f42824b = 0.0f;
            }
        }
        TextView textView = this.f42823a;
        float interpolation = org.telegram.ui.Components.ds.f27586f.getInterpolation(this.f42824b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
