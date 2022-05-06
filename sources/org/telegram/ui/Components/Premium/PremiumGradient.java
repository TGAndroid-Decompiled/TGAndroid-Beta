package org.telegram.ui.Components.Premium;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

public class PremiumGradient {
    private static PremiumGradient instance;
    Matrix matrix = new Matrix();
    Paint paint = new Paint(1);
    public Drawable premiumStarDrawable;
    Shader shader;

    public static PremiumGradient getInstance() {
        if (instance == null) {
            instance = new PremiumGradient();
        }
        return instance;
    }

    private PremiumGradient() {
        LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 150.0f, 0.0f, new int[]{-9015575, -1026983, -1792170}, (float[]) null, Shader.TileMode.CLAMP);
        this.shader = linearGradient;
        linearGradient.setLocalMatrix(this.matrix);
        this.paint.setShader(this.shader);
        Drawable drawable = ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_premium_normal);
        int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.6f);
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicWidth, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicWidth);
        drawable.draw(canvas);
        this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        updateMatrix(0, 0, intrinsicWidth, intrinsicWidth);
        float f = intrinsicWidth;
        canvas.drawRect(0.0f, 0.0f, f, f, this.paint);
        this.paint.setXfermode(null);
        this.premiumStarDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
    }

    public void updateMatrix(int i, int i2, int i3, int i4) {
        this.matrix.reset();
        this.matrix.postScale((i3 - i) / 100.0f, (i4 - i2) / 100.0f, 50.0f, 50.0f);
        this.shader.setLocalMatrix(this.matrix);
    }
}
