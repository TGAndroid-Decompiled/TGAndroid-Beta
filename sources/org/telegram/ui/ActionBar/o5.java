package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.zr;
public abstract class o5 extends TextView {
    public boolean f21743a;
    public final org.telegram.ui.Components.d6 f21744b;
    public final cq f21745c;

    public o5(Context context) {
        super(context);
        this.f21743a = false;
        this.f21744b = new org.telegram.ui.Components.d6(this, 320L, zr.h);
        this.f21745c = new cq(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f21744b.e(this.f21743a);
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
            cq cqVar = this.f21745c;
            cqVar.setAlpha((int) (e * 255.0f));
            cqVar.setBounds(width - (cqVar.getIntrinsicWidth() / 2), height - (cqVar.getIntrinsicWidth() / 2), (cqVar.getIntrinsicWidth() / 2) + width, (cqVar.getIntrinsicHeight() / 2) + height);
            cqVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f21745c.b(i10);
    }
}
