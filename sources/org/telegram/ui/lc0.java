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
public final class lc0 extends org.telegram.ui.Components.lw0 implements r0.m {
    public final int f38894w0 = 1;
    public final b2.u0 f38895x0;
    public boolean f38896y0;
    public final org.telegram.ui.ActionBar.n2 f38897z0;

    public lc0(org.telegram.ui.Wallet.o5 o5Var, Context context) {
        super(context, null);
        this.f38897z0 = o5Var;
        this.f38895x0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        dc0 dc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.jm0 currentListView;
        int max;
        org.telegram.ui.Components.c71 t02;
        org.telegram.ui.Wallet.k5 k5Var;
        switch (this.f38894w0) {
            case 0:
                nc0 nc0Var = (nc0) this.f38897z0;
                if (viewGroup == nc0Var.U && (dc0Var = nc0Var.K0) != null && dc0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.n2) nc0Var).actionBar;
                    boolean z10 = kVar.f21500n0;
                    int top = nc0Var.K0.getTop();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if (top <= 0 && (currentListView = nc0Var.K0.getCurrentListView()) != null) {
                            int L0 = ((s4.b0) currentListView.getLayoutManager()).L0();
                            int i14 = -1;
                            if (L0 != -1) {
                                s4.b1 K = currentListView.K(L0);
                                if (K != null) {
                                    i14 = K.f45920a.getTop();
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
                        org.telegram.ui.Components.jm0 currentListView2 = nc0Var.K0.getCurrentListView();
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
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.f38897z0;
                if (!this.f38896y0 && (t02 = o5Var.t0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((viewGroup == o5Var.f32359a || viewGroup == t02) && (k5Var = o5Var.f34661p0) != null && k5Var.f34430f)) {
                        k5Var.d = true;
                    }
                    if (viewGroup == o5Var.f32359a && i11 < 0 && a0()) {
                        iArr[1] = d0(t02, i11) + iArr[1];
                        return;
                    } else if (viewGroup == t02 && i11 > 0) {
                        iArr[1] = d0(o5Var.f32359a, i11) + iArr[1];
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.f38894w0) {
            case 0:
                nc0 nc0Var = (nc0) this.f38897z0;
                if (nc0Var.K0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, nc0Var.U.getY());
                    nc0Var.K0.Q(canvas, arrayList);
                    canvas.restore();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void Z() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.k5 k5Var = ((org.telegram.ui.Wallet.o5) this.f38897z0).f34661p0;
        if (k5Var != null) {
            k5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean a0() {
        org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.f38897z0;
        ai.r rVar = o5Var.m0;
        if (rVar != null && (rVar.getParent() instanceof View) && ((View) o5Var.m0.getParent()).getTop() <= o5Var.f32359a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        switch (this.f38894w0) {
            case 0:
                return;
            default:
                i(viewGroup, i10, i11, i12, i13, i14, new int[2]);
                return;
        }
    }

    public int d0(org.telegram.ui.Components.c71 c71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.kv kvVar = new org.telegram.ui.Components.kv(iArr, 15);
        this.f38896y0 = true;
        c71Var.j(kvVar);
        try {
            c71Var.scrollBy(0, i10);
            ArrayList arrayList = c71Var.f3630w0;
            if (arrayList != null) {
                arrayList.remove(kvVar);
            }
            this.f38896y0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = c71Var.f3630w0;
            if (arrayList2 != null) {
                arrayList2.remove(kvVar);
            }
            this.f38896y0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lc0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f38894w0) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                nc0 nc0Var = (nc0) this.f38897z0;
                kVar = ((org.telegram.ui.ActionBar.n2) nc0Var).actionBar;
                if (view == kVar) {
                    d5Var = ((org.telegram.ui.ActionBar.n2) nc0Var).parentLayout;
                    if (d5Var != null) {
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) nc0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.n2) nc0Var).actionBar;
                        ((ActionBarLayout) d5Var2).q(canvas, kVar2.getMeasuredHeight());
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public int getNestedScrollAxes() {
        switch (this.f38894w0) {
            case 1:
                return this.f38895x0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        dc0 dc0Var;
        org.telegram.ui.Components.c71 t02;
        switch (this.f38894w0) {
            case 0:
                nc0 nc0Var = (nc0) this.f38897z0;
                try {
                    if (viewGroup == nc0Var.U && (dc0Var = nc0Var.K0) != null && dc0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.jm0 currentListView = nc0Var.K0.getCurrentListView();
                        int top = nc0Var.K0.getTop();
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
                    AndroidUtilities.runOnUIThread(new dz(this, 18));
                    return;
                }
            default:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.f38897z0;
                if (!this.f38896y0 && i13 != 0 && (t02 = o5Var.t0()) != null) {
                    if (viewGroup == o5Var.f32359a && a0()) {
                        iArr[1] = d0(t02, i13) + iArr[1];
                        return;
                    } else if (viewGroup == t02 && i13 < 0) {
                        iArr[1] = d0(o5Var.f32359a, i13) + iArr[1];
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void n(int i10, View view) {
        switch (this.f38894w0) {
            case 0:
                this.f38895x0.f4053a = 0;
                return;
            default:
                b2.u0 u0Var = this.f38895x0;
                if (i10 == 1) {
                    u0Var.f4054b = 0;
                } else {
                    u0Var.f4053a = 0;
                }
                org.telegram.ui.Wallet.k5 k5Var = ((org.telegram.ui.Wallet.o5) this.f38897z0).f34661p0;
                if (k5Var != null) {
                    org.telegram.ui.Wallet.n nVar = k5Var.f34432i;
                    org.telegram.ui.Components.w61 w61Var = k5Var.f34429c;
                    if (w61Var != null) {
                        w61Var.removeCallbacks(nVar);
                        k5Var.f34429c.post(nVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f38894w0) {
            case 0:
                nc0 nc0Var = (nc0) this.f38897z0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    nc0Var.j0(this.f38896y0);
                    this.f38896y0 = false;
                    return;
                }
                nc0Var.z0(true);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f38894w0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.f38897z0;
                if (o5Var.f34658n != size) {
                    o5Var.f34658n = size;
                    org.telegram.ui.Wallet.b5 b5Var = o5Var.d;
                    if (b5Var != null) {
                        b5Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.y4 y4Var = o5Var.e;
                    if (y4Var != null) {
                        y4Var.requestLayout();
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
        switch (this.f38894w0) {
            case 1:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.f38897z0;
                if (view == o5Var.t0() && (k5Var = o5Var.f34661p0) != null) {
                    return k5Var.a((int) f7, (int) f10);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f38894w0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.f38894w0) {
            case 0:
                if (((nc0) this.f38897z0).K0 != null && i10 == 2) {
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
    public final void s(View view, View view2, int i10, int i11) {
        switch (this.f38894w0) {
            case 0:
                this.f38895x0.f4053a = i10;
                return;
            default:
                b2.u0 u0Var = this.f38895x0;
                if (i11 == 1) {
                    u0Var.f4054b = i10;
                    return;
                } else {
                    u0Var.f4053a = i10;
                    return;
                }
        }
    }

    public lc0(nc0 nc0Var, Context context) {
        super(context, null);
        this.f38897z0 = nc0Var;
        this.f38896y0 = true;
        this.f38895x0 = new Object();
    }

    private final void c0(View view) {
    }

    private final void b0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
