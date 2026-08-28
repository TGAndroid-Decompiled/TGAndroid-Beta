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
public final class xa0 extends Drawable {
    public final int f34629a;
    public boolean f34630b;
    public Object f34631c;
    public Object d;
    public Object f34632e;

    public xa0(int i9) {
        this.f34629a = i9;
        switch (i9) {
            case 1:
                this.f34631c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.f34632e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                return;
        }
    }

    public void b(int i9, int i10) {
        ((Paint) this.f34631c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{i9, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        mi0 mi0Var;
        switch (this.f34629a) {
            case 0:
                mi0 mi0Var2 = (mi0) this.d;
                mi0 mi0Var3 = (mi0) this.f34631c;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - AndroidUtilities.dp(12.0f), getBounds().centerY() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + getBounds().centerX(), AndroidUtilities.dp(12.0f) + getBounds().centerY());
                if (((mi0) this.f34632e).y()) {
                    mi0 mi0Var4 = (mi0) this.f34632e;
                    boolean z10 = this.f34630b;
                    if (z10) {
                        mi0Var = mi0Var3;
                    } else {
                        mi0Var = mi0Var2;
                    }
                    if (mi0Var4 != mi0Var) {
                        if (z10) {
                            mi0Var2 = mi0Var3;
                        }
                        this.f34632e = mi0Var2;
                        mi0Var2.K(mi0Var2.f30847e[0] - 1);
                    }
                }
                ((mi0) this.f34632e).setBounds(rect);
                ((mi0) this.f34632e).draw(canvas);
                return;
            default:
                Paint paint = (Paint) this.d;
                float dp = AndroidUtilities.dp(10.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.f34632e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, dp, dp, (Paint) this.f34631c);
                if (this.f34630b) {
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
        switch (this.f34629a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f34629a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f34629a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i9) {
        switch (this.f34629a) {
            case 0:
                ((mi0) this.f34631c).setAlpha(i9);
                ((mi0) this.d).setAlpha(i9);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f34629a) {
            case 0:
                ((mi0) this.f34631c).setColorFilter(colorFilter);
                ((mi0) this.d).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    private final void a(int i9) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
