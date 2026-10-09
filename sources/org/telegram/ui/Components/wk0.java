package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class wk0 implements Utilities.Callback {
    public final int f32628a;
    public final kl0 f32629b;

    public wk0(kl0 kl0Var, int i10) {
        this.f32628a = i10;
        this.f32629b = kl0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f32628a) {
            case 0:
                kl0 kl0Var = this.f32629b;
                ArrayList arrayList = kl0Var.d;
                kl0Var.f28067b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof il0)) {
                    ((il0) view).f(((bl0) arrayList.get(R)).f25046c, true);
                    return;
                }
                return;
            default:
                if (view instanceof il0) {
                    il0 il0Var = (il0) view;
                    hl0 hl0Var = il0Var.f27421b;
                    il0Var.N = false;
                    float f10 = 1.0f;
                    hl0Var.setAlpha(1.0f);
                    if (this.f32629b.N0) {
                        float f11 = il0Var.I;
                        if (il0Var.f27428w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        hl0Var.setScaleX(f11 * f7);
                        float f12 = il0Var.I;
                        if (il0Var.f27428w) {
                            f10 = 0.76f;
                        }
                        hl0Var.setScaleY(f12 * f10);
                        return;
                    }
                    il0Var.d();
                    return;
                }
                return;
        }
    }
}
