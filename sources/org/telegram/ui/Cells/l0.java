package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr0;
public final class l0 extends Drawable {
    public final int f24375a;
    public final Paint f24376b;
    public final Object f24377c;
    public final Object d;

    public l0(s1 s1Var, int[] iArr, Paint paint) {
        this.f24375a = 0;
        this.f24377c = s1Var;
        this.d = iArr;
        this.f24376b = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f24375a) {
            case 0:
                s1 s1Var = (s1) this.f24377c;
                int v = org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23619ra, s1Var.Id), org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23749y6, s1Var.Id)));
                int[] iArr = (int[]) this.d;
                int i10 = iArr[0];
                Paint paint = this.f24376b;
                if (v != i10) {
                    int alpha = paint.getAlpha();
                    iArr[0] = v;
                    paint.setColor(v);
                    paint.setAlpha(alpha);
                }
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                return;
            default:
                Rect bounds = getBounds();
                float dp = AndroidUtilities.dp(25.0f);
                nr0 nr0Var = (nr0) this.d;
                float min = Math.min(bounds.top, nr0Var.f31045n - nr0Var.f31031b.getY());
                int themedColor = nr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5);
                Paint paint2 = this.f24376b;
                paint2.setColor(themedColor);
                Path path = (Path) this.f24377c;
                path.rewind();
                path.addRoundRect(bounds.left, min, bounds.right, bounds.bottom + dp, dp, dp, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(bounds);
                canvas.drawPath(path, paint2);
                canvas.restore();
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f24375a) {
            case 0:
                return -2;
            default:
                return -3;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f24375a) {
            case 0:
                this.f24376b.setAlpha(org.telegram.ui.ActionBar.y6.o1(i10 / 255.0f, ((int[]) this.d)[0]));
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f24375a) {
            case 0:
                this.f24376b.setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public l0(nr0 nr0Var) {
        this.f24375a = 1;
        this.d = nr0Var;
        this.f24376b = new Paint(1);
        this.f24377c = new Path();
    }

    private final void a(int i10) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
