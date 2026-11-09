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
public final class ha0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final ArrayList f34259a;
    public float f34260b;
    public final org.telegram.ui.ActionBar.g6 f34261c;
    public final Paint d;
    public int f34262e;
    public int f34263f;
    public Drawable h;
    public float f34264n;
    public float f34265r;
    public final RectF f34266s;
    public org.telegram.messenger.c20 f34267w;

    public ha0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f34259a = new ArrayList();
        this.d = new Paint(1);
        this.f34264n = org.telegram.messenger.g0.L(14.0f);
        this.f34265r = org.telegram.messenger.g0.L(0.0f);
        this.f34266s = new RectF();
        this.f34261c = g6Var;
        b();
    }

    public final void a(int i7, String str) {
        this.f34259a.add(new ga0(i7, str));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Be));
    }

    public final void b() {
        int[] iArr;
        boolean q10 = org.telegram.ui.ActionBar.l6.I.q();
        Paint paint = this.d;
        if (q10) {
            this.f34262e = -1862270977;
            this.f34263f = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int i7 = org.telegram.ui.ActionBar.l6.Be;
        org.telegram.ui.ActionBar.g6 g6Var = this.f34261c;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        if ((g6Var instanceof org.telegram.ui.an) && (((org.telegram.ui.an) g6Var).m() instanceof ra0) && (iArr = ((ra0) ((org.telegram.ui.an) g6Var).m()).f37612a) != null) {
            w02 = org.telegram.messenger.g0.w0(org.telegram.messenger.g0.w0(iArr[0], iArr[1]), org.telegram.messenger.g0.w0(iArr[2], iArr[3]));
        }
        this.f34262e = org.telegram.ui.ActionBar.l6.c(-1606201797, w02);
        this.f34263f = org.telegram.ui.ActionBar.l6.c(-448573893, w02);
        paint.setColor(org.telegram.ui.ActionBar.l6.c(814980216, w02));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        ArrayList arrayList = this.f34259a;
        boolean z10 = true;
        if (arrayList.size() > 1) {
            float f10 = this.f34260b;
            double d = f10;
            int floor = (int) Math.floor(d);
            if (floor >= 0 && floor < arrayList.size()) {
                z9 = true;
            } else {
                z9 = false;
            }
            int ceil = (int) Math.ceil(d);
            z10 = (ceil < 0 || ceil >= arrayList.size()) ? false : false;
            RectF rectF = this.f34266s;
            if (z9 && z10) {
                org.telegram.messenger.g0.Z1(((ga0) arrayList.get(floor)).f33916c, ((ga0) arrayList.get(ceil)).f33916c, f10 - floor, rectF);
            } else if (z9) {
                rectF.set(((ga0) arrayList.get(floor)).f33916c);
            } else if (z10) {
                rectF.set(((ga0) arrayList.get(ceil)).f33916c);
            }
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z9 || z10) {
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), this.d);
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ga0 ga0Var = (ga0) arrayList.get(i7);
                ga0Var.f33915b.c(ga0Var.f33916c.left + this.f34264n, getMeasuredHeight() / 2.0f, 1.0f, i0.a.f(1.0f - Math.abs(f10 - i7), this.f34262e, this.f34263f), canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        org.telegram.messenger.c20 c20Var;
        ArrayList arrayList = this.f34259a;
        if (arrayList.size() > 1) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((ga0) arrayList.get(i10)).d.contains(x10, y10)) {
                        i7 = ((ga0) arrayList.get(i10)).f33914a;
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
            } else if (motionEvent.getAction() == 1 && i7 != -1 && (c20Var = this.f34267w) != null) {
                c20Var.a(Integer.valueOf(i7));
            }
        }
        return false;
    }

    public int getColor() {
        return this.f34262e;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList;
        super.onMeasure(i7, i10);
        this.f34264n = org.telegram.messenger.g0.L(14.0f);
        float f10 = 0.0f;
        this.f34265r = org.telegram.messenger.g0.L(0.0f);
        int i11 = 0;
        while (true) {
            arrayList = this.f34259a;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 > 0) {
                f10 += this.f34265r;
            }
            f10 += ((ga0) arrayList.get(i11)).f33915b.k() + this.f34264n + this.f34264n;
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
            float k10 = ((ga0) arrayList.get(i12)).f33915b.k() + this.f34264n + this.f34264n;
            ((ga0) arrayList.get(i12)).f33916c.set(f13, L, f13 + k10, L2);
            ((ga0) arrayList.get(i12)).d.set(((ga0) arrayList.get(i12)).f33916c);
            ((ga0) arrayList.get(i12)).d.inset((-this.f34265r) / 2.0f, -L);
            f13 += k10 + this.f34265r;
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
        this.f34267w = c20Var;
    }

    public void setSelectedTab(float f10) {
        this.f34260b = f10;
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
