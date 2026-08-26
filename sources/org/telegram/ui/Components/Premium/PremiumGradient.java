package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;

public final class PremiumGradient {
    public static PremiumGradient instance;
    public final InternalDrawable goldenStarMenuDrawable;
    public int lastStarColor;
    public Paint lockedPremiumPaint;
    public final PremiumGradientTools mainGradient;
    public final Paint mainGradientPaint;
    public final Drawable premiumStarColoredDrawable;
    public final Drawable premiumStarDrawableMini;
    public InternalDrawable premiumStarMenuDrawable;
    public InternalDrawable premiumStarMenuDrawable2;

    public final class InternalDrawable extends BitmapDrawable {
        public final int[] colors;
        public final Drawable originDrawable;

        public InternalDrawable(Drawable drawable, Bitmap bitmap, int[] iArr) {
            super(ApplicationLoader.applicationContext.getResources(), bitmap);
            this.originDrawable = drawable;
            int[] iArr2 = new int[iArr.length];
            this.colors = iArr2;
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        }

        @Override
        public final void setColorFilter(int i, PorterDuff.Mode mode) {
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public class PremiumGradientTools {
        final int colorKey1;
        final int colorKey2;
        final int colorKey3;
        final int colorKey4;
        public boolean darkColors;
        public boolean exactly;
        private final Theme.ResourcesProvider resourcesProvider;
        Shader shader;
        public float cx = 0.5f;
        public float cy = 0.5f;
        final Matrix matrix = new Matrix();
        public final Paint paint = new Paint(1);
        final int[] colors = new int[5];
        public float x1 = 0.0f;
        public float y1 = 1.0f;
        public float x2 = 1.5f;
        public float y2 = 0.0f;
        final int colorKey5 = -1;

        public PremiumGradientTools(int i, int i2, int i3, int i4, Theme.ResourcesProvider resourcesProvider) {
            this.resourcesProvider = resourcesProvider;
            this.colorKey1 = i;
            this.colorKey2 = i2;
            this.colorKey3 = i3;
            this.colorKey4 = i4;
        }

        public final void chekColors() {
            int color = getColor(this.colorKey1);
            int color2 = getColor(this.colorKey2);
            int i = this.colorKey3;
            int color3 = i < 0 ? 0 : getColor(i);
            int i2 = this.colorKey4;
            int color4 = i2 < 0 ? 0 : getColor(i2);
            int i3 = this.colorKey5;
            int color5 = i3 < 0 ? 0 : getColor(i3);
            if (this.shader != null) {
                int[] iArr = this.colors;
                if (iArr[0] == color && iArr[1] == color2 && iArr[2] == color3 && iArr[3] == color4 && iArr[4] == color5) {
                    return;
                }
            }
            int[] iArr2 = this.colors;
            iArr2[0] = color;
            iArr2[1] = color2;
            iArr2[2] = color3;
            iArr2[3] = color4;
            iArr2[4] = color5;
            if (color3 == 0) {
                float f = this.x1 * 100.0f;
                float f2 = this.y1 * 100.0f;
                float f3 = this.x2 * 100.0f;
                float f4 = this.y2 * 100.0f;
                int[] iArr3 = this.colors;
                this.shader = new LinearGradient(f, f2, f3, f4, new int[]{iArr3[0], iArr3[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            } else if (color4 == 0) {
                float f5 = this.x1 * 100.0f;
                float f6 = this.y1 * 100.0f;
                float f7 = this.x2 * 100.0f;
                float f8 = this.y2 * 100.0f;
                int[] iArr4 = this.colors;
                this.shader = new LinearGradient(f5, f6, f7, f8, new int[]{iArr4[0], iArr4[1], iArr4[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
            } else if (color5 == 0) {
                float f9 = this.x1 * 100.0f;
                float f10 = this.y1 * 100.0f;
                float f11 = this.x2 * 100.0f;
                float f12 = this.y2 * 100.0f;
                int[] iArr5 = this.colors;
                this.shader = new LinearGradient(f9, f10, f11, f12, new int[]{iArr5[0], iArr5[1], iArr5[2], iArr5[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
            } else {
                float f13 = this.x1 * 100.0f;
                float f14 = this.y1 * 100.0f;
                float f15 = this.x2 * 100.0f;
                float f16 = this.y2 * 100.0f;
                int[] iArr6 = this.colors;
                this.shader = new LinearGradient(f13, f14, f15, f16, new int[]{iArr6[0], iArr6[1], iArr6[2], iArr6[3], iArr6[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
            }
            this.shader.setLocalMatrix(this.matrix);
            this.paint.setShader(this.shader);
        }

        public final int getColor(int i) {
            int themeColorByKey = getThemeColorByKey(i);
            if (!this.darkColors) {
                return themeColorByKey;
            }
            return Color.argb(Color.alpha(themeColorByKey), Color.red(themeColorByKey) - 15, Color.green(themeColorByKey) - 15, Color.blue(themeColorByKey) - 15);
        }

        public int getThemeColorByKey(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }

        public void gradientMatrix(Rect rect) {
            gradientMatrix(rect.left, rect.top, rect.right, rect.bottom, 0.0f, 0.0f);
        }

        public void gradientMatrixLinear(float f, float f2) {
            chekColors();
            this.matrix.reset();
            this.matrix.postScale(1.0f, f / 100.0f, 0.0f, 0.0f);
            this.matrix.postTranslate(0.0f, f2);
            this.shader.setLocalMatrix(this.matrix);
        }

        public void gradientMatrix(RectF rectF) {
            gradientMatrix((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, 0.0f, 0.0f);
        }

        public void gradientMatrix(int i, int i2, int i3, int i4, float f, float f2) {
            chekColors();
            if (this.exactly) {
                this.matrix.reset();
                this.matrix.postScale((i3 - i) / 100.0f, (i4 - i2) / 100.0f, this.cx * 100.0f, this.cy * 100.0f);
                this.matrix.postTranslate(f, f2);
                this.shader.setLocalMatrix(this.matrix);
                return;
            }
            int i5 = i4 - i2;
            int i6 = i5 + i5;
            chekColors();
            this.matrix.reset();
            this.matrix.postScale((i3 - i) / 100.0f, i6 / 100.0f, 75.0f, 50.0f);
            this.matrix.postTranslate(f, (-i6) + f2);
            this.shader.setLocalMatrix(this.matrix);
        }
    }

    public PremiumGradient() {
        PremiumGradientTools premiumGradientTools = new PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, Theme.key_premiumGradient3, Theme.key_premiumGradient4, null);
        this.mainGradient = premiumGradientTools;
        PremiumGradientTools premiumGradientTools2 = new PremiumGradientTools(Theme.key_starsGradient1, Theme.key_starsGradient2, -1, -1, null);
        this.mainGradientPaint = premiumGradientTools.paint;
        Context context = ApplicationLoader.applicationContext;
        int i = R.drawable.msg_premium_liststar;
        Drawable drawableMutate = context.getDrawable(i).mutate();
        this.premiumStarDrawableMini = drawableMutate;
        Context context2 = ApplicationLoader.applicationContext;
        int i2 = R.drawable.msg_settings_premium;
        this.premiumStarMenuDrawable = createGradientDrawable(context2.getDrawable(i2), premiumGradientTools);
        this.goldenStarMenuDrawable = createGradientDrawable(ApplicationLoader.applicationContext.getDrawable(i2), premiumGradientTools2);
        this.premiumStarMenuDrawable2 = createGradientDrawable(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), premiumGradientTools);
        this.premiumStarColoredDrawable = ApplicationLoader.applicationContext.getDrawable(i).mutate();
        premiumGradientTools.chekColors();
        int i3 = Theme.key_chats_verifiedBackground;
        if (Theme.getColor(null, i3, false) != this.lastStarColor) {
            this.lastStarColor = Theme.getColor(null, i3, false);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(this.lastStarColor, PorterDuff.Mode.MULTIPLY));
        }
        this.premiumStarMenuDrawable = checkColors(this.premiumStarMenuDrawable);
        this.premiumStarMenuDrawable2 = checkColors(this.premiumStarMenuDrawable2);
    }

    public static InternalDrawable createGradientDrawable(Drawable drawable, PremiumGradientTools premiumGradientTools) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        premiumGradientTools.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        premiumGradientTools.gradientMatrix(0, 0, intrinsicWidth, minimumHeight, -intrinsicWidth, 0.0f);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, premiumGradientTools.paint);
        premiumGradientTools.paint.setXfermode(null);
        return new InternalDrawable(drawable, bitmapCreateBitmap, premiumGradientTools.colors);
    }

    public static PremiumGradient getInstance() {
        if (instance == null) {
            instance = new PremiumGradient();
        }
        return instance;
    }

    public final InternalDrawable checkColors(InternalDrawable internalDrawable) {
        PremiumGradientTools premiumGradientTools = this.mainGradient;
        int[] iArr = premiumGradientTools.colors;
        int i = iArr[0];
        int[] iArr2 = internalDrawable.colors;
        return (i == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) ? internalDrawable : createGradientDrawable(internalDrawable.originDrawable, premiumGradientTools);
    }

    public final Paint getMainGradientPaint() {
        if (!MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            return this.mainGradientPaint;
        }
        if (this.lockedPremiumPaint == null) {
            this.lockedPremiumPaint = new Paint(1);
        }
        this.lockedPremiumPaint.setColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
        return this.lockedPremiumPaint;
    }
}
