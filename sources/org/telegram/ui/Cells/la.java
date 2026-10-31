package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
public final class la extends TextView {
    public boolean f22266a;
    public final org.telegram.ui.Components.t5 f22267b;
    public kp f22268c;

    public la(Context context) {
        super(context);
        this.f22267b = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
    }

    public final void a(boolean z10, boolean z11) {
        this.f22266a = z10;
        boolean z12 = true;
        if (!z11) {
            this.f22267b.f(z10, true);
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
        float d = this.f22267b.d(this.f22266a);
        if (d > 0.0f) {
            if (d < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - d) * 255.0f), 31);
                float f7 = 1.0f - (0.2f * d);
                canvas2.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.translate(0.0f, org.telegram.messenger.i0.L(-12.0f) * d);
                super.onDraw(canvas2);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            if (this.f22268c == null) {
                kp kpVar = new kp(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(2.0f), getCurrentTextColor());
                this.f22268c = kpVar;
                kpVar.setCallback(this);
            }
            this.f22268c.b(getCurrentTextColor());
            float f10 = 1.0f - d;
            this.f22268c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (org.telegram.messenger.i0.L(12.0f) * f10)), getWidth() / 2, (getHeight() / 2) + ((int) (f10 * org.telegram.messenger.i0.L(12.0f))));
            this.f22268c.setAlpha((int) (d * 255.0f));
            this.f22268c.draw(canvas2);
            invalidate();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void setPressed(boolean z10) {
        boolean z11;
        if (!z10 && !this.f22266a) {
            z11 = false;
        } else {
            z11 = true;
        }
        super.setPressed(z11);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f22268c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
