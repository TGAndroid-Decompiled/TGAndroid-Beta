package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class fq extends Drawable {
    public final int f26200a;
    public Object f26201b;
    public float f26202c;
    public Object d;

    public fq() {
        this.f26200a = 1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float min;
        switch (this.f26200a) {
            case 0:
                float f7 = this.f26202c;
                canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, f7, f7, (Paint) this.f26201b);
                rf.o.e((Drawable) this.d, getBounds().exactCenterX(), getBounds().exactCenterY(), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f), 17);
                ((Drawable) this.d).draw(canvas);
                return;
            case 1:
                Paint paint = (Paint) this.f26201b;
                if (this.f26202c != org.telegram.messenger.i0.f16171p) {
                    f();
                }
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                canvas.drawPath((Path) this.d, paint);
                canvas.drawRect(org.telegram.messenger.i0.N(7.56f), org.telegram.messenger.i0.N(8.0f), org.telegram.messenger.i0.L(18.0f) - org.telegram.messenger.i0.N(7.56f), org.telegram.messenger.i0.N(11.1f), paint);
                canvas.restore();
                return;
            case 2:
                org.telegram.ui.Components.voip.g gVar = (org.telegram.ui.Components.voip.g) this.f26201b;
                int i10 = gVar.e;
                Matrix matrix = gVar.f31496i;
                gVar.f31494f = getBounds().width();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(getBounds());
                gVar.a(this.f26202c, canvas, rectF, null);
                org.telegram.messenger.d00 d00Var = (org.telegram.messenger.d00) this.d;
                if (d00Var != null) {
                    d00Var.f15263c = gVar.f31491a;
                    int i11 = gVar.f31494f;
                    float f10 = (((i10 * 2) + i11) * gVar.f31495g) - i10;
                    int i12 = (int) (i11 * 0.5f);
                    int width = getBounds().width();
                    int height = getBounds().height();
                    float f11 = width / d00Var.e;
                    float f12 = height / d00Var.f15264f;
                    if (d00Var.f15276s) {
                        min = Math.max(f11, f12);
                    } else {
                        min = Math.min(f11, f12);
                    }
                    matrix.reset();
                    matrix.setScale(1.0f / min, 0.0f, i10 / 2.0f, 0.0f);
                    matrix.setTranslate((f10 - d00Var.getBounds().left) - (i10 / min), 0.0f);
                    gVar.f31492b.setLocalMatrix(matrix);
                    int i13 = i12 / 2;
                    d00Var.setBounds(getBounds().centerX() - i13, getBounds().centerY() - i13, getBounds().centerX() + i13, getBounds().centerY() + i13);
                    d00Var.draw(canvas);
                }
                gVar.f31502o.invalidate();
                return;
            default:
                Rect bounds = getBounds();
                canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
                Drawable drawable = (Drawable) this.d;
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                ((rz0) this.f26201b).c(bounds.centerX() - (((rz0) this.f26201b).f30126c / 2.0f), org.telegram.messenger.i0.L(0.15f) + bounds.centerY(), drawable.getAlpha() / 255.0f, -1, canvas);
                canvas.restore();
                return;
        }
    }

    public void f() {
        int L = org.telegram.messenger.i0.L(18.0f);
        Path path = (Path) this.d;
        path.reset();
        float f7 = L >> 1;
        path.moveTo(f7, org.telegram.messenger.i0.N(4.98f));
        path.lineTo(org.telegram.messenger.i0.N(4.95f), org.telegram.messenger.i0.N(9.0f));
        path.lineTo(L - org.telegram.messenger.i0.N(4.95f), org.telegram.messenger.i0.N(9.0f));
        path.lineTo(f7, org.telegram.messenger.i0.N(4.98f));
        Paint paint = (Paint) this.f26201b;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.0f));
        this.f26202c = org.telegram.messenger.i0.f16171p;
    }

    @Override
    public int getAlpha() {
        switch (this.f26200a) {
            case 3:
                return ((Drawable) this.d).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f26200a) {
            case 1:
                return org.telegram.messenger.i0.L(18.0f);
            case 2:
            default:
                return super.getIntrinsicHeight();
            case 3:
                return (int) (((Drawable) this.d).getIntrinsicHeight() * this.f26202c);
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f26200a) {
            case 1:
                return org.telegram.messenger.i0.L(18.0f);
            case 2:
            default:
                return super.getIntrinsicWidth();
            case 3:
                return (int) (((Drawable) this.d).getIntrinsicWidth() * this.f26202c);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f26200a) {
            case 0:
                return -3;
            case 1:
                return 0;
            case 2:
                return -3;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f26200a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.voip.g gVar = (org.telegram.ui.Components.voip.g) this.f26201b;
                gVar.f31491a.setAlpha(i10);
                gVar.f31493c.setAlpha(i10);
                return;
            default:
                ((Drawable) this.d).setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f26200a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                ((Drawable) this.d).setColorFilter(colorFilter);
                return;
        }
    }

    public fq(Context context, float f7) {
        this.f26200a = 0;
        Paint paint = new Paint(1);
        this.f26201b = paint;
        this.d = context.getResources().getDrawable(2131232147);
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1552f, -16777216));
        this.f26202c = f7;
    }

    public fq(org.telegram.ui.Components.voip.g gVar, org.telegram.messenger.d00 d00Var) {
        this.f26200a = 2;
        this.f26201b = gVar;
        this.d = d00Var;
    }

    public fq(Context context, int i10) {
        this.f26200a = 3;
        this.f26202c = 0.75f;
        this.d = i0.a.f(context, 2131231174);
        rz0 rz0Var = new rz0(i0.a.i(i10, ""), 8.0f, org.telegram.messenger.i0.o1("fonts/num.otf"));
        this.f26201b = rz0Var;
        rz0Var.f30124a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }
}
