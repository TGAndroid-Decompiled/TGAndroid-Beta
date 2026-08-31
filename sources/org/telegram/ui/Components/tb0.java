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
public final class tb0 extends Drawable {
    public final int f31312a;
    public boolean f31313b;
    public Object f31314c;
    public Object d;
    public Object f31315e;

    public tb0(int i10) {
        this.f31312a = i10;
        switch (i10) {
            case 1:
                this.f31314c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.f31315e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                return;
        }
    }

    public void b(int i10, int i11) {
        ((Paint) this.f31314c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        ij0 ij0Var;
        switch (this.f31312a) {
            case 0:
                ij0 ij0Var2 = (ij0) this.d;
                ij0 ij0Var3 = (ij0) this.f31314c;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(12.0f), getBounds().centerY() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + getBounds().centerX(), AndroidUtilities.dp(12.0f) + getBounds().centerY());
                if (((ij0) this.f31315e).y()) {
                    ij0 ij0Var4 = (ij0) this.f31315e;
                    boolean z4 = this.f31313b;
                    if (z4) {
                        ij0Var = ij0Var3;
                    } else {
                        ij0Var = ij0Var2;
                    }
                    if (ij0Var4 != ij0Var) {
                        if (z4) {
                            ij0Var2 = ij0Var3;
                        }
                        this.f31315e = ij0Var2;
                        ij0Var2.K(ij0Var2.f27817e[0] - 1);
                    }
                }
                ((ij0) this.f31315e).setBounds(rect);
                ((ij0) this.f31315e).draw(canvas);
                return;
            default:
                Paint paint = (Paint) this.d;
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.f31315e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, dp, dp, (Paint) this.f31314c);
                if (this.f31313b) {
                    float dp2 = AndroidUtilities.dp(1.0f);
                    paint.setStrokeWidth(dp2);
                    matrix.reset();
                    matrix.postTranslate(rectF.left, rectF.top);
                    float f10 = dp2 / 2.0f;
                    rectF.inset(f10, f10);
                    canvas.drawRoundRect(rectF, dp, dp, paint);
                    return;
                }
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f31312a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f31312a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f31312a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f31312a) {
            case 0:
                ((ij0) this.f31314c).setAlpha(i10);
                ((ij0) this.d).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f31312a) {
            case 0:
                ((ij0) this.f31314c).setColorFilter(colorFilter);
                ((ij0) this.d).setColorFilter(colorFilter);
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
