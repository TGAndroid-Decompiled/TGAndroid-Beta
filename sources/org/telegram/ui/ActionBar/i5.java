package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;

public abstract class i5 extends TextView {

    public boolean f23510a;

    public final org.telegram.ui.Components.y5 f23511b;

    public final hp f23512c;

    public i5(Context context) {
        super(context);
        this.f23510a = false;
        this.f23511b = new org.telegram.ui.Components.y5(this, 320L, er.h);
        this.f23512c = new hp(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float fE = this.f23511b.e(this.f23510a);
        if (fE < 1.0f) {
            if (fE <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - fE) * 255.0f), 31);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) * fE);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (fE > 0.0f) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int iDp = width - ((int) ((1.0f - fE) * AndroidUtilities.dp(6.0f)));
            hp hpVar = this.f23512c;
            hpVar.setAlpha((int) (fE * 255.0f));
            hpVar.setBounds(iDp - (hpVar.getIntrinsicWidth() / 2), height - (hpVar.getIntrinsicWidth() / 2), (hpVar.getIntrinsicWidth() / 2) + iDp, (hpVar.getIntrinsicHeight() / 2) + height);
            hpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f23512c.b(i10);
    }
}
