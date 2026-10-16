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
public final class ja0 extends Drawable {
    public final Bitmap f25945a;
    public long f25947c;
    public LinearGradient d;
    public float f25948f;
    public float f25949g;
    public final z9 h;
    public int f25950i;
    public int f25951j;
    public final Paint f25946b = new Paint(2);
    public final Matrix e = new Matrix();

    public ja0(z9 z9Var, String str, int i10, int i11) {
        this.f25945a = SvgHelper.getBitmapByPathOnly(str, 512, 512, i10, i11);
        this.h = z9Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f25945a;
        if (bitmap == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.f19672h5;
        int i11 = org.telegram.ui.ActionBar.g6.f19689i5;
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        int x03 = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
        int i12 = this.f25950i;
        Paint paint = this.f25946b;
        Matrix matrix = this.e;
        if (i12 != x02 || this.f25951j != x03) {
            this.f25950i = x02;
            this.f25951j = x03;
            int averageColor = AndroidUtilities.getAverageColor(x03, x02);
            paint.setColor(x03);
            float dp = AndroidUtilities.dp(500.0f);
            this.f25949g = dp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{x03, averageColor, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f25947c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f25947c = elapsedRealtime;
        this.f25948f = a1.g.B((float) abs, this.f25949g, 1800.0f, this.f25948f);
        while (true) {
            float f7 = this.f25948f;
            float f10 = this.f25949g * 2.0f;
            if (f7 >= f10) {
                this.f25948f = f7 - f10;
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
