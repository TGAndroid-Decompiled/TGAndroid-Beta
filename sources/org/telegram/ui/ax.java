package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ax implements Runnable {
    public final int f34110a;
    public final xy f34111b;

    public ax(xy xyVar, int i10) {
        this.f34110a = i10;
        this.f34111b = xyVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f34110a) {
            case 0:
                this.f34111b.d.l();
                return;
            case 1:
                xy xyVar = this.f34111b;
                yy yyVar = xyVar.K;
                uy uyVar = xyVar.f41679a;
                if (uyVar != null && uyVar.getScrollState() == 0 && xyVar.f41679a.getChildCount() > 0 && xyVar.f41679a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (xyVar.f41685s == 0 && yyVar.X3() && xyVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = yyVar.N;
                    s4.b0 b0Var = (s4.b0) xyVar.f41679a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < xyVar.f41679a.getChildCount(); i13++) {
                        int R = RecyclerView.R(xyVar.f41679a.getChildAt(i13));
                        View childAt = xyVar.f41679a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - xyVar.f41679a.getPaddingTop();
                        if (yyVar.K) {
                            f7 = 0.0f;
                        }
                        if (xyVar.f41679a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((xyVar.f41679a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
                                top = f7;
                            } else {
                                i10 = i12;
                            }
                            b0Var.h1(i10, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                xy xyVar2 = this.f34111b;
                xyVar2.d.W(xyVar2.I);
                xyVar2.K.Q = true;
                uy uyVar2 = xyVar2.f41679a;
                uyVar2.f40507b3 = true;
                xyVar2.H = false;
                uyVar2.invalidate();
                return;
        }
    }
}
