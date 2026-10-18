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
public final class nc0 extends org.telegram.ui.Components.jw0 implements r0.m {
    public final int f39404w0 = 1;
    public final b2.u0 f39405x0;
    public boolean f39406y0;
    public final org.telegram.ui.ActionBar.n2 f39407z0;

    public nc0(org.telegram.ui.Wallet.n5 n5Var, Context context) {
        super(context, null);
        this.f39407z0 = n5Var;
        this.f39405x0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        fc0 fc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.im0 currentListView;
        int max;
        org.telegram.ui.Components.a71 u02;
        org.telegram.ui.Wallet.j5 j5Var;
        switch (this.f39404w0) {
            case 0:
                pc0 pc0Var = (pc0) this.f39407z0;
                if (viewGroup == pc0Var.U && (fc0Var = pc0Var.K0) != null && fc0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.n2) pc0Var).actionBar;
                    boolean z10 = kVar.f21493n0;
                    int top = pc0Var.K0.getTop();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if (top <= 0 && (currentListView = pc0Var.K0.getCurrentListView()) != null) {
                            int L0 = ((s4.b0) currentListView.getLayoutManager()).L0();
                            int i14 = -1;
                            if (L0 != -1) {
                                s4.b1 K = currentListView.K(L0);
                                if (K != null) {
                                    i14 = K.f45910a.getTop();
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
                        org.telegram.ui.Components.im0 currentListView2 = pc0Var.K0.getCurrentListView();
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
                org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) this.f39407z0;
                if (!this.f39406y0 && (u02 = n5Var.u0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((viewGroup == n5Var.f31190a || viewGroup == u02) && (j5Var = n5Var.f34595p0) != null && j5Var.f34358f)) {
                        j5Var.d = true;
                    }
                    if (viewGroup == n5Var.f31190a && i11 < 0 && a0()) {
                        iArr[1] = d0(u02, i11) + iArr[1];
                        return;
                    } else if (viewGroup == u02 && i11 > 0) {
                        iArr[1] = d0(n5Var.f31190a, i11) + iArr[1];
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
        switch (this.f39404w0) {
            case 0:
                pc0 pc0Var = (pc0) this.f39407z0;
                if (pc0Var.K0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, pc0Var.U.getY());
                    pc0Var.K0.Q(canvas, arrayList);
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
        org.telegram.ui.Wallet.j5 j5Var = ((org.telegram.ui.Wallet.n5) this.f39407z0).f34595p0;
        if (j5Var != null) {
            j5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean a0() {
        org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) this.f39407z0;
        ai.r rVar = n5Var.m0;
        if (rVar != null && (rVar.getParent() instanceof View) && ((View) n5Var.m0.getParent()).getTop() <= n5Var.f31190a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        switch (this.f39404w0) {
            case 0:
                return;
            default:
                i(viewGroup, i10, i11, i12, i13, i14, new int[2]);
                return;
        }
    }

    public int d0(org.telegram.ui.Components.a71 a71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.kv kvVar = new org.telegram.ui.Components.kv(iArr, 15);
        this.f39406y0 = true;
        a71Var.j(kvVar);
        try {
            a71Var.scrollBy(0, i10);
            ArrayList arrayList = a71Var.f3634w0;
            if (arrayList != null) {
                arrayList.remove(kvVar);
            }
            this.f39406y0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = a71Var.f3634w0;
            if (arrayList2 != null) {
                arrayList2.remove(kvVar);
            }
            this.f39406y0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nc0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f39404w0) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                pc0 pc0Var = (pc0) this.f39407z0;
                kVar = ((org.telegram.ui.ActionBar.n2) pc0Var).actionBar;
                if (view == kVar) {
                    d5Var = ((org.telegram.ui.ActionBar.n2) pc0Var).parentLayout;
                    if (d5Var != null) {
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) pc0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.n2) pc0Var).actionBar;
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
        switch (this.f39404w0) {
            case 1:
                return this.f39405x0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        fc0 fc0Var;
        org.telegram.ui.Components.a71 u02;
        switch (this.f39404w0) {
            case 0:
                pc0 pc0Var = (pc0) this.f39407z0;
                try {
                    if (viewGroup == pc0Var.U && (fc0Var = pc0Var.K0) != null && fc0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.im0 currentListView = pc0Var.K0.getCurrentListView();
                        int top = pc0Var.K0.getTop();
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
                    AndroidUtilities.runOnUIThread(new fz(this, 18));
                    return;
                }
            default:
                org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) this.f39407z0;
                if (!this.f39406y0 && i13 != 0 && (u02 = n5Var.u0()) != null) {
                    if (viewGroup == n5Var.f31190a && a0()) {
                        iArr[1] = d0(u02, i13) + iArr[1];
                        return;
                    } else if (viewGroup == u02 && i13 < 0) {
                        iArr[1] = d0(n5Var.f31190a, i13) + iArr[1];
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
        switch (this.f39404w0) {
            case 0:
                this.f39405x0.f4057a = 0;
                return;
            default:
                b2.u0 u0Var = this.f39405x0;
                if (i10 == 1) {
                    u0Var.f4058b = 0;
                } else {
                    u0Var.f4057a = 0;
                }
                org.telegram.ui.Wallet.j5 j5Var = ((org.telegram.ui.Wallet.n5) this.f39407z0).f34595p0;
                if (j5Var != null) {
                    org.telegram.ui.Wallet.n nVar = j5Var.f34360i;
                    org.telegram.ui.Components.u61 u61Var = j5Var.f34357c;
                    if (u61Var != null) {
                        u61Var.removeCallbacks(nVar);
                        j5Var.f34357c.post(nVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f39404w0) {
            case 0:
                pc0 pc0Var = (pc0) this.f39407z0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    pc0Var.j0(this.f39406y0);
                    this.f39406y0 = false;
                    return;
                }
                pc0Var.z0(true);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f39404w0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) this.f39407z0;
                if (n5Var.f34592n != size) {
                    n5Var.f34592n = size;
                    org.telegram.ui.Wallet.a5 a5Var = n5Var.d;
                    if (a5Var != null) {
                        a5Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.x4 x4Var = n5Var.e;
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
        org.telegram.ui.Wallet.j5 j5Var;
        switch (this.f39404w0) {
            case 1:
                org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) this.f39407z0;
                if (view == n5Var.u0() && (j5Var = n5Var.f34595p0) != null) {
                    return j5Var.a((int) f7, (int) f10);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f39404w0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.f39404w0) {
            case 0:
                if (((pc0) this.f39407z0).K0 != null && i10 == 2) {
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
        switch (this.f39404w0) {
            case 0:
                this.f39405x0.f4057a = i10;
                return;
            default:
                b2.u0 u0Var = this.f39405x0;
                if (i11 == 1) {
                    u0Var.f4058b = i10;
                    return;
                } else {
                    u0Var.f4057a = i10;
                    return;
                }
        }
    }

    public nc0(pc0 pc0Var, Context context) {
        super(context, null);
        this.f39407z0 = pc0Var;
        this.f39406y0 = true;
        this.f39405x0 = new Object();
    }

    private final void c0(View view) {
    }

    private final void b0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
