package org.telegram.ui.Stories;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class StoryReactionWidgetBackground extends Drawable {
    Paint backgroundPaint;
    private boolean mirror;
    private final View parent;
    AnimatedFloat progressToMirrored;
    Paint shadowPaint;
    int style;
    private Paint xRefPaint;
    private final int STYLE_FILLED = 0;
    private final int STYLE_TRANSCLUENT = 1;
    int alpha = 255;
    float[] points = new float[15];
    Path path = new Path();

    public StoryReactionWidgetBackground(View view) {
        this.parent = view;
        this.progressToMirrored = new AnimatedFloat(view, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        Paint paint = new Paint(1);
        this.shadowPaint = paint;
        paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
        Paint paint2 = new Paint(1);
        this.backgroundPaint = paint2;
        paint2.setColor(-1);
    }

    @Override
    public void draw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoryReactionWidgetBackground.draw(android.graphics.Canvas):void");
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    public boolean isDarkStyle() {
        return this.style == 1;
    }

    public void nextStyle() {
        int i = this.style + 1;
        this.style = i;
        if (i >= 2) {
            this.style = 0;
        }
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setMirror(boolean z, boolean z2) {
        this.mirror = z;
        if (z2) {
            this.parent.invalidate();
        } else {
            this.progressToMirrored.set(z ? 1.0f : 0.0f, true);
        }
    }

    public void updateShadowLayer(float f) {
        this.shadowPaint.setShadowLayer(AndroidUtilities.dp(2.0f) / f, 0.0f, AndroidUtilities.dpf2(0.7f) / f, ColorUtils.setAlphaComponent(-16777216, 45));
    }
}
