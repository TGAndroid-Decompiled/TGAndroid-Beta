package org.telegram.ui.Components.blur3.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProvider;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceWrapped;
import org.telegram.ui.Components.blur3.utils.NinePatchBuilder;

public abstract class BlurredBackgroundDrawable extends Drawable {
    protected int alpha;
    private final Paint backgroundBitmapFill;
    private final Paint backgroundBitmapPaint;
    protected int backgroundColor;
    private final Paint backgroundColorPaint;
    private final WeakReference bitmapInShader;
    private BitmapShader bitmapShader;
    private final Matrix bitmapShaderMatrix;
    protected final Props boundProps;
    private final RectF cmpRectF1;
    private final RectF cmpRectF2;
    protected BlurredBackgroundColorProvider colorProvider;
    protected boolean inAppKeyboardOptimization;
    private NinePatchDrawable ninePatchDrawable;
    private long ninePatchDrawableHash;
    private final Rect ninePatchDrawablePadding;
    private final Blur3HashImpl ninePatchHashBuilder;
    private final Paint paintStrokeFill;
    protected float shadowAlpha;
    protected int shadowColor;
    protected float shadowLayerDx;
    protected float shadowLayerDy;
    protected float shadowLayerRadius;
    private final Paint shadowPaint;
    protected float sourceOffsetX;
    protected float sourceOffsetY;
    protected int strokeColorBottom;
    protected int strokeColorTop;
    private ViewOutlineProvider viewOutlineProvider;
    private static final float[] tmpRadii = new float[8];
    private static Path tmpPath = new Path();

    @Override
    public int getOpacity() {
        return -3;
    }

    public abstract BlurredBackgroundSource getSource();

    protected void onSourceRelativePositionChanged(RectF rectF) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public BlurredBackgroundDrawable() {
        Props props = new Props();
        this.boundProps = props;
        this.alpha = 255;
        this.shadowAlpha = 1.0f;
        this.backgroundColorPaint = new Paint(1);
        this.paintStrokeFill = new Paint(1);
        Paint paint = new Paint(1);
        this.backgroundBitmapPaint = paint;
        this.backgroundBitmapFill = new Paint(1);
        Paint paint2 = new Paint(1);
        this.shadowPaint = paint2;
        this.bitmapShaderMatrix = new Matrix();
        this.bitmapInShader = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.cmpRectF1 = new RectF();
        this.cmpRectF2 = new RectF();
        this.ninePatchHashBuilder = new Blur3HashImpl();
        this.ninePatchDrawablePadding = new Rect();
        props.strokeWidthTop = AndroidUtilities.dpf2(1.0f);
        props.strokeWidthBottom = AndroidUtilities.dpf2(0.6666667f);
        this.shadowLayerRadius = AndroidUtilities.dpf2(1.0f);
        this.shadowLayerDx = 0.0f;
        this.shadowLayerDy = AndroidUtilities.dpf2(0.33333334f);
    }

    public void setSourceOffset(float f, float f2) {
        if (this.sourceOffsetX == f && this.sourceOffsetY == f2) {
            return;
        }
        this.sourceOffsetX = f;
        this.sourceOffsetY = f2;
        onSourceOffsetChange(f, f2);
    }

    public float getSourceOffsetX() {
        return this.sourceOffsetX;
    }

    public float getSourceOffsetY() {
        return this.sourceOffsetY;
    }

    public BlurredBackgroundDrawable setPadding(int i) {
        Props props = this.boundProps;
        if (props.padding != i) {
            props.padding = i;
            props.build();
            onBoundPropsChanged();
        }
        return this;
    }

