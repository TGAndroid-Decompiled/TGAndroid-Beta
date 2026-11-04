package org.telegram.ui;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class ka0 extends org.telegram.ui.Components.qt0 implements r0.l {
    public final int f46849g0 = 1;
    public final d2.t0 f46850h0;
    public boolean f46851i0;
    public final org.telegram.ui.ActionBar.d2 f46852j0;

    public ka0(org.telegram.ui.Wallet.w5 w5Var, Context context) {
        super(context, null);
        this.f46852j0 = w5Var;
        this.f46850h0 = new Object();
    }

    public void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.s5 s5Var = ((org.telegram.ui.Wallet.w5) this.f46852j0).f43339r0;
        if (s5Var != null) {
            s5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean Y() {
        org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f46852j0;
        ci.q qVar = w5Var.f43335o0;
        if (qVar != null && (qVar.getParent() instanceof View) && ((View) w5Var.f43335o0.getParent()).getTop() <= w5Var.f34298a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public int b0(org.telegram.ui.Components.l41 l41Var, int i3) {
        int[] iArr = {0};
        org.telegram.ui.Components.ji jiVar = new org.telegram.ui.Components.ji(iArr, 24);
        this.f46851i0 = true;
        l41Var.j(jiVar);
        try {
            l41Var.scrollBy(0, i3);
            ArrayList arrayList = l41Var.f2304x0;
            if (arrayList != null) {
                arrayList.remove(jiVar);
            }
            this.f46851i0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = l41Var.f2304x0;
            if (arrayList2 != null) {
                arrayList2.remove(jiVar);
            }
            this.f46851i0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ka0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getNestedScrollAxes() {
        switch (this.f46849g0) {
            case 1:
                return this.f46850h0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void m(int i3, View view) {
        switch (this.f46849g0) {
            case 0:
                this.f46850h0.f8413a = 0;
                return;
            default:
                d2.t0 t0Var = this.f46850h0;
                if (i3 == 1) {
                    t0Var.f8414b = 0;
                } else {
                    t0Var.f8413a = 0;
                }
                org.telegram.ui.Wallet.s5 s5Var = ((org.telegram.ui.Wallet.w5) this.f46852j0).f43339r0;
                if (s5Var != null) {
                    org.telegram.ui.Wallet.l lVar = s5Var.f43159i;
                    ai.h4 h4Var = s5Var.f43155c;
                    if (h4Var != null) {
                        h4Var.removeCallbacks(lVar);
                        s5Var.f43155c.post(lVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void n(View view, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        fa0 fa0Var;
        org.telegram.ui.Components.l41 y02;
        switch (this.f46849g0) {
            case 0:
                la0 la0Var = (la0) this.f46852j0;
                try {
                    if (view == la0Var.R && (fa0Var = la0Var.M0) != null && fa0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.tj0 currentListView = la0Var.M0.getCurrentListView();
                        int top = la0Var.M0.getTop();
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
                    org.telegram.messenger.g0.h3(new fz(this, 19));
                    return;
                }
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f46852j0;
                if (!this.f46851i0 && i12 != 0 && (y02 = w5Var.y0()) != null) {
                    if (view == w5Var.f34298a && Y()) {
                        iArr[1] = b0(y02, i12) + iArr[1];
                        return;
                    } else if (view == y02 && i12 < 0) {
                        iArr[1] = b0(w5Var.f34298a, i12) + iArr[1];
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void o(View view, int i3, int i10, int i11, int i12, int i13) {
        switch (this.f46849g0) {
            case 0:
                return;
            default:
                n(view, i3, i10, i11, i12, i13, new int[2]);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f46849g0) {
            case 0:
                la0 la0Var = (la0) this.f46852j0;
                super.onLayout(z10, i3, i10, i11, i12);
                if (z10) {
                    la0Var.s0(this.f46851i0);
                    this.f46851i0 = false;
                    return;
                }
                la0Var.K0(true);
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f46849g0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i10) * 0.75f);
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f46852j0;
                if (w5Var.f43338r != size) {
                    w5Var.f43338r = size;
                    org.telegram.ui.Wallet.k5 k5Var = w5Var.f43323e;
                    if (k5Var != null) {
                        k5Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.h5 h5Var = w5Var.f43325f;
                    if (h5Var != null) {
                        h5Var.requestLayout();
                    }
                }
                super.onMeasure(i3, i10);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean onNestedPreFling(View view, float f10, float f11) {
        org.telegram.ui.Wallet.s5 s5Var;
        switch (this.f46849g0) {
            case 1:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f46852j0;
                if (view == w5Var.y0() && (s5Var = w5Var.f43339r0) != null) {
                    return s5Var.a((int) f10, (int) f11);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f10, f11);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f46849g0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final boolean p(View view, View view2, int i3, int i10) {
        switch (this.f46849g0) {
            case 0:
                if (((la0) this.f46852j0).M0 != null && i3 == 2) {
                    return true;
                }
                return false;
            default:
                if ((i3 & 2) != 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void s(View view, View view2, int i3, int i10) {
        switch (this.f46849g0) {
            case 0:
                this.f46850h0.f8413a = i3;
                return;
            default:
                d2.t0 t0Var = this.f46850h0;
                if (i10 == 1) {
                    t0Var.f8414b = i3;
                    return;
                } else {
                    t0Var.f8413a = i3;
                    return;
                }
        }
    }

    @Override
    public final void t(android.view.View r6, int r7, int r8, int[] r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ka0.t(android.view.View, int, int, int[], int):void");
    }

    public ka0(la0 la0Var, Context context) {
        super(context, null);
        this.f46852j0 = la0Var;
        this.f46851i0 = true;
        this.f46850h0 = new Object();
    }

    private final void a0(View view) {
    }

    private final void Z(View view, int i3, int i10, int i11, int i12, int i13) {
    }
}
