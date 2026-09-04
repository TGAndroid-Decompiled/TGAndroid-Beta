package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;
public abstract class k5 extends TextView {
    public boolean f21136a;
    public final org.telegram.ui.Components.e6 f21137b;
    public final sp f21138c;

    public k5(Context context) {
        super(context);
        this.f21136a = false;
        this.f21137b = new org.telegram.ui.Components.e6(this, 320L, pr.h);
        this.f21138c = new sp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.f21137b.e(this.f21136a);
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
            sp spVar = this.f21138c;
            spVar.setAlpha((int) (e7 * 255.0f));
            spVar.setBounds(width - (spVar.getIntrinsicWidth() / 2), height - (spVar.getIntrinsicWidth() / 2), (spVar.getIntrinsicWidth() / 2) + width, (spVar.getIntrinsicHeight() / 2) + height);
            spVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f21138c.b(i10);
    }
}
