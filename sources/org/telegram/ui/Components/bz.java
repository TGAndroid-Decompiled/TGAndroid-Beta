package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class bz extends View {
    public final Paint f24913a;
    public final Paint f24914b;
    public final Path f24915c;
    public int d;
    public int e;
    public qz0[] f24916f;
    public RectF[] h;
    public float f24917n;
    public org.telegram.ui.tm0 f24918r;
    public int f24919s;

    public bz(Context context) {
        super(context);
        this.f24913a = new Paint(1);
        this.f24914b = new Paint(1);
        this.f24915c = new Path();
        this.d = -1;
        this.e = -1;
        this.f24919s = -1;
    }

    public final void a(float f7, int i10, int i11, Canvas canvas) {
        qz0[] qz0VarArr = this.f24916f;
        int length = qz0VarArr.length;
        int i12 = 0;
        float f10 = f7;
        while (i12 < length) {
            qz0 qz0Var = qz0VarArr[i12];
            int i13 = i11;
            qz0Var.c(f10, i10 / 2.0f, 1.0f, i13, canvas);
            f10 += qz0Var.k() + org.telegram.messenger.i0.L(24.0f);
            i12++;
            i11 = i13;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f24916f == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float f10 = 4.0f;
        int L = org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.m5.D(24.0f, this.f24916f.length, org.telegram.messenger.i0.L(4.0f));
        int i10 = 0;
        while (true) {
            qz0[] qz0VarArr = this.f24916f;
            if (i10 >= qz0VarArr.length) {
                break;
            }
            L = (int) (qz0VarArr[i10].k() + L);
            i10++;
        }
        float L2 = (height - org.telegram.messenger.i0.L(36.0f)) / 2.0f;
        float L3 = (org.telegram.messenger.i0.L(36.0f) + height) / 2.0f;
        float f11 = (width - L) / 2.0f;
        float L4 = org.telegram.messenger.i0.L(16.0f) + f11;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(f11, L2, L + f11, L3);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), this.f24913a);
        float L5 = f11 + org.telegram.messenger.i0.L(16.0f);
        int i11 = 0;
        while (i11 < this.f24916f.length) {
            this.h[i11].set(L5 - org.telegram.messenger.i0.L(16.0f), L2, this.f24916f[i11].k() + L5 + org.telegram.messenger.i0.L(16.0f), L3);
            L5 += this.f24916f[i11].k() + org.telegram.messenger.i0.L(24.0f);
            i11++;
            f10 = f10;
        }
        org.telegram.messenger.i0.L(f10);
        int j10 = Utilities.j((int) Math.floor(this.f24917n), this.f24916f.length - 1, 0);
        int j11 = Utilities.j((int) Math.ceil(this.f24917n), this.f24916f.length - 1, 0);
        float L6 = this.h[j10].left + org.telegram.messenger.i0.L(f7);
        float L7 = this.h[j11].left + org.telegram.messenger.i0.L(f7);
        float f12 = this.f24917n;
        float T1 = org.telegram.messenger.i0.T1(L6, L7, (float) (f12 - Math.floor(f12)));
        float L8 = this.h[j10].right - org.telegram.messenger.i0.L(f7);
        float L9 = this.h[j11].right - org.telegram.messenger.i0.L(f7);
        float f13 = this.f24917n;
        float T12 = org.telegram.messenger.i0.T1(L8, L9, (float) (f13 - Math.floor(f13)));
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(T1, (height - org.telegram.messenger.i0.L(28.0f)) / 2.0f, T12, (org.telegram.messenger.i0.L(28.0f) + height) / 2.0f);
        Path path = this.f24915c;
        path.rewind();
        path.addRoundRect(rectF2, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), Path.Direction.CW);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), this.f24914b);
        a(L4, height, this.d, canvas);
        canvas.save();
        canvas.clipPath(path);
        a(L4, height, this.e, canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = 0;
        if (this.f24916f == null || this.h == null) {
            return false;
        }
        while (true) {
            RectF[] rectFArr = this.h;
            if (i10 < rectFArr.length) {
                if (rectFArr[i10].contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0 && i10 != this.f24919s) {
            this.f24919s = i10;
            org.telegram.ui.tm0 tm0Var = this.f24918r;
            if (tm0Var != null) {
                tm0Var.a(Integer.valueOf(i10));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f24919s = -1;
        }
        if (motionEvent.getAction() == 0 && i10 >= 0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f24913a.setColor(i10);
        invalidate();
    }

    public void setSelected(float f7) {
        if (Math.abs(f7 - this.f24917n) > 0.001f) {
            invalidate();
        }
        this.f24917n = f7;
    }

    public void setSelectedColor(int i10) {
        this.f24914b.setColor(i10);
        invalidate();
    }

    public void setSelectedTextColor(int i10) {
        this.e = i10;
        invalidate();
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.f24916f = new qz0[charSequenceArr.length];
        this.h = new RectF[charSequenceArr.length];
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            this.f24916f[i10] = new qz0(charSequenceArr[i10], 14.0f, org.telegram.messenger.i0.o());
            this.h[i10] = new RectF();
        }
        invalidate();
    }

    public void setTextColor(int i10) {
        this.d = i10;
        invalidate();
    }
}
