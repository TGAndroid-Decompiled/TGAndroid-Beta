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
public final class da0 extends Drawable {
    public final int f32806a;
    public boolean f32807b;
    public Object f32808c;
    public Object d;
    public Object f32809e;

    public da0(int i7) {
        this.f32806a = i7;
        switch (i7) {
            case 1:
                this.f32808c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.f32809e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                return;
        }
    }

    public void b(int i7, int i10) {
        ((Paint) this.f32808c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        zg0 zg0Var;
        switch (this.f32806a) {
            case 0:
                zg0 zg0Var2 = (zg0) this.d;
                zg0 zg0Var3 = (zg0) this.f32808c;
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.g0.L(12.0f), getBounds().centerY() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + getBounds().centerX(), org.telegram.messenger.g0.L(12.0f) + getBounds().centerY());
                if (((zg0) this.f32809e).A()) {
                    zg0 zg0Var4 = (zg0) this.f32809e;
                    boolean z9 = this.f32807b;
                    if (z9) {
                        zg0Var = zg0Var3;
                    } else {
                        zg0Var = zg0Var2;
                    }
                    if (zg0Var4 != zg0Var) {
                        if (z9) {
                            zg0Var2 = zg0Var3;
                        }
                        this.f32809e = zg0Var2;
                        zg0Var2.M(zg0Var2.f40931e[0] - 1);
                    }
                }
                ((zg0) this.f32809e).setBounds(rect);
                ((zg0) this.f32809e).draw(canvas);
                return;
            default:
                Paint paint = (Paint) this.d;
                float L = org.telegram.messenger.g0.L(10.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.f32809e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, L, L, (Paint) this.f32808c);
                if (this.f32807b) {
                    float L2 = org.telegram.messenger.g0.L(1.0f);
                    paint.setStrokeWidth(L2);
                    matrix.reset();
                    matrix.postTranslate(rectF.left, rectF.top);
                    float f10 = L2 / 2.0f;
                    rectF.inset(f10, f10);
                    canvas.drawRoundRect(rectF, L, L, paint);
                    return;
                }
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f32806a) {
            case 0:
                return org.telegram.messenger.g0.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f32806a) {
            case 0:
                return org.telegram.messenger.g0.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f32806a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f32806a) {
            case 0:
                ((zg0) this.f32808c).setAlpha(i7);
                ((zg0) this.d).setAlpha(i7);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f32806a) {
            case 0:
                ((zg0) this.f32808c).setColorFilter(colorFilter);
                ((zg0) this.d).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    private final void a(int i7) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
