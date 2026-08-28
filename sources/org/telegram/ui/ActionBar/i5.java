package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jp;
public abstract class i5 extends TextView {
    public boolean f23519a;
    public final org.telegram.ui.Components.y5 f23520b;
    public final jp f23521c;

    public i5(Context context) {
        super(context);
        this.f23519a = false;
        this.f23520b = new org.telegram.ui.Components.y5(this, 320L, gr.h);
        this.f23521c = new jp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e10 = this.f23520b.e(this.f23519a);
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
            jp jpVar = this.f23521c;
            jpVar.setAlpha((int) (e10 * 255.0f));
            jpVar.setBounds(width - (jpVar.getIntrinsicWidth() / 2), height - (jpVar.getIntrinsicWidth() / 2), (jpVar.getIntrinsicWidth() / 2) + width, (jpVar.getIntrinsicHeight() / 2) + height);
            jpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i9) {
        super.setTextColor(i9);
        this.f23521c.b(i9);
    }
}
