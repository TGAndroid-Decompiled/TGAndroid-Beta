package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ls extends View {
    public final le.c f26097a;
    public final Paint f26098b;
    public final RectF f26099c;
    public final RectF d;
    public final RectF e;
    public final aq f26100f;

    public ls(Context context) {
        super(context);
        this.f26097a = new le.c(this, tr.h, 380L);
        Paint paint = new Paint(1);
        this.f26098b = paint;
        this.f26099c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f26100f = new aq(this, 5);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.hl, false));
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f26100f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f26100f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7 = this.f26097a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.f26099c;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f7, rectF3);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), 0, f7);
        canvas.drawRoundRect(rectF3, lerp, lerp, this.f26098b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f26099c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int dp = ((currentActionBarHeight / 2) + paddingTop) - AndroidUtilities.dp(15.0f);
        int dp2 = AndroidUtilities.dp(12.0f);
        this.d.set(AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(30.0f) + dp2, AndroidUtilities.dp(30.0f) + dp);
    }
}
