package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gq;
public abstract class i5 extends TextView {
    public boolean f20069a;
    public final org.telegram.ui.Components.g6 f20070b;
    public final gq f20071c;

    public i5(Context context) {
        super(context);
        this.f20069a = false;
        this.f20070b = new org.telegram.ui.Components.g6(this, 320L, es.h);
        this.f20071c = new gq(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f20070b.e(this.f20069a);
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
            gq gqVar = this.f20071c;
            gqVar.setAlpha((int) (e * 255.0f));
            gqVar.setBounds(width - (gqVar.getIntrinsicWidth() / 2), height - (gqVar.getIntrinsicWidth() / 2), (gqVar.getIntrinsicWidth() / 2) + width, (gqVar.getIntrinsicHeight() / 2) + height);
            gqVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f20071c.b(i10);
    }
}
