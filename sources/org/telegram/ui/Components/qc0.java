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
public final class qc0 extends Drawable {
    public final int f30144a;
    public boolean f30145b;
    public Object f30146c;
    public Object d;
    public Object f30147e;

    public qc0(int i10) {
        this.f30144a = i10;
        switch (i10) {
            case 1:
                this.f30146c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.f30147e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                return;
        }
    }

    public void b(int i10, int i11) {
        ((Paint) this.f30146c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        ck0 ck0Var;
        switch (this.f30144a) {
            case 0:
                ck0 ck0Var2 = (ck0) this.d;
                ck0 ck0Var3 = (ck0) this.f30146c;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(12.0f), getBounds().centerY() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + getBounds().centerX(), AndroidUtilities.dp(12.0f) + getBounds().centerY());
                if (((ck0) this.f30147e).A()) {
                    ck0 ck0Var4 = (ck0) this.f30147e;
                    boolean z10 = this.f30145b;
                    if (z10) {
                        ck0Var = ck0Var3;
                    } else {
                        ck0Var = ck0Var2;
                    }
                    if (ck0Var4 != ck0Var) {
                        if (z10) {
                            ck0Var2 = ck0Var3;
                        }
                        this.f30147e = ck0Var2;
                        ck0Var2.M(ck0Var2.f25401e[0] - 1);
                    }
                }
                ((ck0) this.f30147e).setBounds(rect);
                ((ck0) this.f30147e).draw(canvas);
                return;
            default:
                Paint paint = (Paint) this.d;
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.f30147e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, dp, dp, (Paint) this.f30146c);
                if (this.f30145b) {
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
        switch (this.f30144a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f30144a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f30144a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f30144a) {
            case 0:
                ((ck0) this.f30146c).setAlpha(i10);
                ((ck0) this.d).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f30144a) {
            case 0:
                ((ck0) this.f30146c).setColorFilter(colorFilter);
                ((ck0) this.d).setColorFilter(colorFilter);
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
