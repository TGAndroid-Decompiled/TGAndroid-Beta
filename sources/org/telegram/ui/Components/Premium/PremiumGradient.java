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
        public final int colorKey1;
        public final int colorKey2;
        public final int colorKey3;
        public final int colorKey4;
        public boolean darkColors;
        public boolean exactly;
        public final Theme.ResourcesProvider resourcesProvider;
        public LinearGradient shader;
        public float cx = 0.5f;
        public float cy = 0.5f;
        public final Matrix matrix = new Matrix();
        public final Paint paint = new Paint(1);
        public final int[] colors = new int[5];
        public float y1 = 1.0f;
        public float x2 = 1.5f;
        public float y2 = 0.0f;
        public final int colorKey5 = -1;

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
            LinearGradient linearGradient = this.shader;
            int[] iArr = this.colors;
            if (linearGradient != null && iArr[0] == color && iArr[1] == color2 && iArr[2] == color3 && iArr[3] == color4 && iArr[4] == color5) {
                return;
            }
            iArr[0] = color;
            iArr[1] = color2;
            iArr[2] = color3;
            iArr[3] = color4;
            iArr[4] = color5;
            if (color3 == 0) {
                this.shader = new LinearGradient(0.0f, this.y1 * 100.0f, this.x2 * 100.0f, this.y2 * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            } else if (color4 == 0) {
                this.shader = new LinearGradient(0.0f, this.y1 * 100.0f, this.x2 * 100.0f, this.y2 * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
            } else if (color5 == 0) {
                this.shader = new LinearGradient(0.0f, this.y1 * 100.0f, this.x2 * 100.0f, this.y2 * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
            } else {
                this.shader = new LinearGradient(0.0f, this.y1 * 100.0f, this.x2 * 100.0f, this.y2 * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
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

        public final void gradientMatrix(int i, float f, int i2, int i3, float f2, int i4) {
            chekColors();
            boolean z = this.exactly;
            Matrix matrix = this.matrix;
            if (z) {
                matrix.reset();
                matrix.postScale((i3 - i) / 100.0f, (i4 - i2) / 100.0f, this.cx * 100.0f, this.cy * 100.0f);
                matrix.postTranslate(f, f2);
                this.shader.setLocalMatrix(matrix);
                return;
            }
            int i5 = i4 - i2;
            int i6 = i5 + i5;
            chekColors();
            matrix.reset();
            matrix.postScale((i3 - i) / 100.0f, i6 / 100.0f, 75.0f, 50.0f);
            matrix.postTranslate(f, (-i6) + f2);
            this.shader.setLocalMatrix(matrix);
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
        premiumGradientTools.gradientMatrix(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        Paint paint = premiumGradientTools.paint;
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, paint);
        paint.setXfermode(null);
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
