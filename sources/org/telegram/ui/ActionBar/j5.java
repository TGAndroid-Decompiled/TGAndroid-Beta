package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.up;
public abstract class j5 extends TextView {
    public boolean f19252a;
    public final org.telegram.ui.Components.e6 f19253b;
    public final up f19254c;

    public j5(Context context) {
        super(context);
        this.f19252a = false;
        this.f19253b = new org.telegram.ui.Components.e6(this, 320L, rr.h);
        this.f19254c = new up(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f19253b.e(this.f19252a);
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
            up upVar = this.f19254c;
            upVar.setAlpha((int) (e * 255.0f));
            upVar.setBounds(width - (upVar.getIntrinsicWidth() / 2), height - (upVar.getIntrinsicWidth() / 2), (upVar.getIntrinsicWidth() / 2) + width, (upVar.getIntrinsicHeight() / 2) + height);
            upVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f19254c.b(i10);
    }
}
