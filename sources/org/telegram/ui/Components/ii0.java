package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ii0 implements org.telegram.messenger.x10 {
    public final int f36265a;
    public final xi0 f36266b;

    public ii0(xi0 xi0Var, int i7) {
        this.f36265a = i7;
        this.f36266b = xi0Var;
    }

    @Override
    public final void a(Object obj) {
        float f10;
        View view = (View) obj;
        switch (this.f36265a) {
            case 0:
                xi0 xi0Var = this.f36266b;
                ArrayList arrayList = xi0Var.d;
                xi0Var.f42112b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof vi0)) {
                    ((vi0) view).f(((oi0) arrayList.get(R)).f38248c, true);
                    return;
                }
                return;
            default:
                if (view instanceof vi0) {
                    vi0 vi0Var = (vi0) view;
                    ui0 ui0Var = vi0Var.f40836b;
                    vi0Var.O = false;
                    float f11 = 1.0f;
                    ui0Var.setAlpha(1.0f);
                    if (this.f36266b.O0) {
                        float f12 = vi0Var.J;
                        if (vi0Var.f40844x) {
                            f10 = 0.76f;
                        } else {
                            f10 = 1.0f;
                        }
                        ui0Var.setScaleX(f12 * f10);
                        float f13 = vi0Var.J;
                        if (vi0Var.f40844x) {
                            f11 = 0.76f;
                        }
                        ui0Var.setScaleY(f13 * f11);
                        return;
                    }
                    vi0Var.d();
                    return;
                }
                return;
        }
    }
}
