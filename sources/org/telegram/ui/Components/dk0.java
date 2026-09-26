package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class dk0 implements Utilities.Callback {
    public final int f23709a;
    public final rk0 f23710b;

    public dk0(rk0 rk0Var, int i10) {
        this.f23709a = i10;
        this.f23710b = rk0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f23709a) {
            case 0:
                rk0 rk0Var = this.f23710b;
                ArrayList arrayList = rk0Var.d;
                rk0Var.f27951b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof pk0)) {
                    ((pk0) view).f(((ik0) arrayList.get(R)).f25119c, true);
                    return;
                }
                return;
            default:
                if (view instanceof pk0) {
                    pk0 pk0Var = (pk0) view;
                    ok0 ok0Var = pk0Var.f27408b;
                    pk0Var.N = false;
                    float f10 = 1.0f;
                    ok0Var.setAlpha(1.0f);
                    if (this.f23710b.N0) {
                        float f11 = pk0Var.I;
                        if (pk0Var.f27414w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        ok0Var.setScaleX(f11 * f7);
                        float f12 = pk0Var.I;
                        if (pk0Var.f27414w) {
                            f10 = 0.76f;
                        }
                        ok0Var.setScaleY(f12 * f10);
                        return;
                    }
                    pk0Var.d();
                    return;
                }
                return;
        }
    }
}
