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
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;

public class StrokeDrawable extends Drawable {
    private BlurredBackgroundColorProvider colorProvider;
    public boolean nonRound;
    private int padding;
    public float radius;
    protected int strokeColorBottom;
    protected int strokeColorTop;
    private float alpha = 1.0f;
    private final RectF rect = new RectF();
    private final Paint paintFill = new Paint(1);
    private final Paint paintStrokeTop = new Paint(1);
    private final Paint paintStrokeBottom = new Paint(1);

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setBackgroundColor(int i) {
        this.paintFill.setColor(i);
        invalidateSelf();
    }

    public void setPadding(int i) {
        this.padding = i;
    }

    public void setColorProvider(BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        this.colorProvider = blurredBackgroundColorProvider;
        Paint paint = this.paintStrokeTop;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.paintStrokeBottom.setStyle(style);
        updateColors();
    }

    public void updateColors() {
        BlurredBackgroundColorProvider blurredBackgroundColorProvider = this.colorProvider;
        if (blurredBackgroundColorProvider == null) {
            return;
        }
        this.strokeColorTop = Theme.multAlpha(blurredBackgroundColorProvider.getStrokeColorTop(), this.alpha);
        this.strokeColorBottom = Theme.multAlpha(this.colorProvider.getStrokeColorBottom(), this.alpha);
        this.paintStrokeTop.setColor(this.strokeColorTop);
        this.paintStrokeTop.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        this.paintStrokeBottom.setColor(this.strokeColorBottom);
        this.paintStrokeBottom.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override
    public void draw(Canvas canvas) {
        Canvas canvas2;
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        float fMin = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.padding;
        this.rect.set(fCenterX - fMin, fCenterY - fMin, fCenterX + fMin, fCenterY + fMin);
        if (this.nonRound) {
            this.rect.set(getBounds());
            fMin = this.radius;
        }
        float f = fMin;
        if (Color.alpha(this.paintFill.getColor()) > 0) {
            canvas.drawCircle(fCenterX, fCenterY, f, this.paintFill);
        }
        if (this.strokeColorTop != 0) {
            canvas2 = canvas;
            BlurredBackgroundDrawable.drawStroke(canvas2, this.rect, f, AndroidUtilities.dpf2(1.0f), true, this.paintStrokeTop);
        } else {
            canvas2 = canvas;
        }
        if (this.strokeColorBottom != 0) {
            BlurredBackgroundDrawable.drawStroke(canvas2, this.rect, f, AndroidUtilities.dpf2(0.6666667f), false, this.paintStrokeBottom);
        }
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i / 255.0f;
        updateColors();
    }
}
