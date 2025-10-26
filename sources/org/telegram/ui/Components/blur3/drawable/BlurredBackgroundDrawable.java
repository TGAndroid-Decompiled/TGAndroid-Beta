package org.telegram.ui.Components.blur3.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.core.math.MathUtils;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;

public abstract class BlurredBackgroundDrawable extends Drawable {
    private static Path tmpPath = new Path();
    protected int backgroundColor;
    protected final Props boundProps;
    protected BlurredBackgroundColorProvider colorProvider;
    protected boolean inAppKeyboardOptimization;
    protected int shadowColor;
    protected float sourceOffsetX;
    protected float sourceOffsetY;
    protected int strokeColorBottom;
    protected int strokeColorTop;
    private ViewOutlineProvider viewOutlineProvider;

    @Override
    public int getOpacity() {
        return -3;
    }

    protected abstract void onBoundPropsChanged();

    protected abstract void onSourceOffsetChange(float f, float f2);

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public BlurredBackgroundDrawable() {
        Props props = new Props();
        this.boundProps = props;
        props.strokeWidthTop = AndroidUtilities.dpf2(1.0f);
        props.strokeWidthBottom = AndroidUtilities.dpf2(0.6666667f);
    }

    public void setSourceOffset(float f, float f2) {
        if (this.sourceOffsetX == f && this.sourceOffsetY == f2) {
            return;
        }
        this.sourceOffsetX = f;
        this.sourceOffsetY = f2;
        onSourceOffsetChange(f, f2);
    }

    public void setPadding(int i) {
        Props props = this.boundProps;
        if (props.padding != i) {
            props.padding = i;
            props.build();
            onBoundPropsChanged();
        }
    }

    public void setRadius(float f) {
        Arrays.fill(this.boundProps.radii, f);
        this.boundProps.build();
        onBoundPropsChanged();
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        Props props = this.boundProps;
        float[] fArr = props.radii;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
        props.build();
        onBoundPropsChanged();
    }

    public Rect getPaddedBounds() {
        return this.boundProps.boundsWithPadding;
    }

    public Path getPath() {
        return this.boundProps.path;
    }

    @Override
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.boundProps.bounds.set(rect);
        this.boundProps.build();
        onBoundPropsChanged();
    }

    public void setColorProvider(BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        this.colorProvider = blurredBackgroundColorProvider;
        updateColors();
    }

    public void updateColors() {
        BlurredBackgroundColorProvider blurredBackgroundColorProvider = this.colorProvider;
        if (blurredBackgroundColorProvider == null) {
            return;
        }
        this.backgroundColor = blurredBackgroundColorProvider.getBackgroundColor();
        this.shadowColor = this.colorProvider.getShadowColor();
        this.strokeColorTop = this.colorProvider.getStrokeColorTop();
        this.strokeColorBottom = this.colorProvider.getStrokeColorBottom();
    }

    public static class Props {
        public int padding;
        public float strokeWidthBottom;
        public float strokeWidthTop;
        public final Rect bounds = new Rect();
        public final float[] radii = new float[8];
        public final Path path = new Path();
        public boolean radiiAreSame = true;
        public final Rect boundsWithPadding = new Rect();

        protected Props() {
        }

        public void build() {
            this.radiiAreSame = BlurredBackgroundDrawable.radiiAreSame(this.radii);
            this.boundsWithPadding.set(this.bounds);
            Rect rect = this.boundsWithPadding;
            int i = this.padding;
            rect.inset(i, i);
            this.path.rewind();
            Path path = this.path;
            Rect rect2 = this.boundsWithPadding;
            path.addRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, this.radii, Path.Direction.CW);
            this.path.close();
        }
    }

    public ViewOutlineProvider getViewOutlineProvider() {
        if (this.viewOutlineProvider == null) {
            this.viewOutlineProvider = new ViewOutlineProvider() {
                @Override
                public void getOutline(View view, Outline outline) {
                    Props props = BlurredBackgroundDrawable.this.boundProps;
                    BlurredBackgroundDrawable.getOutline(outline, props.boundsWithPadding, props.radii);
                }
            };
        }
        return this.viewOutlineProvider;
    }

    public static void getOutline(Outline outline, Rect rect, float[] fArr) {
        int width = rect.width();
        int height = rect.height();
        if (radiiAreSame(fArr)) {
            if (width == height && fArr[0] * 2.0f == width) {
                outline.setOval(rect);
                return;
            } else {
                outline.setRoundRect(rect, fArr[0]);
                return;
            }
        }
        Path path = tmpPath;
        if (path == null) {
            tmpPath = new Path();
        } else {
            path.rewind();
        }
        tmpPath.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(tmpPath);
    }

    public static boolean radiiAreSame(float[] fArr) {
        float f = fArr[0];
        return f == fArr[1] && f == fArr[2] && f == fArr[3] && f == fArr[4] && f == fArr[5] && f == fArr[6] && f == fArr[7];
    }

    public static void drawStroke(Canvas canvas, Rect rect, float[] fArr, float f, boolean z, Paint paint) {
        drawStroke(canvas, rect.left, rect.top, rect.right, rect.bottom, fArr, f, z, paint);
    }

    public static void drawStroke(android.graphics.Canvas r11, float r12, float r13, float r14, float r15, float[] r16, float r17, boolean r18, android.graphics.Paint r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable.drawStroke(android.graphics.Canvas, float, float, float, float, float[], float, boolean, android.graphics.Paint):void");
    }

    public static void drawStroke(Canvas canvas, RectF rectF, float f, float f2, boolean z, Paint paint) {
        drawStroke(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, f, f2, z, paint);
    }

    public static void drawStroke(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        float f7 = f6 / 2.0f;
        canvas.save();
        if (z) {
            if (canvas.clipRect(f, f2, f3, MathUtils.clamp((2.0f * f5) + f2, f2, f4))) {
                canvas.drawRoundRect(f - f6, f2 + f7, f3 + f6, f7 + f4, f5, f5, paint);
            }
        } else if (canvas.clipRect(f, MathUtils.clamp(f4 - (2.0f * f5), f2, f4), f3, f4)) {
            canvas.drawRoundRect(f - f6, f2 - f7, f3 + f6, f4 - f7, f5, f5, paint);
        }
        canvas.restore();
    }

    public void enableInAppKeyboardOptimization() {
        this.inAppKeyboardOptimization = true;
    }
}
