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
import androidx.appcompat.widget.TintInfo;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_label.zzdq;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.MotionBackgroundDrawable;

public class MessageDrawable extends Drawable {
    public static final MotionBackgroundDrawable[] motionBackground = new MotionBackgroundDrawable[3];
    public boolean botButtonsBottom;
    public Bitmap crosfadeFromBitmap;
    public BitmapShader crosfadeFromBitmapShader;
    public MessageDrawable crossfadeFromDrawable;
    public float crossfadeProgress;
    public boolean currentAnimateGradient;
    public int currentBackgroundHeight;
    public int currentColor;
    public int currentGradientColor1;
    public int currentGradientColor2;
    public int currentGradientColor3;
    public final int currentType;
    public boolean drawFullBubble;
    public Shader gradientShader;
    public boolean isBottomNear;
    public boolean isCrossfadeBackground;
    public final boolean isOut;
    public final boolean isSelected;
    public boolean isTopNear;
    public boolean lastDrawWithShadow;
    public int overrideRoundRadius;
    public float overrideRounding;
    public TintInfo pathDrawCacheParams;
    public Theme.ResourcesProvider resourcesProvider;
    public boolean themePreview;
    public int topY;
    public NinePatchDrawable transitionDrawable;
    public int transitionDrawableColor;
    public final Paint paint = new Paint(1);
    public final RectF rect = new RectF();
    public final Matrix matrix = new Matrix();
    public final Rect backupRect = new Rect();
    public final int[] currentShadowDrawableRadius = {-1, -1, -1, -1};
    public final Bitmap[] shadowDrawableBitmap = new Bitmap[4];
    public final Drawable[] shadowDrawable = new Drawable[4];
    public final int[] shadowDrawableColor = {-1, -1, -1, -1};
    public final int[][] currentBackgroundDrawableRadius = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] backgroundDrawable = (Drawable[][]) Array.newInstance((Class<?>) Drawable.class, 4, 4);
    public final int[][] backgroundDrawableColor = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path path = new Path();
    public final Paint selectedPaint = new Paint(1);
    public int alpha = 255;

    public MessageDrawable(int i, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.isOut = z;
        this.currentType = i;
        this.isSelected = z2;
    }

    public final void applyMatrixScale() {
        Bitmap bitmap;
        if (this.gradientShader instanceof BitmapShader) {
            boolean z = this.isCrossfadeBackground;
            Matrix matrix = this.matrix;
            MotionBackgroundDrawable[] motionBackgroundDrawableArr = motionBackground;
            char c = 0;
            int i = this.currentType;
            if (z && (bitmap = this.crosfadeFromBitmap) != null) {
                c = i == 2 ? (char) 1 : (char) 0;
                float fMin = 1.0f / Math.min(bitmap.getWidth() / motionBackgroundDrawableArr[c].getBounds().width(), this.crosfadeFromBitmap.getHeight() / motionBackgroundDrawableArr[c].getBounds().height());
                matrix.postScale(fMin, fMin);
                return;
            }
            if (this.themePreview) {
                c = 2;
            } else if (i == 2) {
                c = 1;
            }
            Bitmap bitmap2 = motionBackgroundDrawableArr[c].currentBitmap;
            float fMin2 = 1.0f / Math.min(bitmap2.getWidth() / motionBackgroundDrawableArr[c].getBounds().width(), bitmap2.getHeight() / motionBackgroundDrawableArr[c].getBounds().height());
            matrix.postScale(fMin2, fMin2);
        }
    }

    public final int dp(float f) {
        return this.currentType == 2 ? (int) Math.ceil(f * 3.0f) : AndroidUtilities.dp(f);
    }

    @Override
    public final void draw(Canvas canvas) {
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

    public final void drawCached(Canvas canvas, TintInfo tintInfo, Paint paint) {
        this.pathDrawCacheParams = tintInfo;
        MessageDrawable messageDrawable = this.crossfadeFromDrawable;
        if (messageDrawable != null) {
            messageDrawable.pathDrawCacheParams = tintInfo;
        }
        draw(canvas, paint);
        this.pathDrawCacheParams = null;
        MessageDrawable messageDrawable2 = this.crossfadeFromDrawable;
        if (messageDrawable2 != null) {
            messageDrawable2.pathDrawCacheParams = null;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        Bitmap[] bitmapArr = this.shadowDrawableBitmap;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
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
        RectF rectF = this.rect;
        boolean z4 = this.isOut;
        int i7 = this.currentType;
        if (z4) {
            if (this.drawFullBubble || i7 == 2 || z3 || z) {
                int i8 = this.botButtonsBottom ? i4 : i6;
                if (i7 == 1) {
                    path.moveTo((rect.right - dp(8.0f)) - i8, rect.bottom - i);
                } else {
                    path.moveTo(rect.right - dp(2.6f), rect.bottom - i);
                }
                path.lineTo(rect.left + i + i8, rect.bottom - i);
                int i9 = rect.left + i;
                int i10 = rect.bottom - i;
                int i11 = i8 * 2;
                rectF.set(i9, i10 - i11, i9 + i11, i10);
                path.arcTo(rectF, 90.0f, 90.0f, false);
            } else {
                path.moveTo(rect.right - dp(8.0f), (i5 - this.topY) + this.currentBackgroundHeight);
                path.lineTo(rect.left + i, (i5 - this.topY) + this.currentBackgroundHeight);
            }
            if (this.drawFullBubble || i7 == 2 || z3 || z2) {
                path.lineTo(rect.left + i, rect.top + i + i6);
                int i12 = rect.left + i;
                int i13 = rect.top + i;
                int i14 = i6 * 2;
                rectF.set(i12, i13, i12 + i14, i13 + i14);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                int i15 = this.isTopNear ? i4 : i6;
                if (i7 == 1) {
                    path.lineTo((rect.right - i) - i15, rect.top + i);
                    int i16 = rect.right - i;
                    int i17 = i15 * 2;
                    int i18 = rect.top + i;
                    rectF.set(i16 - i17, i18, i16, i18 + i17);
                } else {
                    path.lineTo((rect.right - dp(8.0f)) - i15, rect.top + i);
                    int i19 = i15 * 2;
                    rectF.set((rect.right - dp(8.0f)) - i19, rect.top + i, rect.right - dp(8.0f), rect.top + i + i19);
                }
                path.arcTo(rectF, 270.0f, 90.0f, false);
            } else {
                path.lineTo(rect.left + i, (i5 - this.topY) - dp(2.0f));
                if (i7 == 1) {
                    path.lineTo(rect.right - i, (i5 - this.topY) - dp(2.0f));
                } else {
                    path.lineTo(rect.right - dp(8.0f), (i5 - this.topY) - dp(2.0f));
                }
            }
            if (i7 == 1) {
                if (z3 || z) {
                    if (this.isBottomNear) {
                        i6 = i4;
                    }
                    path.lineTo(rect.right - i, (rect.bottom - i) - i6);
                    int i20 = rect.right - i;
                    int i21 = i6 * 2;
                    int i22 = rect.bottom - i;
                    rectF.set(i20 - i21, i22 - i21, i20, i22);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                } else {
                    path.lineTo(rect.right - i, (i5 - this.topY) + this.currentBackgroundHeight);
                }
            } else if (this.drawFullBubble || i7 == 2 || z3 || z) {
                path.lineTo(rect.right - dp(8.0f), ((rect.bottom - i) - i3) - dp(3.0f));
                int i23 = i3 * 2;
                rectF.set(rect.right - dp(8.0f), ((rect.bottom - i) - i23) - dp(9.0f), (rect.right - dp(7.0f)) + i23, (rect.bottom - i) - dp(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            } else {
                path.lineTo(rect.right - dp(8.0f), (i5 - this.topY) + this.currentBackgroundHeight);
            }
        } else {
            if (this.drawFullBubble || i7 == 2 || z3 || z) {
                int i24 = this.botButtonsBottom ? i4 : i6;
                if (i7 == 1) {
                    path.moveTo(dp(8.0f) + rect.left + i24, rect.bottom - i);
                } else {
                    path.moveTo(dp(2.6f) + rect.left, rect.bottom - i);
                }
                path.lineTo((rect.right - i) - i24, rect.bottom - i);
                int i25 = rect.right - i;
                int i26 = i24 * 2;
                int i27 = rect.bottom - i;
                rectF.set(i25 - i26, i27 - i26, i25, i27);
                path.arcTo(rectF, 90.0f, -90.0f, false);
            } else {
                path.moveTo(dp(8.0f) + rect.left, (i5 - this.topY) + this.currentBackgroundHeight);
                path.lineTo(rect.right - i, (i5 - this.topY) + this.currentBackgroundHeight);
            }
            if (this.drawFullBubble || i7 == 2 || z3 || z2) {
                path.lineTo(rect.right - i, rect.top + i + i6);
                int i28 = rect.right - i;
                int i29 = i6 * 2;
                int i30 = rect.top + i;
                rectF.set(i28 - i29, i30, i28, i30 + i29);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                int i31 = this.isTopNear ? i4 : i6;
                if (i7 == 1) {
                    path.lineTo(rect.left + i + i31, rect.top + i);
                    int i32 = rect.left + i;
                    int i33 = rect.top + i;
                    int i34 = i31 * 2;
                    rectF.set(i32, i33, i32 + i34, i33 + i34);
                } else {
                    path.lineTo(dp(8.0f) + rect.left + i31, rect.top + i);
                    int i35 = i31 * 2;
                    rectF.set(dp(8.0f) + rect.left, rect.top + i, dp(8.0f) + rect.left + i35, rect.top + i + i35);
                }
                path.arcTo(rectF, 270.0f, -90.0f, false);
            } else {
                path.lineTo(rect.right - i, (i5 - this.topY) - dp(2.0f));
                if (i7 == 1) {
                    path.lineTo(rect.left + i, (i5 - this.topY) - dp(2.0f));
                } else {
                    path.lineTo(dp(8.0f) + rect.left, (i5 - this.topY) - dp(2.0f));
                }
            }
            if (i7 == 1) {
                if (z3 || z) {
                    if (this.isBottomNear || this.botButtonsBottom) {
                        i6 = i4;
                    }
                    path.lineTo(rect.left + i, (rect.bottom - i) - i6);
                    int i36 = rect.left + i;
                    int i37 = rect.bottom - i;
                    int i38 = i6 * 2;
                    rectF.set(i36, i37 - i38, i36 + i38, i37);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                } else {
                    path.lineTo(rect.left + i, (i5 - this.topY) + this.currentBackgroundHeight);
                }
            } else if (this.drawFullBubble || i7 == 2 || z3 || z) {
                path.lineTo(dp(8.0f) + rect.left, ((rect.bottom - i) - i3) - dp(3.0f));
                int i39 = i3 * 2;
                rectF.set((dp(7.0f) + rect.left) - i39, ((rect.bottom - i) - i39) - dp(9.0f), dp(8.0f) + rect.left, (rect.bottom - i) - dp(1.0f));
                path.arcTo(rectF, 0.0f, 83.0f, false);
            } else {
                path.lineTo(dp(8.0f) + rect.left, (i5 - this.topY) + this.currentBackgroundHeight);
            }
        }
        path.close();
    }

    public final Drawable getBackgroundDrawable() {
        char c;
        int color;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i;
        int i2;
        Rect rect = this.backupRect;
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
        boolean z3 = this.isOut;
        if (z2) {
            color = getColor(z3 ? Theme.key_chat_outBubbleSelected : Theme.key_chat_inBubbleSelected);
        } else {
            color = getColor(z3 ? Theme.key_chat_outBubble : Theme.key_chat_inBubble);
        }
        boolean z4 = (this.gradientShader != null || z2 || this.isCrossfadeBackground) ? false : true;
        int color2 = getColor(z3 ? Theme.key_chat_outBubbleShadow : Theme.key_chat_inBubbleShadow);
        boolean z5 = this.lastDrawWithShadow;
        Drawable[][] drawableArr2 = this.backgroundDrawable;
        int[][] iArr2 = this.backgroundDrawableColor;
        int[] iArr3 = this.shadowDrawableColor;
        int[][] iArr4 = this.currentBackgroundDrawableRadius;
        if (z5 == z4 && iArr4[c2][c] == iDp && ((!z4 || iArr3[c] == color2) && iArr2[c2][c] == color)) {
            i = color;
            drawableArr = drawableArr2;
            iArr = iArr2;
        } else {
            iArr4[c2][c] = iDp;
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dp(50.0f), dp(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                rect.set(getBounds());
                if (z4) {
                    iArr3[c] = color2;
                    Paint paint = new Paint(1);
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, dp(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (AndroidUtilities.density > 1.0f) {
                        setBounds(-1, -1, bitmapCreateBitmap.getWidth() + 1, bitmapCreateBitmap.getHeight() + 1);
                        i2 = 0;
                    } else {
                        i2 = 0;
                        setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                    }
                    draw(canvas, paint);
                    if (AndroidUtilities.density > 1.0f) {
                        paint.setColor(i2);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i2);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                        draw(canvas, paint);
                    }
                }
                Paint paint2 = new Paint(1);
                paint2.setColor(color);
                setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                draw(canvas, paint2);
                drawableArr = drawableArr2;
                iArr = iArr2;
                i = color;
                try {
                    drawableArr2[c2][c] = new NinePatchDrawable(bitmapCreateBitmap, zzdq.createNinePatchChunk((bitmapCreateBitmap.getWidth() / 2) - 1, (bitmapCreateBitmap.getWidth() / 2) + 1, (bitmapCreateBitmap.getHeight() / 2) - 1, (bitmapCreateBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                i = color;
                drawableArr = drawableArr2;
                iArr = iArr2;
            }
        }
        this.lastDrawWithShadow = z4;
        iArr[c2][c] = i;
        return drawableArr[c2][c];
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

    public final MotionBackgroundDrawable getMotionBackgroundDrawable() {
        boolean z = this.themePreview;
        MotionBackgroundDrawable[] motionBackgroundDrawableArr = motionBackground;
        if (z) {
            return motionBackgroundDrawableArr[2];
        }
        return motionBackgroundDrawableArr[this.currentType == 2 ? (char) 1 : (char) 0];
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final Drawable getShadowDrawable() {
        char c;
        int i;
        if (this.isCrossfadeBackground || (this.gradientShader == null && !this.isSelected && this.crossfadeFromDrawable == null)) {
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
        int i2 = iArr[c];
        Drawable[] drawableArr = this.shadowDrawable;
        if (i2 != iDp) {
            iArr[c] = iDp;
            Bitmap[] bitmapArr = this.shadowDrawableBitmap;
            Bitmap bitmap = bitmapArr[c];
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
                bitmapArr[c] = bitmapCreateBitmap;
                drawableArr[c] = new NinePatchDrawable(bitmapCreateBitmap, zzdq.createNinePatchChunk((bitmapCreateBitmap.getWidth() / 2) - 1, (bitmapCreateBitmap.getWidth() / 2) + 1, (bitmapCreateBitmap.getHeight() / 2) - 1, (bitmapCreateBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i).array(), new Rect(), null);
                z2 = true;
            } catch (Throwable unused) {
            }
        }
        int color = getColor(this.isOut ? Theme.key_chat_outBubbleShadow : Theme.key_chat_inBubbleShadow);
        Drawable drawable = drawableArr[c];
        if (drawable != null) {
            int[] iArr2 = this.shadowDrawableColor;
            if (iArr2[c] != color || z2) {
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
                iArr2[c] = color;
            }
        }
        return drawableArr[c];
    }

    public final Drawable[] getShadowDrawables() {
        return this.shadowDrawable;
    }

    public final boolean hasGradient() {
        return this.gradientShader != null && Theme.shouldDrawGradientIcons;
    }

    public final Path makePath() {
        int iDp;
        int i;
        boolean z;
        boolean z2;
        Path path;
        TintInfo tintInfo = this.pathDrawCacheParams;
        Rect bounds = getBounds();
        int iDp2 = dp(2.0f);
        int iDp3 = this.overrideRoundRadius;
        int i2 = this.currentType;
        if (iDp3 != 0) {
            i = iDp3;
        } else {
            if (this.overrideRounding > 0.0f) {
                iDp3 = AndroidUtilities.lerp(dp(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.overrideRounding);
                iDp = AndroidUtilities.lerp(dp(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.overrideRounding);
            } else if (i2 == 2) {
                iDp3 = dp(6.0f);
                iDp = dp(6.0f);
            } else {
                iDp3 = dp(SharedConfig.bubbleRadius);
                iDp = dp(Math.min(6, SharedConfig.bubbleRadius));
            }
            i = iDp;
        }
        int iDp4 = dp(6.0f);
        int iMax = Math.max(bounds.top, 0);
        boolean zInvalidatePath = true;
        if (tintInfo == null || bounds.height() >= this.currentBackgroundHeight) {
            z = i2 != 1 ? (this.topY + bounds.bottom) - iDp3 < this.currentBackgroundHeight : (this.topY + bounds.bottom) - (iDp4 * 2) < this.currentBackgroundHeight;
            if ((iDp3 * 2) + this.topY < 0) {
                z2 = false;
            }
            if (tintInfo != null) {
                path = (Path) tintInfo.mTintList;
                zInvalidatePath = tintInfo.invalidatePath(bounds, z, z2);
            } else {
                path = this.path;
            }
            if (zInvalidatePath && this.overrideRoundRadius == 0) {
                return path;
            }
            boolean z3 = z;
            Path path2 = path;
            generatePath(path2, bounds, iDp2, iDp3, iDp4, i, iMax, z3, z2, true);
            return path2;
        }
        z = true;
        z2 = true;
        if (tintInfo != null) {
            path = (Path) tintInfo.mTintList;
            zInvalidatePath = tintInfo.invalidatePath(bounds, z, z2);
        } else {
            path = this.path;
        }
        if (zInvalidatePath) {
        }
        boolean z4 = z;
        Path path3 = path;
        generatePath(path3, bounds, iDp2, iDp3, iDp4, i, iMax, z4, z2, true);
        return path3;
    }

    @Override
    public final void setAlpha(int i) {
        int i2 = this.alpha;
        Paint paint = this.paint;
        if (i2 != i || paint.getAlpha() != i) {
            this.alpha = i;
            paint.setAlpha(i);
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

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        MessageDrawable messageDrawable = this.crossfadeFromDrawable;
        if (messageDrawable != null) {
            messageDrawable.setBounds(i, i2, i3, i4);
        }
    }

    @Override
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
    }

    public void setTop(int i, int i2, int i3) {
        setTop(i, i2, i3, i3, 0, 0, false, false);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
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
        char c2;
        Paint paint;
        int i12;
        char c3;
        MessageDrawable messageDrawable = this.crossfadeFromDrawable;
        if (messageDrawable != null) {
            i7 = i3;
            i8 = i5;
            messageDrawable.setTop(i, i2, i7, i4, i8, i6, z, z2);
        } else {
            i7 = i3;
            i8 = i5;
        }
        boolean z4 = this.isOut;
        boolean z5 = this.isSelected;
        if (z4) {
            color = getColor(z5 ? Theme.key_chat_outBubbleSelected : Theme.key_chat_outBubble);
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
            color = getColor(z5 ? Theme.key_chat_inBubbleSelected : Theme.key_chat_inBubble);
            z3 = false;
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (i9 != 0) {
            color = getColor(Theme.key_chat_outBubble);
        }
        int i13 = color;
        boolean z6 = this.themePreview;
        int i14 = this.currentType;
        if (z6) {
            c = 2;
        } else {
            c = i14 == 2 ? (char) 1 : (char) 0;
        }
        boolean z7 = this.isCrossfadeBackground;
        MotionBackgroundDrawable[] motionBackgroundDrawableArr = motionBackground;
        if (!z7 && i10 != 0 && z3) {
            c2 = 3;
            MotionBackgroundDrawable motionBackgroundDrawable = motionBackgroundDrawableArr[c];
            if (motionBackgroundDrawable != null) {
                int[] iArr = motionBackgroundDrawable.colors;
                this.currentColor = iArr[0];
                this.currentGradientColor1 = iArr[1];
                this.currentGradientColor2 = iArr[2];
                this.currentGradientColor3 = iArr[3];
            }
            paint = this.paint;
            if (!z7 && i10 != 0 && z3) {
                if (i7 != this.currentBackgroundHeight || this.crosfadeFromBitmapShader == null || this.currentColor != i13 || this.currentGradientColor1 != i9 || this.currentGradientColor2 != i10 || this.currentGradientColor3 != i11 || this.currentAnimateGradient != z3) {
                    if (this.crosfadeFromBitmap == null) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                        this.crosfadeFromBitmap = bitmapCreateBitmap;
                        bitmapCreateBitmap.setHasAlpha(false);
                        Bitmap bitmap = this.crosfadeFromBitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        this.crosfadeFromBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    }
                    if (motionBackgroundDrawableArr[c] == null) {
                        MotionBackgroundDrawable motionBackgroundDrawable2 = new MotionBackgroundDrawable();
                        motionBackgroundDrawableArr[c] = motionBackgroundDrawable2;
                        if (i14 != 2) {
                            c3 = 1;
                            motionBackgroundDrawable2.postInvalidateParent = true;
                        } else {
                            c3 = 1;
                        }
                        motionBackgroundDrawable2.setRoundRadius(dp(1.0f));
                    } else {
                        c3 = 1;
                    }
                    MotionBackgroundDrawable motionBackgroundDrawable3 = motionBackgroundDrawableArr[c];
                    Bitmap bitmap2 = this.crosfadeFromBitmap;
                    int[] iArr2 = motionBackgroundDrawable3.colors;
                    iArr2[0] = i13;
                    iArr2[c3] = i9;
                    iArr2[2] = i10;
                    iArr2[c2] = i11;
                    Utilities.generateGradient(bitmap2, motionBackgroundDrawable3.phase, motionBackgroundDrawable3.interpolator.getInterpolation(motionBackgroundDrawable3.posAnimationProgress), motionBackgroundDrawable3.colors);
                    this.crosfadeFromBitmapShader.setLocalMatrix(this.matrix);
                }
                BitmapShader bitmapShader = this.crosfadeFromBitmapShader;
                this.gradientShader = bitmapShader;
                paint.setShader(bitmapShader);
                paint.setColor(-1);
                this.currentColor = i13;
                this.currentAnimateGradient = z3;
                this.currentGradientColor1 = i9;
                this.currentGradientColor2 = i10;
                this.currentGradientColor3 = i11;
            } else if (i9 == 0 && (this.gradientShader == null || i7 != this.currentBackgroundHeight || this.currentColor != i13 || this.currentGradientColor1 != i9 || this.currentGradientColor2 != i10 || this.currentGradientColor3 != i11 || this.currentAnimateGradient != z3)) {
                if (i10 != 0 && z3) {
                    if (motionBackgroundDrawableArr[c] == null) {
                        MotionBackgroundDrawable motionBackgroundDrawable4 = new MotionBackgroundDrawable();
                        motionBackgroundDrawableArr[c] = motionBackgroundDrawable4;
                        if (i14 != 2) {
                            motionBackgroundDrawable4.postInvalidateParent = true;
                        }
                        motionBackgroundDrawable4.setRoundRadius(dp(1.0f));
                    }
                    motionBackgroundDrawableArr[c].setColors(i13, i9, i10, i11, 0, true);
                    this.gradientShader = motionBackgroundDrawableArr[c].bitmapShader;
                } else if (i10 == 0) {
                    this.gradientShader = new LinearGradient(0.0f, i8, 0.0f, i7, new int[]{i9, i13}, (float[]) null, Shader.TileMode.CLAMP);
                } else if (i11 != 0) {
                    this.gradientShader = new LinearGradient(0.0f, i8, 0.0f, i7, new int[]{i11, i10, i9, i13}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    this.gradientShader = new LinearGradient(0.0f, i8, 0.0f, i7, new int[]{i10, i9, i13}, (float[]) null, Shader.TileMode.CLAMP);
                }
                paint.setShader(this.gradientShader);
                this.currentColor = i13;
                this.currentAnimateGradient = z3;
                this.currentGradientColor1 = i9;
                this.currentGradientColor2 = i10;
                this.currentGradientColor3 = i11;
                paint.setColor(-1);
            } else if (i9 == 0) {
                if (this.gradientShader != null) {
                    this.gradientShader = null;
                    paint.setShader(null);
                }
                paint.setColor(i13);
            }
            if (this.gradientShader instanceof BitmapShader) {
                i12 = 0;
                motionBackgroundDrawableArr[c].setBounds(0, i8, i2, i7 - i4);
            } else {
                i12 = 0;
            }
            this.currentBackgroundHeight = i7;
            if (this.gradientShader instanceof BitmapShader) {
                i12 = i4;
            }
            this.topY = i - i12;
            this.isTopNear = z;
            this.isBottomNear = z2;
        }
        c2 = 3;
        paint = this.paint;
        if (!z7) {
            if (i9 == 0) {
                if (i9 == 0) {
                    if (this.gradientShader != null) {
                        this.gradientShader = null;
                        paint.setShader(null);
                    }
                    paint.setColor(i13);
                }
            } else if (i9 == 0) {
                if (this.gradientShader != null) {
                    this.gradientShader = null;
                    paint.setShader(null);
                }
                paint.setColor(i13);
            }
        } else if (i9 == 0) {
            if (i9 == 0) {
                if (this.gradientShader != null) {
                    this.gradientShader = null;
                    paint.setShader(null);
                }
                paint.setColor(i13);
            }
        } else if (i9 == 0) {
            if (this.gradientShader != null) {
                this.gradientShader = null;
                paint.setShader(null);
            }
            paint.setColor(i13);
        }
        if (this.gradientShader instanceof BitmapShader) {
            i12 = 0;
            motionBackgroundDrawableArr[c].setBounds(0, i8, i2, i7 - i4);
        } else {
            i12 = 0;
        }
        this.currentBackgroundHeight = i7;
        if (this.gradientShader instanceof BitmapShader) {
            i12 = i4;
        }
        this.topY = i - i12;
        this.isTopNear = z;
        this.isBottomNear = z2;
    }

    public final void draw(Canvas canvas, Paint paint) {
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
            Matrix matrix = this.matrix;
            matrix.reset();
            applyMatrixScale();
            matrix.postTranslate(0.0f, -this.topY);
            this.gradientShader.setLocalMatrix(matrix);
        }
        int iMax = Math.max(bounds.top, 0);
        if (this.pathDrawCacheParams != null) {
            bounds.height();
        }
        TintInfo tintInfo = this.pathDrawCacheParams;
        if (tintInfo != null) {
            path = (Path) tintInfo.mTintList;
            zInvalidatePath = tintInfo.invalidatePath(bounds, true, true);
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
            Paint paint3 = messageDrawable.selectedPaint;
            paint3.setColor(ColorUtils.setAlphaComponent(color, (int) ((Color.alpha(color) * messageDrawable.alpha) / 255.0f)));
            canvas.drawPath(path2, paint3);
        }
    }
}
