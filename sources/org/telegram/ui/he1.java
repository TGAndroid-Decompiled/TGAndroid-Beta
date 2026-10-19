package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class he1 extends FrameLayout {
    public TextView f37580a;
    public float f37581b;
    public boolean f37582c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f37582c) {
            float f7 = this.f37581b + 0.013333334f;
            this.f37581b = f7;
            if (f7 > 1.0f) {
                this.f37582c = false;
                this.f37581b = 1.0f;
            }
        } else {
            float f10 = this.f37581b - 0.013333334f;
            this.f37581b = f10;
            if (f10 < 0.0f) {
                this.f37582c = true;
                this.f37581b = 0.0f;
            }
        }
        TextView textView = this.f37580a;
        float interpolation = org.telegram.ui.Components.bs.f25012f.getInterpolation(this.f37581b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
