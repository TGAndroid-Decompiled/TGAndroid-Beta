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
public final class m90 extends Drawable {
    public final Bitmap f28996a;
    public long f28998c;
    public LinearGradient d;
    public float f29000f;
    public float f29001g;
    public final p9 h;
    public int f29002i;
    public int f29003j;
    public final Paint f28997b = new Paint(2);
    public final Matrix f28999e = new Matrix();

    public m90(p9 p9Var, String str, int i10, int i11) {
        this.f28996a = SvgHelper.getBitmapByPathOnly(str, 512, 512, i10, i11);
        this.h = p9Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f28996a;
        if (bitmap == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.f21731h5;
        int i11 = org.telegram.ui.ActionBar.k6.f21749i5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        int w03 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
        int i12 = this.f29002i;
        Paint paint = this.f28997b;
        Matrix matrix = this.f28999e;
        if (i12 != w02 || this.f29003j != w03) {
            this.f29002i = w02;
            this.f29003j = w03;
            int averageColor = AndroidUtilities.getAverageColor(w03, w02);
            paint.setColor(w03);
            float dp = AndroidUtilities.dp(500.0f);
            this.f29001g = dp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f28998c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f28998c = elapsedRealtime;
        this.f29000f = android.support.v4.media.a.d((float) abs, this.f29001g, 1800.0f, this.f29000f);
        while (true) {
            float f10 = this.f29000f;
            float f11 = this.f29001g * 2.0f;
            if (f10 >= f11) {
                this.f29000f = f10 - f11;
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
