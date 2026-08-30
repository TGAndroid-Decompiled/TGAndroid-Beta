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
public final class rb0 extends Drawable {
    public final int f28437a;
    public boolean f28438b;
    public Object f28439c;
    public Object d;
    public Object e;

    public rb0(int i10) {
        this.f28437a = i10;
        switch (i10) {
            case 1:
                this.f28439c = new Paint(1);
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
        ((Paint) this.f28439c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        gj0 gj0Var;
        switch (this.f28437a) {
            case 0:
                gj0 gj0Var2 = (gj0) this.d;
                gj0 gj0Var3 = (gj0) this.f28439c;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(12.0f), getBounds().centerY() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + getBounds().centerX(), AndroidUtilities.dp(12.0f) + getBounds().centerY());
                if (((gj0) this.e).y()) {
                    gj0 gj0Var4 = (gj0) this.e;
                    boolean z4 = this.f28438b;
                    if (z4) {
                        gj0Var = gj0Var3;
                    } else {
                        gj0Var = gj0Var2;
                    }
                    if (gj0Var4 != gj0Var) {
                        if (z4) {
                            gj0Var2 = gj0Var3;
                        }
                        this.e = gj0Var2;
                        gj0Var2.K(gj0Var2.e[0] - 1);
                    }
                }
                ((gj0) this.e).setBounds(rect);
                ((gj0) this.e).draw(canvas);
                return;
            default:
                Paint paint = (Paint) this.d;
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, dp, dp, (Paint) this.f28439c);
                if (this.f28438b) {
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
        switch (this.f28437a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f28437a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f28437a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f28437a) {
            case 0:
                ((gj0) this.f28439c).setAlpha(i10);
                ((gj0) this.d).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f28437a) {
            case 0:
                ((gj0) this.f28439c).setColorFilter(colorFilter);
                ((gj0) this.d).setColorFilter(colorFilter);
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
