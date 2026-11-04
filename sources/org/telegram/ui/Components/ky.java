package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class ky extends View {
    public final Paint f35501a;
    public final Paint f35502b;
    public final Path f35503c;
    public int d;
    public int f35504e;
    public ly0[] f35505f;
    public RectF[] h;
    public float f35506n;
    public org.telegram.ui.el0 f35507r;
    public int f35508s;

    public ky(Context context) {
        super(context);
        this.f35501a = new Paint(1);
        this.f35502b = new Paint(1);
        this.f35503c = new Path();
        this.d = -1;
        this.f35504e = -1;
        this.f35508s = -1;
    }

    public final void a(float f10, int i3, int i10, Canvas canvas) {
        ly0[] ly0VarArr = this.f35505f;
        int length = ly0VarArr.length;
        int i11 = 0;
        float f11 = f10;
        while (i11 < length) {
            ly0 ly0Var = ly0VarArr[i11];
            int i12 = i10;
            ly0Var.c(f11, i3 / 2.0f, 1.0f, i12, canvas);
            f11 += ly0Var.k() + org.telegram.messenger.g0.L(24.0f);
            i11++;
            i10 = i12;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f35505f == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float f11 = 4.0f;
        int L = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.D(24.0f, this.f35505f.length, org.telegram.messenger.g0.L(4.0f));
        int i3 = 0;
        while (true) {
            ly0[] ly0VarArr = this.f35505f;
            if (i3 >= ly0VarArr.length) {
                break;
            }
            L = (int) (ly0VarArr[i3].k() + L);
            i3++;
        }
        float L2 = (height - org.telegram.messenger.g0.L(36.0f)) / 2.0f;
        float L3 = (org.telegram.messenger.g0.L(36.0f) + height) / 2.0f;
        float f12 = (width - L) / 2.0f;
        float L4 = org.telegram.messenger.g0.L(16.0f) + f12;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f12, L2, L + f12, L3);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.f35501a);
        float L5 = f12 + org.telegram.messenger.g0.L(16.0f);
        int i10 = 0;
        while (i10 < this.f35505f.length) {
            this.h[i10].set(L5 - org.telegram.messenger.g0.L(16.0f), L2, this.f35505f[i10].k() + L5 + org.telegram.messenger.g0.L(16.0f), L3);
            L5 += this.f35505f[i10].k() + org.telegram.messenger.g0.L(24.0f);
            i10++;
            f11 = f11;
        }
        org.telegram.messenger.g0.L(f11);
        int j10 = Utilities.j((int) Math.floor(this.f35506n), this.f35505f.length - 1, 0);
        int j11 = Utilities.j((int) Math.ceil(this.f35506n), this.f35505f.length - 1, 0);
        float L6 = this.h[j10].left + org.telegram.messenger.g0.L(f10);
        float L7 = this.h[j11].left + org.telegram.messenger.g0.L(f10);
        float f13 = this.f35506n;
        float T1 = org.telegram.messenger.g0.T1(L6, L7, (float) (f13 - Math.floor(f13)));
        float L8 = this.h[j10].right - org.telegram.messenger.g0.L(f10);
        float L9 = this.h[j11].right - org.telegram.messenger.g0.L(f10);
        float f14 = this.f35506n;
        float T12 = org.telegram.messenger.g0.T1(L8, L9, (float) (f14 - Math.floor(f14)));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(T1, (height - org.telegram.messenger.g0.L(28.0f)) / 2.0f, T12, (org.telegram.messenger.g0.L(28.0f) + height) / 2.0f);
        Path path = this.f35503c;
        path.rewind();
        path.addRoundRect(rectF2, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), Path.Direction.CW);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), this.f35502b);
        a(L4, height, this.d, canvas);
        canvas.save();
        canvas.clipPath(path);
        a(L4, height, this.f35504e, canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3 = 0;
        if (this.f35505f == null || this.h == null) {
            return false;
        }
        while (true) {
            RectF[] rectFArr = this.h;
            if (i3 < rectFArr.length) {
                if (rectFArr[i3].contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0 && i3 != this.f35508s) {
            this.f35508s = i3;
            org.telegram.ui.el0 el0Var = this.f35507r;
            if (el0Var != null) {
                el0Var.a(Integer.valueOf(i3));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f35508s = -1;
        }
        if (motionEvent.getAction() == 0 && i3 >= 0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i3) {
        this.f35501a.setColor(i3);
        invalidate();
    }

    public void setSelected(float f10) {
        if (Math.abs(f10 - this.f35506n) > 0.001f) {
            invalidate();
        }
        this.f35506n = f10;
    }

    public void setSelectedColor(int i3) {
        this.f35502b.setColor(i3);
        invalidate();
    }

    public void setSelectedTextColor(int i3) {
        this.f35504e = i3;
        invalidate();
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.f35505f = new ly0[charSequenceArr.length];
        this.h = new RectF[charSequenceArr.length];
        for (int i3 = 0; i3 < charSequenceArr.length; i3++) {
            this.f35505f[i3] = new ly0(charSequenceArr[i3], 14.0f, org.telegram.messenger.g0.o());
            this.h[i3] = new RectF();
        }
        invalidate();
    }

    public void setTextColor(int i3) {
        this.d = i3;
        invalidate();
    }
}
