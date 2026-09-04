package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;
public final class va extends TextView {
    public boolean f23386a;
    public final org.telegram.ui.Components.e6 f23387b;
    public sp f23388c;

    public va(Context context) {
        super(context);
        this.f23387b = new org.telegram.ui.Components.e6(this, 0L, 350L, pr.h);
    }

    public final void a(boolean z10, boolean z11) {
        this.f23386a = z10;
        boolean z12 = true;
        if (!z11) {
            this.f23387b.f(z10, true);
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
        float e7 = this.f23387b.e(this.f23386a);
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
            if (this.f23388c == null) {
                sp spVar = new sp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(2.0f), getCurrentTextColor());
                this.f23388c = spVar;
                spVar.setCallback(this);
            }
            this.f23388c.b(getCurrentTextColor());
            float f10 = 1.0f - e7;
            this.f23388c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (AndroidUtilities.dp(12.0f) * f10)), getWidth() / 2, (getHeight() / 2) + ((int) (f10 * AndroidUtilities.dp(12.0f))));
            this.f23388c.setAlpha((int) (e7 * 255.0f));
            this.f23388c.draw(canvas2);
            invalidate();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void setPressed(boolean z10) {
        boolean z11;
        if (!z10 && !this.f23386a) {
            z11 = false;
        } else {
            z11 = true;
        }
        super.setPressed(z11);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f23388c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
