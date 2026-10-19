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
public final class da0 extends Drawable {
    public final Bitmap f25517a;
    public long f25519c;
    public LinearGradient d;
    public float f25520f;
    public float f25521g;
    public final w9 h;
    public int f25522i;
    public int f25523j;
    public final Paint f25518b = new Paint(2);
    public final Matrix e = new Matrix();

    public da0(w9 w9Var, String str, int i10, int i11) {
        this.f25517a = SvgHelper.getBitmapByPathOnly(str, 512, 512, i10, i11);
        this.h = w9Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f25517a;
        if (bitmap == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.h6.f21058h5;
        int i11 = org.telegram.ui.ActionBar.h6.f21075i5;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        int x03 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        int i12 = this.f25522i;
        Paint paint = this.f25518b;
        Matrix matrix = this.e;
        if (i12 != x02 || this.f25523j != x03) {
            this.f25522i = x02;
            this.f25523j = x03;
            int averageColor = AndroidUtilities.getAverageColor(x03, x02);
            paint.setColor(x03);
            float dp = AndroidUtilities.dp(500.0f);
            this.f25521g = dp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{x03, averageColor, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.f25519c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.f25519c = elapsedRealtime;
        this.f25520f = a1.g.B((float) abs, this.f25521g, 1800.0f, this.f25520f);
        while (true) {
            float f7 = this.f25520f;
            float f10 = this.f25521g * 2.0f;
            if (f7 >= f10) {
                this.f25520f = f7 - f10;
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
