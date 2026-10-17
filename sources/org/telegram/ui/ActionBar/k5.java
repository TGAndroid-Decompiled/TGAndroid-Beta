package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dq;
public abstract class k5 extends TextView {
    public boolean f21545a;
    public final org.telegram.ui.Components.f6 f21546b;
    public final dq f21547c;

    public k5(Context context) {
        super(context);
        this.f21545a = false;
        this.f21546b = new org.telegram.ui.Components.f6(this, 320L, bs.h);
        this.f21547c = new dq(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f21546b.e(this.f21545a);
        if (e < 1.0f) {
            if (e <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e) * 255.0f), 31);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) * e);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (e > 0.0f) {
            int height = getHeight() / 2;
            int width = (getWidth() / 2) - ((int) ((1.0f - e) * AndroidUtilities.dp(6.0f)));
            dq dqVar = this.f21547c;
            dqVar.setAlpha((int) (e * 255.0f));
            dqVar.setBounds(width - (dqVar.getIntrinsicWidth() / 2), height - (dqVar.getIntrinsicWidth() / 2), (dqVar.getIntrinsicWidth() / 2) + width, (dqVar.getIntrinsicHeight() / 2) + height);
            dqVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f21547c.b(i10);
    }
}
