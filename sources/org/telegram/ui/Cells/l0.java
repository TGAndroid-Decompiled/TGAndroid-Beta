package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hr0;
public final class l0 extends Drawable {
    public final int f22657a;
    public final Paint f22658b;
    public final Object f22659c;
    public final Object d;

    public l0(t1 t1Var, int[] iArr, Paint paint) {
        this.f22657a = 0;
        this.f22659c = t1Var;
        this.d = iArr;
        this.f22658b = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f22657a) {
            case 0:
                t1 t1Var = (t1) this.f22659c;
                int v = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21445ra, t1Var.Id), org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21572y6, t1Var.Id)));
                int[] iArr = (int[]) this.d;
                int i10 = iArr[0];
                Paint paint = this.f22658b;
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
                hr0 hr0Var = (hr0) this.d;
                float min = Math.min(bounds.top, hr0Var.f27136n - hr0Var.f27120b.getY());
                int themedColor = hr0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5);
                Paint paint2 = this.f22658b;
                paint2.setColor(themedColor);
                Path path = (Path) this.f22659c;
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
        switch (this.f22657a) {
            case 0:
                return -2;
            default:
                return -3;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f22657a) {
            case 0:
                this.f22658b.setAlpha(org.telegram.ui.ActionBar.k6.o1(i10 / 255.0f, ((int[]) this.d)[0]));
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f22657a) {
            case 0:
                this.f22658b.setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public l0(hr0 hr0Var) {
        this.f22657a = 1;
        this.d = hr0Var;
        this.f22658b = new Paint(1);
        this.f22659c = new Path();
    }

    private final void a(int i10) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
