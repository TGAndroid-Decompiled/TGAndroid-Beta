package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class pc0 extends org.telegram.ui.Components.hv0 implements r0.n {
    public final a5.e f41366s0;
    public boolean f41367t0;
    public final rc0 f41368u0;

    public pc0(rc0 rc0Var, Context context) {
        super(context, null);
        this.f41368u0 = rc0Var;
        this.f41367t0 = true;
        this.f41366s0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        hc0 hc0Var;
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        org.telegram.ui.Components.jl0 currentListView;
        int max;
        rc0 rc0Var = this.f41368u0;
        if (viewGroup == rc0Var.Q && (hc0Var = rc0Var.G0) != null && hc0Var.isAttachedToWindow()) {
            lVar = ((org.telegram.ui.ActionBar.o2) rc0Var).actionBar;
            boolean z10 = lVar.f23612j0;
            int top = rc0Var.G0.getTop();
            boolean z11 = false;
            if (i11 < 0) {
                if (top <= 0 && (currentListView = rc0Var.G0.getCurrentListView()) != null) {
                    int L0 = ((f2.j0) currentListView.getLayoutManager()).L0();
                    int i14 = -1;
                    if (L0 != -1) {
                        f2.n1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f6432a.getTop();
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
                org.telegram.ui.Components.jl0 currentListView2 = rc0Var.G0.getCurrentListView();
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
        rc0 rc0Var = this.f41368u0;
        if (rc0Var.G0 != null) {
            canvas.save();
            canvas.translate(0.0f, rc0Var.Q.getY());
            rc0Var.G0.Q(canvas, arrayList);
            canvas.restore();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.l lVar2;
        boolean drawChild = super.drawChild(canvas, view, j10);
        rc0 rc0Var = this.f41368u0;
        lVar = ((org.telegram.ui.ActionBar.o2) rc0Var).actionBar;
        if (view == lVar) {
            b5Var = ((org.telegram.ui.ActionBar.o2) rc0Var).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.o2) rc0Var).parentLayout;
                lVar2 = ((org.telegram.ui.ActionBar.o2) rc0Var).actionBar;
                ((ActionBarLayout) b5Var2).q(canvas, lVar2.getMeasuredHeight());
            }
        }
        return drawChild;
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        hc0 hc0Var;
        rc0 rc0Var = this.f41368u0;
        try {
            if (viewGroup == rc0Var.Q && (hc0Var = rc0Var.G0) != null && hc0Var.isAttachedToWindow()) {
                org.telegram.ui.Components.jl0 currentListView = rc0Var.G0.getCurrentListView();
                int top = rc0Var.G0.getTop();
                if (currentListView != null && top == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new q00(this, 17));
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f41366s0.f165a = 0;
    }

    @Override
    public final boolean o(View view, View view2, int i10, int i11) {
        if (this.f41368u0.G0 != null && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        rc0 rc0Var = this.f41368u0;
        if (z10) {
            rc0Var.k0(this.f41367t0);
            this.f41367t0 = false;
            return;
        }
        rc0Var.A0(true);
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f41366s0.f165a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
