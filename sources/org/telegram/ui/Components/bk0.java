package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class bk0 implements e2.h {
    public final int f21849a;
    public final pk0 f21850b;

    public bk0(pk0 pk0Var, int i10) {
        this.f21849a = i10;
        this.f21850b = pk0Var;
    }

    @Override
    public final void accept(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f21849a) {
            case 0:
                pk0 pk0Var = this.f21850b;
                ArrayList arrayList = pk0Var.d;
                pk0Var.f26161b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof nk0)) {
                    ((nk0) view).f(((gk0) arrayList.get(R)).f23370c, true);
                    return;
                }
                return;
            default:
                if (view instanceof nk0) {
                    nk0 nk0Var = (nk0) view;
                    mk0 mk0Var = nk0Var.f25541b;
                    nk0Var.N = false;
                    float f10 = 1.0f;
                    mk0Var.setAlpha(1.0f);
                    if (this.f21850b.N0) {
                        float f11 = nk0Var.I;
                        if (nk0Var.f25547w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        mk0Var.setScaleX(f11 * f7);
                        float f12 = nk0Var.I;
                        if (nk0Var.f25547w) {
                            f10 = 0.76f;
                        }
                        mk0Var.setScaleY(f12 * f10);
                        return;
                    }
                    nk0Var.d();
                    return;
                }
                return;
        }
    }
}
