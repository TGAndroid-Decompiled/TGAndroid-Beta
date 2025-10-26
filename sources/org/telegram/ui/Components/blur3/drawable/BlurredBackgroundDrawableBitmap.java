package org.telegram.ui.Components.blur3.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;

public class BlurredBackgroundDrawableBitmap extends BlurredBackgroundDrawable {
    private BitmapShader bitmapShader;
    private Bitmap currentBitmap;
    private final Matrix matrix;
    private final Paint paintBitmap;
    private final Paint paintFill;
    private final Paint paintStrokeBottom;
    private final Paint paintStrokeTop;
    private final BlurredBackgroundSourceBitmap source;

    public BlurredBackgroundDrawableBitmap(BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap) {
        Paint paint = new Paint(3);
        this.paintBitmap = paint;
        this.paintFill = new Paint(1);
        Paint paint2 = new Paint(1);
        this.paintStrokeTop = paint2;
        Paint paint3 = new Paint(1);
        this.paintStrokeBottom = paint3;
        this.matrix = new Matrix();
        this.source = blurredBackgroundSourceBitmap;
        paint.setFilterBitmap(true);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
    }

    @Override
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.source.getBitmap();
        if (bitmap != this.currentBitmap) {
            this.currentBitmap = bitmap;
            rebuildPaint();
        }
        Bitmap bitmap2 = this.currentBitmap;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        canvas.drawPath(this.boundProps.path, this.paintBitmap);
        if (this.paintFill.getAlpha() > 0) {
            canvas.drawPath(this.boundProps.path, this.paintFill);
        }
        if (this.strokeColorTop == 0 && this.strokeColorBottom == 0) {
            return;
        }
        canvas.save();
        canvas.clipPath(this.boundProps.path);
        if (this.strokeColorTop != 0) {
            BlurredBackgroundDrawable.Props props = this.boundProps;
            BlurredBackgroundDrawable.drawStroke(canvas, props.boundsWithPadding, props.radii, props.strokeWidthTop, true, this.paintStrokeTop);
        }
        if (this.strokeColorBottom != 0) {
            BlurredBackgroundDrawable.Props props2 = this.boundProps;
            BlurredBackgroundDrawable.drawStroke(canvas, props2.boundsWithPadding, props2.radii, props2.strokeWidthBottom, false, this.paintStrokeBottom);
        }
        canvas.restore();
    }

    private void rebuildPaint() {
        this.paintBitmap.setShader(null);
        this.paintFill.setColor(this.backgroundColor);
        if (this.currentBitmap != null) {
            Bitmap bitmap = this.currentBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.bitmapShader = bitmapShader;
            bitmapShader.setLocalMatrix(this.matrix);
            this.paintBitmap.setShader(this.bitmapShader);
        }
        this.paintBitmap.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33333334f), this.shadowColor);
        this.paintStrokeTop.setColor(this.strokeColorTop);
        this.paintStrokeBottom.setColor(this.strokeColorBottom);
    }

    private void rebuildMatrix() {
        this.matrix.set(this.source.getMatrix());
        this.matrix.postTranslate(-this.sourceOffsetX, -this.sourceOffsetY);
        BitmapShader bitmapShader = this.bitmapShader;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(this.matrix);
        }
    }

    @Override
    protected void onSourceOffsetChange(float f, float f2) {
        rebuildMatrix();
    }

    @Override
    protected void onBoundPropsChanged() {
        rebuildMatrix();
    }

    @Override
    public void updateColors() {
        super.updateColors();
        rebuildPaint();
    }

    @Override
    public void setAlpha(int i) {
        this.paintBitmap.setAlpha(i);
    }
}
