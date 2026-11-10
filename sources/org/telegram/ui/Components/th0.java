package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class th0 implements org.telegram.messenger.c20 {
    public final int f38310a;
    public final ii0 f38311b;

    public th0(ii0 ii0Var, int i7) {
        this.f38310a = i7;
        this.f38311b = ii0Var;
    }

    @Override
    public final void a(Object obj) {
        float f10;
        View view = (View) obj;
        switch (this.f38310a) {
            case 0:
                ii0 ii0Var = this.f38311b;
                ArrayList arrayList = ii0Var.d;
                ii0Var.f34637b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof gi0)) {
                    ((gi0) view).f(((zh0) arrayList.get(R)).f41006c, true);
                    return;
                }
                return;
            default:
                if (view instanceof gi0) {
                    gi0 gi0Var = (gi0) view;
                    fi0 fi0Var = gi0Var.f33904b;
                    gi0Var.N = false;
                    float f11 = 1.0f;
                    fi0Var.setAlpha(1.0f);
                    if (this.f38311b.N0) {
                        float f12 = gi0Var.I;
                        if (gi0Var.f33912x) {
                            f10 = 0.76f;
                        } else {
                            f10 = 1.0f;
                        }
                        fi0Var.setScaleX(f12 * f10);
                        float f13 = gi0Var.I;
                        if (gi0Var.f33912x) {
                            f11 = 0.76f;
                        }
                        fi0Var.setScaleY(f13 * f11);
                        return;
                    }
                    gi0Var.d();
                    return;
                }
                return;
        }
    }
}
