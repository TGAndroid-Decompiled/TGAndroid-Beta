package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.lq;
public final class ta extends TextView {
    public boolean f22872a;
    public final org.telegram.ui.Components.g6 f22873b;
    public lq f22874c;

    public ta(Context context) {
        super(context);
        this.f22873b = new org.telegram.ui.Components.g6(this, 0L, 350L, js.h);
    }

    public final void a(boolean z10, boolean z11) {
        this.f22872a = z10;
        boolean z12 = true;
        if (!z11) {
            this.f22873b.f(z10, true);
        }
        if (!isPressed() && !z10) {
            z12 = false;
        }
        super.setPressed(z12);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.f22873b.e(this.f22872a);
        if (e7 > 0.0f) {
            if (e7 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e7) * 255.0f), 31);
                float f7 = 1.0f - (0.2f * e7);
                canvas2.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.translate(0.0f, AndroidUtilities.dp(-12.0f) * e7);
                super.onDraw(canvas2);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            if (this.f22874c == null) {
                lq lqVar = new lq(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(2.0f), getCurrentTextColor());
                this.f22874c = lqVar;
                lqVar.setCallback(this);
            }
            this.f22874c.b(getCurrentTextColor());
            float f10 = 1.0f - e7;
            this.f22874c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (AndroidUtilities.dp(12.0f) * f10)), getWidth() / 2, (getHeight() / 2) + ((int) (f10 * AndroidUtilities.dp(12.0f))));
            this.f22874c.setAlpha((int) (e7 * 255.0f));
            this.f22874c.draw(canvas2);
            invalidate();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void setPressed(boolean z10) {
        boolean z11;
        if (!z10 && !this.f22872a) {
            z11 = false;
        } else {
            z11 = true;
        }
        super.setPressed(z11);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f22874c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
