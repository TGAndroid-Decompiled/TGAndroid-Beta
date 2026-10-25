package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class us extends View implements org.telegram.ui.ActionBar.p6 {
    public final oe.b f33484a;
    public final Paint f33485b;
    public final RectF f33486c;
    public final RectF d;
    public final RectF e;
    public final bq f33487f;

    public us(Context context) {
        super(context);
        this.f33484a = new oe.b(this, ds.h, 380L);
        this.f33485b = new Paint(1);
        this.f33486c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f33487f = new bq(this, 6);
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f33487f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f33487f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7 = this.f33484a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.f33486c;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f7, rectF3);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), 0, f7);
        canvas.drawRoundRect(rectF3, lerp, lerp, this.f33485b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f33486c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int dp = ((currentActionBarHeight / 2) + paddingTop) - AndroidUtilities.dp(15.0f);
        int dp2 = AndroidUtilities.dp(12.0f);
        this.d.set(AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(30.0f) + dp2, AndroidUtilities.dp(30.0f) + dp);
    }

    @Override
    public final void updateColors() {
        this.f33485b.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.hl, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
