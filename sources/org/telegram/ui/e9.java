package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class e9 extends TextView {
    public final Paint f38783a;
    public final org.telegram.ui.ActionBar.u6 f38784b;

    public e9(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f38784b = u6Var;
        this.f38783a = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.8f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23768z6, this.f38784b));
        Paint paint = this.f38783a;
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
