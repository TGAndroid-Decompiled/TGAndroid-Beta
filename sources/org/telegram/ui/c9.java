package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class c9 extends TextView {
    public final Paint f36270a;
    public final org.telegram.ui.ActionBar.g6 f36271b;

    public c9(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f36271b = g6Var;
        this.f36270a = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.8f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21589z6, this.f36271b));
        Paint paint = this.f36270a;
        paint.setColor(o12);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        Layout layout = getLayout();
        int i10 = 0;
        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
            i10 = Math.max(i10, (int) layout.getLineWidth(i11));
        }
        float f7 = i10 / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f7) - AndroidUtilities.dp(8.0f), height, paint);
        canvas.drawLine((getWidth() / 2.0f) + f7 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
