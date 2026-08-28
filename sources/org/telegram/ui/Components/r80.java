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
public final class r80 extends Drawable {
    public final Bitmap f32110a;
    public long f32112c;
    public LinearGradient d;
    public float f32114f;
    public float f32115g;
    public final o9 h;
    public int f32116i;
    public int f32117j;
    public final Paint f32111b = new Paint(2);
    public final Matrix f32113e = new Matrix();

    public r80(o9 o9Var, String str, int i9, int i10) {
        this.f32110a = SvgHelper.getBitmapByPathOnly(str, 512, 512, i9, i10);
        this.h = o9Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f32110a;
        if (bitmap == null) {
            return;
        }
        int i9 = org.telegram.ui.ActionBar.f6.f23072h5;
        int i10 = org.telegram.ui.ActionBar.f6.f23091i5;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        int i11 = this.f32116i;
        Paint paint = this.f32111b;
        Matrix matrix = this.f32113e;
        if (i11 != w02 || this.f32117j != w03) {
            this.f32116i = w02;
            this.f32117j = w03;
            int averageColor = AndroidUtilities.getAverageColor(w03, w02);
            paint.setColor(w03);
            float dp = AndroidUtilities.dp(500.0f);
            this.f32115g = dp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f32112c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f32112c = elapsedRealtime;
        this.f32114f = aa.d.d((float) abs, this.f32115g, 1800.0f, this.f32114f);
        while (true) {
            float f10 = this.f32114f;
            float f11 = this.f32115g * 2.0f;
            if (f10 >= f11) {
                this.f32114f = f10 - f11;
            } else {
                matrix.setTranslate(f10, 0.0f);
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
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
