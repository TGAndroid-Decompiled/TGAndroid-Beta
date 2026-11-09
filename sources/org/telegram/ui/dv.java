package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class dv implements Runnable {
    public final int f45122a;
    public final xw f45123b;

    public dv(xw xwVar, int i7) {
        this.f45122a = i7;
        this.f45123b = xwVar;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f45122a) {
            case 0:
                this.f45123b.d.f();
                return;
            case 1:
                xw xwVar = this.f45123b;
                yw ywVar = xwVar.K;
                uw uwVar = xwVar.f51772a;
                if (uwVar != null && uwVar.getScrollState() == 0 && xwVar.f51772a.getChildCount() > 0 && xwVar.f51772a.getLayoutManager() != null) {
                    int i7 = 1;
                    if (xwVar.f51779s == 0 && ywVar.l4() && xwVar.f51780w == 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    float f10 = ywVar.N;
                    v4.b0 b0Var = (v4.b0) xwVar.f51772a.getLayoutManager();
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < xwVar.f51772a.getChildCount(); i12++) {
                        int R = RecyclerView.R(xwVar.f51772a.getChildAt(i12));
                        View childAt = xwVar.f51772a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - xwVar.f51772a.getPaddingTop();
                        if (ywVar.K) {
                            f10 = 0.0f;
                        }
                        if (xwVar.f51772a.getScrollState() != 1) {
                            if (z9 && i11 == 0 && ((xwVar.f51772a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i7 = i11;
                            }
                            b0Var.h1(i7, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                xw xwVar2 = this.f45123b;
                xwVar2.d.X(xwVar2.I);
                xwVar2.K.Q = true;
                uw uwVar2 = xwVar2.f51772a;
                uwVar2.j3 = true;
                xwVar2.H = false;
                uwVar2.invalidate();
                return;
        }
    }
}
