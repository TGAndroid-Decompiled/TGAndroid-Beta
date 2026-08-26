package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;

public final class StrokeDrawable extends Drawable {
    public BlurredBackgroundColorProviderThemed colorProvider;
    public boolean nonRound;
    public int padding;
    public float radius;
    public int strokeColorBottom;
    public int strokeColorTop;
    public float alpha = 1.0f;
    public final RectF rect = new RectF();
    public final Paint paintFill = new Paint(1);
    public final Paint paintStrokeTop = new Paint(1);
    public final Paint paintStrokeBottom = new Paint(1);

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        float fMin = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.padding;
        RectF rectF = this.rect;
        rectF.set(fCenterX - fMin, fCenterY - fMin, fCenterX + fMin, fCenterY + fMin);
        if (this.nonRound) {
            rectF.set(getBounds());
            fMin = this.radius;
        }
        float f = fMin;
        Paint paint = this.paintFill;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(fCenterX, fCenterY, f, paint);
        }
        if (this.strokeColorTop != 0) {
            canvas2 = canvas;
            BlurredBackgroundDrawable.drawStroke(canvas2, rectF, f, AndroidUtilities.dpf2(1.0f), true, this.paintStrokeTop);
        } else {
            canvas2 = canvas;
        }
        if (this.strokeColorBottom != 0) {
            BlurredBackgroundDrawable.drawStroke(canvas2, rectF, f, AndroidUtilities.dpf2(0.6666667f), false, this.paintStrokeBottom);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.alpha = i / 255.0f;
        BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed = this.colorProvider;
        if (blurredBackgroundColorProviderThemed == null) {
            return;
        }
        this.strokeColorTop = Theme.multAlpha(this.alpha, blurredBackgroundColorProviderThemed.getStrokeColorTop());
        this.strokeColorBottom = Theme.multAlpha(this.alpha, this.colorProvider.getStrokeColorBottom());
        Paint paint = this.paintStrokeTop;
        paint.setColor(this.strokeColorTop);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.paintStrokeBottom;
        paint2.setColor(this.strokeColorBottom);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
