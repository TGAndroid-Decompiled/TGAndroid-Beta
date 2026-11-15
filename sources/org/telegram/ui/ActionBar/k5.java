package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lp;
public abstract class k5 extends TextView {
    public boolean f29340a;
    public final org.telegram.ui.Components.u5 f29341b;
    public final lp f29342c;

    public k5(Context context) {
        super(context);
        this.f29340a = false;
        this.f29341b = new org.telegram.ui.Components.u5(this, 320L, er.h);
        this.f29342c = new lp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f29341b.d(this.f29340a);
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
            lp lpVar = this.f29342c;
            lpVar.setAlpha((int) (d * 255.0f));
            lpVar.setBounds(width - (lpVar.getIntrinsicWidth() / 2), height - (lpVar.getIntrinsicWidth() / 2), (lpVar.getIntrinsicWidth() / 2) + width, (lpVar.getIntrinsicHeight() / 2) + height);
            lpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        this.f29342c.b(i7);
    }
}
