package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vs extends View {
    public final ne.b f30302a;
    public final Paint f30303b;
    public final RectF f30304c;
    public final RectF d;
    public final RectF e;
    public final kq f30305f;

    public vs(Context context) {
        super(context);
        this.f30302a = new ne.b(this, es.h, 380L);
        Paint paint = new Paint(1);
        this.f30303b = paint;
        this.f30304c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f30305f = new kq(this, 5);
        paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hl, false));
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f30305f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f30305f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7 = this.f30302a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.f30304c;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f7, rectF3);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), 0, f7);
        canvas.drawRoundRect(rectF3, lerp, lerp, this.f30303b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f30304c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int dp = ((currentActionBarHeight / 2) + paddingTop) - AndroidUtilities.dp(15.0f);
        int dp2 = AndroidUtilities.dp(12.0f);
        this.d.set(AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(30.0f) + dp2, AndroidUtilities.dp(30.0f) + dp);
    }
}
