package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class xh0 implements org.telegram.messenger.z10 {
    public final int f41693a;
    public final mi0 f41694b;

    public xh0(mi0 mi0Var, int i7) {
        this.f41693a = i7;
        this.f41694b = mi0Var;
    }

    @Override
    public final void a(Object obj) {
        float f10;
        View view = (View) obj;
        switch (this.f41693a) {
            case 0:
                mi0 mi0Var = this.f41694b;
                ArrayList arrayList = mi0Var.d;
                mi0Var.f37258b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof ki0)) {
                    ((ki0) view).f(((di0) arrayList.get(R)).f33942c, true);
                    return;
                }
                return;
            default:
                if (view instanceof ki0) {
                    ki0 ki0Var = (ki0) view;
                    ji0 ji0Var = ki0Var.f36513b;
                    ki0Var.O = false;
                    float f11 = 1.0f;
                    ji0Var.setAlpha(1.0f);
                    if (this.f41694b.O0) {
                        float f12 = ki0Var.J;
                        if (ki0Var.f36521x) {
                            f10 = 0.76f;
                        } else {
                            f10 = 1.0f;
                        }
                        ji0Var.setScaleX(f12 * f10);
                        float f13 = ki0Var.J;
                        if (ki0Var.f36521x) {
                            f11 = 0.76f;
                        }
                        ji0Var.setScaleY(f13 * f11);
                        return;
                    }
                    ki0Var.d();
                    return;
                }
                return;
        }
    }
}
