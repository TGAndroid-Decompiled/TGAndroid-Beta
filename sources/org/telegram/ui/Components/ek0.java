package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ek0 implements Utilities.Callback {
    public final int f26077a;
    public final sk0 f26078b;

    public ek0(sk0 sk0Var, int i10) {
        this.f26077a = i10;
        this.f26078b = sk0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f26077a) {
            case 0:
                sk0 sk0Var = this.f26078b;
                ArrayList arrayList = sk0Var.d;
                sk0Var.f30757b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof qk0)) {
                    ((qk0) view).f(((jk0) arrayList.get(R)).f27803c, true);
                    return;
                }
                return;
            default:
                if (view instanceof qk0) {
                    qk0 qk0Var = (qk0) view;
                    pk0 pk0Var = qk0Var.f30059b;
                    qk0Var.N = false;
                    float f10 = 1.0f;
                    pk0Var.setAlpha(1.0f);
                    if (this.f26078b.N0) {
                        float f11 = qk0Var.I;
                        if (qk0Var.f30066w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        pk0Var.setScaleX(f11 * f7);
                        float f12 = qk0Var.I;
                        if (qk0Var.f30066w) {
                            f10 = 0.76f;
                        }
                        pk0Var.setScaleY(f12 * f10);
                        return;
                    }
                    qk0Var.d();
                    return;
                }
                return;
        }
    }
}
