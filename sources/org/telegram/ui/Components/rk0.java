package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class rk0 implements Utilities.Callback {
    public final int f32262a;
    public final fl0 f32263b;

    public rk0(fl0 fl0Var, int i10) {
        this.f32262a = i10;
        this.f32263b = fl0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f32262a) {
            case 0:
                fl0 fl0Var = this.f32263b;
                ArrayList arrayList = fl0Var.d;
                fl0Var.f28231b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof dl0)) {
                    ((dl0) view).f(((wk0) arrayList.get(R)).f34474c, true);
                    return;
                }
                return;
            default:
                if (view instanceof dl0) {
                    dl0 dl0Var = (dl0) view;
                    cl0 cl0Var = dl0Var.f27551b;
                    dl0Var.N = false;
                    float f10 = 1.0f;
                    cl0Var.setAlpha(1.0f);
                    if (this.f32263b.N0) {
                        float f11 = dl0Var.I;
                        if (dl0Var.f27557w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        cl0Var.setScaleX(f11 * f7);
                        float f12 = dl0Var.I;
                        if (dl0Var.f27557w) {
                            f10 = 0.76f;
                        }
                        cl0Var.setScaleY(f12 * f10);
                        return;
                    }
                    dl0Var.d();
                    return;
                }
                return;
        }
    }
}
