package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;
public final class la extends TextView {
    public boolean f29604a;
    public final org.telegram.ui.Components.u5 f29605b;
    public cp f29606c;

    public la(Context context) {
        super(context);
        this.f29605b = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
    }

    public final void a(boolean z10, boolean z11) {
        this.f29604a = z10;
        boolean z12 = true;
        if (!z11) {
            this.f29605b.f(z10, true);
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
        float d = this.f29605b.d(this.f29604a);
        if (d > 0.0f) {
            if (d < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - d) * 255.0f), 31);
                float f10 = 1.0f - (0.2f * d);
                canvas2.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.translate(0.0f, org.telegram.messenger.g0.L(-12.0f) * d);
                super.onDraw(canvas2);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            if (this.f29606c == null) {
                cp cpVar = new cp(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(2.0f), getCurrentTextColor());
                this.f29606c = cpVar;
                cpVar.setCallback(this);
            }
            this.f29606c.b(getCurrentTextColor());
            float f11 = 1.0f - d;
            this.f29606c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (org.telegram.messenger.g0.L(12.0f) * f11)), getWidth() / 2, (getHeight() / 2) + ((int) (f11 * org.telegram.messenger.g0.L(12.0f))));
            this.f29606c.setAlpha((int) (d * 255.0f));
            this.f29606c.draw(canvas2);
            invalidate();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void setPressed(boolean z10) {
        boolean z11;
        if (!z10 && !this.f29604a) {
            z11 = false;
        } else {
            z11 = true;
        }
        super.setPressed(z11);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29606c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
