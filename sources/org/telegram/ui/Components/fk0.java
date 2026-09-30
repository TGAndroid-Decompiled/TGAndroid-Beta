package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class fk0 implements Utilities.Callback {
    public final int f24307a;
    public final tk0 f24308b;

    public fk0(tk0 tk0Var, int i10) {
        this.f24307a = i10;
        this.f24308b = tk0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f24307a) {
            case 0:
                tk0 tk0Var = this.f24308b;
                ArrayList arrayList = tk0Var.d;
                tk0Var.f28555b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof rk0)) {
                    ((rk0) view).f(((kk0) arrayList.get(R)).f25781c, true);
                    return;
                }
                return;
            default:
                if (view instanceof rk0) {
                    rk0 rk0Var = (rk0) view;
                    qk0 qk0Var = rk0Var.f28051b;
                    rk0Var.N = false;
                    float f10 = 1.0f;
                    qk0Var.setAlpha(1.0f);
                    if (this.f24308b.N0) {
                        float f11 = rk0Var.I;
                        if (rk0Var.f28057w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        qk0Var.setScaleX(f11 * f7);
                        float f12 = rk0Var.I;
                        if (rk0Var.f28057w) {
                            f10 = 0.76f;
                        }
                        qk0Var.setScaleY(f12 * f10);
                        return;
                    }
                    rk0Var.d();
                    return;
                }
                return;
        }
    }
}
