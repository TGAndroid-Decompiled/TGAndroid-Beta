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
public final class pa0 extends Drawable {
    public final int f38331a;
    public boolean f38332b;
    public Object f38333c;
    public Object d;
    public Object f38334e;

    public pa0(int i7) {
        this.f38331a = i7;
        switch (i7) {
            case 1:
                this.f38333c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.f38334e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                return;
        }
    }

    public void b(int i7, int i10) {
        ((Paint) this.f38333c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        mh0 mh0Var;
        switch (this.f38331a) {
            case 0:
                mh0 mh0Var2 = (mh0) this.d;
                mh0 mh0Var3 = (mh0) this.f38333c;
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.g0.L(12.0f), getBounds().centerY() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + getBounds().centerX(), org.telegram.messenger.g0.L(12.0f) + getBounds().centerY());
                if (((mh0) this.f38334e).A()) {
                    mh0 mh0Var4 = (mh0) this.f38334e;
                    boolean z10 = this.f38332b;
                    if (z10) {
                        mh0Var = mh0Var3;
                    } else {
                        mh0Var = mh0Var2;
                    }
                    if (mh0Var4 != mh0Var) {
                        if (z10) {
                            mh0Var2 = mh0Var3;
                        }
                        this.f38334e = mh0Var2;
                        mh0Var2.M(mh0Var2.f37486e[0] - 1);
                    }
                }
                ((mh0) this.f38334e).setBounds(rect);
                ((mh0) this.f38334e).draw(canvas);
                return;
            default:
                Paint paint = (Paint) this.d;
                float L = org.telegram.messenger.g0.L(10.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.f38334e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, L, L, (Paint) this.f38333c);
                if (this.f38332b) {
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
        switch (this.f38331a) {
            case 0:
                return org.telegram.messenger.g0.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f38331a) {
            case 0:
                return org.telegram.messenger.g0.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f38331a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f38331a) {
            case 0:
                ((mh0) this.f38333c).setAlpha(i7);
                ((mh0) this.d).setAlpha(i7);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f38331a) {
            case 0:
                ((mh0) this.f38333c).setColorFilter(colorFilter);
                ((mh0) this.d).setColorFilter(colorFilter);
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
