package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ck0 implements h5.d {
    public final int f25994a;
    public final rk0 f25995b;

    public ck0(rk0 rk0Var, int i10) {
        this.f25994a = i10;
        this.f25995b = rk0Var;
    }

    @Override
    public final void accept(Object obj) {
        float f10;
        View view = (View) obj;
        switch (this.f25994a) {
            case 0:
                rk0 rk0Var = this.f25995b;
                ArrayList arrayList = rk0Var.d;
                rk0Var.f30755b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof pk0)) {
                    ((pk0) view).f(((ik0) arrayList.get(R)).f27851c, true);
                    return;
                }
                return;
            default:
                if (view instanceof pk0) {
                    pk0 pk0Var = (pk0) view;
                    ok0 ok0Var = pk0Var.f30099b;
                    pk0Var.K = false;
                    float f11 = 1.0f;
                    ok0Var.setAlpha(1.0f);
                    if (this.f25995b.K0) {
                        float f12 = pk0Var.F;
                        if (pk0Var.f30106w) {
                            f10 = 0.76f;
                        } else {
                            f10 = 1.0f;
                        }
                        ok0Var.setScaleX(f12 * f10);
                        float f13 = pk0Var.F;
                        if (pk0Var.f30106w) {
                            f11 = 0.76f;
                        }
                        ok0Var.setScaleY(f13 * f11);
                        return;
                    }
                    pk0Var.d();
                    return;
                }
                return;
        }
    }
}
