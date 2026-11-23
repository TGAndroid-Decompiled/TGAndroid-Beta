package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ii0 implements org.telegram.messenger.y10 {
    public final int f36259a;
    public final xi0 f36260b;

    public ii0(xi0 xi0Var, int i7) {
        this.f36259a = i7;
        this.f36260b = xi0Var;
    }

    @Override
    public final void a(Object obj) {
        float f10;
        View view = (View) obj;
        switch (this.f36259a) {
            case 0:
                xi0 xi0Var = this.f36260b;
                ArrayList arrayList = xi0Var.d;
                xi0Var.f42105b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof vi0)) {
                    ((vi0) view).f(((oi0) arrayList.get(R)).f38242c, true);
                    return;
                }
                return;
            default:
                if (view instanceof vi0) {
                    vi0 vi0Var = (vi0) view;
                    ui0 ui0Var = vi0Var.f40838b;
                    vi0Var.O = false;
                    float f11 = 1.0f;
                    ui0Var.setAlpha(1.0f);
                    if (this.f36260b.O0) {
                        float f12 = vi0Var.J;
                        if (vi0Var.f40846x) {
                            f10 = 0.76f;
                        } else {
                            f10 = 1.0f;
                        }
                        ui0Var.setScaleX(f12 * f10);
                        float f13 = vi0Var.J;
                        if (vi0Var.f40846x) {
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
