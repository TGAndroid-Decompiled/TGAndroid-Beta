package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.ActionBar.Theme;

public class ContextProgressView extends View {
    private RectF cicleRect;
    private int innerColor;
    private String innerKey;
    private Paint innerPaint;
    private long lastUpdateTime;
    private int outerColor;
    private String outerKey;
    private Paint outerPaint;
    private int radOffset;

    public ContextProgressView(Context context, int i) {
        super(context);
        this.innerPaint = new Paint(1);
        this.outerPaint = new Paint(1);
        this.cicleRect = new RectF();
        this.radOffset = 0;
        this.innerPaint.setStyle(Paint.Style.STROKE);
        this.innerPaint.setStrokeWidth(AndroidUtilities.m36dp(2.0f));
        this.outerPaint.setStyle(Paint.Style.STROKE);
        this.outerPaint.setStrokeWidth(AndroidUtilities.m36dp(2.0f));
        this.outerPaint.setStrokeCap(Paint.Cap.ROUND);
        if (i == 0) {
            this.innerKey = "contextProgressInner1";
            this.outerKey = "contextProgressOuter1";
        } else if (i == 1) {
            this.innerKey = "contextProgressInner2";
            this.outerKey = "contextProgressOuter2";
        } else if (i == 2) {
            this.innerKey = "contextProgressInner3";
            this.outerKey = "contextProgressOuter3";
        } else if (i == 3) {
            this.innerKey = "contextProgressInner4";
            this.outerKey = "contextProgressOuter4";
        }
        updateColors();
    }

    public void setColors(int i, int i2) {
        this.innerKey = null;
        this.outerKey = null;
        this.innerColor = i;
        this.outerColor = i2;
        updateColors();
    }

    public void updateColors() {
        String str = this.innerKey;
        if (str != null) {
            this.innerPaint.setColor(Theme.getColor(str));
        } else {
            this.innerPaint.setColor(this.innerColor);
        }
        String str2 = this.outerKey;
        if (str2 != null) {
            this.outerPaint.setColor(Theme.getColor(str2));
        } else {
            this.outerPaint.setColor(this.outerColor);
        }
        invalidate();
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.lastUpdateTime = System.currentTimeMillis();
        invalidate();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.lastUpdateTime = System.currentTimeMillis();
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = currentTimeMillis;
        this.radOffset = (int) (this.radOffset + (((float) (j * 360)) / 1000.0f));
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.m36dp(9.0f);
        int measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.m36dp(9.0f);
        this.cicleRect.set(measuredWidth, measuredHeight, measuredWidth + AndroidUtilities.m36dp(18.0f), measuredHeight + AndroidUtilities.m36dp(18.0f));
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, AndroidUtilities.m36dp(9.0f), this.innerPaint);
        canvas.drawArc(this.cicleRect, this.radOffset - 90, 90.0f, false, this.outerPaint);
        invalidate();
    }
}
