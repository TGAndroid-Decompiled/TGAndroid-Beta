package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ew implements Runnable {
    public final int f36808a;
    public final ay f36809b;

    public ew(ay ayVar, int i10) {
        this.f36808a = i10;
        this.f36809b = ayVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f36808a) {
            case 0:
                this.f36809b.d.l();
                return;
            case 1:
                ay ayVar = this.f36809b;
                cy cyVar = ayVar.K;
                xx xxVar = ayVar.f35436a;
                if (xxVar != null && xxVar.getScrollState() == 0 && ayVar.f35436a.getChildCount() > 0 && ayVar.f35436a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (ayVar.f35442s == 0 && cyVar.X3() && ayVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = cyVar.N;
                    s4.b0 b0Var = (s4.b0) ayVar.f35436a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < ayVar.f35436a.getChildCount(); i13++) {
                        int R = RecyclerView.R(ayVar.f35436a.getChildAt(i13));
                        View childAt = ayVar.f35436a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - ayVar.f35436a.getPaddingTop();
                        if (cyVar.K) {
                            f7 = 0.0f;
                        }
                        if (ayVar.f35436a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((ayVar.f35436a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                ay ayVar2 = this.f36809b;
                ayVar2.d.W(ayVar2.I);
                ayVar2.K.Q = true;
                xx xxVar2 = ayVar2.f35436a;
                xxVar2.f43284b3 = true;
                ayVar2.H = false;
                xxVar2.invalidate();
                return;
        }
    }
}
