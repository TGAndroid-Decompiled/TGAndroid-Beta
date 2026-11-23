package org.telegram.ui;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class oa0 extends org.telegram.ui.Components.cu0 implements r0.l {
    public final int f50612g0 = 1;
    public final e2.r0 f50613h0;
    public boolean f50614i0;
    public final org.telegram.ui.ActionBar.g2 f50615j0;

    public oa0(org.telegram.ui.Wallet.o6 o6Var, Context context) {
        super(context, null);
        this.f50615j0 = o6Var;
        this.f50613h0 = new Object();
    }

    public void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.k6 k6Var = ((org.telegram.ui.Wallet.o6) this.f50615j0).f44816t0;
        if (k6Var != null) {
            k6Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public int a0(org.telegram.ui.Components.g51 g51Var, int i7) {
        int[] iArr = {0};
        org.telegram.ui.Components.na naVar = new org.telegram.ui.Components.na(iArr, 25);
        this.f50614i0 = true;
        g51Var.j(naVar);
        try {
            g51Var.scrollBy(0, i7);
            ArrayList arrayList = g51Var.f2792x0;
            if (arrayList != null) {
                arrayList.remove(naVar);
            }
            this.f50614i0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = g51Var.f2792x0;
            if (arrayList2 != null) {
                arrayList2.remove(naVar);
            }
            this.f50614i0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oa0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getNestedScrollAxes() {
        switch (this.f50612g0) {
            case 1:
                return this.f50613h0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void k(int i7, View view) {
        switch (this.f50612g0) {
            case 0:
                this.f50613h0.f10677a = 0;
                return;
            default:
                e2.r0 r0Var = this.f50613h0;
                if (i7 == 1) {
                    r0Var.f10678b = 0;
                } else {
                    r0Var.f10677a = 0;
                }
                org.telegram.ui.Wallet.k6 k6Var = ((org.telegram.ui.Wallet.o6) this.f50615j0).f44816t0;
                if (k6Var != null) {
                    org.telegram.ui.Wallet.m mVar = k6Var.f44579i;
                    bi.i6 i6Var = k6Var.f44575c;
                    if (i6Var != null) {
                        i6Var.removeCallbacks(mVar);
                        k6Var.f44575c.post(mVar);
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
        org.telegram.ui.Components.g51 B0;
        switch (this.f50612g0) {
            case 0:
                pa0 pa0Var = (pa0) this.f50615j0;
                try {
                    if (view == pa0Var.R && (ja0Var = pa0Var.R0) != null && ja0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.ek0 currentListView = pa0Var.R0.getCurrentListView();
                        int top = pa0Var.R0.getTop();
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
                    org.telegram.messenger.g0.g3(new kz(this, 20));
                    return;
                }
            default:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) this.f50615j0;
                if (!this.f50614i0 && i12 != 0 && (B0 = o6Var.B0()) != null) {
                    if (view == o6Var.f34213a && o6Var.E0()) {
                        iArr[1] = a0(B0, i12) + iArr[1];
                        return;
                    } else if (view == B0 && i12 < 0) {
                        iArr[1] = a0(o6Var.f34213a, i12) + iArr[1];
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
        switch (this.f50612g0) {
            case 0:
                return;
            default:
                l(view, i7, i10, i11, i12, i13, new int[2]);
                return;
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        switch (this.f50612g0) {
            case 0:
                if (((pa0) this.f50615j0).R0 != null && i7 == 2) {
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
        switch (this.f50612g0) {
            case 0:
                pa0 pa0Var = (pa0) this.f50615j0;
                super.onLayout(z10, i7, i10, i11, i12);
                if (z10) {
                    pa0Var.s0(this.f50614i0);
                    this.f50614i0 = false;
                    return;
                }
                pa0Var.N0(true);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f50612g0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i10) * 0.75f);
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) this.f50615j0;
                if (o6Var.f44812r != size) {
                    o6Var.f44812r = size;
                    org.telegram.ui.Wallet.c6 c6Var = o6Var.f44797e;
                    if (c6Var != null) {
                        c6Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.z5 z5Var = o6Var.f44799f;
                    if (z5Var != null) {
                        z5Var.requestLayout();
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
        org.telegram.ui.Wallet.k6 k6Var;
        switch (this.f50612g0) {
            case 1:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) this.f50615j0;
                if (view == o6Var.B0() && (k6Var = o6Var.f44816t0) != null) {
                    return k6Var.a((int) f10, (int) f11);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f10, f11);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f50612g0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        switch (this.f50612g0) {
            case 0:
                this.f50613h0.f10677a = i7;
                return;
            default:
                e2.r0 r0Var = this.f50613h0;
                if (i10 == 1) {
                    r0Var.f10678b = i7;
                    return;
                } else {
                    r0Var.f10677a = i7;
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
        this.f50615j0 = pa0Var;
        this.f50614i0 = true;
        this.f50613h0 = new Object();
    }

    private final void Z(View view) {
    }

    private final void Y(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
