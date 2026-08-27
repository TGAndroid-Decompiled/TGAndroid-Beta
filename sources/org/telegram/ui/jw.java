package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class jw implements Runnable {

    public final int f39527a;

    public final fy f39528b;

    public jw(fy fyVar, int i10) {
        this.f39527a = i10;
        this.f39528b = fyVar;
    }

    @Override
    public final void run() {
        switch (this.f39527a) {
            case 0:
                this.f39528b.d.l();
                break;
            case 1:
                fy fyVar = this.f39528b;
                gy gyVar = fyVar.G;
                cy cyVar = fyVar.f38225a;
                if (cyVar != null && cyVar.getScrollState() == 0 && fyVar.f38225a.getChildCount() > 0 && fyVar.f38225a.getLayoutManager() != null) {
                    int i10 = 1;
                    boolean z10 = fyVar.f38232s == 0 && gyVar.Z3() && fyVar.v == 2;
                    float f10 = gyVar.J;
                    f2.k0 k0Var = (f2.k0) fyVar.f38225a.getLayoutManager();
                    View view = null;
                    int top = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < fyVar.f38225a.getChildCount(); i12++) {
                        int iR = RecyclerView.R(fyVar.f38225a.getChildAt(i12));
                        View childAt = fyVar.f38225a.getChildAt(i12);
                        if (iR != -1 && childAt != null && childAt.getTop() < top) {
                            top = childAt.getTop();
                            i11 = iR;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top2 = view.getTop() - fyVar.f38225a.getPaddingTop();
                        if (gyVar.G) {
                            f10 = 0.0f;
                        }
                        if (fyVar.f38225a.getScrollState() != 1) {
                            if (z10 && i11 == 0 && ((fyVar.f38225a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top2 = f10;
                            } else {
                                i10 = i11;
                            }
                            k0Var.h1(i10, (int) top2);
                        }
                    }
                    break;
                }
                break;
            default:
                fy fyVar2 = this.f39528b;
                fyVar2.d.W(fyVar2.E);
                fyVar2.G.M = true;
                cy cyVar2 = fyVar2.f38225a;
                cyVar2.Z2 = true;
                fyVar2.D = false;
                cyVar2.invalidate();
                break;
        }
    }
}
