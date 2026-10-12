package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.lq;
public abstract class i5 extends TextView {
    public boolean f20984a;
    public final org.telegram.ui.Components.g6 f20985b;
    public final lq f20986c;

    public i5(Context context) {
        super(context);
        this.f20984a = false;
        this.f20985b = new org.telegram.ui.Components.g6(this, 320L, js.h);
        this.f20986c = new lq(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.f20985b.e(this.f20984a);
        if (e7 < 1.0f) {
            if (e7 <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e7) * 255.0f), 31);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) * e7);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (e7 > 0.0f) {
            int height = getHeight() / 2;
            int width = (getWidth() / 2) - ((int) ((1.0f - e7) * AndroidUtilities.dp(6.0f)));
            lq lqVar = this.f20986c;
            lqVar.setAlpha((int) (e7 * 255.0f));
            lqVar.setBounds(width - (lqVar.getIntrinsicWidth() / 2), height - (lqVar.getIntrinsicWidth() / 2), (lqVar.getIntrinsicWidth() / 2) + width, (lqVar.getIntrinsicHeight() / 2) + height);
            lqVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f20986c.b(i10);
    }
}
