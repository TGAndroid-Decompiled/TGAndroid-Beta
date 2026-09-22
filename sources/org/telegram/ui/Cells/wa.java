package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
public final class wa extends TextView {
    public boolean f21829a;
    public final org.telegram.ui.Components.d6 f21830b;
    public tp f21831c;

    public wa(Context context) {
        super(context);
        this.f21830b = new org.telegram.ui.Components.d6(this, 0L, 350L, qr.h);
    }

    public final void a(boolean z10, boolean z11) {
        this.f21829a = z10;
        boolean z12 = true;
        if (!z11) {
            this.f21830b.f(z10, true);
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
        float e = this.f21830b.e(this.f21829a);
        if (e > 0.0f) {
            if (e < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e) * 255.0f), 31);
                float f7 = 1.0f - (0.2f * e);
                canvas2.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.translate(0.0f, AndroidUtilities.dp(-12.0f) * e);
                super.onDraw(canvas2);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            if (this.f21831c == null) {
                tp tpVar = new tp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(2.0f), getCurrentTextColor());
                this.f21831c = tpVar;
                tpVar.setCallback(this);
            }
            this.f21831c.b(getCurrentTextColor());
            float f10 = 1.0f - e;
            this.f21831c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (AndroidUtilities.dp(12.0f) * f10)), getWidth() / 2, (getHeight() / 2) + ((int) (f10 * AndroidUtilities.dp(12.0f))));
            this.f21831c.setAlpha((int) (e * 255.0f));
            this.f21831c.draw(canvas2);
            invalidate();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void setPressed(boolean z10) {
        boolean z11;
        if (!z10 && !this.f21829a) {
            z11 = false;
        } else {
            z11 = true;
        }
        super.setPressed(z11);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f21831c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
