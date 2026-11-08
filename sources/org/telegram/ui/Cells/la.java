package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;
public final class la extends TextView {
    public boolean f29524a;
    public final org.telegram.ui.Components.w5 f29525b;
    public cp f29526c;

    public la(Context context) {
        super(context);
        this.f29525b = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
    }

    public final void a(boolean z9, boolean z10) {
        this.f29524a = z9;
        boolean z11 = true;
        if (!z10) {
            this.f29525b.f(z9, true);
        }
        if (!isPressed() && !z9) {
            z11 = false;
        }
        super.setPressed(z11);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f29525b.d(this.f29524a);
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
            if (this.f29526c == null) {
                cp cpVar = new cp(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(2.0f), getCurrentTextColor());
                this.f29526c = cpVar;
                cpVar.setCallback(this);
            }
            this.f29526c.b(getCurrentTextColor());
            float f11 = 1.0f - d;
            this.f29526c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (org.telegram.messenger.g0.L(12.0f) * f11)), getWidth() / 2, (getHeight() / 2) + ((int) (f11 * org.telegram.messenger.g0.L(12.0f))));
            this.f29526c.setAlpha((int) (d * 255.0f));
            this.f29526c.draw(canvas2);
            invalidate();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void setPressed(boolean z9) {
        boolean z10;
        if (!z9 && !this.f29524a) {
            z10 = false;
        } else {
            z10 = true;
        }
        super.setPressed(z10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29526c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
