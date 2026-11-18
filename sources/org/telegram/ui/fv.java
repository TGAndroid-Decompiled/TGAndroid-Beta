package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class fv implements Runnable {
    public final int f47792a;
    public final bx f47793b;

    public fv(bx bxVar, int i7) {
        this.f47792a = i7;
        this.f47793b = bxVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f47792a) {
            case 0:
                this.f47793b.d.f();
                return;
            case 1:
                bx bxVar = this.f47793b;
                cx cxVar = bxVar.L;
                yw ywVar = bxVar.f46298a;
                if (ywVar != null && ywVar.getScrollState() == 0 && bxVar.f46298a.getChildCount() > 0 && bxVar.f46298a.getLayoutManager() != null) {
                    int i7 = 1;
                    if (bxVar.f46305s == 0 && cxVar.n4() && bxVar.f46306w == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f10 = cxVar.O;
                    v4.c0 c0Var = (v4.c0) bxVar.f46298a.getLayoutManager();
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < bxVar.f46298a.getChildCount(); i12++) {
                        int R = RecyclerView.R(bxVar.f46298a.getChildAt(i12));
                        View childAt = bxVar.f46298a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - bxVar.f46298a.getPaddingTop();
                        if (cxVar.L) {
                            f10 = 0.0f;
                        }
                        if (bxVar.f46298a.getScrollState() != 1) {
                            if (z10 && i11 == 0 && ((bxVar.f46298a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i7 = i11;
                            }
                            c0Var.h1(i7, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                bx bxVar2 = this.f47793b;
                bxVar2.d.X(bxVar2.J);
                bxVar2.L.R = true;
                yw ywVar2 = bxVar2.f46298a;
                ywVar2.f54259k3 = true;
                bxVar2.I = false;
                ywVar2.invalidate();
                return;
        }
    }
}
