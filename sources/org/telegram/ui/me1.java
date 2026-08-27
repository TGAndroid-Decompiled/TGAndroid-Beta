package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class me1 extends FrameLayout {

    public TextView f40465a;

    public float f40466b;

    public boolean f40467c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f40467c) {
            float f10 = this.f40466b + 0.013333334f;
            this.f40466b = f10;
            if (f10 > 1.0f) {
                this.f40467c = false;
                this.f40466b = 1.0f;
            }
        } else {
            float f11 = this.f40466b - 0.013333334f;
            this.f40466b = f11;
            if (f11 < 0.0f) {
                this.f40467c = true;
                this.f40466b = 0.0f;
            }
        }
        this.f40465a.setTranslationX(org.telegram.ui.Components.er.f28122f.getInterpolation(this.f40466b) * AndroidUtilities.dp(8.0f) * (LocaleController.isRTL ? -1 : 1));
        invalidate();
    }
}
