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
public final class va0 extends Drawable {
    public final int f31203a;
    public boolean f31204b;
    public Object f31205c;
    public Object d;
    public Object e;

    public va0(int i10) {
        this.f31203a = i10;
        switch (i10) {
            case 1:
                this.f31205c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                return;
        }
    }

    public void b(int i10, int i11) {
        ((Paint) this.f31205c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(28.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        bi0 bi0Var;
        switch (this.f31203a) {
            case 0:
                bi0 bi0Var2 = (bi0) this.d;
                bi0 bi0Var3 = (bi0) this.f31205c;
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.i0.L(12.0f), getBounds().centerY() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + getBounds().centerX(), org.telegram.messenger.i0.L(12.0f) + getBounds().centerY());
                if (((bi0) this.e).A()) {
                    bi0 bi0Var4 = (bi0) this.e;
                    boolean z10 = this.f31204b;
                    if (z10) {
                        bi0Var = bi0Var3;
                    } else {
                        bi0Var = bi0Var2;
                    }
                    if (bi0Var4 != bi0Var) {
                        if (z10) {
                            bi0Var2 = bi0Var3;
                        }
                        this.e = bi0Var2;
                        bi0Var2.M(bi0Var2.e[0] - 1);
                    }
                }
                ((bi0) this.e).setBounds(rect);
                ((bi0) this.e).draw(canvas);
                return;
            default:
                Paint paint = (Paint) this.d;
                float L = org.telegram.messenger.i0.L(10.0f);
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, L, L, (Paint) this.f31205c);
                if (this.f31204b) {
                    float L2 = org.telegram.messenger.i0.L(1.0f);
                    paint.setStrokeWidth(L2);
                    matrix.reset();
                    matrix.postTranslate(rectF.left, rectF.top);
                    float f7 = L2 / 2.0f;
                    rectF.inset(f7, f7);
                    canvas.drawRoundRect(rectF, L, L, paint);
                    return;
                }
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f31203a) {
            case 0:
                return org.telegram.messenger.i0.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f31203a) {
            case 0:
                return org.telegram.messenger.i0.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f31203a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f31203a) {
            case 0:
                ((bi0) this.f31205c).setAlpha(i10);
                ((bi0) this.d).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f31203a) {
            case 0:
                ((bi0) this.f31205c).setColorFilter(colorFilter);
                ((bi0) this.d).setColorFilter(colorFilter);
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
