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
public final class v90 extends Drawable {
    public final Bitmap f29027a;
    public long f29029c;
    public LinearGradient d;
    public float f29030f;
    public float f29031g;
    public final w9 h;
    public int f29032i;
    public int f29033j;
    public final Paint f29028b = new Paint(2);
    public final Matrix e = new Matrix();

    public v90(w9 w9Var, String str, int i10, int i11) {
        this.f29027a = SvgHelper.getBitmapByPathOnly(str, 512, 512, i10, i11);
        this.h = w9Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f29027a;
        if (bitmap == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.h6.f19130h5;
        int i11 = org.telegram.ui.ActionBar.h6.f19148i5;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        int w03 = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
        int i12 = this.f29032i;
        Paint paint = this.f29028b;
        Matrix matrix = this.e;
        if (i12 != w02 || this.f29033j != w03) {
            this.f29032i = w02;
            this.f29033j = w03;
            int averageColor = AndroidUtilities.getAverageColor(w03, w02);
            paint.setColor(w03);
            float dp = AndroidUtilities.dp(500.0f);
            this.f29031g = dp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f29029c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f29029c = elapsedRealtime;
        this.f29030f = a4.a.B((float) abs, this.f29031g, 1800.0f, this.f29030f);
        while (true) {
            float f7 = this.f29030f;
            float f10 = this.f29031g * 2.0f;
            if (f7 >= f10) {
                this.f29030f = f7 - f10;
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
