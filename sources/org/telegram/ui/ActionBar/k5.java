package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
public abstract class k5 extends TextView {
    public boolean f19346a;
    public final org.telegram.ui.Components.c6 f19347b;
    public final tp f19348c;

    public k5(Context context) {
        super(context);
        this.f19346a = false;
        this.f19347b = new org.telegram.ui.Components.c6(this, 320L, qr.h);
        this.f19348c = new tp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f19347b.e(this.f19346a);
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
            tp tpVar = this.f19348c;
            tpVar.setAlpha((int) (e * 255.0f));
            tpVar.setBounds(width - (tpVar.getIntrinsicWidth() / 2), height - (tpVar.getIntrinsicWidth() / 2), (tpVar.getIntrinsicWidth() / 2) + width, (tpVar.getIntrinsicHeight() / 2) + height);
            tpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f19348c.b(i10);
    }
}
