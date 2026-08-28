package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jp;
public final class ra extends TextView {
    public boolean f25130a;
    public final org.telegram.ui.Components.y5 f25131b;
    public jp f25132c;

    public ra(Context context) {
        super(context);
        this.f25131b = new org.telegram.ui.Components.y5(this, 0L, 350L, gr.h);
    }

    public final void a(boolean z10, boolean z11) {
        this.f25130a = z10;
        boolean z12 = true;
        if (!z11) {
            this.f25131b.f(z10, true);
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
        float e10 = this.f25131b.e(this.f25130a);
        if (e10 > 0.0f) {
            if (e10 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e10) * 255.0f), 31);
                float f10 = 1.0f - (0.2f * e10);
                canvas2.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.translate(0.0f, AndroidUtilities.dp(-12.0f) * e10);
                super.onDraw(canvas2);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            if (this.f25132c == null) {
                jp jpVar = new jp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(2.0f), getCurrentTextColor());
                this.f25132c = jpVar;
                jpVar.setCallback(this);
            }
            this.f25132c.b(getCurrentTextColor());
            float f11 = 1.0f - e10;
            this.f25132c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (AndroidUtilities.dp(12.0f) * f11)), getWidth() / 2, (getHeight() / 2) + ((int) (f11 * AndroidUtilities.dp(12.0f))));
            this.f25132c.setAlpha((int) (e10 * 255.0f));
            this.f25132c.draw(canvas2);
            invalidate();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void setPressed(boolean z10) {
        boolean z11;
        if (!z10 && !this.f25130a) {
            z11 = false;
        } else {
            z11 = true;
        }
        super.setPressed(z11);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f25132c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
