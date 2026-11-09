package org.telegram.ui;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class qa0 extends org.telegram.ui.Components.tt0 implements r0.l {
    public final int f48992f0 = 1;
    public final e2.r0 f48993g0;
    public boolean f48994h0;
    public final org.telegram.ui.ActionBar.f2 f48995i0;

    public qa0(org.telegram.ui.Wallet.w5 w5Var, Context context) {
        super(context, null);
        this.f48995i0 = w5Var;
        this.f48993g0 = new Object();
    }

    public void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.s5 s5Var = ((org.telegram.ui.Wallet.w5) this.f48995i0).f43267q0;
        if (s5Var != null) {
            s5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean Y() {
        org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f48995i0;
        bi.t tVar = w5Var.f43264n0;
        if (tVar != null && (tVar.getParent() instanceof View) && ((View) w5Var.f43264n0.getParent()).getTop() <= w5Var.f36649a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public int b0(org.telegram.ui.Components.r41 r41Var, int i7) {
        int[] iArr = {0};
        org.telegram.ui.Components.ui uiVar = new org.telegram.ui.Components.ui(iArr, 22);
        this.f48994h0 = true;
        r41Var.j(uiVar);
        try {
            r41Var.scrollBy(0, i7);
            ArrayList arrayList = r41Var.f2870w0;
            if (arrayList != null) {
                arrayList.remove(uiVar);
            }
            this.f48994h0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = r41Var.f2870w0;
            if (arrayList2 != null) {
                arrayList2.remove(uiVar);
            }
            this.f48994h0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qa0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getNestedScrollAxes() {
        switch (this.f48992f0) {
            case 1:
                return this.f48993g0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void k(int i7, View view) {
        switch (this.f48992f0) {
            case 0:
                this.f48993g0.f10533a = 0;
                return;
            default:
                e2.r0 r0Var = this.f48993g0;
                if (i7 == 1) {
                    r0Var.f10534b = 0;
                } else {
                    r0Var.f10533a = 0;
                }
                org.telegram.ui.Wallet.s5 s5Var = ((org.telegram.ui.Wallet.w5) this.f48995i0).f43267q0;
                if (s5Var != null) {
                    org.telegram.ui.Wallet.l lVar = s5Var.f43096i;
                    fi.w3 w3Var = s5Var.f43092c;
                    if (w3Var != null) {
                        w3Var.removeCallbacks(lVar);
                        s5Var.f43092c.post(lVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        la0 la0Var;
        org.telegram.ui.Components.r41 y02;
        switch (this.f48992f0) {
            case 0:
                ra0 ra0Var = (ra0) this.f48995i0;
                try {
                    if (view == ra0Var.Q && (la0Var = ra0Var.L0) != null && la0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.qj0 currentListView = ra0Var.L0.getCurrentListView();
                        int top = ra0Var.L0.getTop();
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
                    org.telegram.messenger.g0.h3(new jz(this, 20));
                    return;
                }
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f48995i0;
                if (!this.f48994h0 && i12 != 0 && (y02 = w5Var.y0()) != null) {
                    if (view == w5Var.f36649a && Y()) {
                        iArr[1] = b0(y02, i12) + iArr[1];
                        return;
                    } else if (view == y02 && i12 < 0) {
                        iArr[1] = b0(w5Var.f36649a, i12) + iArr[1];
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
        switch (this.f48992f0) {
            case 0:
                return;
            default:
                l(view, i7, i10, i11, i12, i13, new int[2]);
                return;
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        switch (this.f48992f0) {
            case 0:
                if (((ra0) this.f48995i0).L0 != null && i7 == 2) {
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
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f48992f0) {
            case 0:
                ra0 ra0Var = (ra0) this.f48995i0;
                super.onLayout(z9, i7, i10, i11, i12);
                if (z9) {
                    ra0Var.s0(this.f48994h0);
                    this.f48994h0 = false;
                    return;
                }
                ra0Var.K0(true);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f48992f0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i10) * 0.75f);
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f48995i0;
                if (w5Var.f43268r != size) {
                    w5Var.f43268r = size;
                    org.telegram.ui.Wallet.k5 k5Var = w5Var.f43253e;
                    if (k5Var != null) {
                        k5Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.h5 h5Var = w5Var.f43255f;
                    if (h5Var != null) {
                        h5Var.requestLayout();
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
        org.telegram.ui.Wallet.s5 s5Var;
        switch (this.f48992f0) {
            case 1:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f48995i0;
                if (view == w5Var.y0() && (s5Var = w5Var.f43267q0) != null) {
                    return s5Var.a((int) f10, (int) f11);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f10, f11);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f48992f0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        switch (this.f48992f0) {
            case 0:
                this.f48993g0.f10533a = i7;
                return;
            default:
                e2.r0 r0Var = this.f48993g0;
                if (i10 == 1) {
                    r0Var.f10534b = i7;
                    return;
                } else {
                    r0Var.f10533a = i7;
                    return;
                }
        }
    }

    @Override
    public final void s(android.view.View r6, int r7, int r8, int[] r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qa0.s(android.view.View, int, int, int[], int):void");
    }

    public qa0(ra0 ra0Var, Context context) {
        super(context, null);
        this.f48995i0 = ra0Var;
        this.f48994h0 = true;
        this.f48993g0 = new Object();
    }

    private final void a0(View view) {
    }

    private final void Z(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
