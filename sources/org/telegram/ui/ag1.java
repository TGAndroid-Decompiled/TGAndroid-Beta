package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ag1 extends FrameLayout {
    public TextView f33899a;
    public float f33900b;
    public boolean f33901c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f33901c) {
            float f7 = this.f33900b + 0.013333334f;
            this.f33900b = f7;
            if (f7 > 1.0f) {
                this.f33901c = false;
                this.f33900b = 1.0f;
            }
        } else {
            float f10 = this.f33900b - 0.013333334f;
            this.f33900b = f10;
            if (f10 < 0.0f) {
                this.f33901c = true;
                this.f33900b = 0.0f;
            }
        }
        TextView textView = this.f33899a;
        float interpolation = org.telegram.ui.Components.es.f24465f.getInterpolation(this.f33900b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
