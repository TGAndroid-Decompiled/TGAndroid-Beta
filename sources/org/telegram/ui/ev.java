package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ev implements Runnable {
    public final int f47631a;
    public final ax f47632b;

    public ev(ax axVar, int i7) {
        this.f47631a = i7;
        this.f47632b = axVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f47631a) {
            case 0:
                this.f47632b.d.f();
                return;
            case 1:
                ax axVar = this.f47632b;
                bx bxVar = axVar.L;
                xw xwVar = axVar.f45822a;
                if (xwVar != null && xwVar.getScrollState() == 0 && axVar.f45822a.getChildCount() > 0 && axVar.f45822a.getLayoutManager() != null) {
                    int i7 = 1;
                    if (axVar.f45829s == 0 && bxVar.n4() && axVar.f45830w == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f10 = bxVar.O;
                    v4.c0 c0Var = (v4.c0) axVar.f45822a.getLayoutManager();
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < axVar.f45822a.getChildCount(); i12++) {
                        int R = RecyclerView.R(axVar.f45822a.getChildAt(i12));
                        View childAt = axVar.f45822a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - axVar.f45822a.getPaddingTop();
                        if (bxVar.L) {
                            f10 = 0.0f;
                        }
                        if (axVar.f45822a.getScrollState() != 1) {
                            if (z10 && i11 == 0 && ((axVar.f45822a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
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
                ax axVar2 = this.f47632b;
                axVar2.d.X(axVar2.J);
                axVar2.L.R = true;
                xw xwVar2 = axVar2.f45822a;
                xwVar2.f54089k3 = true;
                axVar2.I = false;
                xwVar2.invalidate();
                return;
        }
    }
}
