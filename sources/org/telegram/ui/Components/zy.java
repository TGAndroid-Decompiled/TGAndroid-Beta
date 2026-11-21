package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class zy extends View {
    public final Paint f43006a;
    public final Paint f43007b;
    public final Path f43008c;
    public int d;
    public int f43009e;
    public xy0[] f43010f;
    public RectF[] h;
    public float f43011n;
    public org.telegram.ui.nl0 f43012r;
    public int f43013s;

    public zy(Context context) {
        super(context);
        this.f43006a = new Paint(1);
        this.f43007b = new Paint(1);
        this.f43008c = new Path();
        this.d = -1;
        this.f43009e = -1;
        this.f43013s = -1;
    }

    public final void a(float f10, int i7, int i10, Canvas canvas) {
        xy0[] xy0VarArr = this.f43010f;
        int length = xy0VarArr.length;
        int i11 = 0;
        float f11 = f10;
        while (i11 < length) {
            xy0 xy0Var = xy0VarArr[i11];
            int i12 = i10;
            xy0Var.c(f11, i7 / 2.0f, 1.0f, i12, canvas);
            f11 += xy0Var.k() + org.telegram.messenger.g0.L(24.0f);
            i11++;
            i10 = i12;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f43010f == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float f11 = 4.0f;
        int L = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.f3.D(24.0f, this.f43010f.length, org.telegram.messenger.g0.L(4.0f));
        int i7 = 0;
        while (true) {
            xy0[] xy0VarArr = this.f43010f;
            if (i7 >= xy0VarArr.length) {
                break;
            }
            L = (int) (xy0VarArr[i7].k() + L);
            i7++;
        }
        float L2 = (height - org.telegram.messenger.g0.L(36.0f)) / 2.0f;
        float L3 = (org.telegram.messenger.g0.L(36.0f) + height) / 2.0f;
        float f12 = (width - L) / 2.0f;
        float L4 = org.telegram.messenger.g0.L(16.0f) + f12;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f12, L2, L + f12, L3);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.f43006a);
        float L5 = f12 + org.telegram.messenger.g0.L(16.0f);
        int i10 = 0;
        while (i10 < this.f43010f.length) {
            this.h[i10].set(L5 - org.telegram.messenger.g0.L(16.0f), L2, this.f43010f[i10].k() + L5 + org.telegram.messenger.g0.L(16.0f), L3);
            L5 += this.f43010f[i10].k() + org.telegram.messenger.g0.L(24.0f);
            i10++;
            f11 = f11;
        }
        org.telegram.messenger.g0.L(f11);
        int j3 = Utilities.j((int) Math.floor(this.f43011n), this.f43010f.length - 1, 0);
        int j10 = Utilities.j((int) Math.ceil(this.f43011n), this.f43010f.length - 1, 0);
        float L6 = this.h[j3].left + org.telegram.messenger.g0.L(f10);
        float L7 = this.h[j10].left + org.telegram.messenger.g0.L(f10);
        float f13 = this.f43011n;
        float T1 = org.telegram.messenger.g0.T1(L6, L7, (float) (f13 - Math.floor(f13)));
        float L8 = this.h[j3].right - org.telegram.messenger.g0.L(f10);
        float L9 = this.h[j10].right - org.telegram.messenger.g0.L(f10);
        float f14 = this.f43011n;
        float T12 = org.telegram.messenger.g0.T1(L8, L9, (float) (f14 - Math.floor(f14)));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(T1, (height - org.telegram.messenger.g0.L(28.0f)) / 2.0f, T12, (org.telegram.messenger.g0.L(28.0f) + height) / 2.0f);
        Path path = this.f43008c;
        path.rewind();
        path.addRoundRect(rectF2, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), Path.Direction.CW);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), this.f43007b);
        a(L4, height, this.d, canvas);
        canvas.save();
        canvas.clipPath(path);
        a(L4, height, this.f43009e, canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7 = 0;
        if (this.f43010f == null || this.h == null) {
            return false;
        }
        while (true) {
            RectF[] rectFArr = this.h;
            if (i7 < rectFArr.length) {
                if (rectFArr[i7].contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 >= 0 && i7 != this.f43013s) {
            this.f43013s = i7;
            org.telegram.ui.nl0 nl0Var = this.f43012r;
            if (nl0Var != null) {
                nl0Var.a(Integer.valueOf(i7));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f43013s = -1;
        }
        if (motionEvent.getAction() == 0 && i7 >= 0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f43006a.setColor(i7);
        invalidate();
    }

    public void setSelected(float f10) {
        if (Math.abs(f10 - this.f43011n) > 0.001f) {
            invalidate();
        }
        this.f43011n = f10;
    }

    public void setSelectedColor(int i7) {
        this.f43007b.setColor(i7);
        invalidate();
    }

    public void setSelectedTextColor(int i7) {
        this.f43009e = i7;
        invalidate();
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.f43010f = new xy0[charSequenceArr.length];
        this.h = new RectF[charSequenceArr.length];
        for (int i7 = 0; i7 < charSequenceArr.length; i7++) {
            this.f43010f[i7] = new xy0(charSequenceArr[i7], 14.0f, org.telegram.messenger.g0.o());
            this.h[i7] = new RectF();
        }
        invalidate();
    }

    public void setTextColor(int i7) {
        this.d = i7;
        invalidate();
    }
}
