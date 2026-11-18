package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public final class q80 extends Drawable {
    public final Bitmap f38734a;
    public final Paint f38735b = new Paint(2);
    public long f38736c;
    public LinearGradient d;
    public final Matrix f38737e;
    public float f38738f;
    public float f38739g;
    public final q9 h;
    public int f38740i;
    public int f38741j;

    public q80(q9 q9Var, String str, int i7, int i10) {
        Bitmap bitmap;
        try {
            Path b10 = org.telegram.messenger.mz.b(str);
            bitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            float f10 = 512;
            canvas.scale(i7 / f10, i10 / f10);
            Paint paint = new Paint();
            paint.setColor(-1);
            canvas.drawPath(b10, paint);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            bitmap = null;
        }
        this.f38734a = bitmap;
        this.h = q9Var;
        this.f38737e = new Matrix();
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f38734a;
        if (bitmap == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.n6.f29467h5;
        int i10 = org.telegram.ui.ActionBar.n6.f29485i5;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        int i11 = this.f38740i;
        Paint paint = this.f38735b;
        Matrix matrix = this.f38737e;
        if (i11 != x02 || this.f38741j != x03) {
            this.f38740i = x02;
            this.f38741j = x03;
            int w02 = org.telegram.messenger.g0.w0(x03, x02);
            paint.setColor(x03);
            float L = org.telegram.messenger.g0.L(500.0f);
            this.f38739g = L;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, w02, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f38736c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f38736c = elapsedRealtime;
        this.f38738f = a8.p0.f((float) abs, this.f38739g, 1800.0f, this.f38738f);
        while (true) {
            float f10 = this.f38738f;
            float f11 = this.f38739g * 2.0f;
            if (f10 >= f11) {
                this.f38738f = f10 - f11;
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
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
