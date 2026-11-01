package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class yi0 implements org.telegram.messenger.r20 {
    public final int f32853a;
    public final nj0 f32854b;

    public yi0(nj0 nj0Var, int i10) {
        this.f32853a = i10;
        this.f32854b = nj0Var;
    }

    @Override
    public final void a(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f32853a) {
            case 0:
                nj0 nj0Var = this.f32854b;
                ArrayList arrayList = nj0Var.d;
                nj0Var.f28861b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof lj0)) {
                    ((lj0) view).f(((ej0) arrayList.get(R)).f25852c, true);
                    return;
                }
                return;
            default:
                if (view instanceof lj0) {
                    lj0 lj0Var = (lj0) view;
                    kj0 kj0Var = lj0Var.f28183b;
                    lj0Var.N = false;
                    float f10 = 1.0f;
                    kj0Var.setAlpha(1.0f);
                    if (this.f32854b.N0) {
                        float f11 = lj0Var.I;
                        if (lj0Var.f28190x) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        kj0Var.setScaleX(f11 * f7);
                        float f12 = lj0Var.I;
                        if (lj0Var.f28190x) {
                            f10 = 0.76f;
                        }
                        kj0Var.setScaleY(f12 * f10);
                        return;
                    }
                    lj0Var.d();
                    return;
                }
                return;
        }
    }
}
