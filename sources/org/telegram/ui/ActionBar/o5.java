package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.rp;
public abstract class o5 extends TextView {
    public boolean f29898a;
    public final org.telegram.ui.Components.c6 f29899b;
    public final rp f29900c;

    public o5(Context context) {
        super(context);
        this.f29898a = false;
        this.f29899b = new org.telegram.ui.Components.c6(this, 320L, kr.h);
        this.f29900c = new rp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f29899b.d(this.f29898a);
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
            rp rpVar = this.f29900c;
            rpVar.setAlpha((int) (d * 255.0f));
            rpVar.setBounds(width - (rpVar.getIntrinsicWidth() / 2), height - (rpVar.getIntrinsicWidth() / 2), (rpVar.getIntrinsicWidth() / 2) + width, (rpVar.getIntrinsicHeight() / 2) + height);
            rpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        this.f29900c.b(i7);
    }
}
