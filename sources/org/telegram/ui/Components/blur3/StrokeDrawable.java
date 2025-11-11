package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
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
    private int padding;
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
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.padding;
        this.rect.set(centerX - min, centerY - min, centerX + min, centerY + min);
        canvas.drawCircle(centerX, centerY, min, this.paintFill);
        if (this.strokeColorTop != 0) {
            BlurredBackgroundDrawable.drawStroke(canvas, this.rect, min, AndroidUtilities.dpf2(1.0f), true, this.paintStrokeTop);
        }
        if (this.strokeColorBottom != 0) {
            BlurredBackgroundDrawable.drawStroke(canvas, this.rect, min, AndroidUtilities.dpf2(0.6666667f), false, this.paintStrokeBottom);
        }
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i / 255.0f;
        updateColors();
    }
}
