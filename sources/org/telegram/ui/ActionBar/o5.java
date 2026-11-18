package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.sp;
public abstract class o5 extends TextView {
    public boolean f29827a;
    public final org.telegram.ui.Components.c6 f29828b;
    public final sp f29829c;

    public o5(Context context) {
        super(context);
        this.f29827a = false;
        this.f29828b = new org.telegram.ui.Components.c6(this, 320L, lr.h);
        this.f29829c = new sp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f29828b.d(this.f29827a);
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
            sp spVar = this.f29829c;
            spVar.setAlpha((int) (d * 255.0f));
            spVar.setBounds(width - (spVar.getIntrinsicWidth() / 2), height - (spVar.getIntrinsicWidth() / 2), (spVar.getIntrinsicWidth() / 2) + width, (spVar.getIntrinsicHeight() / 2) + height);
            spVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        this.f29829c.b(i7);
    }
}
