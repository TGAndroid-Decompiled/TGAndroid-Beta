package org.telegram.ui.Stories;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Stories.PeerStoriesView;
public class StoryLinesDrawable {
    float bufferingProgress;
    boolean incrementBuffering;
    int lastPosition;
    private final PeerStoriesView.SharedResources sharedResources;

    public StoryLinesDrawable(View view, PeerStoriesView.SharedResources sharedResources) {
        this.sharedResources = sharedResources;
        new AnimatedFloat(view, 0L, 230L, CubicBezierInterpolator.EASE_OUT_QUINT);
    }

    public void draw(Canvas canvas, int i, int i2, float f, int i3, float f2, float f3, boolean z) {
        int dp;
        float f4;
        int i4;
        int i5 = i;
        if (i3 <= 0) {
            return;
        }
        if (this.lastPosition != i2) {
            this.bufferingProgress = 0.0f;
            this.incrementBuffering = true;
        }
        this.lastPosition = i2;
        PeerStoriesView.SharedResources sharedResources = this.sharedResources;
        Paint paint = sharedResources.barPaint;
        Paint paint2 = sharedResources.selectedBarPaint;
        if (i3 > 100) {
            dp = 1;
        } else if (i3 >= 50) {
            dp = AndroidUtilities.dp(1.0f);
        } else {
            dp = AndroidUtilities.dp(2.0f);
        }
        float dp2 = ((i5 - AndroidUtilities.dp(10.0f)) - ((i3 - 1) * dp)) / i3;
        float f5 = 5.0f;
        AndroidUtilities.dp(5.0f);
        float min = Math.min(dp2 / 2.0f, AndroidUtilities.dp(1.0f));
        paint2.setAlpha((int) (255.0f * f3 * f2));
        int i6 = 0;
        while (i6 < i3) {
            float dp3 = AndroidUtilities.dp(f5) + (-0.0f) + (dp * i6) + (i6 * dp2);
            if (dp3 <= i5) {
                float f6 = dp3 + dp2;
                if (f6 >= 0.0f) {
                    if (i6 > i2 || i6 != i2) {
                        f4 = 1.0f;
                    } else {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(dp3, 0.0f, f6, AndroidUtilities.dp(2.0f));
                        if (z) {
                            if (this.incrementBuffering) {
                                float f7 = this.bufferingProgress + 0.026666667f;
                                this.bufferingProgress = f7;
                                if (f7 > 0.5f) {
                                    this.incrementBuffering = false;
                                }
                            } else {
                                float f8 = this.bufferingProgress - 0.026666667f;
                                this.bufferingProgress = f8;
                                if (f8 < -0.5f) {
                                    this.incrementBuffering = true;
                                    i4 = (int) (51.0f * f3 * f2 * this.bufferingProgress);
                                }
                            }
                            i4 = (int) (51.0f * f3 * f2 * this.bufferingProgress);
                        } else {
                            i4 = 0;
                        }
                        paint.setAlpha(((int) (85.0f * f3 * f2)) + i4);
                        canvas.drawRoundRect(rectF, min, min, paint);
                        f4 = f;
                    }
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(dp3, 0.0f, (f4 * dp2) + dp3, AndroidUtilities.dp(2.0f));
                    if (i6 > i2) {
                        paint.setAlpha((int) (85 * f3 * f2));
                    }
                    canvas.drawRoundRect(rectF2, min, min, i6 <= i2 ? paint2 : paint);
                }
            }
            i6++;
            i5 = i;
            f5 = 5.0f;
        }
    }
}
