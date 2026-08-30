package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ak0 implements h5.d {
    public final int f23416a;
    public final pk0 f23417b;

    public ak0(pk0 pk0Var, int i10) {
        this.f23416a = i10;
        this.f23417b = pk0Var;
    }

    @Override
    public final void accept(Object obj) {
        float f10;
        View view = (View) obj;
        switch (this.f23416a) {
            case 0:
                pk0 pk0Var = this.f23417b;
                ArrayList arrayList = pk0Var.d;
                pk0Var.f27888b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof nk0)) {
                    ((nk0) view).f(((gk0) arrayList.get(R)).f25186c, true);
                    return;
                }
                return;
            default:
                if (view instanceof nk0) {
                    nk0 nk0Var = (nk0) view;
                    mk0 mk0Var = nk0Var.f27300b;
                    nk0Var.K = false;
                    float f11 = 1.0f;
                    mk0Var.setAlpha(1.0f);
                    if (this.f23417b.K0) {
                        float f12 = nk0Var.F;
                        if (nk0Var.f27306w) {
                            f10 = 0.76f;
                        } else {
                            f10 = 1.0f;
                        }
                        mk0Var.setScaleX(f12 * f10);
                        float f13 = nk0Var.F;
                        if (nk0Var.f27306w) {
                            f11 = 0.76f;
                        }
                        mk0Var.setScaleY(f13 * f11);
                        return;
                    }
                    nk0Var.d();
                    return;
                }
                return;
        }
    }
}
