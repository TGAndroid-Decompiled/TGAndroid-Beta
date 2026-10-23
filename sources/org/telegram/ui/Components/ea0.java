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
public final class ea0 extends Drawable {
    public final Bitmap f25944a;
    public long f25946c;
    public LinearGradient d;
    public float f25947f;
    public float f25948g;
    public final w9 h;
    public int f25949i;
    public int f25950j;
    public final Paint f25945b = new Paint(2);
    public final Matrix e = new Matrix();

    public ea0(w9 w9Var, String str, int i10, int i11) {
        this.f25944a = SvgHelper.getBitmapByPathOnly(str, 512, 512, i10, i11);
        this.h = w9Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f25944a;
        if (bitmap == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.f21254h5;
        int i11 = org.telegram.ui.ActionBar.k6.f21271i5;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = this.f25949i;
        Paint paint = this.f25945b;
        Matrix matrix = this.e;
        if (i12 != x02 || this.f25950j != x03) {
            this.f25949i = x02;
            this.f25950j = x03;
            int averageColor = AndroidUtilities.getAverageColor(x03, x02);
            paint.setColor(x03);
            float dp = AndroidUtilities.dp(500.0f);
            this.f25948g = dp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{x03, averageColor, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f25946c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f25946c = elapsedRealtime;
        this.f25947f = a1.g.B((float) abs, this.f25948g, 1800.0f, this.f25947f);
        while (true) {
            float f7 = this.f25947f;
            float f10 = this.f25948g * 2.0f;
            if (f7 >= f10) {
                this.f25947f = f7 - f10;
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
