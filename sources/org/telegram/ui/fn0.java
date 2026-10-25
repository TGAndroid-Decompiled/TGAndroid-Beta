package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.FileLog;
public final class fn0 extends View implements org.telegram.ui.ActionBar.p6 {
    public Paint f39421a;
    public Paint f39422b;
    public float f39423c;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = (int) (getMeasuredWidth() * this.f39423c);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f39422b);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f39421a);
    }

    @Override
    public final void updateColors() {
        try {
            this.f39421a.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23419gi, false));
            this.f39422b.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23438hi, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
