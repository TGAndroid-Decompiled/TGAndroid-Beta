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
public final class y70 extends Drawable {
    public final Bitmap f40643a;
    public final Paint f40644b = new Paint(2);
    public long f40645c;
    public LinearGradient d;
    public final Matrix f40646e;
    public float f40647f;
    public float f40648g;
    public final k9 h;
    public int f40649i;
    public int f40650j;

    public y70(k9 k9Var, String str, int i3, int i10) {
        Bitmap bitmap;
        try {
            Path b10 = org.telegram.messenger.kz.b(str);
            bitmap = Bitmap.createBitmap(i3, i10, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            float f10 = 512;
            canvas.scale(i3 / f10, i10 / f10);
            Paint paint = new Paint();
            paint.setColor(-1);
            canvas.drawPath(b10, paint);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            bitmap = null;
        }
        this.f40643a = bitmap;
        this.h = k9Var;
        this.f40646e = new Matrix();
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f40643a;
        if (bitmap == null) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.f27954h5;
        int i10 = org.telegram.ui.ActionBar.k6.f27971i5;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int i11 = this.f40649i;
        Paint paint = this.f40644b;
        Matrix matrix = this.f40646e;
        if (i11 != x02 || this.f40650j != x03) {
            this.f40649i = x02;
            this.f40650j = x03;
            int w02 = org.telegram.messenger.g0.w0(x03, x02);
            paint.setColor(x03);
            float L = org.telegram.messenger.g0.L(500.0f);
            this.f40648g = L;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, w02, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f40645c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f40645c = elapsedRealtime;
        this.f40647f = a1.g.e((float) abs, this.f40648g, 1800.0f, this.f40647f);
        while (true) {
            float f10 = this.f40647f;
            float f11 = this.f40648g * 2.0f;
            if (f10 >= f11) {
                this.f40647f = f10 - f11;
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
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
