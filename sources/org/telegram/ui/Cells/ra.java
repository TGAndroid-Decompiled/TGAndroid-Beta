package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;
public final class ra extends TextView {
    public boolean f23601a;
    public final org.telegram.ui.Components.z5 f23602b;
    public tp f23603c;

    public ra(Context context) {
        super(context);
        this.f23602b = new org.telegram.ui.Components.z5(this, 0L, 350L, pr.h);
    }

    public final void a(boolean z4, boolean z10) {
        this.f23601a = z4;
        boolean z11 = true;
        if (!z10) {
            this.f23602b.f(z4, true);
        }
        if (!isPressed() && !z4) {
            z11 = false;
        }
        super.setPressed(z11);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e6 = this.f23602b.e(this.f23601a);
        if (e6 > 0.0f) {
            if (e6 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e6) * 255.0f), 31);
                float f10 = 1.0f - (0.2f * e6);
                canvas2.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.translate(0.0f, AndroidUtilities.dp(-12.0f) * e6);
                super.onDraw(canvas2);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            if (this.f23603c == null) {
                tp tpVar = new tp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(2.0f), getCurrentTextColor());
                this.f23603c = tpVar;
                tpVar.setCallback(this);
            }
            this.f23603c.b(getCurrentTextColor());
            float f11 = 1.0f - e6;
            this.f23603c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (AndroidUtilities.dp(12.0f) * f11)), getWidth() / 2, (getHeight() / 2) + ((int) (f11 * AndroidUtilities.dp(12.0f))));
            this.f23603c.setAlpha((int) (e6 * 255.0f));
            this.f23603c.draw(canvas2);
            invalidate();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void setPressed(boolean z4) {
        boolean z10;
        if (!z4 && !this.f23601a) {
            z10 = false;
        } else {
            z10 = true;
        }
        super.setPressed(z10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f23603c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
