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
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.blur3.utils.NinePatchBuilder;

public class MessageDrawable extends Drawable {
    public static final int TYPE_MEDIA = 1;
    public static final int TYPE_PREVIEW = 2;
    public static final int TYPE_TEXT = 0;
    public static MotionBackgroundDrawable[] motionBackground = new MotionBackgroundDrawable[3];
    private boolean botButtonsBottom;
    private Bitmap crosfadeFromBitmap;
    private Shader crosfadeFromBitmapShader;
    public MessageDrawable crossfadeFromDrawable;
    public float crossfadeProgress;
    private boolean currentAnimateGradient;
    private int currentBackgroundHeight;
    private int currentColor;
    private int currentGradientColor1;
    private int currentGradientColor2;
    private int currentGradientColor3;
    private int currentType;
    private boolean drawFullBubble;
    public boolean forceInvalidatePath;
    private Shader gradientShader;
    private boolean isBottomNear;
    public boolean isCrossfadeBackground;
    private final boolean isOut;
    public boolean isSelected;
    private boolean isTopNear;
    public boolean lastDrawWithShadow;
    private int overrideRoundRadius;
    private float overrideRounding;
    PathDrawParams pathDrawCacheParams;
    private Theme.ResourcesProvider resourcesProvider;
    public boolean themePreview;
    private int topY;
    Drawable transitionDrawable;
    int transitionDrawableColor;
    private Paint paint = new Paint(1);
    private RectF rect = new RectF();
    private Matrix matrix = new Matrix();
    private Rect backupRect = new Rect();
    private int[] currentShadowDrawableRadius = {-1, -1, -1, -1};
    private Bitmap[] shadowDrawableBitmap = new Bitmap[4];
    private Drawable[] shadowDrawable = new Drawable[4];
    private int[] shadowDrawableColor = {-1, -1, -1, -1};
    private int[][] currentBackgroundDrawableRadius = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    private Drawable[][] backgroundDrawable = (Drawable[][]) Array.newInstance((Class<?>) Drawable.class, 4, 4);
    private int[][] backgroundDrawableColor = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    private Path path = new Path();
    private Paint selectedPaint = new Paint(1);
    private int alpha = 255;

    public final class PathDrawParams {
        public boolean lastDrawFullBottom;
        public boolean lastDrawFullTop;
        public final Path path = new Path();
        public final Rect lastRect = new Rect();

        public final boolean invalidatePath(Rect rect, boolean z, boolean z2) {
            Rect rect2 = this.lastRect;
            boolean z3 = (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.lastDrawFullTop == z2 && this.lastDrawFullBottom == z && z2 && z) ? false : true;
            this.lastDrawFullTop = z2;
            this.lastDrawFullBottom = z;
            rect2.set(rect);
            return z3;
        }
    }

    public MessageDrawable(int i, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.isOut = z;
        this.currentType = i;
        this.isSelected = z2;
    }

