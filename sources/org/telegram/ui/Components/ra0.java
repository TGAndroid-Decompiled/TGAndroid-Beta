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
public final class ra0 extends Drawable {
    public final int f39127a;
    public boolean f39128b;
    public Object f39129c;
    public Object d;
    public Object f39130e;

    public ra0(int i7) {
        this.f39127a = i7;
        switch (i7) {
            case 1:
                this.f39129c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.f39130e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                return;
        }
    }

    public void b(int i7, int i10) {
        ((Paint) this.f39129c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        oh0 oh0Var;
        switch (this.f39127a) {
            case 0:
                oh0 oh0Var2 = (oh0) this.d;
                oh0 oh0Var3 = (oh0) this.f39129c;
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.g0.L(12.0f), getBounds().centerY() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + getBounds().centerX(), org.telegram.messenger.g0.L(12.0f) + getBounds().centerY());
                if (((oh0) this.f39130e).A()) {
                    oh0 oh0Var4 = (oh0) this.f39130e;
                    boolean z10 = this.f39128b;
                    if (z10) {
                        oh0Var = oh0Var3;
                    } else {
                        oh0Var = oh0Var2;
                    }
                    if (oh0Var4 != oh0Var) {
                        if (z10) {
                            oh0Var2 = oh0Var3;
                        }
                        this.f39130e = oh0Var2;
                        oh0Var2.M(oh0Var2.f38217e[0] - 1);
                    }
                }
                ((oh0) this.f39130e).setBounds(rect);
                ((oh0) this.f39130e).draw(canvas);
                return;
            default:
                Paint paint = (Paint) this.d;
                float L = org.telegram.messenger.g0.L(10.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.f39130e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, L, L, (Paint) this.f39129c);
                if (this.f39128b) {
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
        switch (this.f39127a) {
            case 0:
                return org.telegram.messenger.g0.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f39127a) {
            case 0:
                return org.telegram.messenger.g0.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f39127a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f39127a) {
            case 0:
                ((oh0) this.f39129c).setAlpha(i7);
                ((oh0) this.d).setAlpha(i7);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f39127a) {
            case 0:
                ((oh0) this.f39129c).setColorFilter(colorFilter);
                ((oh0) this.d).setColorFilter(colorFilter);
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
