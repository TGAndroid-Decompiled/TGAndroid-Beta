package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class sk0 implements Utilities.Callback {
    public final int f28851a;
    public final gl0 f28852b;

    public sk0(gl0 gl0Var, int i10) {
        this.f28851a = i10;
        this.f28852b = gl0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f28851a) {
            case 0:
                gl0 gl0Var = this.f28852b;
                ArrayList arrayList = gl0Var.d;
                gl0Var.f25009b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof el0)) {
                    ((el0) view).f(((xk0) arrayList.get(R)).f30944c, true);
                    return;
                }
                return;
            default:
                if (view instanceof el0) {
                    el0 el0Var = (el0) view;
                    dl0 dl0Var = el0Var.f24417b;
                    el0Var.N = false;
                    float f10 = 1.0f;
                    dl0Var.setAlpha(1.0f);
                    if (this.f28852b.N0) {
                        float f11 = el0Var.I;
                        if (el0Var.f24423w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        dl0Var.setScaleX(f11 * f7);
                        float f12 = el0Var.I;
                        if (el0Var.f24423w) {
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
