package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class rj0 implements e2.h {
    public final int f30033a;
    public final fk0 f30034b;

    public rj0(fk0 fk0Var, int i10) {
        this.f30033a = i10;
        this.f30034b = fk0Var;
    }

    @Override
    public final void accept(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f30033a) {
            case 0:
                fk0 fk0Var = this.f30034b;
                ArrayList arrayList = fk0Var.d;
                fk0Var.f26080b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof dk0)) {
                    ((dk0) view).f(((wj0) arrayList.get(R)).f32274c, true);
                    return;
                }
                return;
            default:
                if (view instanceof dk0) {
                    dk0 dk0Var = (dk0) view;
                    ck0 ck0Var = dk0Var.f25408b;
                    dk0Var.N = false;
                    float f10 = 1.0f;
                    ck0Var.setAlpha(1.0f);
                    if (this.f30034b.N0) {
                        float f11 = dk0Var.I;
                        if (dk0Var.f25415w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        ck0Var.setScaleX(f11 * f7);
                        float f12 = dk0Var.I;
                        if (dk0Var.f25415w) {
                            f10 = 0.76f;
                        }
                        ck0Var.setScaleY(f12 * f10);
                        return;
                    }
                    dk0Var.d();
                    return;
                }
                return;
        }
    }
}
