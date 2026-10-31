package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class xi0 implements org.telegram.messenger.q20 {
    public final int f32477a;
    public final mj0 f32478b;

    public xi0(mj0 mj0Var, int i10) {
        this.f32477a = i10;
        this.f32478b = mj0Var;
    }

    @Override
    public final void a(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f32477a) {
            case 0:
                mj0 mj0Var = this.f32478b;
                ArrayList arrayList = mj0Var.d;
                mj0Var.f28500b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof kj0)) {
                    ((kj0) view).f(((dj0) arrayList.get(R)).f25433c, true);
                    return;
                }
                return;
            default:
                if (view instanceof kj0) {
                    kj0 kj0Var = (kj0) view;
                    jj0 jj0Var = kj0Var.f27772b;
                    kj0Var.N = false;
                    float f10 = 1.0f;
                    jj0Var.setAlpha(1.0f);
                    if (this.f32478b.N0) {
                        float f11 = kj0Var.I;
                        if (kj0Var.f27779x) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        jj0Var.setScaleX(f11 * f7);
                        float f12 = kj0Var.I;
                        if (kj0Var.f27779x) {
                            f10 = 0.76f;
                        }
                        jj0Var.setScaleY(f12 * f10);
                        return;
                    }
                    kj0Var.d();
                    return;
                }
                return;
        }
    }
}
