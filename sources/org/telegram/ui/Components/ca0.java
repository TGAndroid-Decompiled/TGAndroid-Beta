package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class ca0 extends Drawable {
    public final Bitmap f25277a;
    public long f25279c;
    public LinearGradient d;
    public float f25280f;
    public float f25281g;
    public final u9 h;
    public int f25282i;
    public int f25283j;
    public final Paint f25278b = new Paint(2);
    public final Matrix e = new Matrix();

    public ca0(u9 u9Var, String str, int i10, int i11) {
        this.f25277a = SvgHelper.getBitmapByPathOnly(str, 512, 512, i10, i11);
        this.h = u9Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f25277a;
        if (bitmap == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.f21255h5;
        int i11 = org.telegram.ui.ActionBar.k6.f21272i5;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = this.f25282i;
        Paint paint = this.f25278b;
        Matrix matrix = this.e;
        if (i12 != x02 || this.f25283j != x03) {
            this.f25282i = x02;
            this.f25283j = x03;
            int averageColor = AndroidUtilities.getAverageColor(x03, x02);
            paint.setColor(x03);
            float dp = AndroidUtilities.dp(500.0f);
            this.f25281g = dp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{x03, averageColor, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f25279c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f25279c = elapsedRealtime;
        this.f25280f = a1.g.B((float) abs, this.f25281g, 1800.0f, this.f25280f);
        while (true) {
            float f7 = this.f25280f;
            float f10 = this.f25281g * 2.0f;
            if (f7 >= f10) {
                this.f25280f = f7 - f10;
            } else {
                matrix.setTranslate(f7, 0.0f);
                this.d.setLocalMatrix(matrix);
                this.h.invalidate();
                return;
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
