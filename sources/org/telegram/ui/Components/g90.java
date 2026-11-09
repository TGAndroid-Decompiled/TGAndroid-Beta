package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class g90 extends qj0 {
    public boolean f33909e3;
    public boolean f33910f3;
    public int f33911g3;
    public int f33912h3;
    public final h90 f33913i3;

    public g90(h90 h90Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f33913i3 = h90Var;
        setOnScrollListener(new ui(this, 9));
        i(new f90(this));
    }

    @Override
    public final void l0(int i7) {
        h90 h90Var = this.f33913i3;
        h90Var.invalidate();
        h90Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        h90 h90Var = this.f33913i3;
        jg.i1 i1Var = h90Var.f34250f;
        jg.o1 o1Var = h90Var.f34249e;
        if (!h90Var.f34248c.f57030t ? this.f33910f3 || o1Var == null || o1Var.f16877e == null || !o1Var.f16878f || motionEvent.getY() >= o1Var.f16877e.getBottom() : this.f33910f3 || o1Var == null || o1Var.f16877e == null || !o1Var.f16878f || motionEvent.getY() <= o1Var.f16877e.getTop()) {
            if (!this.f33909e3 && org.telegram.ui.ms.p().q(motionEvent, h90Var.f34247b, null, this.f37381n2)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (((i1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && i1Var.N()) {
                if (i1Var.f16790n0 == null) {
                    jg.e1 e1Var = new jg.e1(i1Var, i1Var.f16781f, i1Var.f16789n, i1Var.f16794r, 0);
                    i1Var.f16790n0 = e1Var;
                    e1Var.a();
                }
                i1Var.f16790n0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z9) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int N0;
        int i13;
        int i14;
        int i15 = i11 - i7;
        int i16 = i12 - i10;
        h90 h90Var = this.f33913i3;
        boolean g10 = h90Var.g();
        v4.b0 currentLayoutManager = h90Var.getCurrentLayoutManager();
        if (g10) {
            N0 = currentLayoutManager.L0();
        } else {
            N0 = currentLayoutManager.N0();
        }
        View m10 = currentLayoutManager.m(N0);
        if (m10 != null) {
            int top = m10.getTop();
            if (g10) {
                i14 = 0;
            } else {
                i14 = this.f33912h3 - i16;
            }
            i13 = top - i14;
        } else {
            i13 = 0;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        if (h90Var.H) {
            h90Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i7, i10, i11, i12);
            h90Var.G = false;
            h90Var.H = false;
        } else if (N0 != -1 && i15 == this.f33911g3 && i16 - this.f33912h3 != 0) {
            h90Var.G = true;
            currentLayoutManager.i1(N0, i13, false);
            super.onLayout(false, i7, i10, i11, i12);
            h90Var.G = false;
        }
        this.f33912h3 = i16;
        this.f33911g3 = i15;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        h90 h90Var = this.f33913i3;
        jg.o1 o1Var = h90Var.f34249e;
        if (o1Var != null) {
            o1Var.d = Integer.valueOf(size);
            bi.ec ecVar = o1Var.f16877e;
            if (ecVar != null) {
                ecVar.requestLayout();
            }
        }
        float min = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.f22563q.y * 0.22f);
        h90Var.f34254w = min;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h90 h90Var = this.f33913i3;
        jg.o1 o1Var = h90Var.f34249e;
        if (h90Var.f34248c.f57030t) {
            if (!this.f33910f3 && o1Var != null && o1Var.f16877e != null && o1Var.f16878f && motionEvent.getY() > o1Var.f16877e.getTop()) {
                return false;
            }
        } else if (!this.f33910f3 && o1Var != null && o1Var.f16877e != null && o1Var.f16878f && motionEvent.getY() < o1Var.f16877e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f33913i3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        h90 h90Var = this.f33913i3;
        h90Var.invalidate();
        h90Var.b();
    }
}
