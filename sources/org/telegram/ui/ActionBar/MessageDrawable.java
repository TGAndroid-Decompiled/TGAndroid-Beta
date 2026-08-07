package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import androidx.core.graphics.ColorUtils;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.blur3.utils.NinePatchBuilder;

public class MessageDrawable extends Drawable {
    public static MotionBackgroundDrawable[] motionBackground = new MotionBackgroundDrawable[3];
    private int alpha;
    private Drawable[][] backgroundDrawable;
    private int[][] backgroundDrawableColor;
    private Rect backupRect;
    private boolean botButtonsBottom;
    private Bitmap crosfadeFromBitmap;
    private Shader crosfadeFromBitmapShader;
    public MessageDrawable crossfadeFromDrawable;
    public float crossfadeProgress;
    private boolean currentAnimateGradient;
    private int[][] currentBackgroundDrawableRadius;
    private int currentBackgroundHeight;
    private int currentColor;
    private int currentGradientColor1;
    private int currentGradientColor2;
    private int currentGradientColor3;
    private int[] currentShadowDrawableRadius;
    private int currentType;
    private boolean drawFullBubble;
    private Shader gradientShader;
    private boolean isBottomNear;
    public boolean isCrossfadeBackground;
    private final boolean isOut;
    public boolean isSelected;
    private boolean isTopNear;
    public boolean lastDrawWithShadow;
    private Matrix matrix;
    private int overrideRoundRadius;
    private float overrideRounding;
    private Paint paint;
    private Path path;
    PathDrawParams pathDrawCacheParams;
    private RectF rect;
    private Theme.ResourcesProvider resourcesProvider;
    private Paint selectedPaint;
    private Drawable[] shadowDrawable;
    private Bitmap[] shadowDrawableBitmap;
    private int[] shadowDrawableColor;
    public boolean themePreview;
    private int topY;
    Drawable transitionDrawable;
    int transitionDrawableColor;

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setColorFilter(int i, PorterDuff.Mode mode) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public MessageDrawable(int i, boolean z, boolean z2) {
        this(i, z, z2, null);
    }

