package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class id0 extends org.telegram.ui.Components.qv0 implements r0.m {
    public final b2.q0 f34536w0;
    public boolean f34537x0;
    public final kd0 f34538y0;

    public id0(kd0 kd0Var, Context context) {
        super(context, null);
        this.f34538y0 = kd0Var;
        this.f34537x0 = true;
        this.f34536w0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        ad0 ad0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.ml0 currentListView;
        int max;
        kd0 kd0Var = this.f34538y0;
        if (viewGroup == kd0Var.U && (ad0Var = kd0Var.K0) != null && ad0Var.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.o2) kd0Var).actionBar;
            boolean z10 = kVar.f19305n0;
            int top = kd0Var.K0.getTop();
            boolean z11 = false;
            if (i11 < 0) {
                if (top <= 0 && (currentListView = kd0Var.K0.getCurrentListView()) != null) {
                    int L0 = ((s4.c0) currentListView.getLayoutManager()).L0();
                    int i14 = -1;
                    if (L0 != -1) {
                        s4.c1 L = currentListView.L(L0);
                        if (L != null) {
                            i14 = L.f42702a.getTop();
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
                org.telegram.ui.Components.ml0 currentListView2 = kd0Var.K0.getCurrentListView();
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
    public final void L(Canvas canvas, ArrayList arrayList) {
        kd0 kd0Var = this.f34538y0;
        if (kd0Var.K0 != null) {
            canvas.save();
            canvas.translate(0.0f, kd0Var.U.getY());
            kd0Var.K0.Q(canvas, arrayList);
            canvas.restore();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        boolean drawChild = super.drawChild(canvas, view, j3);
        kd0 kd0Var = this.f34538y0;
        kVar = ((org.telegram.ui.ActionBar.o2) kd0Var).actionBar;
        if (view == kVar) {
            e5Var = ((org.telegram.ui.ActionBar.o2) kd0Var).parentLayout;
            if (e5Var != null) {
                e5Var2 = ((org.telegram.ui.ActionBar.o2) kd0Var).parentLayout;
                kVar2 = ((org.telegram.ui.ActionBar.o2) kd0Var).actionBar;
                ((ActionBarLayout) e5Var2).q(canvas, kVar2.getMeasuredHeight());
            }
        }
        return drawChild;
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ad0 ad0Var;
        kd0 kd0Var = this.f34538y0;
        try {
            if (viewGroup == kd0Var.U && (ad0Var = kd0Var.K0) != null && ad0Var.isAttachedToWindow()) {
                org.telegram.ui.Components.ml0 currentListView = kd0Var.K0.getCurrentListView();
                int top = kd0Var.K0.getTop();
                if (currentListView != null && top == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new i10(this, 17));
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f34536w0.f3203a = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        kd0 kd0Var = this.f34538y0;
        if (z10) {
            kd0Var.k0(this.f34537x0);
            this.f34537x0 = false;
            return;
        }
        kd0Var.A0(true);
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f34538y0.K0 != null && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f34536w0.f3203a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
