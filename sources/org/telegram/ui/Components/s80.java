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
public final class s80 extends Drawable {
    public final Bitmap f39523a;
    public final Paint f39524b = new Paint(2);
    public long f39525c;
    public LinearGradient d;
    public final Matrix f39526e;
    public float f39527f;
    public float f39528g;
    public final q9 h;
    public int f39529i;
    public int f39530j;

    public s80(q9 q9Var, String str, int i7, int i10) {
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
        this.f39523a = bitmap;
        this.h = q9Var;
        this.f39526e = new Matrix();
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f39523a;
        if (bitmap == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.m6.f29451h5;
        int i10 = org.telegram.ui.ActionBar.m6.f29469i5;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        int i11 = this.f39529i;
        Paint paint = this.f39524b;
        Matrix matrix = this.f39526e;
        if (i11 != x02 || this.f39530j != x03) {
            this.f39529i = x02;
            this.f39530j = x03;
            int w02 = org.telegram.messenger.g0.w0(x03, x02);
            paint.setColor(x03);
            float L = org.telegram.messenger.g0.L(500.0f);
            this.f39528g = L;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, w02, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f39525c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f39525c = elapsedRealtime;
        this.f39527f = a8.p0.f((float) abs, this.f39528g, 1800.0f, this.f39527f);
        while (true) {
            float f10 = this.f39527f;
            float f11 = this.f39528g * 2.0f;
            if (f10 >= f11) {
                this.f39527f = f10 - f11;
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
