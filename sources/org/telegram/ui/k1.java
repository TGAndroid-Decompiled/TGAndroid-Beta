package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class k1 extends View {
    public final RectF f47155a;

    public k1(Context context) {
        super(context);
        this.f47155a = new RectF();
        setImportantForAccessibility(2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 3;
        RectF rectF = this.f47155a;
        rectF.set(measuredWidth, org.telegram.messenger.g0.L(8.0f), measuredWidth * 2, org.telegram.messenger.g0.L(10.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), g4.f45873s1);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(18.0f));
    }
}
