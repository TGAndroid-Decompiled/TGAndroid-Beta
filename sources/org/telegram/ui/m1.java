package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class m1 extends View {
    public final RectF f39449a;

    public m1(Context context) {
        super(context);
        this.f39449a = new RectF();
        setImportantForAccessibility(2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 3;
        RectF rectF = this.f39449a;
        rectF.set(measuredWidth, org.telegram.messenger.i0.L(8.0f), measuredWidth * 2, org.telegram.messenger.i0.L(10.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), h4.f37717s1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(18.0f));
    }
}
