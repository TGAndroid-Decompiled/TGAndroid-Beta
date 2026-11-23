package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.up;
public abstract class n5 extends TextView {
    public boolean f29779a;
    public final org.telegram.ui.Components.d6 f29780b;
    public final up f29781c;

    public n5(Context context) {
        super(context);
        this.f29779a = false;
        this.f29780b = new org.telegram.ui.Components.d6(this, 320L, nr.h);
        this.f29781c = new up(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f29780b.d(this.f29779a);
        if (d < 1.0f) {
            if (d <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - d) * 255.0f), 31);
            }
            canvas2.translate(0.0f, org.telegram.messenger.g0.L(6.0f) * d);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            int height = getHeight() / 2;
            int width = (getWidth() / 2) - ((int) ((1.0f - d) * org.telegram.messenger.g0.L(6.0f)));
            up upVar = this.f29781c;
            upVar.setAlpha((int) (d * 255.0f));
            upVar.setBounds(width - (upVar.getIntrinsicWidth() / 2), height - (upVar.getIntrinsicWidth() / 2), (upVar.getIntrinsicWidth() / 2) + width, (upVar.getIntrinsicHeight() / 2) + height);
            upVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        this.f29781c.b(i7);
    }
}
