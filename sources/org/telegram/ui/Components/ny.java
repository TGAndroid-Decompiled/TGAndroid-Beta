package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class ny extends View {
    public final Paint f36461a;
    public final Paint f36462b;
    public final Path f36463c;
    public int d;
    public int f36464e;
    public my0[] f36465f;
    public RectF[] h;
    public float f36466n;
    public org.telegram.ui.il0 f36467r;
    public int f36468s;

    public ny(Context context) {
        super(context);
        this.f36461a = new Paint(1);
        this.f36462b = new Paint(1);
        this.f36463c = new Path();
        this.d = -1;
        this.f36464e = -1;
        this.f36468s = -1;
    }

    public final void a(float f10, int i7, int i10, Canvas canvas) {
        my0[] my0VarArr = this.f36465f;
        int length = my0VarArr.length;
        int i11 = 0;
        float f11 = f10;
        while (i11 < length) {
            my0 my0Var = my0VarArr[i11];
            int i12 = i10;
            my0Var.c(f11, i7 / 2.0f, 1.0f, i12, canvas);
            f11 += my0Var.k() + org.telegram.messenger.g0.L(24.0f);
            i11++;
            i10 = i12;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f36465f == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float f11 = 4.0f;
        int L = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.D(24.0f, this.f36465f.length, org.telegram.messenger.g0.L(4.0f));
        int i7 = 0;
        while (true) {
            my0[] my0VarArr = this.f36465f;
            if (i7 >= my0VarArr.length) {
                break;
            }
            L = (int) (my0VarArr[i7].k() + L);
            i7++;
        }
        float L2 = (height - org.telegram.messenger.g0.L(36.0f)) / 2.0f;
        float L3 = (org.telegram.messenger.g0.L(36.0f) + height) / 2.0f;
        float f12 = (width - L) / 2.0f;
        float L4 = org.telegram.messenger.g0.L(16.0f) + f12;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f12, L2, L + f12, L3);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.f36461a);
        float L5 = f12 + org.telegram.messenger.g0.L(16.0f);
        int i10 = 0;
        while (i10 < this.f36465f.length) {
            this.h[i10].set(L5 - org.telegram.messenger.g0.L(16.0f), L2, this.f36465f[i10].k() + L5 + org.telegram.messenger.g0.L(16.0f), L3);
            L5 += this.f36465f[i10].k() + org.telegram.messenger.g0.L(24.0f);
            i10++;
            f11 = f11;
        }
        org.telegram.messenger.g0.L(f11);
        int j3 = Utilities.j((int) Math.floor(this.f36466n), this.f36465f.length - 1, 0);
        int j10 = Utilities.j((int) Math.ceil(this.f36466n), this.f36465f.length - 1, 0);
        float L6 = this.h[j3].left + org.telegram.messenger.g0.L(f10);
        float L7 = this.h[j10].left + org.telegram.messenger.g0.L(f10);
        float f13 = this.f36466n;
        float T1 = org.telegram.messenger.g0.T1(L6, L7, (float) (f13 - Math.floor(f13)));
        float L8 = this.h[j3].right - org.telegram.messenger.g0.L(f10);
        float L9 = this.h[j10].right - org.telegram.messenger.g0.L(f10);
        float f14 = this.f36466n;
        float T12 = org.telegram.messenger.g0.T1(L8, L9, (float) (f14 - Math.floor(f14)));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(T1, (height - org.telegram.messenger.g0.L(28.0f)) / 2.0f, T12, (org.telegram.messenger.g0.L(28.0f) + height) / 2.0f);
        Path path = this.f36463c;
        path.rewind();
        path.addRoundRect(rectF2, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), Path.Direction.CW);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), this.f36462b);
        a(L4, height, this.d, canvas);
        canvas.save();
        canvas.clipPath(path);
        a(L4, height, this.f36464e, canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7 = 0;
        if (this.f36465f == null || this.h == null) {
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
        if (i7 >= 0 && i7 != this.f36468s) {
            this.f36468s = i7;
            org.telegram.ui.il0 il0Var = this.f36467r;
            if (il0Var != null) {
                il0Var.a(Integer.valueOf(i7));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f36468s = -1;
        }
        if (motionEvent.getAction() == 0 && i7 >= 0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f36461a.setColor(i7);
        invalidate();
    }

    public void setSelected(float f10) {
        if (Math.abs(f10 - this.f36466n) > 0.001f) {
            invalidate();
        }
        this.f36466n = f10;
    }

    public void setSelectedColor(int i7) {
        this.f36462b.setColor(i7);
        invalidate();
    }

    public void setSelectedTextColor(int i7) {
        this.f36464e = i7;
        invalidate();
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.f36465f = new my0[charSequenceArr.length];
        this.h = new RectF[charSequenceArr.length];
        for (int i7 = 0; i7 < charSequenceArr.length; i7++) {
            this.f36465f[i7] = new my0(charSequenceArr[i7], 14.0f, org.telegram.messenger.g0.o());
            this.h[i7] = new RectF();
        }
        invalidate();
    }

    public void setTextColor(int i7) {
        this.d = i7;
        invalidate();
    }
}
