package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gw implements Runnable {
    public final int f38608a;
    public final cy f38609b;

    public gw(cy cyVar, int i9) {
        this.f38608a = i9;
        this.f38609b = cyVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38608a) {
            case 0:
                this.f38609b.d.l();
                return;
            case 1:
                cy cyVar = this.f38609b;
                dy dyVar = cyVar.G;
                yx yxVar = cyVar.f37350a;
                if (yxVar != null && yxVar.getScrollState() == 0 && cyVar.f37350a.getChildCount() > 0 && cyVar.f37350a.getLayoutManager() != null) {
                    int i9 = 1;
                    if (cyVar.f37357s == 0 && dyVar.Z3() && cyVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f10 = dyVar.J;
                    f2.m0 m0Var = (f2.m0) cyVar.f37350a.getLayoutManager();
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < cyVar.f37350a.getChildCount(); i12++) {
                        int R = RecyclerView.R(cyVar.f37350a.getChildAt(i12));
                        View childAt = cyVar.f37350a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - cyVar.f37350a.getPaddingTop();
                        if (dyVar.G) {
                            f10 = 0.0f;
                        }
                        if (cyVar.f37350a.getScrollState() != 1) {
                            if (z10 && i11 == 0 && ((cyVar.f37350a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i9 = i11;
                            }
                            m0Var.h1(i9, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                cy cyVar2 = this.f38609b;
                cyVar2.d.W(cyVar2.E);
                cyVar2.G.M = true;
                yx yxVar2 = cyVar2.f37350a;
                yxVar2.Z2 = true;
                cyVar2.D = false;
                yxVar2.invalidate();
                return;
        }
    }
}
