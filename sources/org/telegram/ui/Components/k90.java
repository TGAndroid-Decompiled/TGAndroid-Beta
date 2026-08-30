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
public final class k90 extends Drawable {
    public final Bitmap f26233a;
    public long f26235c;
    public LinearGradient d;
    public float f26236f;
    public float f26237g;
    public final p9 h;
    public int f26238i;
    public int f26239j;
    public final Paint f26234b = new Paint(2);
    public final Matrix e = new Matrix();

    public k90(p9 p9Var, String str, int i10, int i11) {
        this.f26233a = SvgHelper.getBitmapByPathOnly(str, 512, 512, i10, i11);
        this.h = p9Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f26233a;
        if (bitmap == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.f19977h5;
        int i11 = org.telegram.ui.ActionBar.j6.f19995i5;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = this.f26238i;
        Paint paint = this.f26234b;
        Matrix matrix = this.e;
        if (i12 != w02 || this.f26239j != w03) {
            this.f26238i = w02;
            this.f26239j = w03;
            int averageColor = AndroidUtilities.getAverageColor(w03, w02);
            paint.setColor(w03);
            float dp = AndroidUtilities.dp(500.0f);
            this.f26237g = dp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f26235c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f26235c = elapsedRealtime;
        this.f26236f = android.support.v4.media.a.d((float) abs, this.f26237g, 1800.0f, this.f26236f);
        while (true) {
            float f10 = this.f26236f;
            float f11 = this.f26237g * 2.0f;
            if (f10 >= f11) {
                this.f26236f = f10 - f11;
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
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
