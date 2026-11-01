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
public final class ya0 extends View implements org.telegram.ui.ActionBar.k6 {
    public final ArrayList f32793a;
    public float f32794b;
    public final org.telegram.ui.ActionBar.p6 f32795c;
    public final Paint d;
    public int e;
    public int f32796f;
    public Drawable h;
    public float f32797n;
    public float f32798r;
    public final RectF f32799s;
    public org.telegram.messenger.r20 f32800w;

    public ya0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f32793a = new ArrayList();
        this.d = new Paint(1);
        this.f32797n = org.telegram.messenger.i0.L(14.0f);
        this.f32798r = org.telegram.messenger.i0.L(0.0f);
        this.f32799s = new RectF();
        this.f32795c = p6Var;
        b();
    }

    public final void a(int i10, String str) {
        this.f32793a.add(new xa0(i10, str));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Be));
    }

    public final void b() {
        int[] iArr;
        boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
        Paint paint = this.d;
        if (q6) {
            this.e = -1862270977;
            this.f32796f = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.Be;
        org.telegram.ui.ActionBar.p6 p6Var = this.f32795c;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        if ((p6Var instanceof org.telegram.ui.sn) && (((org.telegram.ui.sn) p6Var).m() instanceof jb0) && (iArr = ((jb0) ((org.telegram.ui.sn) p6Var).m()).f27331a) != null) {
            w02 = org.telegram.messenger.i0.w0(org.telegram.messenger.i0.w0(iArr[0], iArr[1]), org.telegram.messenger.i0.w0(iArr[2], iArr[3]));
        }
        this.e = org.telegram.ui.ActionBar.t6.c(-1606201797, w02);
        this.f32796f = org.telegram.ui.ActionBar.t6.c(-448573893, w02);
        paint.setColor(org.telegram.ui.ActionBar.t6.c(814980216, w02));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        ArrayList arrayList = this.f32793a;
        boolean z11 = true;
        if (arrayList.size() > 1) {
            float f7 = this.f32794b;
            double d = f7;
            int floor = (int) Math.floor(d);
            if (floor >= 0 && floor < arrayList.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int ceil = (int) Math.ceil(d);
            z11 = (ceil < 0 || ceil >= arrayList.size()) ? false : false;
            RectF rectF = this.f32799s;
            if (z10 && z11) {
                org.telegram.messenger.i0.Z1(((xa0) arrayList.get(floor)).f32533c, ((xa0) arrayList.get(ceil)).f32533c, f7 - floor, rectF);
            } else if (z10) {
                rectF.set(((xa0) arrayList.get(floor)).f32533c);
            } else if (z11) {
                rectF.set(((xa0) arrayList.get(ceil)).f32533c);
            }
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (z10 || z11) {
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), this.d);
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                xa0 xa0Var = (xa0) arrayList.get(i10);
                xa0Var.f32532b.c(xa0Var.f32533c.left + this.f32797n, getMeasuredHeight() / 2.0f, 1.0f, i0.b.f(1.0f - Math.abs(f7 - i10), this.e, this.f32796f), canvas);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        org.telegram.messenger.r20 r20Var;
        ArrayList arrayList = this.f32793a;
        if (arrayList.size() > 1) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    if (((xa0) arrayList.get(i11)).d.contains(x10, y3)) {
                        i10 = ((xa0) arrayList.get(i11)).f32531a;
                        break;
                    }
                    i11++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (motionEvent.getAction() == 0) {
                if (i10 != -1) {
                    return true;
                }
            } else if (motionEvent.getAction() == 1 && i10 != -1 && (r20Var = this.f32800w) != null) {
                r20Var.a(Integer.valueOf(i10));
            }
        }
        return false;
    }

    public int getColor() {
        return this.e;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        super.onMeasure(i10, i11);
        this.f32797n = org.telegram.messenger.i0.L(14.0f);
        float f7 = 0.0f;
        this.f32798r = org.telegram.messenger.i0.L(0.0f);
        int i12 = 0;
        while (true) {
            arrayList = this.f32793a;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (i12 > 0) {
                f7 += this.f32798r;
            }
            f7 += ((xa0) arrayList.get(i12)).f32532b.k() + this.f32797n + this.f32797n;
            i12++;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float L = (measuredHeight - org.telegram.messenger.i0.L(26.0f)) / 2.0f;
        float L2 = (org.telegram.messenger.i0.L(26.0f) + measuredHeight) / 2.0f;
        float f10 = measuredWidth;
        float f11 = (f10 - f7) / 2.0f;
        float f12 = f11;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            float k10 = ((xa0) arrayList.get(i13)).f32532b.k() + this.f32797n + this.f32797n;
            ((xa0) arrayList.get(i13)).f32533c.set(f12, L, f12 + k10, L2);
            ((xa0) arrayList.get(i13)).d.set(((xa0) arrayList.get(i13)).f32533c);
            ((xa0) arrayList.get(i13)).d.inset((-this.f32798r) / 2.0f, -L);
            f12 += k10 + this.f32798r;
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            Rect rect = org.telegram.messenger.i0.Q;
            drawable.getPadding(rect);
            int i14 = measuredHeight / 2;
            this.h.setBounds((((int) f11) - org.telegram.messenger.i0.L(3.0f)) - rect.left, (i14 - org.telegram.messenger.i0.L(16.0f)) - rect.top, org.telegram.messenger.i0.L(3.0f) + ((int) ((f10 + f7) / 2.0f)) + rect.right, org.telegram.messenger.i0.L(16.0f) + i14 + rect.bottom);
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.h = drawable;
    }

    public void setOnTabClick(org.telegram.messenger.r20 r20Var) {
        this.f32800w = r20Var;
    }

    public void setSelectedTab(float f7) {
        this.f32794b = f7;
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            b();
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
