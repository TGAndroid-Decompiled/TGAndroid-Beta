package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.eq;
public abstract class o5 extends TextView {
    public boolean f21742a;
    public final org.telegram.ui.Components.f6 f21743b;
    public final eq f21744c;

    public o5(Context context) {
        super(context);
        this.f21742a = false;
        this.f21743b = new org.telegram.ui.Components.f6(this, 320L, bs.h);
        this.f21744c = new eq(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f21743b.e(this.f21742a);
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
            eq eqVar = this.f21744c;
            eqVar.setAlpha((int) (e * 255.0f));
            eqVar.setBounds(width - (eqVar.getIntrinsicWidth() / 2), height - (eqVar.getIntrinsicWidth() / 2), (eqVar.getIntrinsicWidth() / 2) + width, (eqVar.getIntrinsicHeight() / 2) + height);
            eqVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f21744c.b(i10);
    }
}
