package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class gi0 implements org.telegram.messenger.x10 {
    public final int f35505a;
    public final vi0 f35506b;

    public gi0(vi0 vi0Var, int i7) {
        this.f35505a = i7;
        this.f35506b = vi0Var;
    }

    @Override
    public final void a(Object obj) {
        float f10;
        View view = (View) obj;
        switch (this.f35505a) {
            case 0:
                vi0 vi0Var = this.f35506b;
                ArrayList arrayList = vi0Var.d;
                vi0Var.f40641b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof ti0)) {
                    ((ti0) view).f(((mi0) arrayList.get(R)).f37517c, true);
                    return;
                }
                return;
            default:
                if (view instanceof ti0) {
                    ti0 ti0Var = (ti0) view;
                    si0 si0Var = ti0Var.f40010b;
                    ti0Var.O = false;
                    float f11 = 1.0f;
                    si0Var.setAlpha(1.0f);
                    if (this.f35506b.O0) {
                        float f12 = ti0Var.J;
                        if (ti0Var.f40018x) {
                            f10 = 0.76f;
                        } else {
                            f10 = 1.0f;
                        }
                        si0Var.setScaleX(f12 * f10);
                        float f13 = ti0Var.J;
                        if (ti0Var.f40018x) {
                            f11 = 0.76f;
                        }
                        si0Var.setScaleY(f13 * f11);
                        return;
                    }
                    ti0Var.d();
                    return;
                }
                return;
        }
    }
}
