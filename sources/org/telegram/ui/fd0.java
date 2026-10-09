package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class fd0 extends org.telegram.ui.Components.sw0 implements r0.m {
    public final int f37514w0 = 1;
    public final b2.q0 f37515x0;
    public boolean f37516y0;
    public final org.telegram.ui.ActionBar.n2 f37517z0;

    public fd0(org.telegram.ui.Wallet.a5 a5Var, Context context) {
        super(context, null);
        this.f37517z0 = a5Var;
        this.f37515x0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        xc0 xc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.qm0 currentListView;
        int max;
        org.telegram.ui.Components.k71 n02;
        org.telegram.ui.Wallet.v4 v4Var;
        switch (this.f37514w0) {
            case 0:
                hd0 hd0Var = (hd0) this.f37517z0;
                if (viewGroup == hd0Var.U && (xc0Var = hd0Var.K0) != null && xc0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.n2) hd0Var).actionBar;
                    boolean z10 = kVar.f21285n0;
                    int top = hd0Var.K0.getTop();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if (top <= 0 && (currentListView = hd0Var.K0.getCurrentListView()) != null) {
                            int L0 = ((s4.d0) currentListView.getLayoutManager()).L0();
                            int i14 = -1;
                            if (L0 != -1) {
                                s4.d1 K = currentListView.K(L0);
                                if (K != null) {
                                    i14 = K.f47658a.getTop();
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
                        org.telegram.ui.Components.qm0 currentListView2 = hd0Var.K0.getCurrentListView();
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
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.f37517z0;
                if (!this.f37516y0 && (n02 = a5Var.n0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((viewGroup == a5Var.f26290a || viewGroup == n02) && (v4Var = a5Var.f34633o0) != null && v4Var.f35570f)) {
                        v4Var.d = true;
                    }
                    if (viewGroup == a5Var.f26290a && i11 < 0 && Z()) {
                        iArr[1] = c0(n02, i11) + iArr[1];
                        return;
                    } else if (viewGroup == n02 && i11 > 0) {
                        iArr[1] = c0(a5Var.f26290a, i11) + iArr[1];
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
        switch (this.f37514w0) {
            case 0:
                hd0 hd0Var = (hd0) this.f37517z0;
                if (hd0Var.K0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, hd0Var.U.getY());
                    hd0Var.K0.Q(canvas, arrayList);
                    canvas.restore();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public boolean Z() {
        org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.f37517z0;
        LinearLayout linearLayout = a5Var.f34630l0;
        if (linearLayout != null && (linearLayout.getParent() instanceof View) && ((View) a5Var.f34630l0.getParent()).getTop() <= a5Var.f26290a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        switch (this.f37514w0) {
            case 0:
                return;
            default:
                j(viewGroup, i10, i11, i12, i13, i14, new int[2]);
                return;
        }
    }

    public int c0(org.telegram.ui.Components.k71 k71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(iArr, 10);
        this.f37516y0 = true;
        k71Var.j(mh0Var);
        try {
            k71Var.scrollBy(0, i10);
            ArrayList arrayList = k71Var.f3168w0;
            if (arrayList != null) {
                arrayList.remove(mh0Var);
            }
            this.f37516y0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = k71Var.f3168w0;
            if (arrayList2 != null) {
                arrayList2.remove(mh0Var);
            }
            this.f37516y0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Wallet.v4 v4Var;
        boolean z10;
        switch (this.f37514w0) {
            case 1:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.f37517z0;
                org.telegram.ui.Wallet.v4 v4Var2 = a5Var.f34633o0;
                if (v4Var2 != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        v4Var2.c();
                        v4Var2.f35569e = true;
                        v4Var2.f35571g = motionEvent.getX();
                        v4Var2.h = motionEvent.getY();
                    } else if (actionMasked == 3) {
                        v4Var2.c();
                    } else if (actionMasked == 2 || actionMasked == 1) {
                        float abs = Math.abs(motionEvent.getX() - v4Var2.f35571g);
                        float abs2 = Math.abs(motionEvent.getY() - v4Var2.h);
                        if (abs2 > ViewConfiguration.get(v4Var2.f35568c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        v4Var2.f35570f = z10;
                        if (!z10) {
                            v4Var2.d = false;
                        }
                        if (actionMasked == 1) {
                            v4Var2.f35569e = false;
                        }
                    }
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (v4Var = a5Var.f34633o0) != null) {
                    org.telegram.ui.Wallet.m mVar = v4Var.f35572i;
                    org.telegram.ui.Components.e71 e71Var = v4Var.f35568c;
                    if (e71Var != null) {
                        e71Var.removeCallbacks(mVar);
                        v4Var.f35568c.post(mVar);
                    }
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37514w0) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                hd0 hd0Var = (hd0) this.f37517z0;
                kVar = ((org.telegram.ui.ActionBar.n2) hd0Var).actionBar;
                if (view == kVar) {
                    d5Var = ((org.telegram.ui.ActionBar.n2) hd0Var).parentLayout;
                    if (d5Var != null) {
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) hd0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.n2) hd0Var).actionBar;
                        ((ActionBarLayout) d5Var2).q(canvas, kVar2.getMeasuredHeight());
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public int getNestedScrollAxes() {
        switch (this.f37514w0) {
            case 1:
                return this.f37515x0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        xc0 xc0Var;
        org.telegram.ui.Components.k71 n02;
        switch (this.f37514w0) {
            case 0:
                hd0 hd0Var = (hd0) this.f37517z0;
                try {
                    if (viewGroup == hd0Var.U && (xc0Var = hd0Var.K0) != null && xc0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.qm0 currentListView = hd0Var.K0.getCurrentListView();
                        int top = hd0Var.K0.getTop();
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
                    AndroidUtilities.runOnUIThread(new uz(this, 18));
                    return;
                }
            default:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.f37517z0;
                if (!this.f37516y0 && i13 != 0 && (n02 = a5Var.n0()) != null) {
                    if (viewGroup == a5Var.f26290a && Z()) {
                        iArr[1] = c0(n02, i13) + iArr[1];
                        return;
                    } else if (viewGroup == n02 && i13 < 0) {
                        iArr[1] = c0(a5Var.f26290a, i13) + iArr[1];
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void o(int i10, View view) {
        switch (this.f37514w0) {
            case 0:
                this.f37515x0.f3533a = 0;
                return;
            default:
                b2.q0 q0Var = this.f37515x0;
                if (i10 == 1) {
                    q0Var.f3534b = 0;
                } else {
                    q0Var.f3533a = 0;
                }
                org.telegram.ui.Wallet.v4 v4Var = ((org.telegram.ui.Wallet.a5) this.f37517z0).f34633o0;
                if (v4Var != null) {
                    org.telegram.ui.Wallet.m mVar = v4Var.f35572i;
                    org.telegram.ui.Components.e71 e71Var = v4Var.f35568c;
                    if (e71Var != null) {
                        e71Var.removeCallbacks(mVar);
                        v4Var.f35568c.post(mVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37514w0) {
            case 0:
                hd0 hd0Var = (hd0) this.f37517z0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    hd0Var.j0(this.f37516y0);
                    this.f37516y0 = false;
                    return;
                }
                hd0Var.z0(true);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f37514w0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.f37517z0;
                if (a5Var.f34631n != size) {
                    a5Var.f34631n = size;
                    org.telegram.ui.Wallet.m4 m4Var = a5Var.d;
                    if (m4Var != null) {
                        m4Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.j4 j4Var = a5Var.f34621e;
                    if (j4Var != null) {
                        j4Var.requestLayout();
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
        org.telegram.ui.Wallet.v4 v4Var;
        switch (this.f37514w0) {
            case 1:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.f37517z0;
                if (view == a5Var.n0() && (v4Var = a5Var.f34633o0) != null) {
                    return v4Var.a((int) f7, (int) f10);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f37514w0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.f37514w0) {
            case 0:
                if (((hd0) this.f37517z0).K0 != null && i10 == 2) {
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
        switch (this.f37514w0) {
            case 0:
                this.f37515x0.f3533a = i10;
                return;
            default:
                b2.q0 q0Var = this.f37515x0;
                if (i11 == 1) {
                    q0Var.f3534b = i10;
                    return;
                } else {
                    q0Var.f3533a = i10;
                    return;
                }
        }
    }

    public fd0(hd0 hd0Var, Context context) {
        super(context, null);
        this.f37517z0 = hd0Var;
        this.f37516y0 = true;
        this.f37515x0 = new Object();
    }

    private final void b0(View view) {
    }

    private final void a0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
