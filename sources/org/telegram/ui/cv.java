package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class cv implements Runnable {
    public final int f46260a;
    public final xw f46261b;

    public cv(xw xwVar, int i7) {
        this.f46260a = i7;
        this.f46261b = xwVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f46260a) {
            case 0:
                this.f46261b.d.f();
                return;
            case 1:
                xw xwVar = this.f46261b;
                yw ywVar = xwVar.L;
                uw uwVar = xwVar.f53331a;
                if (uwVar != null && uwVar.getScrollState() == 0 && xwVar.f53331a.getChildCount() > 0 && xwVar.f53331a.getLayoutManager() != null) {
                    int i7 = 1;
                    if (xwVar.f53338s == 0 && ywVar.l4() && xwVar.f53339w == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f10 = ywVar.O;
                    v4.b0 b0Var = (v4.b0) xwVar.f53331a.getLayoutManager();
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < xwVar.f53331a.getChildCount(); i12++) {
                        int R = RecyclerView.R(xwVar.f53331a.getChildAt(i12));
                        View childAt = xwVar.f53331a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - xwVar.f53331a.getPaddingTop();
                        if (ywVar.L) {
                            f10 = 0.0f;
                        }
                        if (xwVar.f53331a.getScrollState() != 1) {
                            if (z10 && i11 == 0 && ((xwVar.f53331a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
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
                xw xwVar2 = this.f46261b;
                xwVar2.d.X(xwVar2.J);
                xwVar2.L.R = true;
                uw uwVar2 = xwVar2.f53331a;
                uwVar2.f52036k3 = true;
                xwVar2.I = false;
                uwVar2.invalidate();
                return;
        }
    }
}
