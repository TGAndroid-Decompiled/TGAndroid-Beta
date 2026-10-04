package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wp;
public abstract class j5 extends TextView {
    public boolean f21248a;
    public final org.telegram.ui.Components.e6 f21249b;
    public final wp f21250c;

    public j5(Context context) {
        super(context);
        this.f21248a = false;
        this.f21249b = new org.telegram.ui.Components.e6(this, 320L, tr.h);
        this.f21250c = new wp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.f21249b.e(this.f21248a);
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
            wp wpVar = this.f21250c;
            wpVar.setAlpha((int) (e7 * 255.0f));
            wpVar.setBounds(width - (wpVar.getIntrinsicWidth() / 2), height - (wpVar.getIntrinsicWidth() / 2), (wpVar.getIntrinsicWidth() / 2) + width, (wpVar.getIntrinsicHeight() / 2) + height);
            wpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f21250c.b(i10);
    }
}
