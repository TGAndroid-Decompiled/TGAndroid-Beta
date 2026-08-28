package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class gj0 implements d5.d {
    public final int f28782a;
    public final uj0 f28783b;

    public gj0(uj0 uj0Var, int i9) {
        this.f28782a = i9;
        this.f28783b = uj0Var;
    }

    @Override
    public final void accept(Object obj) {
        float f10;
        View view = (View) obj;
        switch (this.f28782a) {
            case 0:
                uj0 uj0Var = this.f28783b;
                ArrayList arrayList = uj0Var.d;
                uj0Var.f33045b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof sj0)) {
                    ((sj0) view).f(((lj0) arrayList.get(R)).f30466c, true);
                    return;
                }
                return;
            default:
                if (view instanceof sj0) {
                    sj0 sj0Var = (sj0) view;
                    rj0 rj0Var = sj0Var.f32475b;
                    sj0Var.J = false;
                    float f11 = 1.0f;
                    rj0Var.setAlpha(1.0f);
                    if (this.f28783b.J0) {
                        float f12 = sj0Var.E;
                        if (sj0Var.f32482w) {
                            f10 = 0.76f;
                        } else {
                            f10 = 1.0f;
                        }
                        rj0Var.setScaleX(f12 * f10);
                        float f13 = sj0Var.E;
                        if (sj0Var.f32482w) {
                            f11 = 0.76f;
                        }
                        rj0Var.setScaleY(f13 * f11);
                        return;
                    }
                    sj0Var.d();
                    return;
                }
                return;
        }
    }
}
