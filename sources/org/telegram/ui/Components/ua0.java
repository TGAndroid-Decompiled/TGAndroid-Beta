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
public final class ua0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final ArrayList f40289a;
    public float f40290b;
    public final org.telegram.ui.ActionBar.h6 f40291c;
    public final Paint d;
    public int f40292e;
    public int f40293f;
    public Drawable h;
    public float f40294n;
    public float f40295r;
    public final RectF f40296s;
    public org.telegram.messenger.y10 f40297w;

    public ua0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f40289a = new ArrayList();
        this.d = new Paint(1);
        this.f40294n = org.telegram.messenger.g0.L(14.0f);
        this.f40295r = org.telegram.messenger.g0.L(0.0f);
        this.f40296s = new RectF();
        this.f40291c = h6Var;
        b();
    }

    public final void a(int i7, String str) {
        this.f40289a.add(new ta0(i7, str));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ee));
    }

    public final void b() {
        int[] iArr;
        boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
        Paint paint = this.d;
        if (q10) {
            this.f40292e = -1862270977;
            this.f40293f = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int i7 = org.telegram.ui.ActionBar.m6.Ee;
        org.telegram.ui.ActionBar.h6 h6Var = this.f40291c;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        if ((h6Var instanceof org.telegram.ui.zm) && (((org.telegram.ui.zm) h6Var).c() instanceof cb0) && (iArr = ((cb0) ((org.telegram.ui.zm) h6Var).c()).f34107a) != null) {
            w02 = org.telegram.messenger.g0.w0(org.telegram.messenger.g0.w0(iArr[0], iArr[1]), org.telegram.messenger.g0.w0(iArr[2], iArr[3]));
        }
        this.f40292e = org.telegram.ui.ActionBar.m6.c(-1606201797, w02);
        this.f40293f = org.telegram.ui.ActionBar.m6.c(-448573893, w02);
        paint.setColor(org.telegram.ui.ActionBar.m6.c(814980216, w02));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        ArrayList arrayList = this.f40289a;
        boolean z11 = true;
        if (arrayList.size() > 1) {
            float f10 = this.f40290b;
            double d = f10;
            int floor = (int) Math.floor(d);
            if (floor >= 0 && floor < arrayList.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int ceil = (int) Math.ceil(d);
            z11 = (ceil < 0 || ceil >= arrayList.size()) ? false : false;
            RectF rectF = this.f40296s;
            if (z10 && z11) {
                org.telegram.messenger.g0.Z1(((ta0) arrayList.get(floor)).f39765c, ((ta0) arrayList.get(ceil)).f39765c, f10 - floor, rectF);
            } else if (z10) {
                rectF.set(((ta0) arrayList.get(floor)).f39765c);
            } else if (z11) {
                rectF.set(((ta0) arrayList.get(ceil)).f39765c);
            }
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z10 || z11) {
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), this.d);
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ta0 ta0Var = (ta0) arrayList.get(i7);
                ta0Var.f39764b.c(ta0Var.f39765c.left + this.f40294n, getMeasuredHeight() / 2.0f, 1.0f, i0.a.f(1.0f - Math.abs(f10 - i7), this.f40292e, this.f40293f), canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        org.telegram.messenger.y10 y10Var;
        ArrayList arrayList = this.f40289a;
        if (arrayList.size() > 1) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((ta0) arrayList.get(i10)).d.contains(x10, y10)) {
                        i7 = ((ta0) arrayList.get(i10)).f39763a;
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
            } else if (motionEvent.getAction() == 1 && i7 != -1 && (y10Var = this.f40297w) != null) {
                y10Var.a(Integer.valueOf(i7));
            }
        }
        return false;
    }

    public int getColor() {
        return this.f40292e;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList;
        super.onMeasure(i7, i10);
        this.f40294n = org.telegram.messenger.g0.L(14.0f);
        float f10 = 0.0f;
        this.f40295r = org.telegram.messenger.g0.L(0.0f);
        int i11 = 0;
        while (true) {
            arrayList = this.f40289a;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 > 0) {
                f10 += this.f40295r;
            }
            f10 += ((ta0) arrayList.get(i11)).f39764b.k() + this.f40294n + this.f40294n;
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
            float k10 = ((ta0) arrayList.get(i12)).f39764b.k() + this.f40294n + this.f40294n;
            ((ta0) arrayList.get(i12)).f39765c.set(f13, L, f13 + k10, L2);
            ((ta0) arrayList.get(i12)).d.set(((ta0) arrayList.get(i12)).f39765c);
            ((ta0) arrayList.get(i12)).d.inset((-this.f40295r) / 2.0f, -L);
            f13 += k10 + this.f40295r;
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

    public void setOnTabClick(org.telegram.messenger.y10 y10Var) {
        this.f40297w = y10Var;
    }

    public void setSelectedTab(float f10) {
        this.f40290b = f10;
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
