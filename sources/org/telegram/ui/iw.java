package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class iw implements Runnable {
    public final int f39355a;
    public final ey f39356b;

    public iw(ey eyVar, int i10) {
        this.f39355a = i10;
        this.f39356b = eyVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39355a) {
            case 0:
                this.f39356b.d.l();
                return;
            case 1:
                ey eyVar = this.f39356b;
                fy fyVar = eyVar.G;
                ay ayVar = eyVar.f37921a;
                if (ayVar != null && ayVar.getScrollState() == 0 && eyVar.f37921a.getChildCount() > 0 && eyVar.f37921a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (eyVar.f37928s == 0 && fyVar.Z3() && eyVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f9 = fyVar.J;
                    f2.j0 j0Var = (f2.j0) eyVar.f37921a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < eyVar.f37921a.getChildCount(); i13++) {
                        int R = RecyclerView.R(eyVar.f37921a.getChildAt(i13));
                        View childAt = eyVar.f37921a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - eyVar.f37921a.getPaddingTop();
                        if (fyVar.G) {
                            f9 = 0.0f;
                        }
                        if (eyVar.f37921a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((eyVar.f37921a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f9 < 0.0f) {
                                top = f9;
                            } else {
                                i10 = i12;
                            }
                            j0Var.h1(i10, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ey eyVar2 = this.f39356b;
                eyVar2.d.W(eyVar2.E);
                eyVar2.G.M = true;
                ay ayVar2 = eyVar2.f37921a;
                ayVar2.Z2 = true;
                eyVar2.D = false;
                ayVar2.invalidate();
                return;
        }
    }
}
