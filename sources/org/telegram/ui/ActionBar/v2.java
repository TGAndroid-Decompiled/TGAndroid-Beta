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
import org.telegram.messenger.hd;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xy0;
public final class v2 extends Drawable {
    public final int f30127a;
    public final Object f30128b;
    public final Object f30129c;
    public final Object d;

    public v2(Context context) {
        this.f30127a = 2;
        this.d = new org.telegram.ui.Components.d6(new org.telegram.ui.Components.t0(this, 0), 1200L, nr.h, 0);
        this.f30128b = i5.c.g(context, 2131231493);
        this.f30129c = i5.c.g(context, 2131231494);
    }

    public void c(int i7) {
        Rect rect = (Rect) this.f30129c;
        if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == i7) {
            return;
        }
        rect.set(0, 0, 0, i7);
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f30127a) {
            case 0:
                Paint paint = (Paint) this.f30128b;
                Rect rect = (Rect) this.d;
                if (!rect.isEmpty() && paint.getAlpha() != 0 && !org.telegram.messenger.g0.m0) {
                    canvas.drawRect(rect, paint);
                    return;
                }
                return;
            case 1:
                Paint paint2 = (Paint) this.f30128b;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f30129c;
                int w10 = m6.w(m6.w0(m6.f29644ra, r1Var.Qb), m6.r1(0.5f, m6.w0(m6.f29773y6, r1Var.Qb)));
                int[] iArr = (int[]) this.d;
                if (w10 != iArr[0]) {
                    int alpha = paint2.getAlpha();
                    iArr[0] = w10;
                    paint2.setColor(w10);
                    paint2.setAlpha(alpha);
                }
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint2);
                return;
            case 2:
                Rect bounds = getBounds();
                Drawable drawable = (Drawable) this.f30128b;
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                float e10 = ((org.telegram.ui.Components.d6) this.d).e(false, 1.0f);
                float width = (bounds.width() * 0.352f) + bounds.left;
                float height = (bounds.height() * 0.248f) + bounds.top;
                float width2 = bounds.width() * 0.105f * ((float) (1.0d - Math.sin(org.telegram.messenger.g0.s(e10, 0.0f, 2.0f, 1.5f) * 3.141592653589793d)));
                float width3 = (bounds.width() * 0.215f) + bounds.left;
                float height2 = (bounds.height() * 0.43f) + bounds.top;
                float width4 = bounds.width() * 0.09f * ((float) (1.0d - Math.sin(org.telegram.messenger.g0.s(e10, 1.0f, 2.0f, 1.5f) * 3.141592653589793d)));
                Drawable drawable2 = (Drawable) this.f30129c;
                drawable2.setBounds((int) (width - width2), (int) (height - width2), (int) (width + width2), (int) (height + width2));
                drawable2.draw(canvas);
                drawable2.setBounds((int) (width3 - width4), (int) (height2 - width4), (int) (width3 + width4), (int) (height2 + width4));
                drawable2.draw(canvas);
                return;
            case 3:
                Rect bounds2 = getBounds();
                float L = org.telegram.messenger.g0.L(25.0f);
                ap0 ap0Var = (ap0) this.d;
                float min = Math.min(bounds2.top, ap0Var.f33584s1 - ap0Var.f33573m1.getY());
                Paint paint3 = (Paint) this.f30128b;
                paint3.setColor(m6.w0(m6.f29454h5, ap0Var.J0));
                Path path = (Path) this.f30129c;
                path.rewind();
                path.addRoundRect(bounds2.left, min, bounds2.right, bounds2.bottom + L, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(bounds2);
                canvas.drawPath(path, paint3);
                canvas.restore();
                return;
            default:
                int i7 = getBounds().left;
                int centerY = getBounds().centerY();
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = centerY;
                rectF.set(i7, f10 - (org.telegram.messenger.g0.L(18.33f) / 2.0f), getIntrinsicWidth() + i7, (org.telegram.messenger.g0.L(18.33f) / 2.0f) + f10);
                ug.a1 a1Var = (ug.a1) this.d;
                a1Var.e(rectF);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), a1Var.f58647f);
                Drawable drawable3 = (Drawable) this.f30129c;
                drawable3.setBounds(org.telegram.messenger.g0.L(3.33f) + i7, (int) (f10 - ((drawable3.getIntrinsicHeight() * 0.875f) / 2.0f)), (int) ((drawable3.getIntrinsicWidth() * 0.875f) + org.telegram.messenger.g0.L(3.33f) + i7), (int) a8.p0.f(drawable3.getIntrinsicHeight(), 0.875f, 2.0f, f10));
                drawable3.draw(canvas);
                ((xy0) this.f30128b).c((drawable3.getIntrinsicWidth() * 0.875f) + org.telegram.messenger.g0.L(3.66f) + i7, f10, 1.0f, -1, canvas);
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f30127a) {
            case 0:
                return ((Paint) this.f30128b).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f30127a) {
            case 2:
                return ((Drawable) this.f30128b).getIntrinsicHeight();
            case 3:
            default:
                return super.getIntrinsicHeight();
            case 4:
                return org.telegram.messenger.g0.L(18.33f);
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f30127a) {
            case 2:
                return ((Drawable) this.f30128b).getIntrinsicWidth();
            case 3:
            default:
                return super.getIntrinsicWidth();
            case 4:
                return (int) (((xy0) this.f30128b).k() + (((Drawable) this.f30129c).getIntrinsicWidth() * 0.875f) + org.telegram.messenger.g0.L(9.66f));
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f30127a) {
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
        switch (this.f30127a) {
            case 0:
                super.onBoundsChange(rect);
                Rect rect2 = (Rect) this.d;
                rect2.set(rect);
                int i7 = rect2.left;
                Rect rect3 = (Rect) this.f30129c;
                rect2.left = Math.max(0, rect3.left) + i7;
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
    public final void setAlpha(int i7) {
        switch (this.f30127a) {
            case 0:
                ((Paint) this.f30128b).setAlpha(i7);
                invalidateSelf();
                return;
            case 1:
                ((Paint) this.f30128b).setAlpha(m6.r1(i7 / 255.0f, ((int[]) this.d)[0]));
                return;
            case 2:
                ((Drawable) this.f30128b).setAlpha(i7);
                ((Drawable) this.f30129c).setAlpha(i7);
                return;
            case 3:
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f30127a) {
            case 0:
                ((Paint) this.f30128b).setColorFilter(colorFilter);
                return;
            case 1:
                ((Paint) this.f30128b).setColorFilter(colorFilter);
                return;
            case 2:
                ((Drawable) this.f30128b).setColorFilter(colorFilter);
                ((Drawable) this.f30129c).setColorFilter(colorFilter);
                return;
            case 3:
            default:
                return;
        }
    }

    public v2() {
        this.f30127a = 0;
        Paint paint = new Paint(1);
        this.f30128b = paint;
        this.f30129c = new Rect();
        this.d = new Rect();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setColor(-16777216);
    }

    public v2(org.telegram.ui.Cells.r1 r1Var, int[] iArr, Paint paint) {
        this.f30127a = 1;
        this.f30129c = r1Var;
        this.d = iArr;
        this.f30128b = paint;
    }

    public v2(ap0 ap0Var) {
        this.f30127a = 3;
        this.d = ap0Var;
        this.f30128b = new Paint(1);
        this.f30129c = new Path();
    }

    public v2(int i7, Context context, h6 h6Var, boolean z10) {
        this.f30127a = 4;
        this.f30128b = new xy0(hd.G(i7, z10 ? "BoostLevelPlus" : "BoostLevel", new Object[0]), 12.0f, org.telegram.messenger.g0.o());
        Drawable g10 = i5.c.g(context, 2131231977);
        this.f30129c = g10;
        g10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.d = new ug.a1(m6.Ck, m6.Dk, -1, -1, h6Var);
    }

    private final void a(int i7) {
    }

    private final void b(int i7) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }
}
