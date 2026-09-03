package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class bk0 implements h5.d {
    public final int f25631a;
    public final qk0 f25632b;

    public bk0(qk0 qk0Var, int i10) {
        this.f25631a = i10;
        this.f25632b = qk0Var;
    }

    @Override
    public final void accept(Object obj) {
        float f10;
        View view = (View) obj;
        switch (this.f25631a) {
            case 0:
                qk0 qk0Var = this.f25632b;
                ArrayList arrayList = qk0Var.d;
                qk0Var.f30426b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof ok0)) {
                    ((ok0) view).f(((hk0) arrayList.get(R)).f27557c, true);
                    return;
                }
                return;
            default:
                if (view instanceof ok0) {
                    ok0 ok0Var = (ok0) view;
                    nk0 nk0Var = ok0Var.f29792b;
                    ok0Var.K = false;
                    float f11 = 1.0f;
                    nk0Var.setAlpha(1.0f);
                    if (this.f25632b.K0) {
                        float f12 = ok0Var.F;
                        if (ok0Var.f29799w) {
                            f10 = 0.76f;
                        } else {
                            f10 = 1.0f;
                        }
                        nk0Var.setScaleX(f12 * f10);
                        float f13 = ok0Var.F;
                        if (ok0Var.f29799w) {
                            f11 = 0.76f;
                        }
                        nk0Var.setScaleY(f13 * f11);
                        return;
                    }
                    ok0Var.d();
                    return;
                }
                return;
        }
    }
}
