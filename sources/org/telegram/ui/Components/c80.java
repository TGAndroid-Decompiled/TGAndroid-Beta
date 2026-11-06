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
public final class c80 extends Drawable {
    public final Bitmap f32464a;
    public final Paint f32465b = new Paint(2);
    public long f32466c;
    public LinearGradient d;
    public final Matrix f32467e;
    public float f32468f;
    public float f32469g;
    public final l9 h;
    public int f32470i;
    public int f32471j;

    public c80(l9 l9Var, String str, int i7, int i10) {
        Bitmap bitmap;
        try {
            Path b10 = org.telegram.messenger.sz.b(str);
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
        this.f32464a = bitmap;
        this.h = l9Var;
        this.f32467e = new Matrix();
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f32464a;
        if (bitmap == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.k6.f27921h5;
        int i10 = org.telegram.ui.ActionBar.k6.f27939i5;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int i11 = this.f32470i;
        Paint paint = this.f32465b;
        Matrix matrix = this.f32467e;
        if (i11 != x02 || this.f32471j != x03) {
            this.f32470i = x02;
            this.f32471j = x03;
            int w02 = org.telegram.messenger.g0.w0(x03, x02);
            paint.setColor(x03);
            float L = org.telegram.messenger.g0.L(500.0f);
            this.f32469g = L;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, w02, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f32466c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f32466c = elapsedRealtime;
        this.f32468f = a8.p0.f((float) abs, this.f32469g, 1800.0f, this.f32468f);
        while (true) {
            float f10 = this.f32468f;
            float f11 = this.f32469g * 2.0f;
            if (f10 >= f11) {
                this.f32468f = f10 - f11;
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
