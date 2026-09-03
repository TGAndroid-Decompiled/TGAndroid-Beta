package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class js extends View {
    public final xd.a f28171a;
    public final Paint f28172b;
    public final RectF f28173c;
    public final RectF d;
    public final RectF f28174e;
    public final xp f28175f;

    public js(Context context) {
        super(context);
        this.f28171a = new xd.a(this, pr.h, 380L);
        Paint paint = new Paint(1);
        this.f28172b = paint;
        this.f28173c = new RectF();
        this.d = new RectF();
        this.f28174e = new RectF();
        this.f28175f = new xp(this, 5);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.hl, false));
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f28175f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f28175f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10 = this.f28171a.f50541e;
        RectF rectF = this.d;
        RectF rectF2 = this.f28173c;
        RectF rectF3 = this.f28174e;
        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), 0, f10);
        canvas.drawRoundRect(rectF3, lerp, lerp, this.f28172b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f28173c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int dp = ((currentActionBarHeight / 2) + paddingTop) - AndroidUtilities.dp(15.0f);
        int dp2 = AndroidUtilities.dp(12.0f);
        this.d.set(AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(30.0f) + dp2, AndroidUtilities.dp(30.0f) + dp);
    }
}
