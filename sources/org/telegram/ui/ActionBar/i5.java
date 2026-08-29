package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.np;
public abstract class i5 extends TextView {
    public boolean f23529a;
    public final org.telegram.ui.Components.d6 f23530b;
    public final np f23531c;

    public i5(Context context) {
        super(context);
        this.f23529a = false;
        this.f23530b = new org.telegram.ui.Components.d6(this, 320L, jr.h);
        this.f23531c = new np(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e10 = this.f23530b.e(this.f23529a);
        if (e10 < 1.0f) {
            if (e10 <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e10) * 255.0f), 31);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) * e10);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (e10 > 0.0f) {
            int height = getHeight() / 2;
            int width = (getWidth() / 2) - ((int) ((1.0f - e10) * AndroidUtilities.dp(6.0f)));
            np npVar = this.f23531c;
            npVar.setAlpha((int) (e10 * 255.0f));
            npVar.setBounds(width - (npVar.getIntrinsicWidth() / 2), height - (npVar.getIntrinsicWidth() / 2), (npVar.getIntrinsicWidth() / 2) + width, (npVar.getIntrinsicHeight() / 2) + height);
            npVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f23531c.b(i10);
    }
}
