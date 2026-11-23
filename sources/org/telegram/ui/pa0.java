package org.telegram.ui;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class pa0 extends org.telegram.ui.Components.du0 implements r0.l {
    public final int f50824g0 = 1;
    public final e2.r0 f50825h0;
    public boolean f50826i0;
    public final org.telegram.ui.ActionBar.g2 f50827j0;

    public pa0(org.telegram.ui.Wallet.n6 n6Var, Context context) {
        super(context, null);
        this.f50827j0 = n6Var;
        this.f50825h0 = new Object();
    }

    public void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.j6 j6Var = ((org.telegram.ui.Wallet.n6) this.f50827j0).f44688t0;
        if (j6Var != null) {
            j6Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public int a0(org.telegram.ui.Components.h51 h51Var, int i7) {
        int[] iArr = {0};
        org.telegram.ui.Components.oa oaVar = new org.telegram.ui.Components.oa(iArr, 25);
        this.f50826i0 = true;
        h51Var.j(oaVar);
        try {
            h51Var.scrollBy(0, i7);
            ArrayList arrayList = h51Var.f2840x0;
            if (arrayList != null) {
                arrayList.remove(oaVar);
            }
            this.f50826i0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = h51Var.f2840x0;
            if (arrayList2 != null) {
                arrayList2.remove(oaVar);
            }
            this.f50826i0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pa0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getNestedScrollAxes() {
        switch (this.f50824g0) {
            case 1:
                return this.f50825h0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void k(int i7, View view) {
        switch (this.f50824g0) {
            case 0:
                this.f50825h0.f10716a = 0;
                return;
            default:
                e2.r0 r0Var = this.f50825h0;
                if (i7 == 1) {
                    r0Var.f10717b = 0;
                } else {
                    r0Var.f10716a = 0;
                }
                org.telegram.ui.Wallet.j6 j6Var = ((org.telegram.ui.Wallet.n6) this.f50827j0).f44688t0;
                if (j6Var != null) {
                    org.telegram.ui.Wallet.m mVar = j6Var.f44452i;
                    bi.f6 f6Var = j6Var.f44448c;
                    if (f6Var != null) {
                        f6Var.removeCallbacks(mVar);
                        j6Var.f44448c.post(mVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        ka0 ka0Var;
        org.telegram.ui.Components.h51 B0;
        switch (this.f50824g0) {
            case 0:
                qa0 qa0Var = (qa0) this.f50827j0;
                try {
                    if (view == qa0Var.R && (ka0Var = qa0Var.R0) != null && ka0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.ek0 currentListView = qa0Var.R0.getCurrentListView();
                        int top = qa0Var.R0.getTop();
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
                    org.telegram.messenger.g0.g3(new lz(this, 20));
                    return;
                }
            default:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.f50827j0;
                if (!this.f50826i0 && i12 != 0 && (B0 = n6Var.B0()) != null) {
                    if (view == n6Var.f34681a && n6Var.E0()) {
                        iArr[1] = a0(B0, i12) + iArr[1];
                        return;
                    } else if (view == B0 && i12 < 0) {
                        iArr[1] = a0(n6Var.f34681a, i12) + iArr[1];
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
        switch (this.f50824g0) {
            case 0:
                return;
            default:
                l(view, i7, i10, i11, i12, i13, new int[2]);
                return;
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        switch (this.f50824g0) {
            case 0:
                if (((qa0) this.f50827j0).R0 != null && i7 == 2) {
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
        switch (this.f50824g0) {
            case 0:
                qa0 qa0Var = (qa0) this.f50827j0;
                super.onLayout(z10, i7, i10, i11, i12);
                if (z10) {
                    qa0Var.s0(this.f50826i0);
                    this.f50826i0 = false;
                    return;
                }
                qa0Var.N0(true);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f50824g0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i10) * 0.75f);
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.f50827j0;
                if (n6Var.f44684r != size) {
                    n6Var.f44684r = size;
                    org.telegram.ui.Wallet.b6 b6Var = n6Var.f44669e;
                    if (b6Var != null) {
                        b6Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.y5 y5Var = n6Var.f44671f;
                    if (y5Var != null) {
                        y5Var.requestLayout();
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
        org.telegram.ui.Wallet.j6 j6Var;
        switch (this.f50824g0) {
            case 1:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.f50827j0;
                if (view == n6Var.B0() && (j6Var = n6Var.f44688t0) != null) {
                    return j6Var.a((int) f10, (int) f11);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f10, f11);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f50824g0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        switch (this.f50824g0) {
            case 0:
                this.f50825h0.f10716a = i7;
                return;
            default:
                e2.r0 r0Var = this.f50825h0;
                if (i10 == 1) {
                    r0Var.f10717b = i7;
                    return;
                } else {
                    r0Var.f10716a = i7;
                    return;
                }
        }
    }

    @Override
    public final void s(android.view.View r6, int r7, int r8, int[] r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pa0.s(android.view.View, int, int, int[], int):void");
    }

    public pa0(qa0 qa0Var, Context context) {
        super(context, null);
        this.f50827j0 = qa0Var;
        this.f50826i0 = true;
        this.f50825h0 = new Object();
    }

    private final void Z(View view) {
    }

    private final void Y(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
