package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ew implements Runnable {
    public final int f36814a;
    public final ay f36815b;

    public ew(ay ayVar, int i10) {
        this.f36814a = i10;
        this.f36815b = ayVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f36814a) {
            case 0:
                this.f36815b.d.l();
                return;
            case 1:
                ay ayVar = this.f36815b;
                cy cyVar = ayVar.K;
                xx xxVar = ayVar.f35452a;
                if (xxVar != null && xxVar.getScrollState() == 0 && ayVar.f35452a.getChildCount() > 0 && ayVar.f35452a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (ayVar.f35458s == 0 && cyVar.X3() && ayVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = cyVar.N;
                    s4.b0 b0Var = (s4.b0) ayVar.f35452a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < ayVar.f35452a.getChildCount(); i13++) {
                        int R = RecyclerView.R(ayVar.f35452a.getChildAt(i13));
                        View childAt = ayVar.f35452a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - ayVar.f35452a.getPaddingTop();
                        if (cyVar.K) {
                            f7 = 0.0f;
                        }
                        if (ayVar.f35452a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((ayVar.f35452a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                ay ayVar2 = this.f36815b;
                ayVar2.d.W(ayVar2.I);
                ayVar2.K.Q = true;
                xx xxVar2 = ayVar2.f35452a;
                xxVar2.f43280b3 = true;
                ayVar2.H = false;
                xxVar2.invalidate();
                return;
        }
    }
}
