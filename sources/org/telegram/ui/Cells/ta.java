package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.jq;
public final class ta extends TextView {
    public boolean f23099a;
    public final org.telegram.ui.Components.g6 f23100b;
    public jq f23101c;

    public ta(Context context) {
        super(context);
        this.f23100b = new org.telegram.ui.Components.g6(this, 0L, 350L, hs.h);
    }

    public final void a(boolean z10, boolean z11) {
        this.f23099a = z10;
        boolean z12 = true;
        if (!z11) {
            this.f23100b.f(z10, true);
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
        float e7 = this.f23100b.e(this.f23099a);
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
            if (this.f23101c == null) {
                jq jqVar = new jq(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(2.0f), getCurrentTextColor());
                this.f23101c = jqVar;
                jqVar.setCallback(this);
            }
            this.f23101c.b(getCurrentTextColor());
            float f10 = 1.0f - e7;
            this.f23101c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (AndroidUtilities.dp(12.0f) * f10)), getWidth() / 2, (getHeight() / 2) + ((int) (f10 * AndroidUtilities.dp(12.0f))));
            this.f23101c.setAlpha((int) (e7 * 255.0f));
            this.f23101c.draw(canvas2);
            invalidate();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void setPressed(boolean z10) {
        boolean z11;
        if (!z10 && !this.f23099a) {
            z11 = false;
        } else {
            z11 = true;
        }
        super.setPressed(z11);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f23101c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
