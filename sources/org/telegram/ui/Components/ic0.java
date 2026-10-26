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
public final class ic0 extends Drawable {
    public final int f29277a;
    public boolean f29278b;
    public Object f29279c;
    public Object d;
    public Object e;

    public ic0(int i10) {
        this.f29277a = i10;
        switch (i10) {
            case 1:
                this.f29279c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                return;
        }
    }

    public void b(int i10, int i11) {
        ((Paint) this.f29279c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        xj0 xj0Var;
        switch (this.f29277a) {
            case 0:
                xj0 xj0Var2 = (xj0) this.d;
                xj0 xj0Var3 = (xj0) this.f29279c;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(12.0f), getBounds().centerY() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + getBounds().centerX(), AndroidUtilities.dp(12.0f) + getBounds().centerY());
                if (((xj0) this.e).A()) {
                    xj0 xj0Var4 = (xj0) this.e;
                    boolean z10 = this.f29278b;
                    if (z10) {
                        xj0Var = xj0Var3;
                    } else {
                        xj0Var = xj0Var2;
                    }
                    if (xj0Var4 != xj0Var) {
                        if (z10) {
                            xj0Var2 = xj0Var3;
                        }
                        this.e = xj0Var2;
                        xj0Var2.M(xj0Var2.e[0] - 1);
                    }
                }
                ((xj0) this.e).setBounds(rect);
                ((xj0) this.e).draw(canvas);
                return;
            default:
                Paint paint = (Paint) this.d;
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, dp, dp, (Paint) this.f29279c);
                if (this.f29278b) {
                    float dp2 = AndroidUtilities.dp(1.0f);
                    paint.setStrokeWidth(dp2);
                    matrix.reset();
                    matrix.postTranslate(rectF.left, rectF.top);
                    float f7 = dp2 / 2.0f;
                    rectF.inset(f7, f7);
                    canvas.drawRoundRect(rectF, dp, dp, paint);
                    return;
                }
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f29277a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f29277a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f29277a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f29277a) {
            case 0:
                ((xj0) this.f29279c).setAlpha(i10);
                ((xj0) this.d).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f29277a) {
            case 0:
                ((xj0) this.f29279c).setColorFilter(colorFilter);
                ((xj0) this.d).setColorFilter(colorFilter);
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
