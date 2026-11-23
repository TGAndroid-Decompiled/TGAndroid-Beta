package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;
public final class a9 extends TextView {
    public final Paint f45631a;
    public final org.telegram.ui.ActionBar.i6 f45632b;

    public a9(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f45632b = i6Var;
        this.f45631a = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.8f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29862z6, this.f45632b));
        Paint paint = this.f45631a;
        paint.setColor(r12);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        Layout layout = getLayout();
        int i7 = 0;
        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
            i7 = Math.max(i7, (int) layout.getLineWidth(i10));
        }
        float f10 = i7 / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f10) - org.telegram.messenger.g0.L(8.0f), height, paint);
        canvas.drawLine((getWidth() / 2.0f) + f10 + org.telegram.messenger.g0.L(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
