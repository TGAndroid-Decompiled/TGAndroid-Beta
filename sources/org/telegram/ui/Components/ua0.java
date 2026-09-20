package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ua0 extends vl0 {
    public boolean X2;
    public boolean Y2;
    public int Z2;
    public int f28637a3;
    public final va0 f28638b3;

    public ua0(va0 va0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f28638b3 = va0Var;
        setOnScrollListener(new ai.r(this, 29));
        i(new ta0(this));
    }

    @Override
    public final void l0(int i10, int i11) {
        va0 va0Var = this.f28638b3;
        va0Var.invalidate();
        va0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        va0 va0Var = this.f28638b3;
        gg.k1 k1Var = va0Var.f29048f;
        gg.q1 q1Var = va0Var.e;
        if (!va0Var.f29047c.f42967t ? this.Y2 || q1Var == null || q1Var.e == null || !q1Var.f9903f || motionEvent.getY() >= q1Var.e.getBottom() : this.Y2 || q1Var == null || q1Var.e == null || !q1Var.f9903f || motionEvent.getY() <= q1Var.e.getTop()) {
            if (!this.X2 && org.telegram.ui.st.q().r(motionEvent, va0Var.f29046b, null, this.f29207p2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((k1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && k1Var.N()) {
                if (k1Var.f9830n0 == null) {
                    gg.g1 g1Var = new gg.g1(k1Var, k1Var.f9821f, k1Var.f9829n, k1Var.f9834r, 0);
                    k1Var.f9830n0 = g1Var;
                    g1Var.a();
                }
                k1Var.f9830n0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int N0;
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        va0 va0Var = this.f28638b3;
        boolean g10 = va0Var.g();
        s4.c0 currentLayoutManager = va0Var.getCurrentLayoutManager();
        if (g10) {
            N0 = currentLayoutManager.L0();
        } else {
            N0 = currentLayoutManager.N0();
        }
        View m10 = currentLayoutManager.m(N0);
        if (m10 != null) {
            int top = m10.getTop();
            if (g10) {
                i15 = 0;
            } else {
                i15 = this.f28637a3 - i17;
            }
            i14 = top - i15;
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (va0Var.H) {
            va0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            va0Var.G = false;
            va0Var.H = false;
        } else if (N0 != -1 && i16 == this.Z2 && i17 - this.f28637a3 != 0) {
            va0Var.G = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            va0Var.G = false;
        }
        this.f28637a3 = i17;
        this.Z2 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        va0 va0Var = this.f28638b3;
        gg.q1 q1Var = va0Var.e;
        if (q1Var != null) {
            q1Var.d = Integer.valueOf(size);
            ci.eb ebVar = q1Var.e;
            if (ebVar != null) {
                ebVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        va0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        va0 va0Var = this.f28638b3;
        gg.q1 q1Var = va0Var.e;
        if (va0Var.f29047c.f42967t) {
            if (!this.Y2 && q1Var != null && q1Var.e != null && q1Var.f9903f && motionEvent.getY() > q1Var.e.getTop()) {
                return false;
            }
        } else if (!this.Y2 && q1Var != null && q1Var.e != null && q1Var.f9903f && motionEvent.getY() < q1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f28638b3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        va0 va0Var = this.f28638b3;
        va0Var.invalidate();
        va0Var.b();
    }
}
