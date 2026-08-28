package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v90 extends wk0 {
    public boolean T2;
    public boolean U2;
    public int V2;
    public int W2;
    public final w90 X2;

    public v90(w90 w90Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.X2 = w90Var;
        setOnScrollListener(new kn(this, 5));
        i(new u90(this));
    }

    @Override
    public final void k0(int i9, int i10) {
        w90 w90Var = this.X2;
        w90Var.invalidate();
        w90Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        w90 w90Var = this.X2;
        of.f1 f1Var = w90Var.f34159f;
        of.k1 k1Var = w90Var.f34158e;
        if (!w90Var.f34157c.f5437t ? this.U2 || k1Var == null || k1Var.f19399e == null || !k1Var.f19400f || motionEvent.getY() >= k1Var.f19399e.getBottom() : this.U2 || k1Var == null || k1Var.f19399e == null || !k1Var.f19400f || motionEvent.getY() <= k1Var.f19399e.getTop()) {
            if (!this.T2 && org.telegram.ui.ht.q().r(motionEvent, w90Var.f34156b, null, this.f34260l2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((f1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && f1Var.N()) {
                if (f1Var.f19332j0 == null) {
                    of.b1 b1Var = new of.b1(f1Var, f1Var.f19327f, f1Var.f19335n, f1Var.f19340r, 0);
                    f1Var.f19332j0 = b1Var;
                    b1Var.a();
                }
                f1Var.f19332j0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int N0;
        int i13;
        int i14;
        int i15 = i11 - i9;
        int i16 = i12 - i10;
        w90 w90Var = this.X2;
        boolean g10 = w90Var.g();
        f2.m0 currentLayoutManager = w90Var.getCurrentLayoutManager();
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
                i14 = this.W2 - i16;
            }
            i13 = top - i14;
        } else {
            i13 = 0;
        }
        super.onLayout(z10, i9, i10, i11, i12);
        if (w90Var.D) {
            w90Var.C = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i9, i10, i11, i12);
            w90Var.C = false;
            w90Var.D = false;
        } else if (N0 != -1 && i15 == this.V2 && i16 - this.W2 != 0) {
            w90Var.C = true;
            currentLayoutManager.i1(N0, i13, false);
            super.onLayout(false, i9, i10, i11, i12);
            w90Var.C = false;
        }
        this.W2 = i16;
        this.V2 = i15;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        w90 w90Var = this.X2;
        of.k1 k1Var = w90Var.f34158e;
        if (k1Var != null) {
            k1Var.d = Integer.valueOf(size);
            fh.l2 l2Var = k1Var.f19399e;
            if (l2Var != null) {
                l2Var.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        w90Var.v = min;
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        w90 w90Var = this.X2;
        of.k1 k1Var = w90Var.f34158e;
        if (w90Var.f34157c.f5437t) {
            if (!this.U2 && k1Var != null && k1Var.f19399e != null && k1Var.f19400f && motionEvent.getY() > k1Var.f19399e.getTop()) {
                return false;
            }
        } else if (!this.U2 && k1Var != null && k1Var.f19399e != null && k1Var.f19400f && motionEvent.getY() < k1Var.f19399e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.X2.C) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        w90 w90Var = this.X2;
        w90Var.invalidate();
        w90Var.b();
    }
}
