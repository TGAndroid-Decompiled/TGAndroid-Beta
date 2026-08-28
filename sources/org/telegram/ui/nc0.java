package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class nc0 extends org.telegram.ui.Components.xu0 implements r0.n {
    public final d5.p f40696s0;
    public boolean f40697t0;
    public final pc0 f40698u0;

    public nc0(pc0 pc0Var, Context context) {
        super(context, null);
        this.f40698u0 = pc0Var;
        this.f40697t0 = true;
        this.f40696s0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i9, int i10, int[] iArr, int i11) {
        fc0 fc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.Components.wk0 currentListView;
        int max;
        pc0 pc0Var = this.f40698u0;
        if (viewGroup == pc0Var.Q && (fc0Var = pc0Var.G0) != null && fc0Var.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.o2) pc0Var).actionBar;
            boolean z10 = kVar.f23577j0;
            int top = pc0Var.G0.getTop();
            boolean z11 = false;
            if (i10 < 0) {
                if (top <= 0 && (currentListView = pc0Var.G0.getCurrentListView()) != null) {
                    int L0 = ((f2.m0) currentListView.getLayoutManager()).L0();
                    int i13 = -1;
                    if (L0 != -1) {
                        f2.q1 K = currentListView.K(L0);
                        if (K != null) {
                            i13 = K.f5501a.getTop();
                        }
                        int paddingTop = currentListView.getPaddingTop();
                        if (i13 != paddingTop || L0 != 0) {
                            if (L0 != 0) {
                                max = i10;
                            } else {
                                max = Math.max(i10, i13 - paddingTop);
                            }
                            iArr[1] = max;
                            currentListView.scrollBy(0, i10);
                            z11 = true;
                        }
                    }
                }
                if (z10) {
                    if (!z11 && top < 0) {
                        iArr[1] = i10 - Math.max(top, i10);
                    } else {
                        iArr[1] = i10;
                    }
                }
            } else if (z10) {
                org.telegram.ui.Components.wk0 currentListView2 = pc0Var.G0.getCurrentListView();
                iArr[1] = i10;
                if (top > 0) {
                    iArr[1] = 0;
                }
                if (currentListView2 != null && (i12 = iArr[1]) > 0) {
                    currentListView2.scrollBy(0, i12);
                }
            }
        }
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        pc0 pc0Var = this.f40698u0;
        if (pc0Var.G0 != null) {
            canvas.save();
            canvas.translate(0.0f, pc0Var.Q.getY());
            pc0Var.G0.Q(canvas, arrayList);
            canvas.restore();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        boolean drawChild = super.drawChild(canvas, view, j10);
        pc0 pc0Var = this.f40698u0;
        kVar = ((org.telegram.ui.ActionBar.o2) pc0Var).actionBar;
        if (view == kVar) {
            b5Var = ((org.telegram.ui.ActionBar.o2) pc0Var).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.o2) pc0Var).parentLayout;
                kVar2 = ((org.telegram.ui.ActionBar.o2) pc0Var).actionBar;
                ((ActionBarLayout) b5Var2).q(canvas, kVar2.getMeasuredHeight());
            }
        }
        return drawChild;
    }

    @Override
    public final void i(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        fc0 fc0Var;
        pc0 pc0Var = this.f40698u0;
        try {
            if (viewGroup == pc0Var.Q && (fc0Var = pc0Var.G0) != null && fc0Var.isAttachedToWindow()) {
                org.telegram.ui.Components.wk0 currentListView = pc0Var.G0.getCurrentListView();
                int top = pc0Var.G0.getTop();
                if (currentListView != null && top == 0) {
                    iArr[1] = i12;
                    currentListView.scrollBy(0, i12);
                }
            }
        } catch (Throwable th) {
            FileLog.e(th);
            AndroidUtilities.runOnUIThread(new o00(this, 17));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        pc0 pc0Var = this.f40698u0;
        if (z10) {
            pc0Var.j0(this.f40697t0);
            this.f40697t0 = false;
            return;
        }
        pc0Var.z0(true);
    }

    @Override
    public final void p(int i9, View view) {
        this.f40696s0.f4376a = 0;
    }

    @Override
    public final boolean q(View view, View view2, int i9, int i10) {
        if (this.f40698u0.G0 != null && i9 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void t(View view, View view2, int i9, int i10) {
        this.f40696s0.f4376a = i9;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13) {
    }
}
