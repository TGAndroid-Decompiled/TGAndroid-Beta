package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ek0 implements Utilities.Callback {
    public final int f24020a;
    public final sk0 f24021b;

    public ek0(sk0 sk0Var, int i10) {
        this.f24020a = i10;
        this.f24021b = sk0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f24020a) {
            case 0:
                sk0 sk0Var = this.f24021b;
                ArrayList arrayList = sk0Var.d;
                sk0Var.f28267b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof qk0)) {
                    ((qk0) view).f(((jk0) arrayList.get(R)).f25473c, true);
                    return;
                }
                return;
            default:
                if (view instanceof qk0) {
                    qk0 qk0Var = (qk0) view;
                    pk0 pk0Var = qk0Var.f27754b;
                    qk0Var.N = false;
                    float f10 = 1.0f;
                    pk0Var.setAlpha(1.0f);
                    if (this.f24021b.N0) {
                        float f11 = qk0Var.I;
                        if (qk0Var.f27760w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        pk0Var.setScaleX(f11 * f7);
                        float f12 = qk0Var.I;
                        if (qk0Var.f27760w) {
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
