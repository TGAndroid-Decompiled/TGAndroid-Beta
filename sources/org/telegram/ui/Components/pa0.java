package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class pa0 extends rl0 {
    public boolean U2;
    public boolean V2;
    public int W2;
    public int X2;
    public final qa0 Y2;

    public pa0(qa0 qa0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.Y2 = qa0Var;
        setOnScrollListener(new eg.f2(this, 29));
        i(new oa0(this));
    }

    @Override
    public final void k0(int i10, int i11) {
        qa0 qa0Var = this.Y2;
        qa0Var.invalidate();
        qa0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        qa0 qa0Var = this.Y2;
        tf.u0 u0Var = qa0Var.f28129f;
        tf.z0 z0Var = qa0Var.e;
        if (!qa0Var.f28128c.f5725t ? this.V2 || z0Var == null || z0Var.e == null || !z0Var.f44987f || motionEvent.getY() >= z0Var.e.getBottom() : this.V2 || z0Var == null || z0Var.e == null || !z0Var.f44987f || motionEvent.getY() <= z0Var.e.getTop()) {
            if (!this.U2 && org.telegram.ui.rt.q().r(motionEvent, qa0Var.f28127b, null, this.f28511m2)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (((u0Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && u0Var.N()) {
                if (u0Var.f44911k0 == null) {
                    zw zwVar = new zw(u0Var, u0Var.f44905f, u0Var.f44913n, u0Var.f44918r, 1);
                    u0Var.f44911k0 = zwVar;
                    zwVar.a();
                }
                u0Var.f44911k0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z4) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int N0;
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        qa0 qa0Var = this.Y2;
        boolean g10 = qa0Var.g();
        f2.i0 currentLayoutManager = qa0Var.getCurrentLayoutManager();
        if (g10) {
            N0 = currentLayoutManager.L0();
        } else {
            N0 = currentLayoutManager.N0();
        }
        View m9 = currentLayoutManager.m(N0);
        if (m9 != null) {
            int top = m9.getTop();
            if (g10) {
                i15 = 0;
            } else {
                i15 = this.X2 - i17;
            }
            i14 = top - i15;
        } else {
            i14 = 0;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        if (qa0Var.E) {
            qa0Var.D = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            qa0Var.D = false;
            qa0Var.E = false;
        } else if (N0 != -1 && i16 == this.W2 && i17 - this.X2 != 0) {
            qa0Var.D = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            qa0Var.D = false;
        }
        this.X2 = i17;
        this.W2 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        qa0 qa0Var = this.Y2;
        tf.z0 z0Var = qa0Var.e;
        if (z0Var != null) {
            z0Var.d = Integer.valueOf(size);
            org.telegram.ui.nw0 nw0Var = z0Var.e;
            if (nw0Var != null) {
                nw0Var.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        qa0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qa0 qa0Var = this.Y2;
        tf.z0 z0Var = qa0Var.e;
        if (qa0Var.f28128c.f5725t) {
            if (!this.V2 && z0Var != null && z0Var.e != null && z0Var.f44987f && motionEvent.getY() > z0Var.e.getTop()) {
                return false;
            }
        } else if (!this.V2 && z0Var != null && z0Var.e != null && z0Var.f44987f && motionEvent.getY() < z0Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.Y2.D) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        qa0 qa0Var = this.Y2;
        qa0Var.invalidate();
        qa0Var.b();
    }
}
