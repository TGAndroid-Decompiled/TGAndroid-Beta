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
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.utils.FBool;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProvider;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceWrapped;
import org.telegram.ui.Components.blur3.utils.NinePatchBuilder;

public abstract class BlurredBackgroundDrawable extends Drawable {
    public int alpha;
    public final Paint backgroundBitmapFill;
    public final Paint backgroundBitmapPaint;
    public int backgroundColor;
    public final Paint backgroundColorPaint;
    public final WeakReference bitmapInShader;
    public BitmapShader bitmapShader;
    public final Matrix bitmapShaderMatrix;
    public final Props boundProps;
    public final RectF cmpRectF1;
    public final RectF cmpRectF2;
    public BlurredBackgroundColorProvider colorProvider;
    public boolean inAppKeyboardOptimization;
    public NinePatchDrawable ninePatchDrawable;
    public long ninePatchDrawableHash;
    public final Rect ninePatchDrawablePadding;
    public final Blur3HashImpl ninePatchHashBuilder;
    public final Paint paintStrokeFill;
    public float shadowAlpha;
    public int shadowColor;
    public float shadowLayerDy;
    public float shadowLayerRadius;
    public final Paint shadowPaint;
    public float sourceOffsetX;
    public float sourceOffsetY;
    public int strokeColorBottom;
    public int strokeColorTop;
    public ActionBarLayout.AnonymousClass4 viewOutlineProvider;
    public static final float[] tmpRadii = new float[8];
    public static Path tmpPath = new Path();

    public final class Props {
        public boolean hasPadding;
        public int liquidThickness;
        public int padding;
        public float strokeWidthBottom;
        public float strokeWidthTop;
        public final Rect bounds = new Rect();
        public final float[] radii = new float[8];
        public final float[] shaderRadii = new float[8];
        public float liquidIntensity = 0.75f;
        public final float liquidIndex = 1.5f;
        public final Path path = new Path();
        public boolean radiiAreSame = true;
        public final Rect boundsWithPadding = new Rect();
        public final Path strokePathTop = new Path();
        public final Path strokePathBottom = new Path();

        public final void build() {
            float[] fArr = this.radii;
            this.radiiAreSame = FBool.radiiAreSame(fArr);
            Rect rect = this.bounds;
            Rect rect2 = this.boundsWithPadding;
            rect2.set(rect);
            int i = this.padding;
            rect2.inset(i, i);
            Path path = this.path;
            path.rewind();
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(f, f2, f3, f4, this.radii, direction);
            path.close();
            float fMin = Math.min(rect2.width(), rect2.height()) / 2.0f;
            float[] fArr2 = BlurredBackgroundDrawable.tmpRadii;
            Arrays.fill(fArr2, 0.0f);
            fArr2[0] = fArr[0];
            fArr2[1] = fArr[1];
            fArr2[2] = fArr[2];
            fArr2[3] = fArr[3];
            if (this.radiiAreSame && fArr[0] > fMin) {
                fArr2[3] = fMin;
                fArr2[2] = fMin;
                fArr2[1] = fMin;
                fArr2[0] = fMin;
            }
            Path path2 = this.strokePathTop;
            path2.rewind();
            float f5 = rect2.left;
            float f6 = rect2.top;
            path2.addRoundRect(f5, f6, rect2.right, Math.min(fArr[0] + f6, rect2.bottom), fArr2, direction);
            float f7 = rect2.left;
            float f8 = rect2.top;
            float f9 = this.strokeWidthTop + f8;
            float f10 = rect2.right;
            float fMin2 = Math.min(f8 + fArr[0], rect2.bottom);
            Path.Direction direction2 = Path.Direction.CCW;
            path2.addRoundRect(f7, f9, f10, fMin2, fArr2, direction2);
            path2.close();
            Arrays.fill(fArr2, 0.0f);
            fArr2[4] = fArr[4];
            fArr2[5] = fArr[5];
            fArr2[6] = fArr[6];
            fArr2[7] = fArr[7];
            if (this.radiiAreSame && fArr[0] > fMin) {
                fArr2[7] = fMin;
                fArr2[6] = fMin;
                fArr2[5] = fMin;
                fArr2[4] = fMin;
            }
            Path path3 = this.strokePathBottom;
            path3.rewind();
            path3.addRoundRect(rect2.left, Math.max(rect2.bottom - fArr[4], rect2.top), rect2.right, rect2.bottom, fArr2, direction);
            path3.addRoundRect(rect2.left, Math.max(rect2.bottom - fArr[4], rect2.top), rect2.right, rect2.bottom - this.strokeWidthBottom, fArr2, direction2);
            path3.close();
        }

