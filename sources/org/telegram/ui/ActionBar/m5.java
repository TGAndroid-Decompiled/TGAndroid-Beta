package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zp;
public abstract class m5 extends TextView {
    public boolean f18476a;
    public final org.telegram.ui.Components.d6 f18477b;
    public final zp f18478c;

    public m5(Context context) {
        super(context);
        this.f18476a = false;
        this.f18477b = new org.telegram.ui.Components.d6(this, 320L, wr.h);
        this.f18478c = new zp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f18477b.e(this.f18476a);
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
            zp zpVar = this.f18478c;
            zpVar.setAlpha((int) (e * 255.0f));
            zpVar.setBounds(width - (zpVar.getIntrinsicWidth() / 2), height - (zpVar.getIntrinsicWidth() / 2), (zpVar.getIntrinsicWidth() / 2) + width, (zpVar.getIntrinsicHeight() / 2) + height);
            zpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f18478c.b(i10);
    }
}
