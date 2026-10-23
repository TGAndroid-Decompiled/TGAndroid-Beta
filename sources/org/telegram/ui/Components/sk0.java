package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class sk0 implements Utilities.Callback {
    public final int f30511a;
    public final gl0 f30512b;

    public sk0(gl0 gl0Var, int i10) {
        this.f30511a = i10;
        this.f30512b = gl0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f30511a) {
            case 0:
                gl0 gl0Var = this.f30512b;
                ArrayList arrayList = gl0Var.d;
                gl0Var.f26631b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof el0)) {
                    ((el0) view).f(((xk0) arrayList.get(R)).f32590c, true);
                    return;
                }
                return;
            default:
                if (view instanceof el0) {
                    el0 el0Var = (el0) view;
                    dl0 dl0Var = el0Var.f26000b;
                    el0Var.N = false;
                    float f10 = 1.0f;
                    dl0Var.setAlpha(1.0f);
                    if (this.f30512b.N0) {
                        float f11 = el0Var.I;
                        if (el0Var.f26006w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        dl0Var.setScaleX(f11 * f7);
                        float f12 = el0Var.I;
                        if (el0Var.f26006w) {
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
