package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ck0 implements e2.h {
    public final int f23285a;
    public final qk0 f23286b;

    public ck0(qk0 qk0Var, int i10) {
        this.f23285a = i10;
        this.f23286b = qk0Var;
    }

    @Override
    public final void accept(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f23285a) {
            case 0:
                qk0 qk0Var = this.f23286b;
                ArrayList arrayList = qk0Var.d;
                qk0Var.f27637b.getClass();
                int S = RecyclerView.S(view);
                if (S >= 0 && S < arrayList.size() && (view instanceof ok0)) {
                    ((ok0) view).f(((hk0) arrayList.get(S)).f24687c, true);
                    return;
                }
                return;
            default:
                if (view instanceof ok0) {
                    ok0 ok0Var = (ok0) view;
                    nk0 nk0Var = ok0Var.f26974b;
                    ok0Var.N = false;
                    float f10 = 1.0f;
                    nk0Var.setAlpha(1.0f);
                    if (this.f23286b.N0) {
                        float f11 = ok0Var.I;
                        if (ok0Var.f26980w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        nk0Var.setScaleX(f11 * f7);
                        float f12 = ok0Var.I;
                        if (ok0Var.f26980w) {
                            f10 = 0.76f;
                        }
                        nk0Var.setScaleY(f12 * f10);
                        return;
                    }
                    ok0Var.d();
                    return;
                }
                return;
        }
    }
}
