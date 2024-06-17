package org.telegram.ui.Stories;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
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
    int alpha = 255;
    float[] points = new float[15];
    Path path = new Path();

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

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

    public void updateShadowLayer(float f) {
        this.shadowPaint.setShadowLayer(AndroidUtilities.dp(2.0f) / f, 0.0f, AndroidUtilities.dpf2(0.7f) / f, ColorUtils.setAlphaComponent(-16777216, 45));
    }

    @Override
    public void draw(Canvas canvas) {
        this.points[0] = getBounds().centerX();
        int i = 1;
        this.points[1] = getBounds().centerY();
        this.points[2] = getBounds().height() / 2.0f;
        int i2 = 3;
        this.points[3] = getBounds().left + (getBounds().width() * 1.027f);
        this.points[4] = getBounds().top + (getBounds().height() * 0.956f);
        this.points[5] = getBounds().height() * 0.055f;
        this.points[6] = getBounds().left + (getBounds().width() * 0.843f);
        this.points[7] = getBounds().top + (getBounds().height() * 0.812f);
        this.points[8] = getBounds().height() * 0.132f;
        this.points[9] = getBounds().left + (getBounds().width() * (-0.02699995f));
        this.points[10] = getBounds().top + (getBounds().height() * 0.956f);
        this.points[11] = getBounds().height() * 0.055f;
        this.points[12] = getBounds().left + (getBounds().width() * 0.157f);
        this.points[13] = getBounds().top + (getBounds().height() * 0.812f);
        this.points[14] = getBounds().height() * 0.132f;
        float f = this.progressToMirrored.set(this.mirror ? 1.0f : 0.0f);
        int i3 = this.style;
        if (i3 == 0) {
            this.backgroundPaint.setColor(-1);
        } else if (i3 == 1) {
            if (this.xRefPaint == null) {
                Paint paint = new Paint(1);
                this.xRefPaint = paint;
                paint.setColor(-16777216);
                this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.xRefPaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            }
            this.backgroundPaint.setColor(ColorUtils.setAlphaComponent(-16777216, 127));
        }
        if (this.alpha != 255 || this.style == 1) {
            canvas.saveLayerAlpha(getBounds().left - (getBounds().width() * 0.2f), getBounds().top, getBounds().right + (getBounds().width() * 0.2f), getBounds().bottom + (getBounds().height() * 0.2f), this.alpha, 31);
        } else {
            canvas.save();
        }
        this.path.rewind();
        int i4 = 0;
        while (i4 < 2) {
            if (this.style != i || i4 != 0) {
                Paint paint2 = i4 == 0 ? this.shadowPaint : this.backgroundPaint;
                int i5 = i4 == 0 ? 1 : 0;
                int i6 = 0;
                while (i6 < 5) {
                    if (i6 == i || i6 == 2) {
                        if (f != 1.0f) {
                            Path path = this.path;
                            float[] fArr = this.points;
                            int i7 = i6 * 3;
                            path.addCircle(fArr[i7], fArr[i7 + 1], (fArr[i7 + 2] * (1.0f - f)) - i5, Path.Direction.CW);
                        }
                    } else if (i6 != i2 && i6 != 4) {
                        Path path2 = this.path;
                        float[] fArr2 = this.points;
                        int i8 = i6 * 3;
                        path2.addCircle(fArr2[i8], fArr2[i8 + 1], fArr2[i8 + 2] - i5, Path.Direction.CW);
                    } else if (f != 0.0f) {
                        Path path3 = this.path;
                        float[] fArr3 = this.points;
                        int i9 = i6 * 3;
                        path3.addCircle(fArr3[i9], fArr3[i9 + 1], (fArr3[i9 + 2] * f) - i5, Path.Direction.CW);
                    }
                    i6++;
                    i = 1;
                    i2 = 3;
                }
                canvas.drawPath(this.path, paint2);
            }
            i4++;
            i = 1;
            i2 = 3;
        }
        canvas.restore();
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
    }

    public void setMirror(boolean z, boolean z2) {
        this.mirror = z;
        if (!z2) {
            this.progressToMirrored.set(z ? 1.0f : 0.0f, true);
        } else {
            this.parent.invalidate();
        }
    }

    public void nextStyle() {
        int i = this.style + 1;
        this.style = i;
        if (i >= 2) {
            this.style = 0;
        }
    }

    public boolean isDarkStyle() {
        return this.style == 1;
    }
}
