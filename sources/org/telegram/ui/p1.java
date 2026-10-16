package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p1 extends View {
    public final RectF f38789a;

    public p1(Context context) {
        super(context);
        this.f38789a = new RectF();
        setImportantForAccessibility(2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 3;
        RectF rectF = this.f38789a;
        rectF.set(measuredWidth, AndroidUtilities.dp(8.0f), measuredWidth * 2, AndroidUtilities.dp(10.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), k4.f37249r1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(18.0f));
    }
}
