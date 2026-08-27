package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;

public final class na extends TextView {

    public boolean f24738a;

    public final org.telegram.ui.Components.y5 f24739b;

    public hp f24740c;

    public na(Context context) {
        super(context);
        this.f24739b = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
    }

    public final void a(boolean z10, boolean z11) {
        this.f24738a = z10;
        boolean z12 = true;
        if (!z11) {
            this.f24739b.f(z10, true);
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
        float fE = this.f24739b.e(this.f24738a);
        if (fE <= 0.0f) {
            super.onDraw(canvas);
            return;
        }
        if (fE < 1.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - fE) * 255.0f), 31);
            float f10 = 1.0f - (0.2f * fE);
            canvas2.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas2.translate(0.0f, AndroidUtilities.dp(-12.0f) * fE);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (this.f24740c == null) {
            hp hpVar = new hp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(2.0f), getCurrentTextColor());
            this.f24740c = hpVar;
            hpVar.setCallback(this);
        }
        this.f24740c.b(getCurrentTextColor());
        float f11 = 1.0f - fE;
        this.f24740c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (AndroidUtilities.dp(12.0f) * f11)), getWidth() / 2, (getHeight() / 2) + ((int) (f11 * AndroidUtilities.dp(12.0f))));
        this.f24740c.setAlpha((int) (fE * 255.0f));
        this.f24740c.draw(canvas2);
        invalidate();
    }

    @Override
    public final void setPressed(boolean z10) {
        super.setPressed(z10 || this.f24738a);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.f24740c == drawable || super.verifyDrawable(drawable);
    }
}
