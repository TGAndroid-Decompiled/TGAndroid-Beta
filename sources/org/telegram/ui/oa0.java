package org.telegram.ui;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class oa0 extends org.telegram.ui.Components.st0 implements r0.l {
    public final int f49872g0 = 1;
    public final e2.r0 f49873h0;
    public boolean f49874i0;
    public final org.telegram.ui.ActionBar.e2 f49875j0;

    public oa0(org.telegram.ui.Wallet.y5 y5Var, Context context) {
        super(context, null);
        this.f49875j0 = y5Var;
        this.f49873h0 = new Object();
    }

    public void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.u5 u5Var = ((org.telegram.ui.Wallet.y5) this.f49875j0).f44747r0;
        if (u5Var != null) {
            u5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean Y() {
        org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.f49875j0;
        ai.r2 r2Var = y5Var.f44743o0;
        if (r2Var != null && (r2Var.getParent() instanceof View) && ((View) y5Var.f44743o0.getParent()).getTop() <= y5Var.f38880a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public int b0(org.telegram.ui.Components.u41 u41Var, int i7) {
        int[] iArr = {0};
        org.telegram.ui.Components.ri riVar = new org.telegram.ui.Components.ri(iArr, 24);
        this.f49874i0 = true;
        u41Var.j(riVar);
        try {
            u41Var.scrollBy(0, i7);
            ArrayList arrayList = u41Var.f2829x0;
            if (arrayList != null) {
                arrayList.remove(riVar);
            }
            this.f49874i0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = u41Var.f2829x0;
            if (arrayList2 != null) {
                arrayList2.remove(riVar);
            }
            this.f49874i0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oa0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getNestedScrollAxes() {
        switch (this.f49872g0) {
            case 1:
                return this.f49873h0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void k(int i7, View view) {
        switch (this.f49872g0) {
            case 0:
                this.f49873h0.f10369a = 0;
                return;
            default:
                e2.r0 r0Var = this.f49873h0;
                if (i7 == 1) {
                    r0Var.f10370b = 0;
                } else {
                    r0Var.f10369a = 0;
                }
                org.telegram.ui.Wallet.u5 u5Var = ((org.telegram.ui.Wallet.y5) this.f49875j0).f44747r0;
                if (u5Var != null) {
                    org.telegram.ui.Wallet.l lVar = u5Var.f44560i;
                    bi.v3 v3Var = u5Var.f44556c;
                    if (v3Var != null) {
                        v3Var.removeCallbacks(lVar);
                        u5Var.f44556c.post(lVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        ja0 ja0Var;
        org.telegram.ui.Components.u41 y02;
        switch (this.f49872g0) {
            case 0:
                pa0 pa0Var = (pa0) this.f49875j0;
                try {
                    if (view == pa0Var.R && (ja0Var = pa0Var.M0) != null && ja0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.uj0 currentListView = pa0Var.M0.getCurrentListView();
                        int top = pa0Var.M0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i12;
                            currentListView.scrollBy(0, i12);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    org.telegram.messenger.g0.h3(new iz(this, 20));
                    return;
                }
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.f49875j0;
                if (!this.f49874i0 && i12 != 0 && (y02 = y5Var.y0()) != null) {
                    if (view == y5Var.f38880a && Y()) {
                        iArr[1] = b0(y02, i12) + iArr[1];
                        return;
                    } else if (view == y02 && i12 < 0) {
                        iArr[1] = b0(y5Var.f38880a, i12) + iArr[1];
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
        switch (this.f49872g0) {
            case 0:
                return;
            default:
                l(view, i7, i10, i11, i12, i13, new int[2]);
                return;
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        switch (this.f49872g0) {
            case 0:
                if (((pa0) this.f49875j0).M0 != null && i7 == 2) {
                    return true;
                }
                return false;
            default:
                if ((i7 & 2) != 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f49872g0) {
            case 0:
                pa0 pa0Var = (pa0) this.f49875j0;
                super.onLayout(z10, i7, i10, i11, i12);
                if (z10) {
                    pa0Var.s0(this.f49874i0);
                    this.f49874i0 = false;
                    return;
                }
                pa0Var.K0(true);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f49872g0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i10) * 0.75f);
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.f49875j0;
                if (y5Var.f44746r != size) {
                    y5Var.f44746r = size;
                    org.telegram.ui.Wallet.m5 m5Var = y5Var.f44731e;
                    if (m5Var != null) {
                        m5Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.j5 j5Var = y5Var.f44733f;
                    if (j5Var != null) {
                        j5Var.requestLayout();
                    }
                }
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onNestedPreFling(View view, float f10, float f11) {
        org.telegram.ui.Wallet.u5 u5Var;
        switch (this.f49872g0) {
            case 1:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.f49875j0;
                if (view == y5Var.y0() && (u5Var = y5Var.f44747r0) != null) {
                    return u5Var.a((int) f10, (int) f11);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f10, f11);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f49872g0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        switch (this.f49872g0) {
            case 0:
                this.f49873h0.f10369a = i7;
                return;
            default:
                e2.r0 r0Var = this.f49873h0;
                if (i10 == 1) {
                    r0Var.f10370b = i7;
                    return;
                } else {
                    r0Var.f10369a = i7;
                    return;
                }
        }
    }

    @Override
    public final void s(android.view.View r6, int r7, int r8, int[] r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oa0.s(android.view.View, int, int, int[], int):void");
    }

    public oa0(pa0 pa0Var, Context context) {
        super(context, null);
        this.f49875j0 = pa0Var;
        this.f49874i0 = true;
        this.f49873h0 = new Object();
    }

    private final void a0(View view) {
    }

    private final void Z(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
