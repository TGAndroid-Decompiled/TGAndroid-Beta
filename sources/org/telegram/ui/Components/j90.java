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
public final class j90 extends Drawable {
    public final Bitmap f25221a;
    public long f25223c;
    public LinearGradient d;
    public float f25224f;
    public float f25225g;
    public final w9 h;
    public int f25226i;
    public int f25227j;
    public final Paint f25222b = new Paint(2);
    public final Matrix e = new Matrix();

    public j90(w9 w9Var, String str, int i10, int i11) {
        this.f25221a = SvgHelper.getBitmapByPathOnly(str, 512, 512, i10, i11);
        this.h = w9Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f25221a;
        if (bitmap == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.h6.f18859h5;
        int i11 = org.telegram.ui.ActionBar.h6.f18877i5;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        int w03 = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
        int i12 = this.f25226i;
        Paint paint = this.f25222b;
        Matrix matrix = this.e;
        if (i12 != w02 || this.f25227j != w03) {
            this.f25226i = w02;
            this.f25227j = w03;
            int averageColor = AndroidUtilities.getAverageColor(w03, w02);
            paint.setColor(w03);
            float dp = AndroidUtilities.dp(500.0f);
            this.f25225g = dp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f25223c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f25223c = elapsedRealtime;
        this.f25224f = a4.a.B((float) abs, this.f25225g, 1800.0f, this.f25224f);
        while (true) {
            float f7 = this.f25224f;
            float f10 = this.f25225g * 2.0f;
            if (f7 >= f10) {
                this.f25224f = f7 - f10;
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
