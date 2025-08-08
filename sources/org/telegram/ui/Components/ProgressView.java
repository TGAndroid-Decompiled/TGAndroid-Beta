package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

public class ProgressView {
    public int height;
    public int width;
    public float currentProgress = 0.0f;
    public float progressHeight = AndroidUtilities.dp(2.0f);
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
        float f = this.height / 2;
        float f2 = this.progressHeight / 2.0f;
        canvas.drawRect(0.0f, f - f2, this.width, f + f2, this.innerPaint);
        float f3 = this.height / 2;
        float f4 = this.progressHeight / 2.0f;
        canvas.drawRect(0.0f, f3 - f4, this.width * this.currentProgress, f3 + f4, this.outerPaint);
    }
}
