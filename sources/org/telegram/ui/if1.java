package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class if1 extends FrameLayout {
    public TextView f34921a;
    public float f34922b;
    public boolean f34923c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f34923c) {
            float f10 = this.f34922b + 0.013333334f;
            this.f34922b = f10;
            if (f10 > 1.0f) {
                this.f34923c = false;
                this.f34922b = 1.0f;
            }
        } else {
            float f11 = this.f34922b - 0.013333334f;
            this.f34922b = f11;
            if (f11 < 0.0f) {
                this.f34923c = true;
                this.f34922b = 0.0f;
            }
        }
        TextView textView = this.f34921a;
        float interpolation = org.telegram.ui.Components.mr.f27122f.getInterpolation(this.f34922b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