    public BlurredBackgroundDrawable setRadius(float f) {
        Arrays.fill(this.boundProps.radii, f);
        Arrays.fill(this.boundProps.shaderRadii, f);
        this.boundProps.build();
        onBoundPropsChanged();
        return this;
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

    public void setRadius(float f, float f2, float f3, float f4, boolean z) {
        Props props = this.boundProps;
        float[] fArr = props.radii;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        float f5 = z ? 0.0f : f3;
        fArr[5] = f5;
        fArr[4] = f5;
        float f6 = z ? 0.0f : f4;
        fArr[7] = f6;
        fArr[6] = f6;
        float[] fArr2 = props.shaderRadii;
        fArr2[1] = f;
        fArr2[0] = f;
        fArr2[3] = f2;
        fArr2[2] = f2;
        fArr2[5] = f3;
        fArr2[4] = f3;
        fArr2[7] = f4;
        fArr2[6] = f4;
        props.build();
        onBoundPropsChanged();
    }

    public void setThickness(int i) {
        this.boundProps.liquidThickness = i;
        onBoundPropsChanged();
    }

    public void setIntensity(float f) {
        this.boundProps.liquidIntensity = f;
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

    protected void onBoundPropsChanged() {
        dispatchSourceRelativePositionChange();
    }

    protected void onSourceOffsetChange(float f, float f2) {
        dispatchSourceRelativePositionChange();
    }

    public BlurredBackgroundSource getUnwrappedSource() {
        BlurredBackgroundSource source = getSource();
        while (source instanceof BlurredBackgroundSourceWrapped) {
            source = ((BlurredBackgroundSourceWrapped) source).getSource();
        }
        return source;
    }

    public BlurredBackgroundDrawable setColorProvider(BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        this.colorProvider = blurredBackgroundColorProvider;
        updateColors();
        if (blurredBackgroundColorProvider instanceof BlurredBackgroundProvider) {
            BlurredBackgroundProvider blurredBackgroundProvider = (BlurredBackgroundProvider) blurredBackgroundColorProvider;
            setStrokeWidth(blurredBackgroundProvider.getStrokeWidthTop(), blurredBackgroundProvider.getStrokeWidthBottom());
            setShadowParams(blurredBackgroundProvider.getShadowRadius(), blurredBackgroundProvider.getShadowDx(), blurredBackgroundProvider.getShadowDy());
        }
        return this;
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

    protected static class Props {
        public int liquidThickness;
        public int padding;
        public float strokeWidthBottom;
        public float strokeWidthTop;
        public final Rect bounds = new Rect();
        public final float[] radii = new float[8];
        public final float[] shaderRadii = new float[8];
        public float liquidIntensity = 0.75f;
        public float liquidIndex = 1.5f;
        public final Path path = new Path();
        public boolean radiiAreSame = true;
        public final Rect boundsWithPadding = new Rect();
        public final Path strokePathTop = new Path();
        public final Path strokePathBottom = new Path();

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
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            float[] fArr = this.radii;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(f, f2, f3, f4, fArr, direction);
            this.path.close();
            float fMin = Math.min(this.boundsWithPadding.width(), this.boundsWithPadding.height()) / 2.0f;
            Arrays.fill(BlurredBackgroundDrawable.tmpRadii, 0.0f);
            BlurredBackgroundDrawable.tmpRadii[0] = this.radii[0];
            BlurredBackgroundDrawable.tmpRadii[1] = this.radii[1];
            BlurredBackgroundDrawable.tmpRadii[2] = this.radii[2];
            float[] fArr2 = BlurredBackgroundDrawable.tmpRadii;
            float[] fArr3 = this.radii;
            fArr2[3] = fArr3[3];
            if (this.radiiAreSame && fArr3[0] > fMin) {
                float[] fArr4 = BlurredBackgroundDrawable.tmpRadii;
                float[] fArr5 = BlurredBackgroundDrawable.tmpRadii;
                float[] fArr6 = BlurredBackgroundDrawable.tmpRadii;
                BlurredBackgroundDrawable.tmpRadii[3] = fMin;
                fArr6[2] = fMin;
                fArr5[1] = fMin;
                fArr4[0] = fMin;
            }
            this.strokePathTop.rewind();
            Path path2 = this.strokePathTop;
            Rect rect3 = this.boundsWithPadding;
            float f5 = rect3.left;
            float f6 = rect3.top;
            path2.addRoundRect(f5, f6, rect3.right, Math.min(this.radii[0] + f6, rect3.bottom), BlurredBackgroundDrawable.tmpRadii, direction);
            Path path3 = this.strokePathTop;
            Rect rect4 = this.boundsWithPadding;
            float f7 = rect4.left;
            float f8 = rect4.top;
            float f9 = f8 + this.strokeWidthTop;
            float f10 = rect4.right;
            float fMin2 = Math.min(f8 + this.radii[0], rect4.bottom);
            float[] fArr7 = BlurredBackgroundDrawable.tmpRadii;
            Path.Direction direction2 = Path.Direction.CCW;
            path3.addRoundRect(f7, f9, f10, fMin2, fArr7, direction2);
            this.strokePathTop.close();
            Arrays.fill(BlurredBackgroundDrawable.tmpRadii, 0.0f);
            BlurredBackgroundDrawable.tmpRadii[4] = this.radii[4];
            BlurredBackgroundDrawable.tmpRadii[5] = this.radii[5];
            BlurredBackgroundDrawable.tmpRadii[6] = this.radii[6];
            float[] fArr8 = BlurredBackgroundDrawable.tmpRadii;
            float[] fArr9 = this.radii;
            fArr8[7] = fArr9[7];
            if (this.radiiAreSame && fArr9[0] > fMin) {
                float[] fArr10 = BlurredBackgroundDrawable.tmpRadii;
                float[] fArr11 = BlurredBackgroundDrawable.tmpRadii;
                float[] fArr12 = BlurredBackgroundDrawable.tmpRadii;
                BlurredBackgroundDrawable.tmpRadii[7] = fMin;
                fArr12[6] = fMin;
                fArr11[5] = fMin;
                fArr10[4] = fMin;
            }
            this.strokePathBottom.rewind();
            Path path4 = this.strokePathBottom;
            float f11 = this.boundsWithPadding.left;
            float fMax = Math.max(r2.bottom - this.radii[4], r2.top);
            Rect rect5 = this.boundsWithPadding;
            path4.addRoundRect(f11, fMax, rect5.right, rect5.bottom, BlurredBackgroundDrawable.tmpRadii, direction);
            Path path5 = this.strokePathBottom;
            float f12 = this.boundsWithPadding.left;
            float fMax2 = Math.max(r2.bottom - this.radii[4], r2.top);
            Rect rect6 = this.boundsWithPadding;
            path5.addRoundRect(f12, fMax2, rect6.right, rect6.bottom - this.strokeWidthBottom, BlurredBackgroundDrawable.tmpRadii, direction2);
            this.strokePathBottom.close();
        }

        public void drawShadows(Canvas canvas, Paint paint, boolean z) {
            if (z) {
                float f = this.boundsWithPadding.top;
                float fClamp = MathUtils.clamp((this.radii[0] * 2.0f) + f, f, r14.bottom);
                canvas.save();
                Rect rect = this.bounds;
                canvas.clipRect(rect.left, rect.top, rect.right, fClamp);
                Rect rect2 = this.boundsWithPadding;
                float f2 = rect2.left;
                float f3 = rect2.top;
                float f4 = rect2.right;
                float f5 = this.radii[0];
                canvas.drawRoundRect(f2, f3, f4, fClamp, f5, f5, paint);
                canvas.restore();
                return;
            }
            draw(canvas, paint);
        }

        public void draw(Canvas canvas, Paint paint) {
            if (this.radiiAreSame) {
                Rect rect = this.boundsWithPadding;
                float f = rect.left;
                float f2 = rect.top;
                float f3 = rect.right;
                float f4 = rect.bottom;
                float f5 = this.radii[0];
                canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
                return;
            }
            canvas.drawPath(this.path, paint);
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

    protected static void getOutline(Outline outline, Rect rect, float[] fArr) {
        if (radiiAreSame(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
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

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public int getAlpha() {
        return this.alpha;
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
            float f8 = f - f7;
            float f9 = f3 + f7;
            if (canvas.clipRect(f8, f2, f9, MathUtils.clamp((2.0f * f5) + f2, f2, f4))) {
                canvas.drawRoundRect(f8, f2 + f7, f9, f4 + f7, f5, f5, paint);
            }
        } else {
            float f10 = f - f7;
            float f11 = f3 + f7;
            if (canvas.clipRect(f10, MathUtils.clamp(f4 - (2.0f * f5), f2, f4), f11, f4)) {
                canvas.drawRoundRect(f10, f2 - f7, f11, f4 - f7, f5, f5, paint);
            }
        }
        canvas.restore();
    }

    public void enableInAppKeyboardOptimization() {
        this.inAppKeyboardOptimization = true;
    }

    public void setShadowParams(float f, float f2, float f3) {
        this.shadowLayerRadius = f;
        this.shadowLayerDx = f2;
        this.shadowLayerDy = f3;
    }

    public void setShadowAlpha(float f) {
        this.shadowAlpha = f;
    }

    public void setStrokeWidth(float f, float f2) {
        Props props = this.boundProps;
        props.strokeWidthTop = f;
        props.strokeWidthBottom = f2;
    }

    protected void drawSource(Canvas canvas, BlurredBackgroundSource blurredBackgroundSource) {
        if (this.boundProps.boundsWithPadding.isEmpty()) {
            return;
        }
        if (Color.alpha(this.backgroundColor) == 255) {
            drawSourceColorImpl(canvas, 0);
            return;
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceColor) {
            drawSourceColor(canvas, (BlurredBackgroundSourceColor) blurredBackgroundSource);
            return;
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceBitmap) {
            drawSourceBitmap(canvas, (BlurredBackgroundSourceBitmap) blurredBackgroundSource);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (blurredBackgroundSource instanceof BlurredBackgroundSourceRenderNode)) {
            drawSourceRenderNode(canvas, (BlurredBackgroundSourceRenderNode) blurredBackgroundSource);
        } else if (blurredBackgroundSource instanceof BlurredBackgroundSourceWrapped) {
            drawSource(canvas, ((BlurredBackgroundSourceWrapped) blurredBackgroundSource).getSource());
        } else if (blurredBackgroundSource != null) {
            drawSourceAny(canvas, blurredBackgroundSource);
        }
    }

    private void drawSourceAny(Canvas canvas, BlurredBackgroundSource blurredBackgroundSource) {
        int i = this.alpha;
        if (i == 0) {
            return;
        }
        int iMultAlpha = Theme.multAlpha(this.backgroundColor, i / 255.0f);
        if (Color.alpha(this.shadowColor) > 0 && this.alpha == 255) {
            float f = this.shadowAlpha;
            if (f > 0.0f) {
                this.shadowPaint.setShadowLayer(this.shadowLayerRadius, this.shadowLayerDx, this.shadowLayerDy, Theme.multAlpha(this.shadowColor, f));
                this.boundProps.drawShadows(canvas, this.shadowPaint, this.inAppKeyboardOptimization);
            }
        }
        float f2 = this.sourceOffsetX;
        float f3 = this.sourceOffsetY;
        Rect rect = this.boundProps.boundsWithPadding;
        float f4 = rect.left;
        float f5 = f4 + f2;
        float f6 = rect.top;
        float f7 = f6 + f3;
        float f8 = rect.right;
        float f9 = f8 + f2;
        float f10 = rect.bottom;
        float f11 = f10 + f3;
        int i2 = this.alpha;
        boolean z = i2 != 255;
        if (z) {
            canvas.saveLayerAlpha(f4, f6, f8, f10, i2);
        }
        canvas.save();
        canvas.clipPath(this.boundProps.path);
        Rect rect2 = this.boundProps.boundsWithPadding;
        canvas.translate(rect2.left, rect2.top);
        canvas.translate(-f5, -f7);
        blurredBackgroundSource.draw(canvas, f5, f7, f9, f11);
        canvas.restore();
        if (Color.alpha(iMultAlpha) > 0) {
            this.backgroundColorPaint.setColor(iMultAlpha);
            this.boundProps.draw(canvas, this.backgroundColorPaint);
        }
        drawStrokeInternalIfNeeded(canvas);
        if (z) {
            canvas.restore();
        }
    }

    private void drawSourceColor(Canvas canvas, BlurredBackgroundSourceColor blurredBackgroundSourceColor) {
        drawSourceColorImpl(canvas, blurredBackgroundSourceColor.getColor());
    }

    private void drawSourceColorImpl(Canvas canvas, int i) {
        int iCompositeColors = ColorUtils.compositeColors(this.backgroundColor, i);
        if (Color.alpha(iCompositeColors) == 0 && Color.alpha(this.shadowColor) == 0) {
            return;
        }
        NinePatchDrawable ninePatchDrawableCheckNinePatchDrawable = checkNinePatchDrawable(iCompositeColors);
        if (ninePatchDrawableCheckNinePatchDrawable != null) {
            Rect rect = this.boundProps.boundsWithPadding;
            int i2 = rect.left;
            Rect rect2 = this.ninePatchDrawablePadding;
            ninePatchDrawableCheckNinePatchDrawable.setBounds(i2 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
            ninePatchDrawableCheckNinePatchDrawable.setAlpha(this.alpha);
            ninePatchDrawableCheckNinePatchDrawable.draw(canvas);
            drawStrokeInternalIfNeeded(canvas);
            return;
        }
        int iMultAlpha = Theme.multAlpha(iCompositeColors, this.alpha / 255.0f);
        if (Color.alpha(this.shadowColor) > 0 && this.alpha == 255) {
            float f = this.shadowAlpha;
            if (f > 0.0f) {
                this.shadowPaint.setShadowLayer(this.shadowLayerRadius, this.shadowLayerDx, this.shadowLayerDy, Theme.multAlpha(this.shadowColor, f));
                this.boundProps.drawShadows(canvas, this.shadowPaint, this.inAppKeyboardOptimization);
            }
        }
        this.backgroundColorPaint.setColor(iMultAlpha);
        this.boundProps.draw(canvas, this.backgroundColorPaint);
        drawStrokeInternalIfNeeded(canvas);
    }

    private void drawSourceBitmap(Canvas canvas, BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap) {
        Bitmap bitmap = blurredBackgroundSourceBitmap.getBitmap();
        if (bitmap != ((Bitmap) this.bitmapInShader.get())) {
            if (bitmap != null && !bitmap.isRecycled()) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.bitmapShader = bitmapShader;
                this.backgroundBitmapPaint.setShader(bitmapShader);
            } else {
                this.bitmapShader = null;
                this.backgroundBitmapPaint.setShader(null);
            }
        }
        if (Color.alpha(this.shadowColor) > 0) {
            NinePatchDrawable ninePatchDrawableCheckNinePatchDrawable = checkNinePatchDrawable(0);
            if (ninePatchDrawableCheckNinePatchDrawable != null) {
                Rect rect = this.boundProps.boundsWithPadding;
                int i = rect.left;
                Rect rect2 = this.ninePatchDrawablePadding;
                ninePatchDrawableCheckNinePatchDrawable.setBounds(i - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
                ninePatchDrawableCheckNinePatchDrawable.setAlpha(this.alpha);
                ninePatchDrawableCheckNinePatchDrawable.draw(canvas);
            } else if (this.alpha == 255) {
                float f = this.shadowAlpha;
                if (f > 0.0f) {
                    this.shadowPaint.setShadowLayer(this.shadowLayerRadius, this.shadowLayerDx, this.shadowLayerDy, Theme.multAlpha(this.shadowColor, f));
                    this.boundProps.drawShadows(canvas, this.shadowPaint, this.inAppKeyboardOptimization);
                }
            }
        }
        if (this.bitmapShader != null && bitmap != null && !bitmap.isRecycled() && this.alpha > 0) {
            this.bitmapShaderMatrix.set(blurredBackgroundSourceBitmap.getMatrix());
            this.bitmapShaderMatrix.postTranslate(-this.sourceOffsetX, -this.sourceOffsetY);
            this.bitmapShader.setLocalMatrix(this.bitmapShaderMatrix);
            this.backgroundBitmapPaint.setAlpha(this.alpha);
            this.boundProps.draw(canvas, this.backgroundBitmapPaint);
        }
        int iMultAlpha = Theme.multAlpha(this.backgroundColor, this.alpha / 255.0f);
        if (Color.alpha(iMultAlpha) > 0) {
            this.backgroundBitmapFill.setColor(iMultAlpha);
            this.boundProps.draw(canvas, this.backgroundBitmapFill);
        }
        drawStrokeInternalIfNeeded(canvas);
    }

    private void drawStrokeInternalIfNeeded(Canvas canvas) {
        int iMultAlpha = Theme.multAlpha(this.strokeColorTop, this.alpha / 255.0f);
        int iMultAlpha2 = Theme.multAlpha(this.strokeColorBottom, this.alpha / 255.0f);
        if (Color.alpha(iMultAlpha) > 0) {
            this.paintStrokeFill.setColor(iMultAlpha);
            canvas.drawPath(this.boundProps.strokePathTop, this.paintStrokeFill);
        }
        if (Color.alpha(iMultAlpha2) > 0) {
            this.paintStrokeFill.setColor(iMultAlpha2);
            canvas.drawPath(this.boundProps.strokePathBottom, this.paintStrokeFill);
        }
    }

    private void drawSourceRenderNode(Canvas canvas, BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode) {
        if (canvas.isHardwareAccelerated()) {
            return;
        }
        drawSource(canvas, blurredBackgroundSourceRenderNode.getFallbackSource());
    }

    private void dispatchSourceRelativePositionChange() {
        getPositionRelativeSource(this.cmpRectF1);
        if (this.cmpRectF1.equals(this.cmpRectF2)) {
            return;
        }
        this.cmpRectF2.set(this.cmpRectF1);
        onSourceRelativePositionChanged(this.cmpRectF1);
    }

    public void getPositionRelativeSource(RectF rectF) {
        rectF.set(this.boundProps.boundsWithPadding);
        rectF.offset(this.sourceOffsetX, this.sourceOffsetY);
    }

    private NinePatchDrawable checkNinePatchDrawable(int i) {
        this.ninePatchHashBuilder.start();
        this.ninePatchHashBuilder.add(i);
        this.ninePatchHashBuilder.add(this.shadowColor);
        this.ninePatchHashBuilder.add(this.boundProps.radii);
        this.ninePatchHashBuilder.addF(this.shadowLayerRadius);
        this.ninePatchHashBuilder.addF(this.shadowLayerDx);
        this.ninePatchHashBuilder.addF(this.shadowLayerDy);
        long j = this.ninePatchHashBuilder.get();
        NinePatchDrawable ninePatchDrawable = this.ninePatchDrawable;
        if (ninePatchDrawable == null || this.ninePatchDrawableHash != j) {
            this.ninePatchDrawableHash = j;
            if (ninePatchDrawable == null) {
                this.ninePatchDrawable = NinePatchBuilder.createNinePatch(i, this.boundProps.radii, this.shadowLayerRadius, this.shadowColor, this.shadowLayerDx, this.shadowLayerDy);
            }
            this.ninePatchDrawable.getPadding(this.ninePatchDrawablePadding);
        }
        return this.ninePatchDrawable;
    }
}
