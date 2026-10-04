package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ed0 extends org.telegram.ui.Components.lw0 implements r0.m {
    public final b2.q0 f35991w0;
    public boolean f35992x0;
    public final gd0 f35993y0;

    public ed0(gd0 gd0Var, Context context) {
        super(context, null);
        this.f35993y0 = gd0Var;
        this.f35992x0 = true;
        this.f35991w0 = new Object();
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        gd0 gd0Var = this.f35993y0;
        if (gd0Var.K0 != null) {
            canvas.save();
            canvas.translate(0.0f, gd0Var.U.getY());
            gd0Var.K0.Q(canvas, arrayList);
            canvas.restore();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        boolean drawChild = super.drawChild(canvas, view, j3);
        gd0 gd0Var = this.f35993y0;
        kVar = ((org.telegram.ui.ActionBar.n2) gd0Var).actionBar;
        if (view == kVar) {
            c5Var = ((org.telegram.ui.ActionBar.n2) gd0Var).parentLayout;
            if (c5Var != null) {
                c5Var2 = ((org.telegram.ui.ActionBar.n2) gd0Var).parentLayout;
                kVar2 = ((org.telegram.ui.ActionBar.n2) gd0Var).actionBar;
                ((ActionBarLayout) c5Var2).q(canvas, kVar2.getMeasuredHeight());
            }
        }
        return drawChild;
    }

    @Override
    public final void m(int i10, View view) {
        this.f35991w0.f3454a = 0;
    }

    @Override
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        wc0 wc0Var;
        gd0 gd0Var = this.f35993y0;
        try {
            if (view == gd0Var.U && (wc0Var = gd0Var.K0) != null && wc0Var.isAttachedToWindow()) {
                org.telegram.ui.Components.zl0 currentListView = gd0Var.K0.getCurrentListView();
                int top = gd0Var.K0.getTop();
                if (currentListView != null && top == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new g10(this, 17));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        gd0 gd0Var = this.f35993y0;
        if (z10) {
            gd0Var.k0(this.f35992x0);
            this.f35992x0 = false;
            return;
        }
        gd0Var.A0(true);
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f35993y0.K0 != null && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f35991w0.f3454a = i10;
    }

    @Override
    public final void t(View view, int i10, int i11, int[] iArr, int i12) {
        wc0 wc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.zl0 currentListView;
        int max;
        gd0 gd0Var = this.f35993y0;
        if (view == gd0Var.U && (wc0Var = gd0Var.K0) != null && wc0Var.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.n2) gd0Var).actionBar;
            boolean z10 = kVar.f21281n0;
            int top = gd0Var.K0.getTop();
            boolean z11 = false;
            if (i11 < 0) {
                if (top <= 0 && (currentListView = gd0Var.K0.getCurrentListView()) != null) {
                    int L0 = ((s4.c0) currentListView.getLayoutManager()).L0();
                    int i14 = -1;
                    if (L0 != -1) {
                        s4.c1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f46531a.getTop();
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
                    } else {
                        iArr[1] = i11;
                    }
                }
            } else if (z10) {
                org.telegram.ui.Components.zl0 currentListView2 = gd0Var.K0.getCurrentListView();
                iArr[1] = i11;
                if (top > 0) {
                    iArr[1] = 0;
                }
                if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                    currentListView2.scrollBy(0, i13);
                }
            }
        }
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void o(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
