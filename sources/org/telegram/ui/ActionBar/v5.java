package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
public abstract class v5 extends TextView {
    public boolean f21411a;
    public final org.telegram.ui.Components.t5 f21412b;
    public final kp f21413c;

    public v5(Context context) {
        super(context);
        this.f21411a = false;
        this.f21412b = new org.telegram.ui.Components.t5(this, 320L, gr.h);
        this.f21413c = new kp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f21412b.d(this.f21411a);
        if (d < 1.0f) {
            if (d <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - d) * 255.0f), 31);
            }
            canvas2.translate(0.0f, org.telegram.messenger.i0.L(6.0f) * d);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            int height = getHeight() / 2;
            int width = (getWidth() / 2) - ((int) ((1.0f - d) * org.telegram.messenger.i0.L(6.0f)));
            kp kpVar = this.f21413c;
            kpVar.setAlpha((int) (d * 255.0f));
            kpVar.setBounds(width - (kpVar.getIntrinsicWidth() / 2), height - (kpVar.getIntrinsicWidth() / 2), (kpVar.getIntrinsicWidth() / 2) + width, (kpVar.getIntrinsicHeight() / 2) + height);
            kpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f21413c.b(i10);
    }
}
