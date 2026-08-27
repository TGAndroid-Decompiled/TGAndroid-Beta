package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class bb0 extends Drawable {

    public final int f27059a;

    public boolean f27060b;

    public Object f27061c;
    public Object d;

    public Object f27062e;

    public bb0(int i10) {
        this.f27059a = i10;
        switch (i10) {
            case 1:
                this.f27061c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.f27062e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                break;
        }
    }

    public void b(int i10, int i11) {
        ((Paint) this.f27061c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f27059a) {
            case 0:
                oi0 oi0Var = (oi0) this.d;
                oi0 oi0Var2 = (oi0) this.f27061c;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(12.0f), getBounds().centerY() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + getBounds().centerX(), AndroidUtilities.dp(12.0f) + getBounds().centerY());
                if (((oi0) this.f27062e).y()) {
                    oi0 oi0Var3 = (oi0) this.f27062e;
                    boolean z10 = this.f27060b;
                    if (oi0Var3 != (z10 ? oi0Var2 : oi0Var)) {
                        if (z10) {
                            oi0Var = oi0Var2;
                        }
                        this.f27062e = oi0Var;
                        oi0Var.K(oi0Var.f31312e[0] - 1);
                    }
                }
                ((oi0) this.f27062e).setBounds(rect);
                ((oi0) this.f27062e).draw(canvas);
                break;
            default:
                Paint paint = (Paint) this.d;
                float fDp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.f27062e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, fDp, fDp, (Paint) this.f27061c);
                if (this.f27060b) {
                    float fDp2 = AndroidUtilities.dp(1.0f);
                    paint.setStrokeWidth(fDp2);
                    matrix.reset();
                    matrix.postTranslate(rectF.left, rectF.top);
                    float f10 = fDp2 / 2.0f;
                    rectF.inset(f10, f10);
                    canvas.drawRoundRect(rectF, fDp, fDp, paint);
                }
                break;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f27059a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f27059a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f27059a) {
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f27059a) {
            case 0:
                ((oi0) this.f27061c).setAlpha(i10);
                ((oi0) this.d).setAlpha(i10);
                break;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f27059a) {
            case 0:
                ((oi0) this.f27061c).setColorFilter(colorFilter);
                ((oi0) this.d).setColorFilter(colorFilter);
                break;
        }
    }

    private final void a(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
