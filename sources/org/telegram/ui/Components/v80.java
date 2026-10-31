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
public final class v80 extends Drawable {
    public final Bitmap f31190a;
    public final Paint f31191b = new Paint(2);
    public long f31192c;
    public LinearGradient d;
    public final Matrix e;
    public float f31193f;
    public float f31194g;
    public final g9 h;
    public int f31195i;
    public int f31196j;

    public v80(g9 g9Var, String str, int i10, int i11) {
        Bitmap bitmap;
        try {
            Path b10 = org.telegram.messenger.d00.b(str);
            bitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            float f7 = 512;
            canvas.scale(i10 / f7, i11 / f7);
            Paint paint = new Paint();
            paint.setColor(-1);
            canvas.drawPath(b10, paint);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            bitmap = null;
        }
        this.f31190a = bitmap;
        this.h = g9Var;
        this.e = new Matrix();
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f31190a;
        if (bitmap == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.f21001h5;
        int i11 = org.telegram.ui.ActionBar.t6.f21019i5;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        int i12 = this.f31195i;
        Paint paint = this.f31191b;
        Matrix matrix = this.e;
        if (i12 != x02 || this.f31196j != x03) {
            this.f31195i = x02;
            this.f31196j = x03;
            int w02 = org.telegram.messenger.i0.w0(x03, x02);
            paint.setColor(x03);
            float L = org.telegram.messenger.i0.L(500.0f);
            this.f31194g = L;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, w02, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f31192c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f31192c = elapsedRealtime;
        this.f31193f = a1.g.A((float) abs, this.f31194g, 1800.0f, this.f31193f);
        while (true) {
            float f7 = this.f31193f;
            float f10 = this.f31194g * 2.0f;
            if (f7 >= f10) {
                this.f31193f = f7 - f10;
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
