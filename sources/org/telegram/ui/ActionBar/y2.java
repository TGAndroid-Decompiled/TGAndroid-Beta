package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.rz0;
public final class y2 extends Drawable {
    public final int f21556a;
    public final Object f21557b;
    public final Object f21558c;
    public final Object d;

    public y2(Context context) {
        this.f21556a = 2;
        this.d = new org.telegram.ui.Components.t5(new org.telegram.ui.Components.j0(this, 0), 1200L, gr.h, 0);
        this.f21557b = i0.a.f(context, 2131231494);
        this.f21558c = i0.a.f(context, 2131231495);
    }

    public void c(int i10) {
        Rect rect = (Rect) this.f21558c;
        if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == i10) {
            return;
        }
        rect.set(0, 0, 0, i10);
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f21556a) {
            case 0:
                Paint paint = (Paint) this.f21557b;
                Rect rect = (Rect) this.d;
                if (!rect.isEmpty() && paint.getAlpha() != 0 && !org.telegram.messenger.i0.m0) {
                    canvas.drawRect(rect, paint);
                    return;
                }
                return;
            case 1:
                Paint paint2 = (Paint) this.f21557b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f21558c;
                int w9 = t6.w(t6.w0(t6.f21191ra, q1Var.Ob), t6.r1(0.5f, t6.w0(t6.f21312y6, q1Var.Ob)));
                int[] iArr = (int[]) this.d;
                if (w9 != iArr[0]) {
                    int alpha = paint2.getAlpha();
                    iArr[0] = w9;
                    paint2.setColor(w9);
                    paint2.setAlpha(alpha);
                }
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint2);
                return;
            case 2:
                Rect bounds = getBounds();
                Drawable drawable = (Drawable) this.f21557b;
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                float e = ((org.telegram.ui.Components.t5) this.d).e(false, 1.0f);
                float width = (bounds.width() * 0.352f) + bounds.left;
                float height = (bounds.height() * 0.248f) + bounds.top;
                float width2 = bounds.width() * 0.105f * ((float) (1.0d - Math.sin(org.telegram.messenger.i0.s(e, 0.0f, 2.0f, 1.5f) * 3.141592653589793d)));
                float width3 = (bounds.width() * 0.215f) + bounds.left;
                float height2 = (bounds.height() * 0.43f) + bounds.top;
                float width4 = bounds.width() * 0.09f * ((float) (1.0d - Math.sin(org.telegram.messenger.i0.s(e, 1.0f, 2.0f, 1.5f) * 3.141592653589793d)));
                Drawable drawable2 = (Drawable) this.f21558c;
                drawable2.setBounds((int) (width - width2), (int) (height - width2), (int) (width + width2), (int) (height + width2));
                drawable2.draw(canvas);
                drawable2.setBounds((int) (width3 - width4), (int) (height2 - width4), (int) (width3 + width4), (int) (height2 + width4));
                drawable2.draw(canvas);
                return;
            case 3:
                Rect bounds2 = getBounds();
                float L = org.telegram.messenger.i0.L(25.0f);
                pp0 pp0Var = (pp0) this.d;
                float min = Math.min(bounds2.top, pp0Var.f29486o1 - pp0Var.f29475i1.getY());
                Paint paint3 = (Paint) this.f21557b;
                paint3.setColor(t6.w0(t6.f21002h5, pp0Var.I0));
                Path path = (Path) this.f21558c;
                path.rewind();
                path.addRoundRect(bounds2.left, min, bounds2.right, bounds2.bottom + L, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(bounds2);
                canvas.drawPath(path, paint3);
                canvas.restore();
                return;
            default:
                int i10 = getBounds().left;
                int centerY = getBounds().centerY();
                RectF rectF = org.telegram.messenger.i0.P;
                float f7 = centerY;
                rectF.set(i10, f7 - (org.telegram.messenger.i0.L(18.33f) / 2.0f), getIntrinsicWidth() + i10, (org.telegram.messenger.i0.L(18.33f) / 2.0f) + f7);
                kg.k1 k1Var = (kg.k1) this.d;
                k1Var.e(rectF);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), k1Var.f11143f);
                Drawable drawable3 = (Drawable) this.f21558c;
                drawable3.setBounds(org.telegram.messenger.i0.L(3.33f) + i10, (int) (f7 - ((drawable3.getIntrinsicHeight() * 0.875f) / 2.0f)), (int) ((drawable3.getIntrinsicWidth() * 0.875f) + org.telegram.messenger.i0.L(3.33f) + i10), (int) a1.g.A(drawable3.getIntrinsicHeight(), 0.875f, 2.0f, f7));
                drawable3.draw(canvas);
                ((rz0) this.f21557b).c((drawable3.getIntrinsicWidth() * 0.875f) + org.telegram.messenger.i0.L(3.66f) + i10, f7, 1.0f, -1, canvas);
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f21556a) {
            case 0:
                return ((Paint) this.f21557b).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f21556a) {
            case 2:
                return ((Drawable) this.f21557b).getIntrinsicHeight();
            case 3:
            default:
                return super.getIntrinsicHeight();
            case 4:
                return org.telegram.messenger.i0.L(18.33f);
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f21556a) {
            case 2:
                return ((Drawable) this.f21557b).getIntrinsicWidth();
            case 3:
            default:
                return super.getIntrinsicWidth();
            case 4:
                return (int) (((rz0) this.f21557b).k() + (((Drawable) this.f21558c).getIntrinsicWidth() * 0.875f) + org.telegram.messenger.i0.L(9.66f));
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f21556a) {
            case 0:
                return 0;
            case 1:
                return -2;
            case 2:
                return -2;
            case 3:
                return -3;
            default:
                return -2;
        }
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f21556a) {
            case 0:
                super.onBoundsChange(rect);
                Rect rect2 = (Rect) this.d;
                rect2.set(rect);
                int i10 = rect2.left;
                Rect rect3 = (Rect) this.f21558c;
                rect2.left = Math.max(0, rect3.left) + i10;
                rect2.top = Math.max(0, rect3.top) + rect2.top;
                rect2.right -= Math.max(0, rect3.right);
                rect2.bottom -= Math.max(0, rect3.bottom);
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f21556a) {
            case 0:
                ((Paint) this.f21557b).setAlpha(i10);
                invalidateSelf();
                return;
            case 1:
                ((Paint) this.f21557b).setAlpha(t6.r1(i10 / 255.0f, ((int[]) this.d)[0]));
                return;
            case 2:
                ((Drawable) this.f21557b).setAlpha(i10);
                ((Drawable) this.f21558c).setAlpha(i10);
                return;
            case 3:
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f21556a) {
            case 0:
                ((Paint) this.f21557b).setColorFilter(colorFilter);
                return;
            case 1:
                ((Paint) this.f21557b).setColorFilter(colorFilter);
                return;
            case 2:
                ((Drawable) this.f21557b).setColorFilter(colorFilter);
                ((Drawable) this.f21558c).setColorFilter(colorFilter);
                return;
            case 3:
            default:
                return;
        }
    }

    public y2() {
        this.f21556a = 0;
        Paint paint = new Paint(1);
        this.f21557b = paint;
        this.f21558c = new Rect();
        this.d = new Rect();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setColor(-16777216);
    }

    public y2(org.telegram.ui.Cells.q1 q1Var, int[] iArr, Paint paint) {
        this.f21556a = 1;
        this.f21558c = q1Var;
        this.d = iArr;
        this.f21557b = paint;
    }

    public y2(pp0 pp0Var) {
        this.f21556a = 3;
        this.d = pp0Var;
        this.f21557b = new Paint(1);
        this.f21558c = new Path();
    }

    public y2(int i10, Context context, p6 p6Var, boolean z10) {
        this.f21556a = 4;
        this.f21557b = new rz0(dd.G(i10, z10 ? "BoostLevelPlus" : "BoostLevel", new Object[0]), 12.0f, org.telegram.messenger.i0.o());
        Drawable f7 = i0.a.f(context, 2131231975);
        this.f21558c = f7;
        f7.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.d = new kg.k1(t6.zk, t6.Ak, -1, -1, p6Var);
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }
}
