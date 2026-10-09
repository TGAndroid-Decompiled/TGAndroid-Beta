package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.jq;
public abstract class k5 extends TextView {
    public boolean f21338a;
    public final org.telegram.ui.Components.g6 f21339b;
    public final jq f21340c;

    public k5(Context context) {
        super(context);
        this.f21338a = false;
        this.f21339b = new org.telegram.ui.Components.g6(this, 320L, hs.h);
        this.f21340c = new jq(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.f21339b.e(this.f21338a);
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
            jq jqVar = this.f21340c;
            jqVar.setAlpha((int) (e7 * 255.0f));
            jqVar.setBounds(width - (jqVar.getIntrinsicWidth() / 2), height - (jqVar.getIntrinsicWidth() / 2), (jqVar.getIntrinsicWidth() / 2) + width, (jqVar.getIntrinsicHeight() / 2) + height);
            jqVar.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f21340c.b(i10);
    }
}
