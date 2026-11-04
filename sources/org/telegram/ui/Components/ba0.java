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
public final class ba0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final ArrayList f32143a;
    public float f32144b;
    public final org.telegram.ui.ActionBar.e6 f32145c;
    public final Paint d;
    public int f32146e;
    public int f32147f;
    public Drawable h;
    public float f32148n;
    public float f32149r;
    public final RectF f32150s;
    public org.telegram.messenger.u10 f32151w;

    public ba0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f32143a = new ArrayList();
        this.d = new Paint(1);
        this.f32148n = org.telegram.messenger.g0.L(14.0f);
        this.f32149r = org.telegram.messenger.g0.L(0.0f);
        this.f32150s = new RectF();
        this.f32145c = e6Var;
        b();
    }

    public final void a(int i3, String str) {
        this.f32143a.add(new aa0(i3, str));
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
            this.f32146e = -1862270977;
            this.f32147f = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.Be;
        org.telegram.ui.ActionBar.e6 e6Var = this.f32145c;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        if ((e6Var instanceof org.telegram.ui.um) && (((org.telegram.ui.um) e6Var).m() instanceof la0) && (iArr = ((la0) ((org.telegram.ui.um) e6Var).m()).f35646a) != null) {
            w02 = org.telegram.messenger.g0.w0(org.telegram.messenger.g0.w0(iArr[0], iArr[1]), org.telegram.messenger.g0.w0(iArr[2], iArr[3]));
        }
        this.f32146e = org.telegram.ui.ActionBar.k6.c(-1606201797, w02);
        this.f32147f = org.telegram.ui.ActionBar.k6.c(-448573893, w02);
        paint.setColor(org.telegram.ui.ActionBar.k6.c(814980216, w02));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        ArrayList arrayList = this.f32143a;
        boolean z11 = true;
        if (arrayList.size() > 1) {
            float f10 = this.f32144b;
            double d = f10;
            int floor = (int) Math.floor(d);
            if (floor >= 0 && floor < arrayList.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int ceil = (int) Math.ceil(d);
            z11 = (ceil < 0 || ceil >= arrayList.size()) ? false : false;
            RectF rectF = this.f32150s;
            if (z10 && z11) {
                org.telegram.messenger.g0.Z1(((aa0) arrayList.get(floor)).f31783c, ((aa0) arrayList.get(ceil)).f31783c, f10 - floor, rectF);
            } else if (z10) {
                rectF.set(((aa0) arrayList.get(floor)).f31783c);
            } else if (z11) {
                rectF.set(((aa0) arrayList.get(ceil)).f31783c);
            }
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z10 || z11) {
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), this.d);
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                aa0 aa0Var = (aa0) arrayList.get(i3);
                aa0Var.f31782b.c(aa0Var.f31783c.left + this.f32148n, getMeasuredHeight() / 2.0f, 1.0f, i0.a.f(1.0f - Math.abs(f10 - i3), this.f32146e, this.f32147f), canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i3;
        org.telegram.messenger.u10 u10Var;
        ArrayList arrayList = this.f32143a;
        if (arrayList.size() > 1) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((aa0) arrayList.get(i10)).d.contains(x10, y9)) {
                        i3 = ((aa0) arrayList.get(i10)).f31781a;
                        break;
                    }
                    i10++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (motionEvent.getAction() == 0) {
                if (i3 != -1) {
                    return true;
                }
            } else if (motionEvent.getAction() == 1 && i3 != -1 && (u10Var = this.f32151w) != null) {
                u10Var.a(Integer.valueOf(i3));
            }
        }
        return false;
    }

    public int getColor() {
        return this.f32146e;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        ArrayList arrayList;
        super.onMeasure(i3, i10);
        this.f32148n = org.telegram.messenger.g0.L(14.0f);
        float f10 = 0.0f;
        this.f32149r = org.telegram.messenger.g0.L(0.0f);
        int i11 = 0;
        while (true) {
            arrayList = this.f32143a;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 > 0) {
                f10 += this.f32149r;
            }
            f10 += ((aa0) arrayList.get(i11)).f31782b.k() + this.f32148n + this.f32148n;
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
            float k10 = ((aa0) arrayList.get(i12)).f31782b.k() + this.f32148n + this.f32148n;
            ((aa0) arrayList.get(i12)).f31783c.set(f13, L, f13 + k10, L2);
            ((aa0) arrayList.get(i12)).d.set(((aa0) arrayList.get(i12)).f31783c);
            ((aa0) arrayList.get(i12)).d.inset((-this.f32149r) / 2.0f, -L);
            f13 += k10 + this.f32149r;
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

    public void setOnTabClick(org.telegram.messenger.u10 u10Var) {
        this.f32151w = u10Var;
    }

    public void setSelectedTab(float f10) {
        this.f32144b = f10;
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
