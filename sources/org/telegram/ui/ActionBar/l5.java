package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rp;
public abstract class l5 extends TextView {
    public boolean f20428a;
    public final org.telegram.ui.Components.z5 f20429b;
    public final rp f20430c;

    public l5(Context context) {
        super(context);
        this.f20428a = false;
        this.f20429b = new org.telegram.ui.Components.z5(this, 320L, nr.h);
        this.f20430c = new rp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f20429b.e(this.f20428a);
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
            rp rpVar = this.f20430c;
            rpVar.setAlpha((int) (e * 255.0f));
            rpVar.setBounds(width - (rpVar.getIntrinsicWidth() / 2), height - (rpVar.getIntrinsicWidth() / 2), (rpVar.getIntrinsicWidth() / 2) + width, (rpVar.getIntrinsicHeight() / 2) + height);
            rpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f20430c.b(i10);
    }
}
