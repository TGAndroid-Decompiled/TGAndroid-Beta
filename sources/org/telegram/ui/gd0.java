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
public final class gd0 extends org.telegram.ui.Components.yw0 implements r0.m {
    public final int f38006w0 = 1;
    public final b2.q0 f38007x0;
    public boolean f38008y0;
    public final org.telegram.ui.ActionBar.m2 f38009z0;

    public gd0(org.telegram.ui.Wallet.c5 c5Var, Context context) {
        super(context, null);
        this.f38009z0 = c5Var;
        this.f38007x0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        yc0 yc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.wm0 currentListView;
        int max;
        org.telegram.ui.Components.p71 n02;
        org.telegram.ui.Wallet.x4 x4Var;
        switch (this.f38006w0) {
            case 0:
                id0 id0Var = (id0) this.f38009z0;
                if (viewGroup == id0Var.U && (yc0Var = id0Var.K0) != null && yc0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.m2) id0Var).actionBar;
                    boolean z10 = kVar.f21060n0;
                    int top = id0Var.K0.getTop();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if (top <= 0 && (currentListView = id0Var.K0.getCurrentListView()) != null) {
                            int L0 = ((s4.d0) currentListView.getLayoutManager()).L0();
                            int i14 = -1;
                            if (L0 != -1) {
                                s4.d1 K = currentListView.K(L0);
                                if (K != null) {
                                    i14 = K.f47889a.getTop();
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
                        org.telegram.ui.Components.wm0 currentListView2 = id0Var.K0.getCurrentListView();
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
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f38009z0;
                if (!this.f38008y0 && (n02 = c5Var.n0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((viewGroup == c5Var.f27773a || viewGroup == n02) && (x4Var = c5Var.f34564o0) != null && x4Var.f35504f)) {
                        x4Var.d = true;
                    }
                    if (viewGroup == c5Var.f27773a && i11 < 0 && Z()) {
                        iArr[1] = c0(n02, i11) + iArr[1];
                        return;
                    } else if (viewGroup == n02 && i11 > 0) {
                        iArr[1] = c0(c5Var.f27773a, i11) + iArr[1];
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
        switch (this.f38006w0) {
            case 0:
                id0 id0Var = (id0) this.f38009z0;
                if (id0Var.K0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, id0Var.U.getY());
                    id0Var.K0.Q(canvas, arrayList);
                    canvas.restore();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public boolean Z() {
        org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f38009z0;
        LinearLayout linearLayout = c5Var.f34561l0;
        if (linearLayout != null && (linearLayout.getParent() instanceof View) && ((View) c5Var.f34561l0.getParent()).getTop() <= c5Var.f27773a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        switch (this.f38006w0) {
            case 0:
                return;
            default:
                j(viewGroup, i10, i11, i12, i13, i14, new int[2]);
                return;
        }
    }

    public int c0(org.telegram.ui.Components.p71 p71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(iArr, 10);
        this.f38008y0 = true;
        p71Var.j(qh0Var);
        try {
            p71Var.scrollBy(0, i10);
            ArrayList arrayList = p71Var.f3166w0;
            if (arrayList != null) {
                arrayList.remove(qh0Var);
            }
            this.f38008y0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = p71Var.f3166w0;
            if (arrayList2 != null) {
                arrayList2.remove(qh0Var);
            }
            this.f38008y0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Wallet.x4 x4Var;
        boolean z10;
        switch (this.f38006w0) {
            case 1:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f38009z0;
                org.telegram.ui.Wallet.x4 x4Var2 = c5Var.f34564o0;
                if (x4Var2 != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        x4Var2.c();
                        x4Var2.f35503e = true;
                        x4Var2.f35505g = motionEvent.getX();
                        x4Var2.h = motionEvent.getY();
                    } else if (actionMasked == 3) {
                        x4Var2.c();
                    } else if (actionMasked == 2 || actionMasked == 1) {
                        float abs = Math.abs(motionEvent.getX() - x4Var2.f35505g);
                        float abs2 = Math.abs(motionEvent.getY() - x4Var2.h);
                        if (abs2 > ViewConfiguration.get(x4Var2.f35502c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        x4Var2.f35504f = z10;
                        if (!z10) {
                            x4Var2.d = false;
                        }
                        if (actionMasked == 1) {
                            x4Var2.f35503e = false;
                        }
                    }
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (x4Var = c5Var.f34564o0) != null) {
                    org.telegram.ui.Wallet.n nVar = x4Var.f35506i;
                    org.telegram.ui.Components.j71 j71Var = x4Var.f35502c;
                    if (j71Var != null) {
                        j71Var.removeCallbacks(nVar);
                        x4Var.f35502c.post(nVar);
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
        switch (this.f38006w0) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                id0 id0Var = (id0) this.f38009z0;
                kVar = ((org.telegram.ui.ActionBar.m2) id0Var).actionBar;
                if (view == kVar) {
                    b5Var = ((org.telegram.ui.ActionBar.m2) id0Var).parentLayout;
                    if (b5Var != null) {
                        b5Var2 = ((org.telegram.ui.ActionBar.m2) id0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.m2) id0Var).actionBar;
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
        switch (this.f38006w0) {
            case 1:
                return this.f38007x0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        yc0 yc0Var;
        org.telegram.ui.Components.p71 n02;
        switch (this.f38006w0) {
            case 0:
                id0 id0Var = (id0) this.f38009z0;
                try {
                    if (viewGroup == id0Var.U && (yc0Var = id0Var.K0) != null && yc0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.wm0 currentListView = id0Var.K0.getCurrentListView();
                        int top = id0Var.K0.getTop();
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
                    AndroidUtilities.runOnUIThread(new wz(this, 18));
                    return;
                }
            default:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f38009z0;
                if (!this.f38008y0 && i13 != 0 && (n02 = c5Var.n0()) != null) {
                    if (viewGroup == c5Var.f27773a && Z()) {
                        iArr[1] = c0(n02, i13) + iArr[1];
                        return;
                    } else if (viewGroup == n02 && i13 < 0) {
                        iArr[1] = c0(c5Var.f27773a, i13) + iArr[1];
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
        switch (this.f38006w0) {
            case 0:
                this.f38007x0.f3531a = 0;
                return;
            default:
                b2.q0 q0Var = this.f38007x0;
                if (i10 == 1) {
                    q0Var.f3532b = 0;
                } else {
                    q0Var.f3531a = 0;
                }
                org.telegram.ui.Wallet.x4 x4Var = ((org.telegram.ui.Wallet.c5) this.f38009z0).f34564o0;
                if (x4Var != null) {
                    org.telegram.ui.Wallet.n nVar = x4Var.f35506i;
                    org.telegram.ui.Components.j71 j71Var = x4Var.f35502c;
                    if (j71Var != null) {
                        j71Var.removeCallbacks(nVar);
                        x4Var.f35502c.post(nVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f38006w0) {
            case 0:
                id0 id0Var = (id0) this.f38009z0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    id0Var.j0(this.f38008y0);
                    this.f38008y0 = false;
                    return;
                }
                id0Var.z0(true);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f38006w0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f38009z0;
                if (c5Var.f34562n != size) {
                    c5Var.f34562n = size;
                    org.telegram.ui.Wallet.o4 o4Var = c5Var.d;
                    if (o4Var != null) {
                        o4Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.l4 l4Var = c5Var.f34552e;
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
        switch (this.f38006w0) {
            case 1:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f38009z0;
                if (view == c5Var.n0() && (x4Var = c5Var.f34564o0) != null) {
                    return x4Var.a((int) f7, (int) f10);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f38006w0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.f38006w0) {
            case 0:
                if (((id0) this.f38009z0).K0 != null && i10 == 2) {
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
        switch (this.f38006w0) {
            case 0:
                this.f38007x0.f3531a = i10;
                return;
            default:
                b2.q0 q0Var = this.f38007x0;
                if (i11 == 1) {
                    q0Var.f3532b = i10;
                    return;
                } else {
                    q0Var.f3531a = i10;
                    return;
                }
        }
    }

    public gd0(id0 id0Var, Context context) {
        super(context, null);
        this.f38009z0 = id0Var;
        this.f38008y0 = true;
        this.f38007x0 = new Object();
    }

    private final void b0(View view) {
    }

    private final void a0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
