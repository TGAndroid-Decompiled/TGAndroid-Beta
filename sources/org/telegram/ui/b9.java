package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class b9 extends TextView {
    public final Paint f35388a;
    public final org.telegram.ui.ActionBar.g6 f35389b;

    public b9(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f35389b = g6Var;
        this.f35388a = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int l1 = org.telegram.ui.ActionBar.k6.l1(0.8f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22053z6, this.f35389b));
        Paint paint = this.f35388a;
        paint.setColor(l1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        Layout layout = getLayout();
        int i10 = 0;
        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
            i10 = Math.max(i10, (int) layout.getLineWidth(i11));
        }
        float f10 = i10 / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f10) - AndroidUtilities.dp(8.0f), height, paint);
        canvas.drawLine((getWidth() / 2.0f) + f10 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
