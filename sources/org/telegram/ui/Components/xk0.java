package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class xk0 implements Utilities.Callback {
    public final int f32956a;
    public final ll0 f32957b;

    public xk0(ll0 ll0Var, int i10) {
        this.f32956a = i10;
        this.f32957b = ll0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f32956a) {
            case 0:
                ll0 ll0Var = this.f32957b;
                ArrayList arrayList = ll0Var.d;
                ll0Var.f28382b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof jl0)) {
                    ((jl0) view).f(((cl0) arrayList.get(R)).f25322c, true);
                    return;
                }
                return;
            default:
                if (view instanceof jl0) {
                    jl0 jl0Var = (jl0) view;
                    il0 il0Var = jl0Var.f27718b;
                    jl0Var.N = false;
                    float f10 = 1.0f;
                    il0Var.setAlpha(1.0f);
                    if (this.f32957b.N0) {
                        float f11 = jl0Var.I;
                        if (jl0Var.f27725w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        il0Var.setScaleX(f11 * f7);
                        float f12 = jl0Var.I;
                        if (jl0Var.f27725w) {
                            f10 = 0.76f;
                        }
                        il0Var.setScaleY(f12 * f10);
                        return;
                    }
                    jl0Var.d();
                    return;
                }
                return;
        }
    }
}
