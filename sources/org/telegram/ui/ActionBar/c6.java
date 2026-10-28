package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;
public abstract class c6 extends TextView {
    public boolean f22518a;
    public final org.telegram.ui.Components.h6 f22519b;
    public final gq f22520c;

    public c6(Context context) {
        super(context);
        this.f22518a = false;
        this.f22519b = new org.telegram.ui.Components.h6(this, 320L, ds.h);
        this.f22520c = new gq(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f22519b.e(this.f22518a);
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
            gq gqVar = this.f22520c;
            gqVar.setAlpha((int) (e * 255.0f));
            gqVar.setBounds(width - (gqVar.getIntrinsicWidth() / 2), height - (gqVar.getIntrinsicWidth() / 2), (gqVar.getIntrinsicWidth() / 2) + width, (gqVar.getIntrinsicHeight() / 2) + height);
            gqVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f22520c.b(i10);
    }
}
