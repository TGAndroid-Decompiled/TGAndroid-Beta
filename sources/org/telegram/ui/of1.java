package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class of1 extends FrameLayout {
    public TextView f39178a;
    public float f39179b;
    public boolean f39180c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f39180c) {
            float f7 = this.f39179b + 0.013333334f;
            this.f39179b = f7;
            if (f7 > 1.0f) {
                this.f39180c = false;
                this.f39179b = 1.0f;
            }
        } else {
            float f10 = this.f39179b - 0.013333334f;
            this.f39179b = f10;
            if (f10 < 0.0f) {
                this.f39180c = true;
                this.f39179b = 0.0f;
            }
        }
        TextView textView = this.f39178a;
        float interpolation = org.telegram.ui.Components.tr.f31140f.getInterpolation(this.f39179b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
