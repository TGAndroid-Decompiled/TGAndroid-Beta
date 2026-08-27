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

public final class v80 extends Drawable {

    public final Bitmap f33306a;

    public long f33308c;
    public LinearGradient d;

    public float f33310f;

    public float f33311g;
    public final n9 h;

    public int f33312i;

    public int f33313j;

    public final Paint f33307b = new Paint(2);

    public final Matrix f33309e = new Matrix();

    public v80(n9 n9Var, String str, int i10, int i11) {
        this.f33306a = SvgHelper.getBitmapByPathOnly(str, 512, 512, i10, i11);
        this.h = n9Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f33306a;
        if (bitmap == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.f23124h5;
        int i11 = org.telegram.ui.ActionBar.g6.f23143i5;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int i12 = this.f33312i;
        Paint paint = this.f33307b;
        Matrix matrix = this.f33309e;
        if (i12 != iW0 || this.f33313j != iW1) {
            this.f33312i = iW0;
            this.f33313j = iW1;
            int averageColor = AndroidUtilities.getAverageColor(iW1, iW0);
            paint.setColor(iW1);
            float fDp = AndroidUtilities.dp(500.0f);
            this.f33311g = fDp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, fDp, 0.0f, new int[]{iW1, averageColor, iW1}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jAbs = Math.abs(this.f33308c - jElapsedRealtime);
        if (jAbs > 17) {
            jAbs = 16;
        }
        this.f33308c = jElapsedRealtime;
        this.f33310f = a9.p.d(jAbs, this.f33311g, 1800.0f, this.f33310f);
        while (true) {
            float f10 = this.f33310f;
            float f11 = this.f33311g * 2.0f;
            if (f10 < f11) {
                matrix.setTranslate(f10, 0.0f);
                this.d.setLocalMatrix(matrix);
                this.h.invalidate();
                return;
            }
            this.f33310f = f10 - f11;
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
