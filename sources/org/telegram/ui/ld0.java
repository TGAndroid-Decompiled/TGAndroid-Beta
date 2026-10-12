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
public final class ld0 extends org.telegram.ui.Components.ow0 implements r0.n {
    public final int f37920w0 = 1;
    public final b2.v0 f37921x0;
    public boolean f37922y0;
    public final org.telegram.ui.ActionBar.m2 f37923z0;

    public ld0(org.telegram.ui.Wallet.z4 z4Var, Context context) {
        super(context, null);
        this.f37923z0 = z4Var;
        this.f37921x0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        dd0 dd0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.mm0 currentListView;
        int max;
        org.telegram.ui.Components.h71 n02;
        org.telegram.ui.Wallet.v4 v4Var;
        switch (this.f37920w0) {
            case 0:
                nd0 nd0Var = (nd0) this.f37923z0;
                if (viewGroup == nd0Var.U && (dd0Var = nd0Var.K0) != null && dd0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.m2) nd0Var).actionBar;
                    boolean z10 = kVar.f20442n0;
                    int top = nd0Var.K0.getTop();
                    boolean z11 = false;
                    if (i11 < 0) {
                        if (top <= 0 && (currentListView = nd0Var.K0.getCurrentListView()) != null) {
                            int L0 = ((s4.b0) currentListView.getLayoutManager()).L0();
                            int i14 = -1;
                            if (L0 != -1) {
                                s4.b1 K = currentListView.K(L0);
                                if (K != null) {
                                    i14 = K.f44838a.getTop();
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
                        org.telegram.ui.Components.mm0 currentListView2 = nd0Var.K0.getCurrentListView();
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
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.f37923z0;
                if (!this.f37922y0 && (n02 = z4Var.n0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((viewGroup == z4Var.f23964a || viewGroup == n02) && (v4Var = z4Var.f33934o0) != null && v4Var.f33775f)) {
                        v4Var.d = true;
                    }
                    if (viewGroup == z4Var.f23964a && i11 < 0 && Z()) {
                        iArr[1] = c0(n02, i11) + iArr[1];
                        return;
                    } else if (viewGroup == n02 && i11 > 0) {
                        iArr[1] = c0(z4Var.f23964a, i11) + iArr[1];
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
        switch (this.f37920w0) {
            case 0:
                nd0 nd0Var = (nd0) this.f37923z0;
                if (nd0Var.K0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, nd0Var.U.getY());
                    nd0Var.K0.Q(canvas, arrayList);
                    canvas.restore();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public boolean Z() {
        org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.f37923z0;
        LinearLayout linearLayout = z4Var.f33931l0;
        if (linearLayout != null && (linearLayout.getParent() instanceof View) && ((View) z4Var.f33931l0.getParent()).getTop() <= z4Var.f23964a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        switch (this.f37920w0) {
            case 0:
                return;
            default:
                i(viewGroup, i10, i11, i12, i13, i14, new int[2]);
                return;
        }
    }

    public int c0(org.telegram.ui.Components.h71 h71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.kc0 kc0Var = new org.telegram.ui.Components.kc0(iArr, 11);
        this.f37922y0 = true;
        h71Var.j(kc0Var);
        try {
            h71Var.scrollBy(0, i10);
            ArrayList arrayList = h71Var.f2016w0;
            if (arrayList != null) {
                arrayList.remove(kc0Var);
            }
            this.f37922y0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = h71Var.f2016w0;
            if (arrayList2 != null) {
                arrayList2.remove(kc0Var);
            }
            this.f37922y0 = false;
            throw th2;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Wallet.v4 v4Var;
        boolean z10;
        switch (this.f37920w0) {
            case 1:
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.f37923z0;
                org.telegram.ui.Wallet.v4 v4Var2 = z4Var.f33934o0;
                if (v4Var2 != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        v4Var2.c();
                        v4Var2.e = true;
                        v4Var2.f33776g = motionEvent.getX();
                        v4Var2.h = motionEvent.getY();
                    } else if (actionMasked == 3) {
                        v4Var2.c();
                    } else if (actionMasked == 2 || actionMasked == 1) {
                        float abs = Math.abs(motionEvent.getX() - v4Var2.f33776g);
                        float abs2 = Math.abs(motionEvent.getY() - v4Var2.h);
                        if (abs2 > ViewConfiguration.get(v4Var2.f33774c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        v4Var2.f33775f = z10;
                        if (!z10) {
                            v4Var2.d = false;
                        }
                        if (actionMasked == 1) {
                            v4Var2.e = false;
                        }
                    }
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (v4Var = z4Var.f33934o0) != null) {
                    org.telegram.ui.Wallet.m mVar = v4Var.f33777i;
                    org.telegram.ui.Components.b71 b71Var = v4Var.f33774c;
                    if (b71Var != null) {
                        b71Var.removeCallbacks(mVar);
                        v4Var.f33774c.post(mVar);
                    }
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37920w0) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                nd0 nd0Var = (nd0) this.f37923z0;
                kVar = ((org.telegram.ui.ActionBar.m2) nd0Var).actionBar;
                if (view == kVar) {
                    b5Var = ((org.telegram.ui.ActionBar.m2) nd0Var).parentLayout;
                    if (b5Var != null) {
                        b5Var2 = ((org.telegram.ui.ActionBar.m2) nd0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.m2) nd0Var).actionBar;
                        ((ActionBarLayout) b5Var2).q(canvas, kVar2.getMeasuredHeight());
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public int getNestedScrollAxes() {
        switch (this.f37920w0) {
            case 1:
                return this.f37921x0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        dd0 dd0Var;
        org.telegram.ui.Components.h71 n02;
        switch (this.f37920w0) {
            case 0:
                nd0 nd0Var = (nd0) this.f37923z0;
                try {
                    if (viewGroup == nd0Var.U && (dd0Var = nd0Var.K0) != null && dd0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.mm0 currentListView = nd0Var.K0.getCurrentListView();
                        int top = nd0Var.K0.getTop();
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
                    AndroidUtilities.runOnUIThread(new zz(this, 18));
                    return;
                }
            default:
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.f37923z0;
                if (!this.f37922y0 && i13 != 0 && (n02 = z4Var.n0()) != null) {
                    if (viewGroup == z4Var.f23964a && Z()) {
                        iArr[1] = c0(n02, i13) + iArr[1];
                        return;
                    } else if (viewGroup == n02 && i13 < 0) {
                        iArr[1] = c0(z4Var.f23964a, i13) + iArr[1];
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
        switch (this.f37920w0) {
            case 0:
                this.f37921x0.f2444a = 0;
                return;
            default:
                b2.v0 v0Var = this.f37921x0;
                if (i10 == 1) {
                    v0Var.f2445b = 0;
                } else {
                    v0Var.f2444a = 0;
                }
                org.telegram.ui.Wallet.v4 v4Var = ((org.telegram.ui.Wallet.z4) this.f37923z0).f33934o0;
                if (v4Var != null) {
                    org.telegram.ui.Wallet.m mVar = v4Var.f33777i;
                    org.telegram.ui.Components.b71 b71Var = v4Var.f33774c;
                    if (b71Var != null) {
                        b71Var.removeCallbacks(mVar);
                        v4Var.f33774c.post(mVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37920w0) {
            case 0:
                nd0 nd0Var = (nd0) this.f37923z0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    nd0Var.j0(this.f37922y0);
                    this.f37922y0 = false;
                    return;
                }
                nd0Var.z0(true);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f37920w0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.f37923z0;
                if (z4Var.f33932n != size) {
                    z4Var.f33932n = size;
                    org.telegram.ui.Wallet.m4 m4Var = z4Var.d;
                    if (m4Var != null) {
                        m4Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.j4 j4Var = z4Var.e;
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
        switch (this.f37920w0) {
            case 1:
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.f37923z0;
                if (view == z4Var.n0() && (v4Var = z4Var.f33934o0) != null) {
                    return v4Var.a((int) f7, (int) f10);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override
    public void onStopNestedScroll(View view) {
        switch (this.f37920w0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.f37920w0) {
            case 0:
                if (((nd0) this.f37923z0).K0 != null && i10 == 2) {
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
        switch (this.f37920w0) {
            case 0:
                this.f37921x0.f2444a = i10;
                return;
            default:
                b2.v0 v0Var = this.f37921x0;
                if (i11 == 1) {
                    v0Var.f2445b = i10;
                    return;
                } else {
                    v0Var.f2444a = i10;
                    return;
                }
        }
    }

    public ld0(nd0 nd0Var, Context context) {
        super(context, null);
        this.f37923z0 = nd0Var;
        this.f37922y0 = true;
        this.f37921x0 = new Object();
    }

    private final void b0(View view) {
    }

    private final void a0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
