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
public final class ed0 extends org.telegram.ui.Components.tw0 implements r0.m {
    public final int f37301w0 = 1;
    public final b2.q0 f37302x0;
    public boolean f37303y0;
    public final org.telegram.ui.ActionBar.m2 f37304z0;

    public ed0(org.telegram.ui.Wallet.c5 c5Var, Context context) {
        super(context, null);
        this.f37304z0 = c5Var;
        this.f37302x0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        wc0 wc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.rm0 currentListView;
        int max;
        org.telegram.ui.Components.l71 n02;
        org.telegram.ui.Wallet.x4 x4Var;
        switch (this.f37301w0) {
            case 0:
                gd0 gd0Var = (gd0) this.f37304z0;
                if (viewGroup == gd0Var.U && (wc0Var = gd0Var.K0) != null && wc0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.m2) gd0Var).actionBar;
                    boolean z10 = kVar.f21322n0;
                    int top = gd0Var.K0.getTop();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if (top <= 0 && (currentListView = gd0Var.K0.getCurrentListView()) != null) {
                            int L0 = ((s4.d0) currentListView.getLayoutManager()).L0();
                            int i14 = -1;
                            if (L0 != -1) {
                                s4.d1 K = currentListView.K(L0);
                                if (K != null) {
                                    i14 = K.f47782a.getTop();
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
                        org.telegram.ui.Components.rm0 currentListView2 = gd0Var.K0.getCurrentListView();
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
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f37304z0;
                if (!this.f37303y0 && (n02 = c5Var.n0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((viewGroup == c5Var.f26675a || viewGroup == n02) && (x4Var = c5Var.f34789o0) != null && x4Var.f35728f)) {
                        x4Var.d = true;
                    }
                    if (viewGroup == c5Var.f26675a && i11 < 0 && Z()) {
                        iArr[1] = c0(n02, i11) + iArr[1];
                        return;
                    } else if (viewGroup == n02 && i11 > 0) {
                        iArr[1] = c0(c5Var.f26675a, i11) + iArr[1];
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
        switch (this.f37301w0) {
            case 0:
                gd0 gd0Var = (gd0) this.f37304z0;
                if (gd0Var.K0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, gd0Var.U.getY());
                    gd0Var.K0.Q(canvas, arrayList);
                    canvas.restore();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public boolean Z() {
        org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f37304z0;
        LinearLayout linearLayout = c5Var.f34786l0;
        if (linearLayout != null && (linearLayout.getParent() instanceof View) && ((View) c5Var.f34786l0.getParent()).getTop() <= c5Var.f26675a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        switch (this.f37301w0) {
            case 0:
                return;
            default:
                j(viewGroup, i10, i11, i12, i13, i14, new int[2]);
                return;
        }
    }

    public int c0(org.telegram.ui.Components.l71 l71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(iArr, 10);
        this.f37303y0 = true;
        l71Var.j(nh0Var);
        try {
            l71Var.scrollBy(0, i10);
            ArrayList arrayList = l71Var.f3168w0;
            if (arrayList != null) {
                arrayList.remove(nh0Var);
            }
            this.f37303y0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = l71Var.f3168w0;
            if (arrayList2 != null) {
                arrayList2.remove(nh0Var);
            }
            this.f37303y0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Wallet.x4 x4Var;
        boolean z10;
        switch (this.f37301w0) {
            case 1:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f37304z0;
                org.telegram.ui.Wallet.x4 x4Var2 = c5Var.f34789o0;
                if (x4Var2 != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        x4Var2.c();
                        x4Var2.f35727e = true;
                        x4Var2.f35729g = motionEvent.getX();
                        x4Var2.h = motionEvent.getY();
                    } else if (actionMasked == 3) {
                        x4Var2.c();
                    } else if (actionMasked == 2 || actionMasked == 1) {
                        float abs = Math.abs(motionEvent.getX() - x4Var2.f35729g);
                        float abs2 = Math.abs(motionEvent.getY() - x4Var2.h);
                        if (abs2 > ViewConfiguration.get(x4Var2.f35726c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        x4Var2.f35728f = z10;
                        if (!z10) {
                            x4Var2.d = false;
                        }
                        if (actionMasked == 1) {
                            x4Var2.f35727e = false;
                        }
                    }
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (x4Var = c5Var.f34789o0) != null) {
                    org.telegram.ui.Wallet.o oVar = x4Var.f35730i;
                    org.telegram.ui.Components.f71 f71Var = x4Var.f35726c;
                    if (f71Var != null) {
                        f71Var.removeCallbacks(oVar);
                        x4Var.f35726c.post(oVar);
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
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37301w0) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                gd0 gd0Var = (gd0) this.f37304z0;
                kVar = ((org.telegram.ui.ActionBar.m2) gd0Var).actionBar;
                if (view == kVar) {
                    b5Var = ((org.telegram.ui.ActionBar.m2) gd0Var).parentLayout;
                    if (b5Var != null) {
                        b5Var2 = ((org.telegram.ui.ActionBar.m2) gd0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.m2) gd0Var).actionBar;
                        ((ActionBarLayout) b5Var2).q(canvas, kVar2.getMeasuredHeight());
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public int getNestedScrollAxes() {
        switch (this.f37301w0) {
            case 1:
                return this.f37302x0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        wc0 wc0Var;
        org.telegram.ui.Components.l71 n02;
        switch (this.f37301w0) {
            case 0:
                gd0 gd0Var = (gd0) this.f37304z0;
                try {
                    if (viewGroup == gd0Var.U && (wc0Var = gd0Var.K0) != null && wc0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.rm0 currentListView = gd0Var.K0.getCurrentListView();
                        int top = gd0Var.K0.getTop();
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
                    AndroidUtilities.runOnUIThread(new tz(this, 18));
                    return;
                }
            default:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f37304z0;
                if (!this.f37303y0 && i13 != 0 && (n02 = c5Var.n0()) != null) {
                    if (viewGroup == c5Var.f26675a && Z()) {
                        iArr[1] = c0(n02, i13) + iArr[1];
                        return;
                    } else if (viewGroup == n02 && i13 < 0) {
                        iArr[1] = c0(c5Var.f26675a, i13) + iArr[1];
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
        switch (this.f37301w0) {
            case 0:
                this.f37302x0.f3533a = 0;
                return;
            default:
                b2.q0 q0Var = this.f37302x0;
                if (i10 == 1) {
                    q0Var.f3534b = 0;
                } else {
                    q0Var.f3533a = 0;
                }
                org.telegram.ui.Wallet.x4 x4Var = ((org.telegram.ui.Wallet.c5) this.f37304z0).f34789o0;
                if (x4Var != null) {
                    org.telegram.ui.Wallet.o oVar = x4Var.f35730i;
                    org.telegram.ui.Components.f71 f71Var = x4Var.f35726c;
                    if (f71Var != null) {
                        f71Var.removeCallbacks(oVar);
                        x4Var.f35726c.post(oVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37301w0) {
            case 0:
                gd0 gd0Var = (gd0) this.f37304z0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    gd0Var.j0(this.f37303y0);
                    this.f37303y0 = false;
                    return;
                }
                gd0Var.z0(true);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f37301w0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f37304z0;
                if (c5Var.f34787n != size) {
                    c5Var.f34787n = size;
                    org.telegram.ui.Wallet.o4 o4Var = c5Var.d;
                    if (o4Var != null) {
                        o4Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.l4 l4Var = c5Var.f34777e;
                    if (l4Var != null) {
                        l4Var.requestLayout();
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
        org.telegram.ui.Wallet.x4 x4Var;
        switch (this.f37301w0) {
            case 1:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f37304z0;
                if (view == c5Var.n0() && (x4Var = c5Var.f34789o0) != null) {
                    return x4Var.a((int) f7, (int) f10);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f37301w0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.f37301w0) {
            case 0:
                if (((gd0) this.f37304z0).K0 != null && i10 == 2) {
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
        switch (this.f37301w0) {
            case 0:
                this.f37302x0.f3533a = i10;
                return;
            default:
                b2.q0 q0Var = this.f37302x0;
                if (i11 == 1) {
                    q0Var.f3534b = i10;
                    return;
                } else {
                    q0Var.f3533a = i10;
                    return;
                }
        }
    }

    public ed0(gd0 gd0Var, Context context) {
        super(context, null);
        this.f37304z0 = gd0Var;
        this.f37303y0 = true;
        this.f37302x0 = new Object();
    }

    private final void b0(View view) {
    }

    private final void a0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
