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
public final class y90 extends Drawable {
    public final int f40667a;
    public boolean f40668b;
    public Object f40669c;
    public Object d;
    public Object f40670e;

    public y90(int i3) {
        this.f40667a = i3;
        switch (i3) {
            case 1:
                this.f40669c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.f40670e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                return;
        }
    }

    public void b(int i3, int i10) {
        ((Paint) this.f40669c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{i3, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        ch0 ch0Var;
        switch (this.f40667a) {
            case 0:
                ch0 ch0Var2 = (ch0) this.d;
                ch0 ch0Var3 = (ch0) this.f40669c;
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.g0.L(12.0f), getBounds().centerY() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + getBounds().centerX(), org.telegram.messenger.g0.L(12.0f) + getBounds().centerY());
                if (((ch0) this.f40670e).A()) {
                    ch0 ch0Var4 = (ch0) this.f40670e;
                    boolean z10 = this.f40668b;
                    if (z10) {
                        ch0Var = ch0Var3;
                    } else {
                        ch0Var = ch0Var2;
                    }
                    if (ch0Var4 != ch0Var) {
                        if (z10) {
                            ch0Var2 = ch0Var3;
                        }
                        this.f40670e = ch0Var2;
                        ch0Var2.M(ch0Var2.f32725e[0] - 1);
                    }
                }
                ((ch0) this.f40670e).setBounds(rect);
                ((ch0) this.f40670e).draw(canvas);
                return;
            default:
                Paint paint = (Paint) this.d;
                float L = org.telegram.messenger.g0.L(10.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.f40670e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, L, L, (Paint) this.f40669c);
                if (this.f40668b) {
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
        switch (this.f40667a) {
            case 0:
                return org.telegram.messenger.g0.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f40667a) {
            case 0:
                return org.telegram.messenger.g0.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f40667a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i3) {
        switch (this.f40667a) {
            case 0:
                ((ch0) this.f40669c).setAlpha(i3);
                ((ch0) this.d).setAlpha(i3);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f40667a) {
            case 0:
                ((ch0) this.f40669c).setColorFilter(colorFilter);
                ((ch0) this.d).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    private final void a(int i3) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
