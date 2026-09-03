package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;
public abstract class m5 extends TextView {
    public boolean f22138a;
    public final org.telegram.ui.Components.z5 f22139b;
    public final tp f22140c;

    public m5(Context context) {
        super(context);
        this.f22138a = false;
        this.f22139b = new org.telegram.ui.Components.z5(this, 320L, pr.h);
        this.f22140c = new tp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e6 = this.f22139b.e(this.f22138a);
        if (e6 < 1.0f) {
            if (e6 <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e6) * 255.0f), 31);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) * e6);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (e6 > 0.0f) {
            int height = getHeight() / 2;
            int width = (getWidth() / 2) - ((int) ((1.0f - e6) * AndroidUtilities.dp(6.0f)));
            tp tpVar = this.f22140c;
            tpVar.setAlpha((int) (e6 * 255.0f));
            tpVar.setBounds(width - (tpVar.getIntrinsicWidth() / 2), height - (tpVar.getIntrinsicWidth() / 2), (tpVar.getIntrinsicWidth() / 2) + width, (tpVar.getIntrinsicHeight() / 2) + height);
            tpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f22140c.b(i10);
    }
}
