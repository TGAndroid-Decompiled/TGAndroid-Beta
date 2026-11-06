package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public final class ga0 extends View implements org.telegram.ui.ActionBar.a6 {
    public final ArrayList f33878a;
    public float f33879b;
    public final org.telegram.ui.ActionBar.f6 f33880c;
    public final Paint d;
    public int f33881e;
    public int f33882f;
    public Drawable h;
    public float f33883n;
    public float f33884r;
    public final RectF f33885s;
    public org.telegram.messenger.c20 f33886w;

    public ga0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f33878a = new ArrayList();
        this.d = new Paint(1);
        this.f33883n = org.telegram.messenger.g0.L(14.0f);
        this.f33884r = org.telegram.messenger.g0.L(0.0f);
        this.f33885s = new RectF();
        this.f33880c = f6Var;
        b();
    }

    public final void a(int i7, String str) {
        this.f33878a.add(new fa0(i7, str));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Be));
    }

    public final void b() {
        int[] iArr;
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        Paint paint = this.d;
        if (q10) {
            this.f33881e = -1862270977;
            this.f33882f = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int i7 = org.telegram.ui.ActionBar.k6.Be;
        org.telegram.ui.ActionBar.f6 f6Var = this.f33880c;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        if ((f6Var instanceof org.telegram.ui.ym) && (((org.telegram.ui.ym) f6Var).m() instanceof qa0) && (iArr = ((qa0) ((org.telegram.ui.ym) f6Var).m()).f37218a) != null) {
            w02 = org.telegram.messenger.g0.w0(org.telegram.messenger.g0.w0(iArr[0], iArr[1]), org.telegram.messenger.g0.w0(iArr[2], iArr[3]));
        }
        this.f33881e = org.telegram.ui.ActionBar.k6.c(-1606201797, w02);
        this.f33882f = org.telegram.ui.ActionBar.k6.c(-448573893, w02);
        paint.setColor(org.telegram.ui.ActionBar.k6.c(814980216, w02));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        ArrayList arrayList = this.f33878a;
        boolean z10 = true;
        if (arrayList.size() > 1) {
            float f10 = this.f33879b;
            double d = f10;
            int floor = (int) Math.floor(d);
            if (floor >= 0 && floor < arrayList.size()) {
                z9 = true;
            } else {
                z9 = false;
            }
            int ceil = (int) Math.ceil(d);
            z10 = (ceil < 0 || ceil >= arrayList.size()) ? false : false;
            RectF rectF = this.f33885s;
            if (z9 && z10) {
                org.telegram.messenger.g0.Z1(((fa0) arrayList.get(floor)).f33504c, ((fa0) arrayList.get(ceil)).f33504c, f10 - floor, rectF);
            } else if (z9) {
                rectF.set(((fa0) arrayList.get(floor)).f33504c);
            } else if (z10) {
                rectF.set(((fa0) arrayList.get(ceil)).f33504c);
            }
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z9 || z10) {
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), this.d);
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                fa0 fa0Var = (fa0) arrayList.get(i7);
                fa0Var.f33503b.c(fa0Var.f33504c.left + this.f33883n, getMeasuredHeight() / 2.0f, 1.0f, i0.a.f(1.0f - Math.abs(f10 - i7), this.f33881e, this.f33882f), canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        org.telegram.messenger.c20 c20Var;
        ArrayList arrayList = this.f33878a;
        if (arrayList.size() > 1) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((fa0) arrayList.get(i10)).d.contains(x10, y10)) {
                        i7 = ((fa0) arrayList.get(i10)).f33502a;
                        break;
                    }
                    i10++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (motionEvent.getAction() == 0) {
                if (i7 != -1) {
                    return true;
                }
            } else if (motionEvent.getAction() == 1 && i7 != -1 && (c20Var = this.f33886w) != null) {
                c20Var.a(Integer.valueOf(i7));
            }
        }
        return false;
    }

    public int getColor() {
        return this.f33881e;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList;
        super.onMeasure(i7, i10);
        this.f33883n = org.telegram.messenger.g0.L(14.0f);
        float f10 = 0.0f;
        this.f33884r = org.telegram.messenger.g0.L(0.0f);
        int i11 = 0;
        while (true) {
            arrayList = this.f33878a;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 > 0) {
                f10 += this.f33884r;
            }
            f10 += ((fa0) arrayList.get(i11)).f33503b.k() + this.f33883n + this.f33883n;
            i11++;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float L = (measuredHeight - org.telegram.messenger.g0.L(26.0f)) / 2.0f;
        float L2 = (org.telegram.messenger.g0.L(26.0f) + measuredHeight) / 2.0f;
        float f11 = measuredWidth;
        float f12 = (f11 - f10) / 2.0f;
        float f13 = f12;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            float k10 = ((fa0) arrayList.get(i12)).f33503b.k() + this.f33883n + this.f33883n;
            ((fa0) arrayList.get(i12)).f33504c.set(f13, L, f13 + k10, L2);
            ((fa0) arrayList.get(i12)).d.set(((fa0) arrayList.get(i12)).f33504c);
            ((fa0) arrayList.get(i12)).d.inset((-this.f33884r) / 2.0f, -L);
            f13 += k10 + this.f33884r;
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            Rect rect = org.telegram.messenger.g0.Q;
            drawable.getPadding(rect);
            int i13 = measuredHeight / 2;
            this.h.setBounds((((int) f12) - org.telegram.messenger.g0.L(3.0f)) - rect.left, (i13 - org.telegram.messenger.g0.L(16.0f)) - rect.top, org.telegram.messenger.g0.L(3.0f) + ((int) ((f11 + f10) / 2.0f)) + rect.right, org.telegram.messenger.g0.L(16.0f) + i13 + rect.bottom);
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.h = drawable;
    }

    public void setOnTabClick(org.telegram.messenger.c20 c20Var) {
        this.f33886w = c20Var;
    }

    public void setSelectedTab(float f10) {
        this.f33879b = f10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            b();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
