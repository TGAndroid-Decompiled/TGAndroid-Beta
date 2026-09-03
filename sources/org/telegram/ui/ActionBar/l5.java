package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qp;
public abstract class l5 extends TextView {
    public boolean f20403a;
    public final org.telegram.ui.Components.z5 f20404b;
    public final qp f20405c;

    public l5(Context context) {
        super(context);
        this.f20403a = false;
        this.f20404b = new org.telegram.ui.Components.z5(this, 320L, mr.h);
        this.f20405c = new qp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f20404b.e(this.f20403a);
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
            qp qpVar = this.f20405c;
            qpVar.setAlpha((int) (e * 255.0f));
            qpVar.setBounds(width - (qpVar.getIntrinsicWidth() / 2), height - (qpVar.getIntrinsicWidth() / 2), (qpVar.getIntrinsicWidth() / 2) + width, (qpVar.getIntrinsicHeight() / 2) + height);
            qpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f20405c.b(i10);
    }
}
