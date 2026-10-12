package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class bg1 extends FrameLayout {
    public TextView f34536a;
    public float f34537b;
    public boolean f34538c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f34538c) {
            float f7 = this.f34537b + 0.013333334f;
            this.f34537b = f7;
            if (f7 > 1.0f) {
                this.f34538c = false;
                this.f34537b = 1.0f;
            }
        } else {
            float f10 = this.f34537b - 0.013333334f;
            this.f34537b = f10;
            if (f10 < 0.0f) {
                this.f34538c = true;
                this.f34537b = 0.0f;
            }
        }
        TextView textView = this.f34536a;
        float interpolation = org.telegram.ui.Components.es.f24771f.getInterpolation(this.f34537b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
