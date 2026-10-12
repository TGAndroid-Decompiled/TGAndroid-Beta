package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class zk0 implements Utilities.Callback {
    public final int f33398a;
    public final nl0 f33399b;

    public zk0(nl0 nl0Var, int i10) {
        this.f33398a = i10;
        this.f33399b = nl0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f33398a) {
            case 0:
                nl0 nl0Var = this.f33399b;
                ArrayList arrayList = nl0Var.d;
                nl0Var.f28827b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof ll0)) {
                    ((ll0) view).f(((el0) arrayList.get(R)).f25727c, true);
                    return;
                }
                return;
            default:
                if (view instanceof ll0) {
                    ll0 ll0Var = (ll0) view;
                    kl0 kl0Var = ll0Var.f28219b;
                    ll0Var.N = false;
                    float f10 = 1.0f;
                    kl0Var.setAlpha(1.0f);
                    if (this.f33399b.N0) {
                        float f11 = ll0Var.I;
                        if (ll0Var.f28226w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        kl0Var.setScaleX(f11 * f7);
                        float f12 = ll0Var.I;
                        if (ll0Var.f28226w) {
                            f10 = 0.76f;
                        }
                        kl0Var.setScaleY(f12 * f10);
                        return;
                    }
                    ll0Var.d();
                    return;
                }
                return;
        }
    }
}
