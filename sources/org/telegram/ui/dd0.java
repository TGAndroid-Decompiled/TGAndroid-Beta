package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class dd0 extends org.telegram.ui.Components.cw0 implements r0.m {
    public final b2.q0 f32937w0;
    public boolean f32938x0;
    public final fd0 f32939y0;

    public dd0(fd0 fd0Var, Context context) {
        super(context, null);
        this.f32939y0 = fd0Var;
        this.f32938x0 = true;
        this.f32937w0 = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        vc0 vc0Var;
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        org.telegram.ui.Components.yl0 currentListView;
        int max;
        fd0 fd0Var = this.f32939y0;
        if (viewGroup == fd0Var.U && (vc0Var = fd0Var.K0) != null && vc0Var.isAttachedToWindow()) {
            lVar = ((org.telegram.ui.ActionBar.o2) fd0Var).actionBar;
            boolean z10 = lVar.f19570n0;
            int top = fd0Var.K0.getTop();
            boolean z11 = false;
            if (i11 < 0) {
                if (top <= 0 && (currentListView = fd0Var.K0.getCurrentListView()) != null) {
                    int L0 = ((s4.c0) currentListView.getLayoutManager()).L0();
                    int i14 = -1;
                    if (L0 != -1) {
                        s4.c1 L = currentListView.L(L0);
                        if (L != null) {
                            i14 = L.f43005a.getTop();
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
                org.telegram.ui.Components.yl0 currentListView2 = fd0Var.K0.getCurrentListView();
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
        fd0 fd0Var = this.f32939y0;
        if (fd0Var.K0 != null) {
            canvas.save();
            canvas.translate(0.0f, fd0Var.U.getY());
            fd0Var.K0.Q(canvas, arrayList);
            canvas.restore();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.l lVar2;
        boolean drawChild = super.drawChild(canvas, view, j3);
        fd0 fd0Var = this.f32939y0;
        lVar = ((org.telegram.ui.ActionBar.o2) fd0Var).actionBar;
        if (view == lVar) {
            d5Var = ((org.telegram.ui.ActionBar.o2) fd0Var).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.o2) fd0Var).parentLayout;
                lVar2 = ((org.telegram.ui.ActionBar.o2) fd0Var).actionBar;
                ((ActionBarLayout) d5Var2).q(canvas, lVar2.getMeasuredHeight());
            }
        }
        return drawChild;
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        vc0 vc0Var;
        fd0 fd0Var = this.f32939y0;
        try {
            if (viewGroup == fd0Var.U && (vc0Var = fd0Var.K0) != null && vc0Var.isAttachedToWindow()) {
                org.telegram.ui.Components.yl0 currentListView = fd0Var.K0.getCurrentListView();
                int top = fd0Var.K0.getTop();
                if (currentListView != null && top == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new f10(this, 17));
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f32937w0.f3197a = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        fd0 fd0Var = this.f32939y0;
        if (z10) {
            fd0Var.k0(this.f32938x0);
            this.f32938x0 = false;
            return;
        }
        fd0Var.A0(true);
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f32939y0.K0 != null && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f32937w0.f3197a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
