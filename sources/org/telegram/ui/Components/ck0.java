package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ck0 implements Utilities.Callback {
    public final int f23351a;
    public final qk0 f23352b;

    public ck0(qk0 qk0Var, int i10) {
        this.f23351a = i10;
        this.f23352b = qk0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f23351a) {
            case 0:
                qk0 qk0Var = this.f23352b;
                ArrayList arrayList = qk0Var.d;
                qk0Var.f27656b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof ok0)) {
                    ((ok0) view).f(((hk0) arrayList.get(R)).f24797c, true);
                    return;
                }
                return;
            default:
                if (view instanceof ok0) {
                    ok0 ok0Var = (ok0) view;
                    nk0 nk0Var = ok0Var.f27104b;
                    ok0Var.N = false;
                    float f10 = 1.0f;
                    nk0Var.setAlpha(1.0f);
                    if (this.f23352b.N0) {
                        float f11 = ok0Var.I;
                        if (ok0Var.f27110w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        nk0Var.setScaleX(f11 * f7);
                        float f12 = ok0Var.I;
                        if (ok0Var.f27110w) {
                            f10 = 0.76f;
                        }
                        nk0Var.setScaleY(f12 * f10);
                        return;
                    }
                    ok0Var.d();
                    return;
                }
                return;
        }
    }
}
