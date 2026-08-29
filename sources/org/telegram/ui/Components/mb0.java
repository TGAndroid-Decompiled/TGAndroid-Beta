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
public final class mb0 extends Drawable {
    public final int f30640a;
    public boolean f30641b;
    public Object f30642c;
    public Object d;
    public Object f30643e;

    public mb0(int i10) {
        this.f30640a = i10;
        switch (i10) {
            case 1:
                this.f30642c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.f30643e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                return;
        }
    }

    public void b(int i10, int i11) {
        ((Paint) this.f30642c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        xi0 xi0Var;
        switch (this.f30640a) {
            case 0:
                xi0 xi0Var2 = (xi0) this.d;
                xi0 xi0Var3 = (xi0) this.f30642c;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(12.0f), getBounds().centerY() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + getBounds().centerX(), AndroidUtilities.dp(12.0f) + getBounds().centerY());
                if (((xi0) this.f30643e).y()) {
                    xi0 xi0Var4 = (xi0) this.f30643e;
                    boolean z10 = this.f30641b;
                    if (z10) {
                        xi0Var = xi0Var3;
                    } else {
                        xi0Var = xi0Var2;
                    }
                    if (xi0Var4 != xi0Var) {
                        if (z10) {
                            xi0Var2 = xi0Var3;
                        }
                        this.f30643e = xi0Var2;
                        xi0Var2.K(xi0Var2.f34737e[0] - 1);
                    }
                }
                ((xi0) this.f30643e).setBounds(rect);
                ((xi0) this.f30643e).draw(canvas);
                return;
            default:
                Paint paint = (Paint) this.d;
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.f30643e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, dp, dp, (Paint) this.f30642c);
                if (this.f30641b) {
                    float dp2 = AndroidUtilities.dp(1.0f);
                    paint.setStrokeWidth(dp2);
                    matrix.reset();
                    matrix.postTranslate(rectF.left, rectF.top);
                    float f9 = dp2 / 2.0f;
                    rectF.inset(f9, f9);
                    canvas.drawRoundRect(rectF, dp, dp, paint);
                    return;
                }
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f30640a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f30640a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f30640a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f30640a) {
            case 0:
                ((xi0) this.f30642c).setAlpha(i10);
                ((xi0) this.d).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f30640a) {
            case 0:
                ((xi0) this.f30642c).setColorFilter(colorFilter);
                ((xi0) this.d).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    private final void a(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
