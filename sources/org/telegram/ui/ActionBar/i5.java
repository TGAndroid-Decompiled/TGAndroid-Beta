package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vp;
public abstract class i5 extends TextView {
    public boolean f19482a;
    public final org.telegram.ui.Components.e6 f19483b;
    public final vp f19484c;

    public i5(Context context) {
        super(context);
        this.f19482a = false;
        this.f19483b = new org.telegram.ui.Components.e6(this, 320L, sr.h);
        this.f19484c = new vp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f19483b.e(this.f19482a);
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
            vp vpVar = this.f19484c;
            vpVar.setAlpha((int) (e * 255.0f));
            vpVar.setBounds(width - (vpVar.getIntrinsicWidth() / 2), height - (vpVar.getIntrinsicWidth() / 2), (vpVar.getIntrinsicWidth() / 2) + width, (vpVar.getIntrinsicHeight() / 2) + height);
            vpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f19484c.b(i10);
    }
}
