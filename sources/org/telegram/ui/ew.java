package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ew implements Runnable {
    public final int f36819a;
    public final ay f36820b;

    public ew(ay ayVar, int i10) {
        this.f36819a = i10;
        this.f36820b = ayVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f36819a) {
            case 0:
                this.f36820b.d.l();
                return;
            case 1:
                ay ayVar = this.f36820b;
                cy cyVar = ayVar.K;
                xx xxVar = ayVar.f35447a;
                if (xxVar != null && xxVar.getScrollState() == 0 && ayVar.f35447a.getChildCount() > 0 && ayVar.f35447a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (ayVar.f35453s == 0 && cyVar.X3() && ayVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = cyVar.N;
                    s4.b0 b0Var = (s4.b0) ayVar.f35447a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < ayVar.f35447a.getChildCount(); i13++) {
                        int R = RecyclerView.R(ayVar.f35447a.getChildAt(i13));
                        View childAt = ayVar.f35447a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - ayVar.f35447a.getPaddingTop();
                        if (cyVar.K) {
                            f7 = 0.0f;
                        }
                        if (ayVar.f35447a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((ayVar.f35447a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                ay ayVar2 = this.f36820b;
                ayVar2.d.W(ayVar2.I);
                ayVar2.K.Q = true;
                xx xxVar2 = ayVar2.f35447a;
                xxVar2.f43294b3 = true;
                ayVar2.H = false;
                xxVar2.invalidate();
                return;
        }
    }
}
