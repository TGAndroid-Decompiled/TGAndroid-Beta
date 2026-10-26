package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class bw implements Runnable {
    public final int f38178a;
    public final ay f38179b;

    public bw(ay ayVar, int i10) {
        this.f38178a = i10;
        this.f38179b = ayVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38178a) {
            case 0:
                this.f38179b.d.l();
                return;
            case 1:
                ay ayVar = this.f38179b;
                cy cyVar = ayVar.K;
                wx wxVar = ayVar.f37913a;
                if (wxVar != null && wxVar.getScrollState() == 0 && ayVar.f37913a.getChildCount() > 0 && ayVar.f37913a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (ayVar.f37919s == 0 && cyVar.h4() && ayVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = cyVar.N;
                    s4.c0 c0Var = (s4.c0) ayVar.f37913a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < ayVar.f37913a.getChildCount(); i13++) {
                        int R = RecyclerView.R(ayVar.f37913a.getChildAt(i13));
                        View childAt = ayVar.f37913a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - ayVar.f37913a.getPaddingTop();
                        if (cyVar.K) {
                            f7 = 0.0f;
                        }
                        if (ayVar.f37913a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((ayVar.f37913a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                ay ayVar2 = this.f38179b;
                ayVar2.d.X(ayVar2.I);
                ayVar2.K.Q = true;
                wx wxVar2 = ayVar2.f37913a;
                wxVar2.f45569k3 = true;
                ayVar2.H = false;
                wxVar2.invalidate();
                return;
        }
    }
}
