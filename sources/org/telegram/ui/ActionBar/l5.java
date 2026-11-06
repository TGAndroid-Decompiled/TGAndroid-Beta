package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;
public abstract class l5 extends TextView {
    public boolean f28277a;
    public final org.telegram.ui.Components.w5 f28278b;
    public final cp f28279c;

    public l5(Context context) {
        super(context);
        this.f28277a = false;
        this.f28278b = new org.telegram.ui.Components.w5(this, 320L, xq.h);
        this.f28279c = new cp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f28278b.d(this.f28277a);
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
            cp cpVar = this.f28279c;
            cpVar.setAlpha((int) (d * 255.0f));
            cpVar.setBounds(width - (cpVar.getIntrinsicWidth() / 2), height - (cpVar.getIntrinsicWidth() / 2), (cpVar.getIntrinsicWidth() / 2) + width, (cpVar.getIntrinsicHeight() / 2) + height);
            cpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        this.f28279c.b(i7);
    }
}
