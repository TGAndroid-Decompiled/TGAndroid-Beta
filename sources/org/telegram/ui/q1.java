package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class q1 extends View {

    public final RectF f41484a;

    public q1(Context context) {
        super(context);
        this.f41484a = new RectF();
        setImportantForAccessibility(2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 3;
        float fDp = AndroidUtilities.dp(10.0f);
        RectF rectF = this.f41484a;
        rectF.set(measuredWidth, AndroidUtilities.dp(8.0f), measuredWidth * 2, fDp);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), m4.f40321n1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(18.0f));
    }
}
