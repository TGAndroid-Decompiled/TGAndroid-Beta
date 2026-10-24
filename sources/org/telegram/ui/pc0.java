package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class pc0 extends org.telegram.ui.Components.nw0 implements r0.m {
    public final int f40438w0 = 1;
    public final b2.u0 f40439x0;
    public boolean f40440y0;
    public final org.telegram.ui.ActionBar.o2 f40441z0;

    public pc0(org.telegram.ui.Wallet.o5 o5Var, Context context) {
        super(context, null);
        this.f40441z0 = o5Var;
        this.f40439x0 = new Object();
    }

    @Override
    public final void D(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        hc0 hc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.lm0 currentListView;
        int max;
        org.telegram.ui.Components.i71 t02;
        org.telegram.ui.Wallet.k5 k5Var;
        switch (this.f40438w0) {
            case 0:
                rc0 rc0Var = (rc0) this.f40441z0;
                if (viewGroup == rc0Var.U && (hc0Var = rc0Var.J0) != null && hc0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.o2) rc0Var).actionBar;
                    boolean z10 = kVar.f21069n0;
                    int top = rc0Var.J0.getTop();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if (top <= 0 && (currentListView = rc0Var.J0.getCurrentListView()) != null) {
                            int L0 = ((s4.b0) currentListView.getLayoutManager()).L0();
                            int i14 = -1;
                            if (L0 != -1) {
                                s4.b1 K = currentListView.K(L0);
                                if (K != null) {
                                    i14 = K.f46342a.getTop();
                                }
                                int paddingTop = currentListView.getPaddingTop();
                                if (i14 != paddingTop || L0 != 0) {
                                    if (L0 != 0) {
                                        max = i11;
                                    } else {
                                        max = Math.max(i11, i14 - paddingTop);
                                    }
                                    iArr[1] = max;
                                    currentListView.scrollBy(0, i11);
                                    z11 = true;
                                }
                            }
                        }
                        if (z10) {
                            if (!z11 && top < 0) {
                                iArr[1] = i11 - Math.max(top, i11);
                                return;
                            } else {
                                iArr[1] = i11;
                                return;
                            }
                        }
                        return;
                    } else if (z10) {
                        org.telegram.ui.Components.lm0 currentListView2 = rc0Var.J0.getCurrentListView();
                        iArr[1] = i11;
                        if (top > 0) {
                            iArr[1] = 0;
                        }
                        if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                            currentListView2.scrollBy(0, i13);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.f40441z0;
                if (!this.f40440y0 && (t02 = o5Var.t0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((viewGroup == o5Var.f25615a || viewGroup == t02) && (k5Var = o5Var.f34951p0) != null && k5Var.f34713f)) {
                        k5Var.d = true;
                    }
                    if (viewGroup == o5Var.f25615a && i11 < 0 && Z()) {
                        iArr[1] = c0(t02, i11) + iArr[1];
                        return;
                    } else if (viewGroup == t02 && i11 > 0) {
                        iArr[1] = c0(o5Var.f25615a, i11) + iArr[1];
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void K(Canvas canvas, ArrayList arrayList) {
        switch (this.f40438w0) {
            case 0:
                rc0 rc0Var = (rc0) this.f40441z0;
                if (rc0Var.J0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, rc0Var.U.getY());
                    rc0Var.J0.R(canvas, arrayList);
                    canvas.restore();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void Y() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.k5 k5Var = ((org.telegram.ui.Wallet.o5) this.f40441z0).f34951p0;
        if (k5Var != null) {
            k5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean Z() {
        org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.f40441z0;
        ai.r rVar = o5Var.m0;
        if (rVar != null && (rVar.getParent() instanceof View) && ((View) o5Var.m0.getParent()).getTop() <= o5Var.f25615a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        switch (this.f40438w0) {
            case 0:
                return;
            default:
                h(viewGroup, i10, i11, i12, i13, i14, new int[2]);
                return;
        }
    }

    public int c0(org.telegram.ui.Components.i71 i71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.iv ivVar = new org.telegram.ui.Components.iv(iArr, 15);
        this.f40440y0 = true;
        i71Var.j(ivVar);
        try {
            i71Var.scrollBy(0, i10);
            ArrayList arrayList = i71Var.f3637w0;
            if (arrayList != null) {
                arrayList.remove(ivVar);
            }
            this.f40440y0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = i71Var.f3637w0;
            if (arrayList2 != null) {
                arrayList2.remove(ivVar);
            }
            this.f40440y0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pc0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40438w0) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                rc0 rc0Var = (rc0) this.f40441z0;
                kVar = ((org.telegram.ui.ActionBar.o2) rc0Var).actionBar;
                if (view == kVar) {
                    h5Var = ((org.telegram.ui.ActionBar.o2) rc0Var).parentLayout;
                    if (h5Var != null) {
                        h5Var2 = ((org.telegram.ui.ActionBar.o2) rc0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.o2) rc0Var).actionBar;
                        ((ActionBarLayout) h5Var2).q(canvas, kVar2.getMeasuredHeight());
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public int getNestedScrollAxes() {
        switch (this.f40438w0) {
            case 1:
                return this.f40439x0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        hc0 hc0Var;
        org.telegram.ui.Components.i71 t02;
        switch (this.f40438w0) {
            case 0:
                rc0 rc0Var = (rc0) this.f40441z0;
                try {
                    if (viewGroup == rc0Var.U && (hc0Var = rc0Var.J0) != null && hc0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.lm0 currentListView = rc0Var.J0.getCurrentListView();
                        int top = rc0Var.J0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new fz(this, 19));
                    return;
                }
            default:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.f40441z0;
                if (!this.f40440y0 && i13 != 0 && (t02 = o5Var.t0()) != null) {
                    if (viewGroup == o5Var.f25615a && Z()) {
                        iArr[1] = c0(t02, i13) + iArr[1];
                        return;
                    } else if (viewGroup == t02 && i13 < 0) {
                        iArr[1] = c0(o5Var.f25615a, i13) + iArr[1];
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void m(int i10, View view) {
        switch (this.f40438w0) {
            case 0:
                this.f40439x0.f4060a = 0;
                return;
            default:
                b2.u0 u0Var = this.f40439x0;
                if (i10 == 1) {
                    u0Var.f4061b = 0;
                } else {
                    u0Var.f4060a = 0;
                }
                org.telegram.ui.Wallet.k5 k5Var = ((org.telegram.ui.Wallet.o5) this.f40441z0).f34951p0;
                if (k5Var != null) {
                    org.telegram.ui.Wallet.m mVar = k5Var.f34715i;
                    org.telegram.ui.Components.c71 c71Var = k5Var.f34712c;
                    if (c71Var != null) {
                        c71Var.removeCallbacks(mVar);
                        k5Var.f34712c.post(mVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean o(View view, View view2, int i10, int i11) {
        switch (this.f40438w0) {
            case 0:
                if (((rc0) this.f40441z0).J0 != null && i10 == 2) {
                    return true;
                }
                return false;
            default:
                if ((i10 & 2) != 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f40438w0) {
            case 0:
                rc0 rc0Var = (rc0) this.f40441z0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    rc0Var.k0(this.f40440y0);
                    this.f40440y0 = false;
                    return;
                }
                rc0Var.A0(true);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f40438w0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.f40441z0;
                if (o5Var.f34948n != size) {
                    o5Var.f34948n = size;
                    org.telegram.ui.Wallet.a5 a5Var = o5Var.d;
                    if (a5Var != null) {
                        a5Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.x4 x4Var = o5Var.e;
                    if (x4Var != null) {
                        x4Var.requestLayout();
                    }
                }
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onNestedPreFling(View view, float f7, float f10) {
        org.telegram.ui.Wallet.k5 k5Var;
        switch (this.f40438w0) {
            case 1:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.f40441z0;
                if (view == o5Var.t0() && (k5Var = o5Var.f34951p0) != null) {
                    return k5Var.a((int) f7, (int) f10);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f40438w0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final void r(View view, View view2, int i10, int i11) {
        switch (this.f40438w0) {
            case 0:
                this.f40439x0.f4060a = i10;
                return;
            default:
                b2.u0 u0Var = this.f40439x0;
                if (i11 == 1) {
                    u0Var.f4061b = i10;
                    return;
                } else {
                    u0Var.f4060a = i10;
                    return;
                }
        }
    }

    public pc0(rc0 rc0Var, Context context) {
        super(context, null);
        this.f40441z0 = rc0Var;
        this.f40440y0 = true;
        this.f40439x0 = new Object();
    }

    private final void b0(View view) {
    }

    private final void a0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
