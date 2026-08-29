package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class rj0 implements f5.d {
    public final int f32328a;
    public final fk0 f32329b;

    public rj0(fk0 fk0Var, int i10) {
        this.f32328a = i10;
        this.f32329b = fk0Var;
    }

    @Override
    public final void accept(Object obj) {
        float f9;
        View view = (View) obj;
        switch (this.f32328a) {
            case 0:
                fk0 fk0Var = this.f32329b;
                ArrayList arrayList = fk0Var.d;
                fk0Var.f28434b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof dk0)) {
                    ((dk0) view).f(((wj0) arrayList.get(R)).f34434c, true);
                    return;
                }
                return;
            default:
                if (view instanceof dk0) {
                    dk0 dk0Var = (dk0) view;
                    ck0 ck0Var = dk0Var.f27795b;
                    dk0Var.J = false;
                    float f10 = 1.0f;
                    ck0Var.setAlpha(1.0f);
                    if (this.f32329b.J0) {
                        float f11 = dk0Var.E;
                        if (dk0Var.f27802w) {
                            f9 = 0.76f;
                        } else {
                            f9 = 1.0f;
                        }
                        ck0Var.setScaleX(f11 * f9);
                        float f12 = dk0Var.E;
                        if (dk0Var.f27802w) {
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