    public void applyMatrixScale() {
        Bitmap bitmap;
        if (this.gradientShader instanceof BitmapShader) {
            char c = 0;
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

    public final int dp(float f) {
        return this.currentType == 2 ? (int) Math.ceil(f * 3.0f) : AndroidUtilities.dp(f);
    }

    @Override
    public void draw(Canvas canvas) {
        MessageDrawable messageDrawable = this.crossfadeFromDrawable;
        if (messageDrawable == null) {
            draw(canvas, null);
            return;
        }
        messageDrawable.draw(canvas);
        setAlpha((int) (this.crossfadeProgress * 255.0f));
        draw(canvas, null);
        setAlpha(255);
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

    public void finalize() throws Throwable {
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

    public final void generatePath(Path path, Rect rect, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
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
                RectF rectF = this.rect;
                int i8 = rect.left + i;
                int i9 = rect.bottom - i;
                int i10 = i7 * 2;
                rectF.set(i8, i9 - i10, i8 + i10, i9);
                path.arcTo(this.rect, 90.0f, 90.0f, false);
            } else {
                path.moveTo(rect.right - dp(8.0f), (i5 - this.topY) + this.currentBackgroundHeight);
                path.lineTo(rect.left + i, (i5 - this.topY) + this.currentBackgroundHeight);
            }
            if (this.drawFullBubble || this.currentType == 2 || z3 || z2) {
                path.lineTo(rect.left + i, rect.top + i + i6);
                RectF rectF2 = this.rect;
                int i11 = rect.left + i;
                int i12 = rect.top + i;
                int i13 = i6 * 2;
                rectF2.set(i11, i12, i11 + i13, i12 + i13);
                path.arcTo(this.rect, 180.0f, 90.0f, false);
                int i14 = this.isTopNear ? i4 : i6;
                if (this.currentType == 1) {
                    path.lineTo((rect.right - i) - i14, rect.top + i);
                    RectF rectF3 = this.rect;
                    int i15 = rect.right - i;
                    int i16 = i14 * 2;
                    int i17 = rect.top + i;
                    rectF3.set(i15 - i16, i17, i15, i17 + i16);
                } else {
                    path.lineTo((rect.right - dp(8.0f)) - i14, rect.top + i);
                    int i18 = i14 * 2;
                    this.rect.set((rect.right - dp(8.0f)) - i18, rect.top + i, rect.right - dp(8.0f), rect.top + i + i18);
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
            int i19 = this.currentType;
            if (i19 == 1) {
                if (z3 || z) {
                    if (this.isBottomNear) {
                        i6 = i4;
                    }
                    path.lineTo(rect.right - i, (rect.bottom - i) - i6);
                    RectF rectF4 = this.rect;
                    int i20 = rect.right - i;
                    int i21 = i6 * 2;
                    int i22 = rect.bottom - i;
                    rectF4.set(i20 - i21, i22 - i21, i20, i22);
                    path.arcTo(this.rect, 0.0f, 90.0f, false);
                } else {
                    path.lineTo(rect.right - i, (i5 - this.topY) + this.currentBackgroundHeight);
                }
            } else if (this.drawFullBubble || i19 == 2 || z3 || z) {
                path.lineTo(rect.right - dp(8.0f), ((rect.bottom - i) - i3) - dp(3.0f));
                int i23 = i3 * 2;
                this.rect.set(rect.right - dp(8.0f), ((rect.bottom - i) - i23) - dp(9.0f), (rect.right - dp(7.0f)) + i23, (rect.bottom - i) - dp(1.0f));
                path.arcTo(this.rect, 180.0f, -83.0f, false);
            } else {
                path.lineTo(rect.right - dp(8.0f), (i5 - this.topY) + this.currentBackgroundHeight);
            }
        } else {
            if (this.drawFullBubble || this.currentType == 2 || z3 || z) {
                int i24 = this.botButtonsBottom ? i4 : i6;
                if (this.currentType == 1) {
                    path.moveTo(dp(8.0f) + rect.left + i24, rect.bottom - i);
                } else {
                    path.moveTo(dp(2.6f) + rect.left, rect.bottom - i);
                }
                path.lineTo((rect.right - i) - i24, rect.bottom - i);
                RectF rectF5 = this.rect;
                int i25 = rect.right - i;
                int i26 = i24 * 2;
                int i27 = rect.bottom - i;
                rectF5.set(i25 - i26, i27 - i26, i25, i27);
                path.arcTo(this.rect, 90.0f, -90.0f, false);
            } else {
                path.moveTo(dp(8.0f) + rect.left, (i5 - this.topY) + this.currentBackgroundHeight);
                path.lineTo(rect.right - i, (i5 - this.topY) + this.currentBackgroundHeight);
            }
            if (this.drawFullBubble || this.currentType == 2 || z3 || z2) {
                path.lineTo(rect.right - i, rect.top + i + i6);
                RectF rectF6 = this.rect;
                int i28 = rect.right - i;
                int i29 = i6 * 2;
                int i30 = rect.top + i;
                rectF6.set(i28 - i29, i30, i28, i30 + i29);
                path.arcTo(this.rect, 0.0f, -90.0f, false);
                int i31 = this.isTopNear ? i4 : i6;
                if (this.currentType == 1) {
                    path.lineTo(rect.left + i + i31, rect.top + i);
                    RectF rectF7 = this.rect;
                    int i32 = rect.left + i;
                    int i33 = rect.top + i;
                    int i34 = i31 * 2;
                    rectF7.set(i32, i33, i32 + i34, i33 + i34);
                } else {
                    path.lineTo(dp(8.0f) + rect.left + i31, rect.top + i);
                    int i35 = i31 * 2;
                    this.rect.set(dp(8.0f) + rect.left, rect.top + i, dp(8.0f) + rect.left + i35, rect.top + i + i35);
                }
                path.arcTo(this.rect, 270.0f, -90.0f, false);
            } else {
                path.lineTo(rect.right - i, (i5 - this.topY) - dp(2.0f));
                if (this.currentType == 1) {
                    path.lineTo(rect.left + i, (i5 - this.topY) - dp(2.0f));
                } else {
                    path.lineTo(dp(8.0f) + rect.left, (i5 - this.topY) - dp(2.0f));
                }
            }
            int i36 = this.currentType;
            if (i36 == 1) {
                if (z3 || z) {
                    if (this.isBottomNear || this.botButtonsBottom) {
                        i6 = i4;
                    }
                    path.lineTo(rect.left + i, (rect.bottom - i) - i6);
                    RectF rectF8 = this.rect;
                    int i37 = rect.left + i;
                    int i38 = rect.bottom - i;
                    int i39 = i6 * 2;
                    rectF8.set(i37, i38 - i39, i37 + i39, i38);
                    path.arcTo(this.rect, 180.0f, -90.0f, false);
                } else {
                    path.lineTo(rect.left + i, (i5 - this.topY) + this.currentBackgroundHeight);
                }
            } else if (this.drawFullBubble || i36 == 2 || z3 || z) {
                path.lineTo(dp(8.0f) + rect.left, ((rect.bottom - i) - i3) - dp(3.0f));
                int i40 = i3 * 2;
                this.rect.set((dp(7.0f) + rect.left) - i40, ((rect.bottom - i) - i40) - dp(9.0f), dp(8.0f) + rect.left, (rect.bottom - i) - dp(1.0f));
                path.arcTo(this.rect, 0.0f, 83.0f, false);
            } else {
                path.lineTo(dp(8.0f) + rect.left, (i5 - this.topY) + this.currentBackgroundHeight);
            }
        }
        path.close();
    }

    public Drawable getBackgroundDrawable() {
        char c;
        int color;
        int i;
        boolean z;
        int iDp = this.overrideRoundRadius;
        if (iDp == 0) {
            iDp = this.overrideRounding > 0.0f ? 0 : dp(SharedConfig.bubbleRadius);
        }
        boolean z2 = this.isTopNear;
        char c2 = 3;
        if (z2 && this.isBottomNear) {
            c = 3;
        } else if (z2) {
            c = 2;
        } else {
            c = this.isBottomNear ? (char) 1 : (char) 0;
        }
        boolean z3 = this.isSelected;
        if (!z3 || !this.botButtonsBottom) {
            if (z3) {
                c2 = 1;
            } else {
                c2 = this.botButtonsBottom ? (char) 2 : (char) 0;
            }
        }
        if (z3) {
            color = getColor(this.isOut ? Theme.key_chat_outBubbleSelected : Theme.key_chat_inBubbleSelected);
        } else {
            color = getColor(this.isOut ? Theme.key_chat_outBubble : Theme.key_chat_inBubble);
        }
        boolean z4 = (this.gradientShader != null || this.isSelected || this.isCrossfadeBackground) ? false : true;
        int color2 = getColor(this.isOut ? Theme.key_chat_outBubbleShadow : Theme.key_chat_inBubbleShadow);
        if (this.lastDrawWithShadow == z4 && this.currentBackgroundDrawableRadius[c2][c] == iDp && ((!z4 || this.shadowDrawableColor[c] == color2) && this.backgroundDrawableColor[c2][c] == color)) {
            i = color;
            z = z4;
        } else {
            this.currentBackgroundDrawableRadius[c2][c] = iDp;
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dp(50.0f), dp(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                this.backupRect.set(getBounds());
                if (z4) {
                    this.shadowDrawableColor[c] = color2;
                    Paint paint = new Paint(1);
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, dp(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.MULTIPLY));
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
                    }
                }
                Paint paint2 = new Paint(1);
                paint2.setColor(color);
                setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                draw(canvas, paint2);
                i = color;
                z = z4;
                try {
                    this.backgroundDrawable[c2][c] = new NinePatchDrawable(bitmapCreateBitmap, NinePatchBuilder.createNinePatchChunk((bitmapCreateBitmap.getWidth() / 2) - 1, (bitmapCreateBitmap.getWidth() / 2) + 1, (bitmapCreateBitmap.getHeight() / 2) - 1, (bitmapCreateBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i).array(), new Rect(), null);
                    setBounds(this.backupRect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                i = color;
                z = z4;
            }
        }
        this.lastDrawWithShadow = z;
        this.backgroundDrawableColor[c2][c] = i;
        return this.backgroundDrawable[c2][c];
    }

    public int getColor(int i) {
        if (this.currentType == 2) {
            return Theme.getColor(null, i, false);
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.getColor(i) : Theme.getColor(null, i, false);
    }

    public int getCurrentColor(int i) {
        if (this.currentType == 2) {
            return Theme.getColor(null, i, false);
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.getCurrentColor(i) : Theme.currentColors.get(i);
    }

    public Shader getGradientShader() {
        return this.gradientShader;
    }

    public Matrix getMatrix() {
        return this.matrix;
    }

    public MotionBackgroundDrawable getMotionBackgroundDrawable() {
        if (this.themePreview) {
            return motionBackground[2];
        }
        return motionBackground[this.currentType == 2 ? (char) 1 : (char) 0];
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    public Paint getPaint() {
        return this.paint;
    }

    public Path getPath() {
        return this.path;
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
                this.shadowDrawable[c] = new NinePatchDrawable(bitmapCreateBitmap, NinePatchBuilder.createNinePatchChunk((bitmapCreateBitmap.getWidth() / 2) - 1, (bitmapCreateBitmap.getWidth() / 2) + 1, (bitmapCreateBitmap.getHeight() / 2) - 1, (bitmapCreateBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i).array(), new Rect(), null);
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

    public Drawable[] getShadowDrawables() {
        return this.shadowDrawable;
    }

    public int getTopY() {
        return this.topY;
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
            this.transitionDrawable = new NinePatchDrawable(bitmapCreateBitmap, NinePatchBuilder.createNinePatchChunk((bitmapCreateBitmap.getWidth() / 2) - 1, (bitmapCreateBitmap.getWidth() / 2) + 1, (bitmapCreateBitmap.getHeight() / 2) - 1, (bitmapCreateBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
            setBounds(this.backupRect);
        }
        if (this.transitionDrawableColor != i) {
            this.transitionDrawableColor = i;
            this.transitionDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }
        return this.transitionDrawable;
    }

    public boolean hasGradient() {
        return this.gradientShader != null && Theme.shouldDrawGradientIcons;
    }

    public Path makePath() {
        return makePath(this.pathDrawCacheParams);
    }

    @Override
    public void setAlpha(int i) {
        if (this.alpha != i || this.paint.getAlpha() != i) {
            this.alpha = i;
            this.paint.setAlpha(i);
            if (this.isOut) {
                this.selectedPaint.setAlpha((int) ((i / 255.0f) * Color.alpha(getColor(Theme.key_chat_outBubbleGradientSelectedOverlay))));
            }
        }
        if (this.gradientShader == null) {
            Drawable backgroundDrawable = getBackgroundDrawable();
            if (backgroundDrawable.getAlpha() != i) {
                backgroundDrawable.setAlpha(i);
            }
        }
    }

    public void setBotButtonsBottom(boolean z) {
        this.botButtonsBottom = z;
    }

    @Override
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        MessageDrawable messageDrawable = this.crossfadeFromDrawable;
        if (messageDrawable != null) {
            messageDrawable.setBounds(i, i2, i3, i4);
        }
    }

    @Override
    public void setColorFilter(int i, PorterDuff.Mode mode) {
    }

    public void setDrawFullBubble(boolean z) {
        this.drawFullBubble = z;
    }

    public void setResourceProvider(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    public void setRoundRadius(int i) {
        this.overrideRoundRadius = i;
    }

    public void setRoundingRadius(float f) {
        this.overrideRounding = f;
    }

    public void setTop(int i, int i2, int i3, boolean z, boolean z2) {
        setTop(i, i2, i3, i3, 0, 0, z, z2);
    }

    public void setTopBottomNear(boolean z, boolean z2) {
        this.isTopNear = z;
        this.isBottomNear = z2;
    }

    public Path makePath(PathDrawParams pathDrawParams) {
        int iDp;
        int iDp2;
        int i;
        int i2;
        boolean z;
        boolean z2;
        Path path;
        Rect bounds = getBounds();
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
        int iMax = Math.max(bounds.top, 0);
        boolean zInvalidatePath = true;
        if (pathDrawParams == null || bounds.height() >= this.currentBackgroundHeight) {
            z = this.currentType != 1 ? (this.topY + bounds.bottom) - i2 < this.currentBackgroundHeight : (this.topY + bounds.bottom) - (iDp4 * 2) < this.currentBackgroundHeight;
            if ((i2 * 2) + this.topY < 0) {
                z2 = false;
            }
            if (pathDrawParams != null) {
                path = pathDrawParams.path;
                zInvalidatePath = pathDrawParams.invalidatePath(bounds, z, z2);
            } else {
                path = this.path;
            }
            if (zInvalidatePath && this.overrideRoundRadius == 0) {
                return path;
            }
            generatePath(path, bounds, iDp3, i2, iDp4, i, iMax, z, z2, true);
            return path;
        }
        z = true;
        z2 = true;
        if (pathDrawParams != null) {
            path = pathDrawParams.path;
            zInvalidatePath = pathDrawParams.invalidatePath(bounds, z, z2);
        } else {
            path = this.path;
        }
        if (zInvalidatePath) {
        }
        generatePath(path, bounds, iDp3, i2, iDp4, i, iMax, z, z2, true);
        return path;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setTop(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        int i7;
        int i8;
        int color;
        boolean z3;
        int i9;
        int i10;
        int i11;
        char c;
        MotionBackgroundDrawable motionBackgroundDrawable;
        MessageDrawable messageDrawable = this.crossfadeFromDrawable;
        if (messageDrawable != null) {
            i7 = i3;
            i8 = i5;
            messageDrawable.setTop(i, i2, i7, i4, i8, i6, z, z2);
        } else {
            i7 = i3;
            i8 = i5;
        }
        if (this.isOut) {
            color = getColor(this.isSelected ? Theme.key_chat_outBubbleSelected : Theme.key_chat_outBubble);
            int currentColor = getCurrentColor(Theme.key_chat_outBubbleGradient1);
            int currentColor2 = getCurrentColor(Theme.key_chat_outBubbleGradient2);
            int currentColor3 = getCurrentColor(Theme.key_chat_outBubbleGradient3);
            if (getCurrentColor(Theme.key_chat_outBubbleGradientAnimated) != 0) {
                i9 = currentColor;
                i10 = currentColor2;
                i11 = currentColor3;
                z3 = true;
            } else {
                i9 = currentColor;
                i10 = currentColor2;
                i11 = currentColor3;
                z3 = false;
            }
        } else {
            color = getColor(this.isSelected ? Theme.key_chat_inBubbleSelected : Theme.key_chat_inBubble);
            z3 = false;
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (i9 != 0) {
            color = getColor(Theme.key_chat_outBubble);
        }
        int i12 = color;
        if (this.themePreview) {
            c = 2;
        } else {
            c = this.currentType == 2 ? (char) 1 : (char) 0;
        }
        if (!this.isCrossfadeBackground && i10 != 0 && z3 && (motionBackgroundDrawable = motionBackground[c]) != null) {
            int[] colors = motionBackgroundDrawable.getColors();
            this.currentColor = colors[0];
            this.currentGradientColor1 = colors[1];
            this.currentGradientColor2 = colors[2];
            this.currentGradientColor3 = colors[3];
        }
        if (this.isCrossfadeBackground && i10 != 0 && z3) {
            if (i7 != this.currentBackgroundHeight || this.crosfadeFromBitmapShader == null || this.currentColor != i12 || this.currentGradientColor1 != i9 || this.currentGradientColor2 != i10 || this.currentGradientColor3 != i11 || this.currentAnimateGradient != z3) {
                if (this.crosfadeFromBitmap == null) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                    this.crosfadeFromBitmap = bitmapCreateBitmap;
                    bitmapCreateBitmap.setHasAlpha(false);
                    Bitmap bitmap = this.crosfadeFromBitmap;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.crosfadeFromBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                }
                MotionBackgroundDrawable[] motionBackgroundDrawableArr = motionBackground;
                if (motionBackgroundDrawableArr[c] == null) {
                    motionBackgroundDrawableArr[c] = new MotionBackgroundDrawable();
                    if (this.currentType != 2) {
                        motionBackground[c].setPostInvalidateParent(true);
                    }
                    motionBackground[c].setRoundRadius(dp(1.0f));
                }
                motionBackground[c].setColors(i12, i9, i10, i11, this.crosfadeFromBitmap);
                this.crosfadeFromBitmapShader.setLocalMatrix(this.matrix);
            }
            Shader shader = this.crosfadeFromBitmapShader;
            this.gradientShader = shader;
            this.paint.setShader(shader);
            this.paint.setColor(-1);
            this.currentColor = i12;
            this.currentAnimateGradient = z3;
            this.currentGradientColor1 = i9;
            this.currentGradientColor2 = i10;
            this.currentGradientColor3 = i11;
        } else if (i9 != 0 && (this.gradientShader == null || i7 != this.currentBackgroundHeight || this.currentColor != i12 || this.currentGradientColor1 != i9 || this.currentGradientColor2 != i10 || this.currentGradientColor3 != i11 || this.currentAnimateGradient != z3)) {
            if (i10 != 0 && z3) {
                MotionBackgroundDrawable[] motionBackgroundDrawableArr2 = motionBackground;
                if (motionBackgroundDrawableArr2[c] == null) {
                    motionBackgroundDrawableArr2[c] = new MotionBackgroundDrawable();
                    if (this.currentType != 2) {
                        motionBackground[c].setPostInvalidateParent(true);
                    }
                    motionBackground[c].setRoundRadius(dp(1.0f));
                }
                motionBackground[c].setColors(i12, i9, i10, i11);
                this.gradientShader = motionBackground[c].getBitmapShader();
            } else if (i10 == 0) {
                this.gradientShader = new LinearGradient(0.0f, i8, 0.0f, i7, new int[]{i9, i12}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i11 != 0) {
                this.gradientShader = new LinearGradient(0.0f, i8, 0.0f, i7, new int[]{i11, i10, i9, i12}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                this.gradientShader = new LinearGradient(0.0f, i8, 0.0f, i7, new int[]{i10, i9, i12}, (float[]) null, Shader.TileMode.CLAMP);
            }
            this.paint.setShader(this.gradientShader);
            this.currentColor = i12;
            this.currentAnimateGradient = z3;
            this.currentGradientColor1 = i9;
            this.currentGradientColor2 = i10;
            this.currentGradientColor3 = i11;
            this.paint.setColor(-1);
        } else if (i9 == 0) {
            if (this.gradientShader != null) {
                this.gradientShader = null;
                this.paint.setShader(null);
            }
            this.paint.setColor(i12);
        }
        if (this.gradientShader instanceof BitmapShader) {
            motionBackground[c].setBounds(0, i8, i2, i7 - i4);
        }
        this.currentBackgroundHeight = i7;
        this.topY = i - (this.gradientShader instanceof BitmapShader ? i4 : 0);
        this.isTopNear = z;
        this.isBottomNear = z2;
    }

    public void draw(Canvas canvas, Paint paint) {
        int iDp;
        int i;
        Path path;
        boolean zInvalidatePath;
        MessageDrawable messageDrawable;
        Path path2;
        Drawable backgroundDrawable;
        Rect bounds = getBounds();
        if (paint == null && this.gradientShader == null && this.overrideRoundRadius == 0 && this.overrideRounding <= 0.0f && (backgroundDrawable = getBackgroundDrawable()) != null) {
            backgroundDrawable.setBounds(bounds);
            backgroundDrawable.draw(canvas);
            return;
        }
        int iDp2 = dp(2.0f);
        int iDp3 = this.overrideRoundRadius;
        if (iDp3 != 0) {
            i = iDp3;
        } else {
            if (this.overrideRounding > 0.0f) {
                iDp3 = AndroidUtilities.lerp(dp(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.overrideRounding);
                iDp = AndroidUtilities.lerp(dp(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.overrideRounding);
            } else if (this.currentType == 2) {
                iDp3 = dp(6.0f);
                iDp = dp(6.0f);
            } else {
                iDp3 = dp(SharedConfig.bubbleRadius);
                iDp = dp(Math.min(6, SharedConfig.bubbleRadius));
            }
            i = iDp;
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
            messageDrawable = this;
            int i2 = iDp3;
            path2 = path;
            messageDrawable.generatePath(path2, bounds, iDp2, i2, iDp4, i, iMax, true, true, paint != null);
        } else {
            messageDrawable = this;
            path2 = path;
        }
        canvas.drawPath(path2, paint2);
        if (messageDrawable.gradientShader != null && messageDrawable.isSelected && paint == null) {
            int color = getColor(Theme.key_chat_outBubbleGradientSelectedOverlay);
            messageDrawable.selectedPaint.setColor(ColorUtils.setAlphaComponent(color, (int) ((Color.alpha(color) * messageDrawable.alpha) / 255.0f)));
            canvas.drawPath(path2, messageDrawable.selectedPaint);
        }
    }

    public void drawCached(Canvas canvas, PathDrawParams pathDrawParams) {
        drawCached(canvas, pathDrawParams, null);
    }
}
