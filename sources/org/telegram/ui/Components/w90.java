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
public final class w90 extends Drawable {
    public final Bitmap f32497a;
    public long f32499c;
    public LinearGradient d;
    public float f32501f;
    public float f32502g;
    public final w9 h;
    public int f32503i;
    public int f32504j;
    public final Paint f32498b = new Paint(2);
    public final Matrix f32500e = new Matrix();

    public w90(w9 w9Var, String str, int i10, int i11) {
        this.f32497a = SvgHelper.getBitmapByPathOnly(str, 512, 512, i10, i11);
        this.h = w9Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f32497a;
        if (bitmap == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.i6.f20889h5;
        int i11 = org.telegram.ui.ActionBar.i6.f20907i5;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        int w03 = org.telegram.ui.ActionBar.i6.w0(null, i11, false);
        int i12 = this.f32503i;
        Paint paint = this.f32498b;
        Matrix matrix = this.f32500e;
        if (i12 != w02 || this.f32504j != w03) {
            this.f32503i = w02;
            this.f32504j = w03;
            int averageColor = AndroidUtilities.getAverageColor(w03, w02);
            paint.setColor(w03);
            float dp = AndroidUtilities.dp(500.0f);
            this.f32502g = dp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f32499c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f32499c = elapsedRealtime;
        this.f32501f = a4.a.A((float) abs, this.f32502g, 1800.0f, this.f32501f);
        while (true) {
            float f7 = this.f32501f;
            float f10 = this.f32502g * 2.0f;
            if (f7 >= f10) {
                this.f32501f = f7 - f10;
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
