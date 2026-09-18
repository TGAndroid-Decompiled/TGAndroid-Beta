package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class sj0 implements e2.h {
    public final int f27876a;
    public final gk0 f27877b;

    public sj0(gk0 gk0Var, int i10) {
        this.f27876a = i10;
        this.f27877b = gk0Var;
    }

    @Override
    public final void accept(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f27876a) {
            case 0:
                gk0 gk0Var = this.f27877b;
                ArrayList arrayList = gk0Var.d;
                gk0Var.f24271b.getClass();
                int S = RecyclerView.S(view);
                if (S >= 0 && S < arrayList.size() && (view instanceof ek0)) {
                    ((ek0) view).f(((xj0) arrayList.get(S)).f29930c, true);
                    return;
                }
                return;
            default:
                if (view instanceof ek0) {
                    ek0 ek0Var = (ek0) view;
                    dk0 dk0Var = ek0Var.f23584b;
                    ek0Var.N = false;
                    float f10 = 1.0f;
                    dk0Var.setAlpha(1.0f);
                    if (this.f27877b.N0) {
                        float f11 = ek0Var.I;
                        if (ek0Var.f23590w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        dk0Var.setScaleX(f11 * f7);
                        float f12 = ek0Var.I;
                        if (ek0Var.f23590w) {
                            f10 = 0.76f;
                        }
                        dk0Var.setScaleY(f12 * f10);
                        return;
                    }
                    ek0Var.d();
                    return;
                }
                return;
        }
    }
}