    public MessageDrawable(int i, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        this.paint = new Paint(1);
        this.rect = new RectF();
        this.matrix = new Matrix();
        this.backupRect = new Rect();
        this.currentShadowDrawableRadius = new int[]{-1, -1, -1, -1};
        this.shadowDrawableBitmap = new Bitmap[4];
        this.shadowDrawable = new Drawable[4];
        this.shadowDrawableColor = new int[]{-1, -1, -1, -1};
        this.currentBackgroundDrawableRadius = new int[][]{new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
        this.backgroundDrawable = (Drawable[][]) Array.newInstance((Class<?>) Drawable.class, 4, 4);
        this.backgroundDrawableColor = new int[][]{new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
        this.resourcesProvider = resourcesProvider;
        this.isOut = z;
        this.currentType = i;
        this.isSelected = z2;
        this.path = new Path();
        this.selectedPaint = new Paint(1);
        this.alpha = 255;
    }

    public boolean hasGradient() {
        return this.gradientShader != null && Theme.shouldDrawGradientIcons;
    }

    public void applyMatrixScale() {
        Bitmap bitmap;
        if (this.gradientShader instanceof BitmapShader) {
            if (this.isCrossfadeBackground && (bitmap = this.crosfadeFromBitmap) != null) {
                c = this.currentType == 2 ? (char) 1 : (char) 0;
                float fMin = 1.0f / Math.min(bitmap.getWidth() / motionBackground[c].getBounds().width(), this.crosfadeFromBitmap.getHeight() / motionBackground[c].getBounds().height());
                this.matrix.postScale(fMin, fMin);
                return;
            }
            if (this.themePreview) {
                c = 2;
            } else if (this.currentType == 2) {
                c = 1;
            }
            Bitmap bitmap2 = motionBackground[c].getBitmap();
            float fMin2 = 1.0f / Math.min(bitmap2.getWidth() / motionBackground[c].getBounds().width(), bitmap2.getHeight() / motionBackground[c].getBounds().height());
            this.matrix.postScale(fMin2, fMin2);
        }
    }

    public Shader getGradientShader() {
        return this.gradientShader;
    }

    public Matrix getMatrix() {
        return this.matrix;
    }

    protected int getColor(int i) {
        if (this.currentType == 2) {
            return Theme.getColor(i);
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            return resourcesProvider.getColor(i);
        }
        return Theme.getColor(i);
    }

    protected int getCurrentColor(int i) {
        if (this.currentType == 2) {
            return Theme.getColor(i);
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.getCurrentColor(i) : Theme.getCurrentColor(i);
    }

    public void setBotButtonsBottom(boolean z) {
        this.botButtonsBottom = z;
    }

    public void setTop(int i, int i2, int i3, boolean z, boolean z2) {
        setTop(i, i2, i3, i3, 0, 0, z, z2);
    }

    public void setTop(int r34, int r35, int r36, int r37, int r38, int r39, boolean r40, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.MessageDrawable.setTop(int, int, int, int, int, int, boolean, boolean):void");
    }

    public int getTopY() {
        return this.topY;
    }

    private int dp(float f) {
        if (this.currentType == 2) {
            return (int) Math.ceil(f * 3.0f);
        }
        return AndroidUtilities.dp(f);
    }

    public Paint getPaint() {
        return this.paint;
    }

    public Drawable[] getShadowDrawables() {
        return this.shadowDrawable;
    }

    public Drawable getBackgroundDrawable() {
        char c;
        int color;
        int i;
        int iDp = this.overrideRoundRadius;
        if (iDp == 0) {
            iDp = this.overrideRounding > 0.0f ? 0 : dp(SharedConfig.bubbleRadius);
        }
        boolean z = this.isTopNear;
        char c2 = 3;
        if (z && this.isBottomNear) {
            c = 3;
        } else if (z) {
            c = 2;
        } else {
            c = this.isBottomNear ? (char) 1 : (char) 0;
        }
        boolean z2 = this.isSelected;
        if (!z2 || !this.botButtonsBottom) {
            if (z2) {
                c2 = 1;
            } else {
                c2 = this.botButtonsBottom ? (char) 2 : (char) 0;
            }
        }
        if (z2) {
            color = getColor(this.isOut ? Theme.key_chat_outBubbleSelected : Theme.key_chat_inBubbleSelected);
        } else {
            color = getColor(this.isOut ? Theme.key_chat_outBubble : Theme.key_chat_inBubble);
        }
        boolean z3 = (this.gradientShader != null || this.isSelected || this.isCrossfadeBackground) ? false : true;
        int color2 = getColor(this.isOut ? Theme.key_chat_outBubbleShadow : Theme.key_chat_inBubbleShadow);
        if (this.lastDrawWithShadow != z3 || this.currentBackgroundDrawableRadius[c2][c] != iDp || ((z3 && this.shadowDrawableColor[c] != color2) || this.backgroundDrawableColor[c2][c] != color)) {
            this.currentBackgroundDrawableRadius[c2][c] = iDp;
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dp(50.0f), dp(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                this.backupRect.set(getBounds());
                if (z3) {
                    this.shadowDrawableColor[c] = color2;
                    Paint paint = new Paint(1);
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, dp(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (AndroidUtilities.density > 1.0f) {
                        setBounds(-1, -1, bitmapCreateBitmap.getWidth() + 1, bitmapCreateBitmap.getHeight() + 1);
                        i = 0;
                    } else {
                        i = 0;
                        setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                    }
                    draw(canvas, paint);
                    if (AndroidUtilities.density > 1.0f) {
                        paint.setColor(i);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                        draw(canvas, paint);
                    }
                }
                Paint paint2 = new Paint(1);
                paint2.setColor(color);
                setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                draw(canvas, paint2);
                this.backgroundDrawable[c2][c] = new NinePatchDrawable(bitmapCreateBitmap, getByteBuffer((bitmapCreateBitmap.getWidth() / 2) - 1, (bitmapCreateBitmap.getWidth() / 2) + 1, (bitmapCreateBitmap.getHeight() / 2) - 1, (bitmapCreateBitmap.getHeight() / 2) + 1, color).array(), new Rect(), null);
                setBounds(this.backupRect);
            } catch (Throwable unused) {
            }
        }
        this.lastDrawWithShadow = z3;
        this.backgroundDrawableColor[c2][c] = color;
        return this.backgroundDrawable[c2][c];
    }

    public Drawable getTransitionDrawable(int i) {
        if (this.transitionDrawable == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dp(50.0f), dp(40.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            this.backupRect.set(getBounds());
            Paint paint = new Paint(1);
            paint.setColor(-1);
            setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            draw(canvas, paint);
            this.transitionDrawable = new NinePatchDrawable(bitmapCreateBitmap, getByteBuffer((bitmapCreateBitmap.getWidth() / 2) - 1, (bitmapCreateBitmap.getWidth() / 2) + 1, (bitmapCreateBitmap.getHeight() / 2) - 1, (bitmapCreateBitmap.getHeight() / 2) + 1, -1).array(), new Rect(), null);
            setBounds(this.backupRect);
        }
        if (this.transitionDrawableColor != i) {
            this.transitionDrawableColor = i;
            this.transitionDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }
        return this.transitionDrawable;
    }

    public MotionBackgroundDrawable getMotionBackgroundDrawable() {
        if (this.themePreview) {
            return motionBackground[2];
        }
        return motionBackground[this.currentType == 2 ? (char) 1 : (char) 0];
    }

    public Drawable getShadowDrawable() {
        char c;
        int i;
        if (this.isCrossfadeBackground) {
            return null;
        }
        if (this.gradientShader == null && !this.isSelected && this.crossfadeFromDrawable == null) {
            return null;
        }
        int iDp = dp(SharedConfig.bubbleRadius);
        boolean z = this.isTopNear;
        boolean z2 = false;
        if (z && this.isBottomNear) {
            c = 3;
        } else if (z) {
            c = 2;
        } else {
            c = this.isBottomNear ? (char) 1 : (char) 0;
        }
        int[] iArr = this.currentShadowDrawableRadius;
        if (iArr[c] != iDp) {
            iArr[c] = iDp;
            Bitmap bitmap = this.shadowDrawableBitmap[c];
            if (bitmap != null) {
                bitmap.recycle();
            }
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dp(50.0f), dp(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint(1);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, dp(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                if (AndroidUtilities.density > 1.0f) {
                    setBounds(-1, -1, bitmapCreateBitmap.getWidth() + 1, bitmapCreateBitmap.getHeight() + 1);
                } else {
                    setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                }
                draw(canvas, paint);
                if (AndroidUtilities.density > 1.0f) {
                    paint.setColor(0);
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                    draw(canvas, paint);
                    i = 0;
                } else {
                    i = 1;
                }
                this.shadowDrawableBitmap[c] = bitmapCreateBitmap;
                this.shadowDrawable[c] = new NinePatchDrawable(bitmapCreateBitmap, getByteBuffer((bitmapCreateBitmap.getWidth() / 2) - 1, (bitmapCreateBitmap.getWidth() / 2) + 1, (bitmapCreateBitmap.getHeight() / 2) - 1, (bitmapCreateBitmap.getHeight() / 2) + 1, i).array(), new Rect(), null);
                z2 = true;
            } catch (Throwable unused) {
            }
        }
        int color = getColor(this.isOut ? Theme.key_chat_outBubbleShadow : Theme.key_chat_inBubbleShadow);
        Drawable drawable = this.shadowDrawable[c];
        if (drawable != null && (this.shadowDrawableColor[c] != color || z2)) {
            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
            this.shadowDrawableColor[c] = color;
        }
        return this.shadowDrawable[c];
    }

    protected void finalize() throws Throwable {
        super.finalize();
        for (Bitmap bitmap : this.shadowDrawableBitmap) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(this.shadowDrawableBitmap, (Object) null);
        Arrays.fill(this.shadowDrawable, (Object) null);
        Arrays.fill(this.currentShadowDrawableRadius, -1);
    }

    private static ByteBuffer getByteBuffer(int i, int i2, int i3, int i4, int i5) {
        return NinePatchBuilder.createNinePatchChunk(i, i2, i3, i4, 0, 0, 0, 0, i5);
    }

    public void drawCached(Canvas canvas, PathDrawParams pathDrawParams, Paint paint) {
        this.pathDrawCacheParams = pathDrawParams;
        MessageDrawable messageDrawable = this.crossfadeFromDrawable;
        if (messageDrawable != null) {
            messageDrawable.pathDrawCacheParams = pathDrawParams;
        }
        draw(canvas, paint);
        this.pathDrawCacheParams = null;
        MessageDrawable messageDrawable2 = this.crossfadeFromDrawable;
        if (messageDrawable2 != null) {
            messageDrawable2.pathDrawCacheParams = null;
        }
    }

    public void drawCached(Canvas canvas, PathDrawParams pathDrawParams) {
        drawCached(canvas, pathDrawParams, null);
    }

    @Override
    public void draw(Canvas canvas) {
        MessageDrawable messageDrawable = this.crossfadeFromDrawable;
        if (messageDrawable != null) {
            messageDrawable.draw(canvas);
            setAlpha((int) (this.crossfadeProgress * 255.0f));
            draw(canvas, null);
            setAlpha(255);
            return;
        }
        draw(canvas, null);
    }

    public void draw(Canvas canvas, Paint paint) {
        int iDp;
        int iDp2;
        int i;
        int i2;
        Path path;
        boolean zInvalidatePath;
        Drawable backgroundDrawable;
        Rect bounds = getBounds();
        if (paint == null && this.gradientShader == null && this.overrideRoundRadius == 0 && this.overrideRounding <= 0.0f && (backgroundDrawable = getBackgroundDrawable()) != null) {
            backgroundDrawable.setBounds(bounds);
            backgroundDrawable.draw(canvas);
            return;
        }
        int iDp3 = dp(2.0f);
        int i3 = this.overrideRoundRadius;
        if (i3 != 0) {
            i2 = i3;
            i = i2;
        } else {
            if (this.overrideRounding > 0.0f) {
                iDp = AndroidUtilities.lerp(dp(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.overrideRounding);
                iDp2 = AndroidUtilities.lerp(dp(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.overrideRounding);
            } else if (this.currentType == 2) {
                iDp = dp(6.0f);
                iDp2 = dp(6.0f);
            } else {
                iDp = dp(SharedConfig.bubbleRadius);
                iDp2 = dp(Math.min(6, SharedConfig.bubbleRadius));
            }
            i = iDp2;
            i2 = iDp;
        }
        int iDp4 = dp(6.0f);
        Paint paint2 = paint == null ? this.paint : paint;
        if (paint == null && this.gradientShader != null) {
            this.matrix.reset();
            applyMatrixScale();
            this.matrix.postTranslate(0.0f, -this.topY);
            this.gradientShader.setLocalMatrix(this.matrix);
        }
        int iMax = Math.max(bounds.top, 0);
        if (this.pathDrawCacheParams != null) {
            bounds.height();
        }
        PathDrawParams pathDrawParams = this.pathDrawCacheParams;
        if (pathDrawParams != null) {
            path = pathDrawParams.path;
            zInvalidatePath = pathDrawParams.invalidatePath(bounds, true, true);
        } else {
            path = this.path;
            zInvalidatePath = true;
        }
        if (zInvalidatePath || this.overrideRoundRadius != 0) {
            generatePath(path, bounds, iDp3, i2, iDp4, i, iMax, true, true, paint != null);
        }
        canvas.drawPath(path, paint2);
        if (this.gradientShader != null && this.isSelected && paint == null) {
            this.selectedPaint.setColor(ColorUtils.setAlphaComponent(getColor(Theme.key_chat_outBubbleGradientSelectedOverlay), (int) ((Color.alpha(r0) * this.alpha) / 255.0f)));
            canvas.drawPath(path, this.selectedPaint);
        }
    }

    public Path makePath() {
        return makePath(this.pathDrawCacheParams);
    }

    public android.graphics.Path makePath(org.telegram.ui.ActionBar.MessageDrawable.PathDrawParams r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.MessageDrawable.makePath(org.telegram.ui.ActionBar.MessageDrawable$PathDrawParams):android.graphics.Path");
    }

    private void generatePath(Path path, Rect rect, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        path.rewind();
        int iHeight = (rect.height() - i) >> 1;
        int i6 = i2;
        if (i6 > iHeight) {
            i6 = iHeight;
        }
        if (this.isOut) {
            if (this.drawFullBubble || this.currentType == 2 || z3 || z) {
                int i7 = this.botButtonsBottom ? i4 : i6;
                if (this.currentType == 1) {
                    path.moveTo((rect.right - dp(8.0f)) - i7, rect.bottom - i);
                } else {
                    path.moveTo(rect.right - dp(2.6f), rect.bottom - i);
                }
                path.lineTo(rect.left + i + i7, rect.bottom - i);
                int i8 = i7 * 2;
                this.rect.set(rect.left + i, r10 - i8, r11 + i8, rect.bottom - i);
                path.arcTo(this.rect, 90.0f, 90.0f, false);
            } else {
                path.moveTo(rect.right - dp(8.0f), (i5 - this.topY) + this.currentBackgroundHeight);
                path.lineTo(rect.left + i, (i5 - this.topY) + this.currentBackgroundHeight);
            }
            if (this.drawFullBubble || this.currentType == 2 || z3 || z2) {
                path.lineTo(rect.left + i, rect.top + i + i6);
                int i9 = i6 * 2;
                this.rect.set(rect.left + i, rect.top + i, r9 + i9, r11 + i9);
                path.arcTo(this.rect, 180.0f, 90.0f, false);
                int i10 = this.isTopNear ? i4 : i6;
                if (this.currentType == 1) {
                    path.lineTo((rect.right - i) - i10, rect.top + i);
                    RectF rectF = this.rect;
                    int i11 = rect.right - i;
                    int i12 = i10 * 2;
                    rectF.set(i11 - i12, rect.top + i, i11, r12 + i12);
                } else {
                    path.lineTo((rect.right - dp(8.0f)) - i10, rect.top + i);
                    int i13 = i10 * 2;
                    this.rect.set((rect.right - dp(8.0f)) - i13, rect.top + i, rect.right - dp(8.0f), rect.top + i + i13);
                }
                path.arcTo(this.rect, 270.0f, 90.0f, false);
            } else {
                path.lineTo(rect.left + i, (i5 - this.topY) - dp(2.0f));
                if (this.currentType == 1) {
                    path.lineTo(rect.right - i, (i5 - this.topY) - dp(2.0f));
                } else {
                    path.lineTo(rect.right - dp(8.0f), (i5 - this.topY) - dp(2.0f));
                }
            }
            int i14 = this.currentType;
            if (i14 == 1) {
                if (z3 || z) {
                    if (this.isBottomNear) {
                        i6 = i4;
                    }
                    path.lineTo(rect.right - i, (rect.bottom - i) - i6);
                    int i15 = i6 * 2;
                    this.rect.set(r4 - i15, r2 - i15, rect.right - i, rect.bottom - i);
                    path.arcTo(this.rect, 0.0f, 90.0f, false);
                } else {
                    path.lineTo(rect.right - i, (i5 - this.topY) + this.currentBackgroundHeight);
                }
            } else if (this.drawFullBubble || i14 == 2 || z3 || z) {
                path.lineTo(rect.right - dp(8.0f), ((rect.bottom - i) - i3) - dp(3.0f));
                int i16 = i3 * 2;
                this.rect.set(rect.right - dp(8.0f), ((rect.bottom - i) - i16) - dp(9.0f), (rect.right - dp(7.0f)) + i16, (rect.bottom - i) - dp(1.0f));
                path.arcTo(this.rect, 180.0f, -83.0f, false);
            } else {
                path.lineTo(rect.right - dp(8.0f), (i5 - this.topY) + this.currentBackgroundHeight);
            }
        } else {
            if (this.drawFullBubble || this.currentType == 2 || z3 || z) {
                int i17 = this.botButtonsBottom ? i4 : i6;
                if (this.currentType == 1) {
                    path.moveTo(rect.left + dp(8.0f) + i17, rect.bottom - i);
                } else {
                    path.moveTo(rect.left + dp(2.6f), rect.bottom - i);
                }
                path.lineTo((rect.right - i) - i17, rect.bottom - i);
                int i18 = i17 * 2;
                this.rect.set(r11 - i18, r13 - i18, rect.right - i, rect.bottom - i);
                path.arcTo(this.rect, 90.0f, -90.0f, false);
            } else {
                path.moveTo(rect.left + dp(8.0f), (i5 - this.topY) + this.currentBackgroundHeight);
                path.lineTo(rect.right - i, (i5 - this.topY) + this.currentBackgroundHeight);
            }
            if (this.drawFullBubble || this.currentType == 2 || z3 || z2) {
                path.lineTo(rect.right - i, rect.top + i + i6);
                RectF rectF2 = this.rect;
                int i19 = rect.right - i;
                int i20 = i6 * 2;
                rectF2.set(i19 - i20, rect.top + i, i19, r13 + i20);
                path.arcTo(this.rect, 0.0f, -90.0f, false);
                int i21 = this.isTopNear ? i4 : i6;
                if (this.currentType == 1) {
                    path.lineTo(rect.left + i + i21, rect.top + i);
                    int i22 = i21 * 2;
                    this.rect.set(rect.left + i, rect.top + i, r11 + i22, r13 + i22);
                } else {
                    path.lineTo(rect.left + dp(8.0f) + i21, rect.top + i);
                    int i23 = i21 * 2;
                    this.rect.set(rect.left + dp(8.0f), rect.top + i, rect.left + dp(8.0f) + i23, rect.top + i + i23);
                }
                path.arcTo(this.rect, 270.0f, -90.0f, false);
            } else {
                path.lineTo(rect.right - i, (i5 - this.topY) - dp(2.0f));
                if (this.currentType == 1) {
                    path.lineTo(rect.left + i, (i5 - this.topY) - dp(2.0f));
                } else {
                    path.lineTo(rect.left + dp(8.0f), (i5 - this.topY) - dp(2.0f));
                }
            }
            int i24 = this.currentType;
            if (i24 == 1) {
                if (z3 || z) {
                    if (this.isBottomNear || this.botButtonsBottom) {
                        i6 = i4;
                    }
                    path.lineTo(rect.left + i, (rect.bottom - i) - i6);
                    int i25 = i6 * 2;
                    this.rect.set(rect.left + i, r2 - i25, r4 + i25, rect.bottom - i);
                    path.arcTo(this.rect, 180.0f, -90.0f, false);
                } else {
                    path.lineTo(rect.left + i, (i5 - this.topY) + this.currentBackgroundHeight);
                }
            } else if (this.drawFullBubble || i24 == 2 || z3 || z) {
                path.lineTo(rect.left + dp(8.0f), ((rect.bottom - i) - i3) - dp(3.0f));
                int i26 = i3 * 2;
                this.rect.set((rect.left + dp(7.0f)) - i26, ((rect.bottom - i) - i26) - dp(9.0f), rect.left + dp(8.0f), (rect.bottom - i) - dp(1.0f));
                path.arcTo(this.rect, 0.0f, 83.0f, false);
            } else {
                path.lineTo(rect.left + dp(8.0f), (i5 - this.topY) + this.currentBackgroundHeight);
            }
        }
        path.close();
    }

    public void setDrawFullBubble(boolean z) {
        this.drawFullBubble = z;
    }

    @Override
    public void setAlpha(int i) {
        if (this.alpha != i || this.paint.getAlpha() != i) {
            this.alpha = i;
            this.paint.setAlpha(i);
            if (this.isOut) {
                this.selectedPaint.setAlpha((int) (Color.alpha(getColor(Theme.key_chat_outBubbleGradientSelectedOverlay)) * (i / 255.0f)));
            }
        }
        if (this.gradientShader == null) {
            Drawable backgroundDrawable = getBackgroundDrawable();
            if (backgroundDrawable.getAlpha() != i) {
                backgroundDrawable.setAlpha(i);
            }
        }
    }

    @Override
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        MessageDrawable messageDrawable = this.crossfadeFromDrawable;
        if (messageDrawable != null) {
            messageDrawable.setBounds(i, i2, i3, i4);
        }
    }

    public void setRoundRadius(int i) {
        this.overrideRoundRadius = i;
    }

    public void setRoundingRadius(float f) {
        this.overrideRounding = f;
    }

    public void setResourceProvider(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    public static class PathDrawParams {
        boolean lastDrawFullBottom;
        boolean lastDrawFullTop;
        Path path = new Path();
        Rect lastRect = new Rect();

        public boolean invalidatePath(android.graphics.Rect r4, boolean r5, boolean r6) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.MessageDrawable.PathDrawParams.invalidatePath(android.graphics.Rect, boolean, boolean):boolean");
        }

        public Path getPath() {
            return this.path;
        }
    }
}
