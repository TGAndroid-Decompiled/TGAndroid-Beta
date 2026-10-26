package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class nc0 extends org.telegram.ui.Components.vw0 implements r0.m {
    public final int f41839l0 = 1;
    public final b2.v0 m0;
    public boolean f41840n0;
    public final org.telegram.ui.ActionBar.r2 f41841o0;

    public nc0(org.telegram.ui.Wallet.m5 m5Var, Context context) {
        super(context, null);
        this.f41841o0 = m5Var;
        this.m0 = new Object();
    }

    public void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.i5 i5Var = ((org.telegram.ui.Wallet.m5) this.f41841o0).f36953q0;
        if (i5Var != null) {
            i5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean Y() {
        org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.f41841o0;
        bi.r rVar = m5Var.f36950n0;
        if (rVar != null && (rVar.getParent() instanceof View) && ((View) m5Var.f36950n0.getParent()).getTop() <= m5Var.f30419a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public int b0(org.telegram.ui.Components.r71 r71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.ml mlVar = new org.telegram.ui.Components.ml(iArr, 20);
        this.f41840n0 = true;
        r71Var.j(mlVar);
        try {
            r71Var.scrollBy(0, i10);
            ArrayList arrayList = r71Var.f3083w0;
            if (arrayList != null) {
                arrayList.remove(mlVar);
            }
            this.f41840n0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = r71Var.f3083w0;
            if (arrayList2 != null) {
                arrayList2.remove(mlVar);
            }
            this.f41840n0 = false;
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
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f41839l0) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                pc0 pc0Var = (pc0) this.f41841o0;
                kVar = ((org.telegram.ui.ActionBar.r2) pc0Var).actionBar;
                if (view == kVar) {
                    j5Var = ((org.telegram.ui.ActionBar.r2) pc0Var).parentLayout;
                    if (j5Var != null) {
                        j5Var2 = ((org.telegram.ui.ActionBar.r2) pc0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.r2) pc0Var).actionBar;
                        ((ActionBarLayout) j5Var2).q(canvas, kVar2.getMeasuredHeight());
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public int getNestedScrollAxes() {
        switch (this.f41839l0) {
            case 1:
                return this.m0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void m(int i10, View view) {
        switch (this.f41839l0) {
            case 0:
                this.m0.f3511a = 0;
                return;
            default:
                b2.v0 v0Var = this.m0;
                if (i10 == 1) {
                    v0Var.f3512b = 0;
                } else {
                    v0Var.f3511a = 0;
                }
                org.telegram.ui.Wallet.i5 i5Var = ((org.telegram.ui.Wallet.m5) this.f41841o0).f36953q0;
                if (i5Var != null) {
                    org.telegram.ui.Wallet.m mVar = i5Var.f36677i;
                    org.telegram.ui.Components.l71 l71Var = i5Var.f36674c;
                    if (l71Var != null) {
                        l71Var.removeCallbacks(mVar);
                        i5Var.f36674c.post(mVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        fc0 fc0Var;
        org.telegram.ui.Components.r71 u02;
        switch (this.f41839l0) {
            case 0:
                pc0 pc0Var = (pc0) this.f41841o0;
                try {
                    if (view == pc0Var.U && (fc0Var = pc0Var.J0) != null && fc0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.mm0 currentListView = pc0Var.J0.getCurrentListView();
                        int top = pc0Var.J0.getTop();
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
                    AndroidUtilities.runOnUIThread(new p00(this, 19));
                    return;
                }
            default:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.f41841o0;
                if (!this.f41840n0 && i13 != 0 && (u02 = m5Var.u0()) != null) {
                    if (view == m5Var.f30419a && Y()) {
                        iArr[1] = b0(u02, i13) + iArr[1];
                        return;
                    } else if (view == u02 && i13 < 0) {
                        iArr[1] = b0(m5Var.f30419a, i13) + iArr[1];
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void o(View view, int i10, int i11, int i12, int i13, int i14) {
        switch (this.f41839l0) {
            case 0:
                return;
            default:
                n(view, i10, i11, i12, i13, i14, new int[2]);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41839l0) {
            case 0:
                pc0 pc0Var = (pc0) this.f41841o0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    pc0Var.l0(this.f41840n0);
                    this.f41840n0 = false;
                    return;
                }
                pc0Var.B0(true);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f41839l0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.f41841o0;
                if (m5Var.f36954r != size) {
                    m5Var.f36954r = size;
                    org.telegram.ui.Wallet.y4 y4Var = m5Var.e;
                    if (y4Var != null) {
                        y4Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.v4 v4Var = m5Var.f36941f;
                    if (v4Var != null) {
                        v4Var.requestLayout();
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
        org.telegram.ui.Wallet.i5 i5Var;
        switch (this.f41839l0) {
            case 1:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.f41841o0;
                if (view == m5Var.u0() && (i5Var = m5Var.f36953q0) != null) {
                    return i5Var.a((int) f7, (int) f10);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f41839l0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.f41839l0) {
            case 0:
                if (((pc0) this.f41841o0).J0 != null && i10 == 2) {
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
        switch (this.f41839l0) {
            case 0:
                this.m0.f3511a = i10;
                return;
            default:
                b2.v0 v0Var = this.m0;
                if (i11 == 1) {
                    v0Var.f3512b = i10;
                    return;
                } else {
                    v0Var.f3511a = i10;
                    return;
                }
        }
    }

    @Override
    public final void t(View view, int i10, int i11, int[] iArr, int i12) {
        fc0 fc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.mm0 currentListView;
        int max;
        org.telegram.ui.Components.r71 u02;
        org.telegram.ui.Wallet.i5 i5Var;
        switch (this.f41839l0) {
            case 0:
                pc0 pc0Var = (pc0) this.f41841o0;
                if (view == pc0Var.U && (fc0Var = pc0Var.J0) != null && fc0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.r2) pc0Var).actionBar;
                    boolean z10 = kVar.f22774n0;
                    int top = pc0Var.J0.getTop();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if (top <= 0 && (currentListView = pc0Var.J0.getCurrentListView()) != null) {
                            int L0 = ((s4.c0) currentListView.getLayoutManager()).L0();
                            int i14 = -1;
                            if (L0 != -1) {
                                s4.e1 K = currentListView.K(L0);
                                if (K != null) {
                                    i14 = K.f47738a.getTop();
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
                        org.telegram.ui.Components.mm0 currentListView2 = pc0Var.J0.getCurrentListView();
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
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.f41841o0;
                if (!this.f41840n0 && (u02 = m5Var.u0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((view == m5Var.f30419a || view == u02) && (i5Var = m5Var.f36953q0) != null && i5Var.f36675f)) {
                        i5Var.d = true;
                    }
                    if (view == m5Var.f30419a && i11 < 0 && Y()) {
                        iArr[1] = b0(u02, i11) + iArr[1];
                        return;
                    } else if (view == u02 && i11 > 0) {
                        iArr[1] = b0(m5Var.f30419a, i11) + iArr[1];
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public nc0(pc0 pc0Var, Context context) {
        super(context, null);
        this.f41841o0 = pc0Var;
        this.f41840n0 = true;
        this.m0 = new Object();
    }

    private final void a0(View view) {
    }

    private final void Z(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
