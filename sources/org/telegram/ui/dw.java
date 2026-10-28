package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class dw implements Runnable {
    public final int f38695a;
    public final dy f38696b;

    public dw(dy dyVar, int i10) {
        this.f38695a = i10;
        this.f38696b = dyVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38695a) {
            case 0:
                this.f38696b.d.l();
                return;
            case 1:
                dy dyVar = this.f38696b;
                ey eyVar = dyVar.K;
                zx zxVar = dyVar.f38702a;
                if (zxVar != null && zxVar.getScrollState() == 0 && dyVar.f38702a.getChildCount() > 0 && dyVar.f38702a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (dyVar.f38708s == 0 && eyVar.h4() && dyVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = eyVar.N;
                    s4.c0 c0Var = (s4.c0) dyVar.f38702a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < dyVar.f38702a.getChildCount(); i13++) {
                        int R = RecyclerView.R(dyVar.f38702a.getChildAt(i13));
                        View childAt = dyVar.f38702a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - dyVar.f38702a.getPaddingTop();
                        if (eyVar.K) {
                            f7 = 0.0f;
                        }
                        if (dyVar.f38702a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((dyVar.f38702a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
                                top = f7;
                            } else {
                                i10 = i12;
                            }
                            c0Var.h1(i10, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                dy dyVar2 = this.f38696b;
                dyVar2.d.X(dyVar2.I);
                dyVar2.K.Q = true;
                zx zxVar2 = dyVar2.f38702a;
                zxVar2.f46400k3 = true;
                dyVar2.H = false;
                zxVar2.invalidate();
                return;
        }
    }
}
