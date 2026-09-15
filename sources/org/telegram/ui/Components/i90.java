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
public final class i90 extends Drawable {
    public final Bitmap f24969a;
    public long f24971c;
    public LinearGradient d;
    public float f24972f;
    public float f24973g;
    public final u9 h;
    public int f24974i;
    public int f24975j;
    public final Paint f24970b = new Paint(2);
    public final Matrix e = new Matrix();

    public i90(u9 u9Var, String str, int i10, int i11) {
        this.f24969a = SvgHelper.getBitmapByPathOnly(str, 512, 512, i10, i11);
        this.h = u9Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f24969a;
        if (bitmap == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.i6.f18907h5;
        int i11 = org.telegram.ui.ActionBar.i6.f18925i5;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        int w03 = org.telegram.ui.ActionBar.i6.w0(null, i11, false);
        int i12 = this.f24974i;
        Paint paint = this.f24970b;
        Matrix matrix = this.e;
        if (i12 != w02 || this.f24975j != w03) {
            this.f24974i = w02;
            this.f24975j = w03;
            int averageColor = AndroidUtilities.getAverageColor(w03, w02);
            paint.setColor(w03);
            float dp = AndroidUtilities.dp(500.0f);
            this.f24973g = dp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f24971c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f24971c = elapsedRealtime;
        this.f24972f = a4.a.A((float) abs, this.f24973g, 1800.0f, this.f24972f);
        while (true) {
            float f7 = this.f24972f;
            float f10 = this.f24973g * 2.0f;
            if (f7 >= f10) {
                this.f24972f = f7 - f10;
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
