package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class uh0 implements org.telegram.messenger.c20 {
    public final int f38722a;
    public final ji0 f38723b;

    public uh0(ji0 ji0Var, int i7) {
        this.f38722a = i7;
        this.f38723b = ji0Var;
    }

    @Override
    public final void a(Object obj) {
        float f10;
        View view = (View) obj;
        switch (this.f38722a) {
            case 0:
                ji0 ji0Var = this.f38723b;
                ArrayList arrayList = ji0Var.d;
                ji0Var.f35028b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof hi0)) {
                    ((hi0) view).f(((ai0) arrayList.get(R)).f31864c, true);
                    return;
                }
                return;
            default:
                if (view instanceof hi0) {
                    hi0 hi0Var = (hi0) view;
                    gi0 gi0Var = hi0Var.f34304b;
                    hi0Var.N = false;
                    float f11 = 1.0f;
                    gi0Var.setAlpha(1.0f);
                    if (this.f38723b.N0) {
                        float f12 = hi0Var.I;
                        if (hi0Var.f34312x) {
                            f10 = 0.76f;
                        } else {
                            f10 = 1.0f;
                        }
                        gi0Var.setScaleX(f12 * f10);
                        float f13 = hi0Var.I;
                        if (hi0Var.f34312x) {
                            f11 = 0.76f;
                        }
                        gi0Var.setScaleY(f13 * f11);
                        return;
                    }
                    hi0Var.d();
                    return;
                }
                return;
        }
    }
}
