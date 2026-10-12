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
public final class uc0 extends Drawable {
    public final int f31134a;
    public boolean f31135b;
    public Object f31136c;
    public Object d;
    public Object f31137e;

    public uc0(int i10) {
        this.f31134a = i10;
        switch (i10) {
            case 1:
                this.f31136c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.f31137e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                return;
        }
    }

    public void b(int i10, int i11) {
        ((Paint) this.f31136c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        fk0 fk0Var;
        switch (this.f31134a) {
            case 0:
                fk0 fk0Var2 = (fk0) this.d;
                fk0 fk0Var3 = (fk0) this.f31136c;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(12.0f), getBounds().centerY() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + getBounds().centerX(), AndroidUtilities.dp(12.0f) + getBounds().centerY());
                if (((fk0) this.f31137e).A()) {
                    fk0 fk0Var4 = (fk0) this.f31137e;
                    boolean z10 = this.f31135b;
                    if (z10) {
                        fk0Var = fk0Var3;
                    } else {
                        fk0Var = fk0Var2;
                    }
                    if (fk0Var4 != fk0Var) {
                        if (z10) {
                            fk0Var2 = fk0Var3;
                        }
                        this.f31137e = fk0Var2;
                        fk0Var2.M(fk0Var2.f26109e[0] - 1);
                    }
                }
                ((fk0) this.f31137e).setBounds(rect);
                ((fk0) this.f31137e).draw(canvas);
                return;
            default:
                Paint paint = (Paint) this.d;
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.f31137e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, dp, dp, (Paint) this.f31136c);
                if (this.f31135b) {
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
        switch (this.f31134a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f31134a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f31134a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f31134a) {
            case 0:
                ((fk0) this.f31136c).setAlpha(i10);
                ((fk0) this.d).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f31134a) {
            case 0:
                ((fk0) this.f31136c).setColorFilter(colorFilter);
                ((fk0) this.d).setColorFilter(colorFilter);
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
