package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ek0 implements e2.h {
    public final int f23960a;
    public final sk0 f23961b;

    public ek0(sk0 sk0Var, int i10) {
        this.f23960a = i10;
        this.f23961b = sk0Var;
    }

    @Override
    public final void accept(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f23960a) {
            case 0:
                sk0 sk0Var = this.f23961b;
                ArrayList arrayList = sk0Var.d;
                sk0Var.f28229b.getClass();
                int S = RecyclerView.S(view);
                if (S >= 0 && S < arrayList.size() && (view instanceof qk0)) {
                    ((qk0) view).f(((jk0) arrayList.get(S)).f25397c, true);
                    return;
                }
                return;
            default:
                if (view instanceof qk0) {
                    qk0 qk0Var = (qk0) view;
                    pk0 pk0Var = qk0Var.f27589b;
                    qk0Var.N = false;
                    float f10 = 1.0f;
                    pk0Var.setAlpha(1.0f);
                    if (this.f23961b.N0) {
                        float f11 = qk0Var.I;
                        if (qk0Var.f27595w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        pk0Var.setScaleX(f11 * f7);
                        float f12 = qk0Var.I;
                        if (qk0Var.f27595w) {
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
