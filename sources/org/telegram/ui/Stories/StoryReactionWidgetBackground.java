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

public final class StoryReactionWidgetBackground extends Drawable {
    public final Paint backgroundPaint;
    public boolean mirror;
    public final View parent;
    public final AnimatedFloat progressToMirrored;
    public final Paint shadowPaint;
    public int style;
    public Paint xRefPaint;
    public int alpha = 255;
    public final float[] points = new float[15];
    public final Path path = new Path();

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
    public final void draw(Canvas canvas) {
        float fCenterX = getBounds().centerX();
        float[] fArr = this.points;
        int i = 0;
        fArr[0] = fCenterX;
        int i2 = 1;
        fArr[1] = getBounds().centerY();
        int i3 = 2;
        fArr[2] = getBounds().height() / 2.0f;
        int i4 = 3;
        fArr[3] = (getBounds().width() * 1.027f) + getBounds().left;
        int i5 = 4;
        fArr[4] = (getBounds().height() * 0.956f) + getBounds().top;
        fArr[5] = getBounds().height() * 0.055f;
        fArr[6] = (getBounds().width() * 0.843f) + getBounds().left;
        fArr[7] = (getBounds().height() * 0.812f) + getBounds().top;
        fArr[8] = getBounds().height() * 0.132f;
        fArr[9] = (getBounds().width() * (-0.02699995f)) + getBounds().left;
        fArr[10] = (getBounds().height() * 0.956f) + getBounds().top;
        fArr[11] = getBounds().height() * 0.055f;
        fArr[12] = (getBounds().width() * 0.157f) + getBounds().left;
        fArr[13] = (getBounds().height() * 0.812f) + getBounds().top;
        fArr[14] = getBounds().height() * 0.132f;
        float f = this.progressToMirrored.set(this.mirror ? 1.0f : 0.0f);
        int i6 = this.style;
        Paint paint = this.backgroundPaint;
        if (i6 == 0) {
            paint.setColor(-1);
        } else if (i6 == 1) {
            if (this.xRefPaint == null) {
                Paint paint2 = new Paint(1);
                this.xRefPaint = paint2;
                paint2.setColor(-16777216);
                this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.xRefPaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            }
            paint.setColor(ColorUtils.setAlphaComponent(-16777216, 127));
        }
        if (this.alpha != 255 || this.style == 1) {
            canvas.saveLayerAlpha(getBounds().left - (getBounds().width() * 0.2f), getBounds().top, (getBounds().width() * 0.2f) + getBounds().right, (getBounds().height() * 0.2f) + getBounds().bottom, this.alpha, 31);
        } else {
            canvas.save();
        }
        Path path = this.path;
        path.rewind();
        int i7 = 0;
        while (i7 < i3) {
            if (this.style != i2 || i7 != 0) {
                Paint paint3 = i7 == 0 ? this.shadowPaint : paint;
                int i8 = i7 == 0 ? 1 : 0;
                while (i < 5) {
                    if (i == i2 || i == i3) {
                        if (f != 1.0f) {
                            int i9 = i * 3;
                            path.addCircle(fArr[i9], fArr[i9 + 1], ((1.0f - f) * fArr[i9 + 2]) - i8, Path.Direction.CW);
                        }
                    } else if (i != i4 && i != i5) {
                        int i10 = i * 3;
                        path.addCircle(fArr[i10], fArr[i10 + 1], fArr[i10 + 2] - i8, Path.Direction.CW);
                    } else if (f != 0.0f) {
                        int i11 = i * 3;
                        path.addCircle(fArr[i11], fArr[i11 + 1], (fArr[i11 + 2] * f) - i8, Path.Direction.CW);
                    }
                    i++;
                    i4 = 3;
                    i2 = 1;
                    i3 = 2;
                    i5 = 4;
                }
                canvas.drawPath(path, paint3);
            }
            i7++;
            i4 = 3;
            i = 0;
            i2 = 1;
            i3 = 2;
            i5 = 4;
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setMirror(boolean z, boolean z2) {
        this.mirror = z;
        if (z2) {
            this.parent.invalidate();
        } else {
            this.progressToMirrored.set(z ? 1.0f : 0.0f, true);
        }
    }

    public final void updateShadowLayer(float f) {
        this.shadowPaint.setShadowLayer(AndroidUtilities.dp(2.0f) / f, 0.0f, AndroidUtilities.dpf2(0.7f) / f, ColorUtils.setAlphaComponent(-16777216, 45));
    }
}
