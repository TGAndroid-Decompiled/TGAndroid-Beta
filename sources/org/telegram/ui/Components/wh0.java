package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class wh0 implements org.telegram.messenger.u10 {
    public final int f40009a;
    public final li0 f40010b;

    public wh0(li0 li0Var, int i3) {
        this.f40009a = i3;
        this.f40010b = li0Var;
    }

    @Override
    public final void a(Object obj) {
        float f10;
        View view = (View) obj;
        switch (this.f40009a) {
            case 0:
                li0 li0Var = this.f40010b;
                ArrayList arrayList = li0Var.d;
                li0Var.f35736b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof ji0)) {
                    ((ji0) view).f(((ci0) arrayList.get(R)).f32756c, true);
                    return;
                }
                return;
            default:
                if (view instanceof ji0) {
                    ji0 ji0Var = (ji0) view;
                    ii0 ii0Var = ji0Var.f35078b;
                    ji0Var.O = false;
                    float f11 = 1.0f;
                    ii0Var.setAlpha(1.0f);
                    if (this.f40010b.O0) {
                        float f12 = ji0Var.J;
                        if (ji0Var.f35086x) {
                            f10 = 0.76f;
                        } else {
                            f10 = 1.0f;
                        }
                        ii0Var.setScaleX(f12 * f10);
                        float f13 = ji0Var.J;
                        if (ji0Var.f35086x) {
                            f11 = 0.76f;
                        }
                        ii0Var.setScaleY(f13 * f11);
                        return;
                    }
                    ji0Var.d();
                    return;
                }
                return;
        }
    }
}
