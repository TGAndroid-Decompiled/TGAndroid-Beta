package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class pk0 implements Utilities.Callback {
    public final int f29330a;
    public final dl0 f29331b;

    public pk0(dl0 dl0Var, int i10) {
        this.f29330a = i10;
        this.f29331b = dl0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f29330a) {
            case 0:
                dl0 dl0Var = this.f29331b;
                ArrayList arrayList = dl0Var.d;
                dl0Var.f25529b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof bl0)) {
                    ((bl0) view).f(((uk0) arrayList.get(R)).f30960c, true);
                    return;
                }
                return;
            default:
                if (view instanceof bl0) {
                    bl0 bl0Var = (bl0) view;
                    al0 al0Var = bl0Var.f24980b;
                    bl0Var.N = false;
                    float f10 = 1.0f;
                    al0Var.setAlpha(1.0f);
                    if (this.f29331b.N0) {
                        float f11 = bl0Var.I;
                        if (bl0Var.f24986w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        al0Var.setScaleX(f11 * f7);
                        float f12 = bl0Var.I;
                        if (bl0Var.f24986w) {
                            f10 = 0.76f;
                        }
                        al0Var.setScaleY(f12 * f10);
                        return;
                    }
                    bl0Var.d();
                    return;
                }
                return;
        }
    }
}
