package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

public final class ProgressView {
    public int height;
    public int width;
    public float currentProgress = 0.0f;
    public final float progressHeight = AndroidUtilities.dp(2.0f);
    public final Paint innerPaint = new Paint();
    public final Paint outerPaint = new Paint();

    public final void setProgress(float f) {
        this.currentProgress = f;
        if (f < 0.0f) {
            this.currentProgress = 0.0f;
        } else if (f > 1.0f) {
            this.currentProgress = 1.0f;
        }
    }
}
