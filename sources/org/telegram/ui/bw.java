package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class bw implements Runnable {
    public final int f38175a;
    public final ay f38176b;

    public bw(ay ayVar, int i10) {
        this.f38175a = i10;
        this.f38176b = ayVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38175a) {
            case 0:
                this.f38176b.d.l();
                return;
            case 1:
                ay ayVar = this.f38176b;
                cy cyVar = ayVar.K;
                wx wxVar = ayVar.f37910a;
                if (wxVar != null && wxVar.getScrollState() == 0 && ayVar.f37910a.getChildCount() > 0 && ayVar.f37910a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (ayVar.f37916s == 0 && cyVar.h4() && ayVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = cyVar.N;
                    s4.c0 c0Var = (s4.c0) ayVar.f37910a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < ayVar.f37910a.getChildCount(); i13++) {
                        int R = RecyclerView.R(ayVar.f37910a.getChildAt(i13));
                        View childAt = ayVar.f37910a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - ayVar.f37910a.getPaddingTop();
                        if (cyVar.K) {
                            f7 = 0.0f;
                        }
                        if (ayVar.f37910a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((ayVar.f37910a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                ay ayVar2 = this.f38176b;
                ayVar2.d.X(ayVar2.I);
                ayVar2.K.Q = true;
                wx wxVar2 = ayVar2.f37910a;
                wxVar2.f45566k3 = true;
                ayVar2.H = false;
                wxVar2.invalidate();
                return;
        }
    }
}
