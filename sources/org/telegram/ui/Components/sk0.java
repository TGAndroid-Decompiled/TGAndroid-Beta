package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class sk0 implements Utilities.Callback {
    public final int f32612a;
    public final gl0 f32613b;

    public sk0(gl0 gl0Var, int i10) {
        this.f32612a = i10;
        this.f32613b = gl0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f32612a) {
            case 0:
                gl0 gl0Var = this.f32613b;
                ArrayList arrayList = gl0Var.d;
                gl0Var.f28609b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof el0)) {
                    ((el0) view).f(((xk0) arrayList.get(R)).f34790c, true);
                    return;
                }
                return;
            default:
                if (view instanceof el0) {
                    el0 el0Var = (el0) view;
                    dl0 dl0Var = el0Var.f27877b;
                    el0Var.N = false;
                    float f10 = 1.0f;
                    dl0Var.setAlpha(1.0f);
                    if (this.f32613b.N0) {
                        float f11 = el0Var.I;
                        if (el0Var.f27883w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        dl0Var.setScaleX(f11 * f7);
                        float f12 = el0Var.I;
                        if (el0Var.f27883w) {
                            f10 = 0.76f;
                        }
                        dl0Var.setScaleY(f12 * f10);
                        return;
                    }
                    el0Var.d();
                    return;
                }
                return;
        }
    }
}
