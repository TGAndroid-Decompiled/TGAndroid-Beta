package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.np;
public final class oa extends TextView {
    public boolean f24819a;
    public final org.telegram.ui.Components.d6 f24820b;
    public np f24821c;

    public oa(Context context) {
        super(context);
        this.f24820b = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
    }

    public final void a(boolean z10, boolean z11) {
        this.f24819a = z10;
        boolean z12 = true;
        if (!z11) {
            this.f24820b.f(z10, true);
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
        float e10 = this.f24820b.e(this.f24819a);
        if (e10 > 0.0f) {
            if (e10 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e10) * 255.0f), 31);
                float f9 = 1.0f - (0.2f * e10);
                canvas2.scale(f9, f9, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.translate(0.0f, AndroidUtilities.dp(-12.0f) * e10);
                super.onDraw(canvas2);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            if (this.f24821c == null) {
                np npVar = new np(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(2.0f), getCurrentTextColor());
                this.f24821c = npVar;
                npVar.setCallback(this);
            }
            this.f24821c.b(getCurrentTextColor());
            float f10 = 1.0f - e10;
            this.f24821c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (AndroidUtilities.dp(12.0f) * f10)), getWidth() / 2, (getHeight() / 2) + ((int) (f10 * AndroidUtilities.dp(12.0f))));
            this.f24821c.setAlpha((int) (e10 * 255.0f));
            this.f24821c.draw(canvas2);
            invalidate();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void setPressed(boolean z10) {
        boolean z11;
        if (!z10 && !this.f24819a) {
            z11 = false;
        } else {
            z11 = true;
        }
        super.setPressed(z11);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f24821c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
