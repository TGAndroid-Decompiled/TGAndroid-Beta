package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

public class ProgressView {
    public int height;
    public int width;
    public float currentProgress = 0.0f;
    public float progressHeight = AndroidUtilities.m35dp(2.0f);
    private Paint innerPaint = new Paint();
    private Paint outerPaint = new Paint();

    public void setProgressColors(int i, int i2) {
        this.innerPaint.setColor(i);
        this.outerPaint.setColor(i2);
    }

    public void setProgress(float f) {
        this.currentProgress = f;
        if (f < 0.0f) {
            this.currentProgress = 0.0f;
        } else if (f > 1.0f) {
            this.currentProgress = 1.0f;
        }
    }

    public void draw(Canvas canvas) {
        int i = this.height;
        float f = this.progressHeight;
        canvas.drawRect(0.0f, (i / 2) - (f / 2.0f), this.width, (i / 2) + (f / 2.0f), this.innerPaint);
        int i2 = this.height;
        float f2 = this.progressHeight;
        canvas.drawRect(0.0f, (i2 / 2) - (f2 / 2.0f), this.width * this.currentProgress, (i2 / 2) + (f2 / 2.0f), this.outerPaint);
    }
}