        public final void draw(Canvas canvas, Paint paint) {
            if (!this.radiiAreSame) {
                canvas.drawPath(this.path, paint);
                return;
            }
            Rect rect = this.boundsWithPadding;
            float f = rect.left;
            float f2 = rect.top;
            float f3 = rect.right;
            float f4 = rect.bottom;
            float f5 = this.radii[0];
            canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
        }

        public final void drawShadows(Canvas canvas, Paint paint, boolean z) {
            if (!z) {
                draw(canvas, paint);
                return;
            }
            Rect rect = this.boundsWithPadding;
            float f = rect.top;
            float[] fArr = this.radii;
            float fClamp = MathUtils.clamp((fArr[0] * 2.0f) + f, f, rect.bottom);
            canvas.save();
            Rect rect2 = this.bounds;
            canvas.clipRect(rect2.left, rect2.top, rect2.right, fClamp);
            float f2 = rect.left;
            float f3 = rect.top;
            float f4 = rect.right;
            float f5 = fArr[0];
            canvas.drawRoundRect(f2, f3, f4, fClamp, f5, f5, paint);
            canvas.restore();
        }
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
        this.shadowLayerDy = AndroidUtilities.dpf2(0.33333334f);
    }

    public static void drawStroke(Canvas canvas, float f, float f2, float[] fArr, float f3, boolean z, Paint paint) {
        boolean z2;
        float f4;
        if (z) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            if (f5 == f6) {
                float f7 = fArr[2];
                if (f6 == f7 && f7 == fArr[3]) {
                    z2 = true;
                }
            }
            z2 = false;
        } else {
            float f8 = fArr[4];
            float f9 = fArr[5];
            if (f8 == f9) {
                float f10 = fArr[6];
                if (f9 == f10 && f10 == fArr[7]) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        float f11 = f3 / 2.0f;
        if (z) {
            if (z2) {
                canvas.save();
                if (canvas.clipRect(0.0f, 0.0f, f, MathUtils.clamp((fArr[0] * 2.0f) + 0.0f, 0.0f, f2))) {
                    float f12 = fArr[0];
                    canvas.drawRoundRect(0.0f - f11, f11 + 0.0f, f + f11, f2 + f11, f12, f12, paint);
                }
                canvas.restore();
                return;
            }
            float f13 = (f + 0.0f) / 2.0f;
            canvas.save();
            if (canvas.clipRect(0.0f, 0.0f, f13, MathUtils.clamp((fArr[0] * 2.0f) + 0.0f, 0.0f, f2))) {
                f4 = 0.0f;
                canvas.drawRoundRect(0.0f - f11, f11 + 0.0f, f + f11, f2 + f11, fArr[0], fArr[1], paint);
            } else {
                f4 = 0.0f;
            }
            canvas.restore();
            canvas.save();
            if (canvas.clipRect(f13, f4, f, MathUtils.clamp((fArr[0] * 2.0f) + f4, f4, f2))) {
                canvas.drawRoundRect(f4 - f11, f11 + f4, f + f11, f2 + f11, fArr[2], fArr[3], paint);
            }
            canvas.restore();
            return;
        }
        if (z2) {
            canvas.save();
            if (canvas.clipRect(0.0f, MathUtils.clamp(f2 - (fArr[4] * 2.0f), 0.0f, f2), f, f2)) {
                float f14 = 0.0f - f11;
                float f15 = fArr[4];
                canvas.drawRoundRect(f14, f14, f + f11, f2 - f11, f15, f15, paint);
            }
            canvas.restore();
            return;
        }
        float f16 = (f + 0.0f) / 2.0f;
        canvas.save();
        if (canvas.clipRect(0.0f, MathUtils.clamp(f2 - (fArr[4] * 2.0f), 0.0f, f2), f16, f2)) {
            float f17 = 0.0f - f11;
            canvas.drawRoundRect(f17, f17, f + f11, f2 - f11, fArr[6], fArr[7], paint);
        }
        canvas.restore();
        canvas.save();
        if (canvas.clipRect(f16, MathUtils.clamp(f2 - (fArr[4] * 2.0f), 0.0f, f2), f, f2)) {
            float f18 = 0.0f - f11;
            canvas.drawRoundRect(f18, f18, f + f11, f2 - f11, fArr[4], fArr[5], paint);
        }
        canvas.restore();
    }

    public final NinePatchDrawable checkNinePatchDrawable(int i, boolean z) {
        Blur3HashImpl blur3HashImpl = this.ninePatchHashBuilder;
        blur3HashImpl.hash = 0L;
        blur3HashImpl.unsupported = false;
        long jCalcHash = MediaDataController.calcHash(0L, i);
        blur3HashImpl.hash = jCalcHash;
        blur3HashImpl.hash = MediaDataController.calcHash(jCalcHash, this.shadowColor);
        Props props = this.boundProps;
        for (float f : props.radii) {
            blur3HashImpl.addF(f);
        }
        blur3HashImpl.addF(this.shadowLayerRadius);
        blur3HashImpl.addF(0.0f);
        blur3HashImpl.addF(this.shadowLayerDy);
        blur3HashImpl.add(z);
        if (z) {
            long jCalcHash2 = MediaDataController.calcHash(blur3HashImpl.hash, this.strokeColorTop);
            blur3HashImpl.hash = jCalcHash2;
            blur3HashImpl.hash = MediaDataController.calcHash(jCalcHash2, this.strokeColorBottom);
            blur3HashImpl.addF(props.strokeWidthTop);
            blur3HashImpl.addF(props.strokeWidthBottom);
        }
        long j = blur3HashImpl.unsupported ? -1L : blur3HashImpl.hash;
        if (this.ninePatchDrawable == null || this.ninePatchDrawableHash != j) {
            this.ninePatchDrawableHash = j;
            NinePatchDrawable ninePatchDrawableCreateNinePatch = NinePatchBuilder.createNinePatch(null, props.radii, this.shadowLayerRadius, this.shadowLayerDy, Color.alpha(i) == 255 ? i : 1, new DefaultAnalyticsCollector$$ExternalSyntheticLambda1(this, z, i, 3));
            this.ninePatchDrawable = ninePatchDrawableCreateNinePatch;
            ninePatchDrawableCreateNinePatch.getPadding(this.ninePatchDrawablePadding);
        }
        return this.ninePatchDrawable;
    }

    public final void dispatchSourceRelativePositionChange() {
        RectF rectF = this.cmpRectF1;
        rectF.set(this.boundProps.boundsWithPadding);
        rectF.offset(this.sourceOffsetX, this.sourceOffsetY);
        RectF rectF2 = this.cmpRectF2;
        if (rectF.equals(rectF2)) {
            return;
        }
        rectF2.set(rectF);
        onSourceRelativePositionChanged();
    }

    public final void drawSource(Canvas canvas, BlurredBackgroundSource blurredBackgroundSource) {
        int i;
        Props props = this.boundProps;
        if (props.boundsWithPadding.isEmpty()) {
            return;
        }
        if (Color.alpha(this.backgroundColor) == 255) {
            drawSourceColorImpl(canvas, 0);
            return;
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceColor) {
            drawSourceColorImpl(canvas, ((BlurredBackgroundSourceColor) blurredBackgroundSource).paint.getColor());
            return;
        }
        boolean z = blurredBackgroundSource instanceof BlurredBackgroundSourceBitmap;
        Rect rect = props.boundsWithPadding;
        if (z) {
            BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = (BlurredBackgroundSourceBitmap) blurredBackgroundSource;
            Bitmap bitmap = blurredBackgroundSourceBitmap.bitmap;
            Bitmap bitmap2 = (Bitmap) this.bitmapInShader.get();
            Paint paint = this.backgroundBitmapPaint;
            if (bitmap != bitmap2) {
                if (bitmap == null || bitmap.isRecycled()) {
                    this.bitmapShader = null;
                    paint.setShader(null);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    this.bitmapShader = bitmapShader;
                    paint.setShader(bitmapShader);
                }
            }
            if (Color.alpha(this.shadowColor) > 0) {
                NinePatchDrawable ninePatchDrawableCheckNinePatchDrawable = checkNinePatchDrawable(0, false);
                int i2 = rect.left;
                Rect rect2 = this.ninePatchDrawablePadding;
                ninePatchDrawableCheckNinePatchDrawable.setBounds(i2 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
                ninePatchDrawableCheckNinePatchDrawable.setAlpha(this.alpha);
                ninePatchDrawableCheckNinePatchDrawable.draw(canvas);
            }
            if (this.bitmapShader != null && bitmap != null && !bitmap.isRecycled() && this.alpha > 0) {
                Matrix matrix = this.bitmapShaderMatrix;
                matrix.set(blurredBackgroundSourceBitmap.bitmapMatrix);
                matrix.postTranslate(-this.sourceOffsetX, -this.sourceOffsetY);
                this.bitmapShader.setLocalMatrix(matrix);
                paint.setAlpha(this.alpha);
                props.draw(canvas, paint);
            }
            int iMultAlpha = Theme.multAlpha(this.alpha / 255.0f, this.backgroundColor);
            if (Color.alpha(iMultAlpha) > 0) {
                Paint paint2 = this.backgroundBitmapFill;
                paint2.setColor(iMultAlpha);
                props.draw(canvas, paint2);
            }
            drawStrokeInternalIfNeeded(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (blurredBackgroundSource instanceof BlurredBackgroundSourceRenderNode)) {
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = (BlurredBackgroundSourceRenderNode) blurredBackgroundSource;
            if (canvas.isHardwareAccelerated()) {
                return;
            }
            drawSource(canvas, blurredBackgroundSourceRenderNode.fallbackSource);
            return;
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceWrapped) {
            drawSource(canvas, ((BlurredBackgroundSourceWrapped) blurredBackgroundSource).sourceInternal);
            return;
        }
        if (blurredBackgroundSource == null || (i = this.alpha) == 0) {
            return;
        }
        int iMultAlpha2 = Theme.multAlpha(i / 255.0f, this.backgroundColor);
        if (Color.alpha(this.shadowColor) > 0 && this.alpha == 255) {
            float f = this.shadowAlpha;
            if (f > 0.0f) {
                Paint paint3 = this.shadowPaint;
                paint3.setShadowLayer(this.shadowLayerRadius, 0.0f, this.shadowLayerDy, Theme.multAlpha(f, this.shadowColor));
                props.drawShadows(canvas, paint3, this.inAppKeyboardOptimization);
            }
        }
        float f2 = this.sourceOffsetX;
        float f3 = this.sourceOffsetY;
        float f4 = rect.left;
        float f5 = f4 + f2;
        float f6 = rect.top;
        float f7 = f6 + f3;
        float f8 = rect.right;
        float f9 = f8 + f2;
        float f10 = rect.bottom;
        float f11 = f10 + f3;
        int i3 = this.alpha;
        boolean z2 = i3 != 255;
        if (z2) {
            canvas.saveLayerAlpha(f4, f6, f8, f10, i3);
        }
        canvas.save();
        canvas.clipPath(props.path);
        canvas.translate(rect.left, rect.top);
        canvas.translate(-f5, -f7);
        blurredBackgroundSource.draw(canvas, f5, f7, f9, f11);
        canvas.restore();
        if (Color.alpha(iMultAlpha2) > 0) {
            Paint paint4 = this.backgroundColorPaint;
            paint4.setColor(iMultAlpha2);
            props.draw(canvas, paint4);
        }
        drawStrokeInternalIfNeeded(canvas);
        if (z2) {
            canvas.restore();
        }
    }

    public final void drawSourceColorImpl(Canvas canvas, int i) {
        int iCompositeColors = ColorUtils.compositeColors(this.backgroundColor, i);
        if (Color.alpha(iCompositeColors) == 0 && Color.alpha(this.shadowColor) == 0) {
            return;
        }
        NinePatchDrawable ninePatchDrawableCheckNinePatchDrawable = checkNinePatchDrawable(iCompositeColors, true);
        Rect rect = this.boundProps.boundsWithPadding;
        int i2 = rect.left;
        Rect rect2 = this.ninePatchDrawablePadding;
        ninePatchDrawableCheckNinePatchDrawable.setBounds(i2 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        ninePatchDrawableCheckNinePatchDrawable.setAlpha(this.alpha);
        ninePatchDrawableCheckNinePatchDrawable.draw(canvas);
    }

    public final void drawStrokeInternalIfNeeded(Canvas canvas) {
        int iMultAlpha = Theme.multAlpha(this.alpha / 255.0f, this.strokeColorTop);
        int iMultAlpha2 = Theme.multAlpha(this.alpha / 255.0f, this.strokeColorBottom);
        int iAlpha = Color.alpha(iMultAlpha);
        Props props = this.boundProps;
        Paint paint = this.paintStrokeFill;
        if (iAlpha > 0) {
            paint.setColor(iMultAlpha);
            canvas.drawPath(props.strokePathTop, paint);
        }
        if (Color.alpha(iMultAlpha2) > 0) {
            paint.setColor(iMultAlpha2);
            canvas.drawPath(props.strokePathBottom, paint);
        }
    }

    @Override
    public final int getAlpha() {
        return this.alpha;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        Props props = this.boundProps;
        getOutline(outline, props.boundsWithPadding, props.radii);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        Props props = this.boundProps;
        int i = props.padding;
        rect.set(i, i, i, i);
        return props.hasPadding;
    }

    public abstract BlurredBackgroundSource getSource();

    public void onBoundPropsChanged() {
        dispatchSourceRelativePositionChange();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Props props = this.boundProps;
        props.bounds.set(rect);
        props.build();
        onBoundPropsChanged();
    }

    public void onSourceOffsetChange() {
        dispatchSourceRelativePositionChange();
    }

    public void onSourceRelativePositionChanged() {
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
    }

    public BlurredBackgroundDrawable setClipToOutline() {
        return this;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setColorProvider(BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        this.colorProvider = blurredBackgroundColorProvider;
        updateColors();
        if (blurredBackgroundColorProvider instanceof BlurredBackgroundProvider) {
            BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = (BlurredBackgroundProviderBuilder) ((BlurredBackgroundProvider) blurredBackgroundColorProvider);
            float f = blurredBackgroundProviderBuilder.strokeWidthTop;
            float f2 = blurredBackgroundProviderBuilder.strokeWidthBottom;
            Props props = this.boundProps;
            props.strokeWidthTop = f;
            props.strokeWidthBottom = f2;
            float f3 = blurredBackgroundProviderBuilder.shadowRadius;
            float f4 = blurredBackgroundProviderBuilder.shadowDy;
            this.shadowLayerRadius = f3;
            this.shadowLayerDy = f4;
        }
    }

    public final void setHasPadding() {
        this.boundProps.hasPadding = true;
    }

    public final void setPadding(int i) {
        Props props = this.boundProps;
        if (props.padding != i) {
            props.padding = i;
            props.build();
            onBoundPropsChanged();
        }
    }

    public final void setRadius(float f) {
        Props props = this.boundProps;
        Arrays.fill(props.radii, f);
        Arrays.fill(props.shaderRadii, f);
        props.build();
        onBoundPropsChanged();
    }

    public final void setRadius$1(float f, float f2, float f3, float f4) {
        Props props = this.boundProps;
        float[] fArr = props.radii;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
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

    public static void getOutline(Outline outline, Rect rect, float[] fArr) {
        if (FBool.radiiAreSame(fArr)) {
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

    public final void setRadius(float f, float f2, float f3, float f4) {
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

    public static void drawStroke(Canvas canvas, RectF rectF, float f, float f2, boolean z, Paint paint) {
        float f3 = rectF.left;
        float f4 = rectF.top;
        float f5 = rectF.right;
        float f6 = rectF.bottom;
        float f7 = f2 / 2.0f;
        canvas.save();
        if (z) {
            float f8 = f3 - f7;
            float f9 = f5 + f7;
            if (canvas.clipRect(f8, f4, f9, MathUtils.clamp((2.0f * f) + f4, f4, f6))) {
                canvas.drawRoundRect(f8, f4 + f7, f9, f6 + f7, f, f, paint);
            }
        } else {
            float f10 = f3 - f7;
            float f11 = f5 + f7;
            if (canvas.clipRect(f10, MathUtils.clamp(f6 - (2.0f * f), f4, f6), f11, f6)) {
                canvas.drawRoundRect(f10, f4 - f7, f11, f6 - f7, f, f, paint);
            }
        }
        canvas.restore();
    }
}
