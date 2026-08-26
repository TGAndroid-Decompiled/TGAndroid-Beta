package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class ContextProgressView extends View {
    public final RectF cicleRect;
    public int innerColor;
    public int innerKey;
    public final Paint innerPaint;
    public long lastUpdateTime;
    public int outerColor;
    public int outerKey;
    public final Paint outerPaint;
    public int radOffset;

    public ContextProgressView(Context context, int i) {
        super(context);
        Paint paint = new Paint(1);
        this.innerPaint = paint;
        Paint paint2 = new Paint(1);
        this.outerPaint = paint2;
        this.cicleRect = new RectF();
        this.radOffset = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        if (i == 0) {
            this.innerKey = Theme.key_contextProgressInner1;
            this.outerKey = Theme.key_contextProgressOuter1;
        } else if (i == 1) {
            this.innerKey = Theme.key_contextProgressInner2;
            this.outerKey = Theme.key_contextProgressOuter2;
        } else if (i == 2) {
            this.innerKey = Theme.key_contextProgressInner3;
            this.outerKey = Theme.key_contextProgressOuter3;
        } else if (i == 3) {
            this.innerKey = Theme.key_contextProgressInner4;
            this.outerKey = Theme.key_contextProgressOuter4;
        }
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.lastUpdateTime = System.currentTimeMillis();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = jCurrentTimeMillis;
        this.radOffset = (int) (((j * 360) / 1000.0f) + this.radOffset);
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(9.0f);
        RectF rectF = this.cicleRect;
        rectF.set(measuredWidth, measuredHeight, AndroidUtilities.dp(18.0f) + measuredWidth, AndroidUtilities.dp(18.0f) + measuredHeight);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, AndroidUtilities.dp(9.0f), this.innerPaint);
        canvas.drawArc(rectF, this.radOffset - 90, 90.0f, false, this.outerPaint);
        invalidate();
    }

    public final void setColors(int i, int i2) {
        this.innerKey = -1;
        this.outerKey = -1;
        this.innerColor = i;
        this.outerColor = i2;
        updateColors();
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.lastUpdateTime = System.currentTimeMillis();
        invalidate();
    }

    public final void updateColors() {
        int i = this.innerKey;
        Paint paint = this.innerPaint;
        if (i >= 0) {
            paint.setColor(Theme.getColor(null, i, false));
        } else {
            paint.setColor(this.innerColor);
        }
        int i2 = this.outerKey;
        Paint paint2 = this.outerPaint;
        if (i2 >= 0) {
            paint2.setColor(Theme.getColor(null, i2, false));
        } else {
            paint2.setColor(this.outerColor);
        }
        invalidate();
    }
}
