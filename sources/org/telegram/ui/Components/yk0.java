package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class yk0 implements Utilities.Callback {
    public final int f33290a;
    public final ml0 f33291b;

    public yk0(ml0 ml0Var, int i10) {
        this.f33290a = i10;
        this.f33291b = ml0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f33290a) {
            case 0:
                ml0 ml0Var = this.f33291b;
                ArrayList arrayList = ml0Var.d;
                ml0Var.f28753b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof kl0)) {
                    ((kl0) view).f(((dl0) arrayList.get(R)).f25626c, true);
                    return;
                }
                return;
            default:
                if (view instanceof kl0) {
                    kl0 kl0Var = (kl0) view;
                    jl0 jl0Var = kl0Var.f28031b;
                    kl0Var.N = false;
                    float f10 = 1.0f;
                    jl0Var.setAlpha(1.0f);
                    if (this.f33291b.N0) {
                        float f11 = kl0Var.I;
                        if (kl0Var.f28038w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        jl0Var.setScaleX(f11 * f7);
                        float f12 = kl0Var.I;
                        if (kl0Var.f28038w) {
                            f10 = 0.76f;
                        }
                        jl0Var.setScaleY(f12 * f10);
                        return;
                    }
                    kl0Var.d();
                    return;
                }
                return;
        }
    }
}
