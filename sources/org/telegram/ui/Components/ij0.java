package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class ij0 implements d5.d {

    public final int f29375a;

    public final wj0 f29376b;

    public ij0(wj0 wj0Var, int i10) {
        this.f29375a = i10;
        this.f29376b = wj0Var;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.f29375a) {
            case 0:
                wj0 wj0Var = this.f29376b;
                ArrayList arrayList = wj0Var.d;
                wj0Var.f34236b.getClass();
                int iR = RecyclerView.R(view);
                if (iR >= 0 && iR < arrayList.size() && (view instanceof uj0)) {
                    ((uj0) view).f(((nj0) arrayList.get(iR)).f30984c, true);
                    break;
                }
                break;
            default:
                if (view instanceof uj0) {
                    uj0 uj0Var = (uj0) view;
                    tj0 tj0Var = uj0Var.f33100b;
                    uj0Var.J = false;
                    tj0Var.setAlpha(1.0f);
                    if (!this.f29376b.J0) {
                        uj0Var.d();
                    } else {
                        tj0Var.setScaleX(uj0Var.E * (uj0Var.f33107w ? 0.76f : 1.0f));
                        tj0Var.setScaleY(uj0Var.E * (uj0Var.f33107w ? 0.76f : 1.0f));
                    }
                }
                break;
        }
    }
}
