package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ok0 implements Utilities.Callback {
    public final int f28996a;
    public final cl0 f28997b;

    public ok0(cl0 cl0Var, int i10) {
        this.f28996a = i10;
        this.f28997b = cl0Var;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        View view = (View) obj;
        switch (this.f28996a) {
            case 0:
                cl0 cl0Var = this.f28997b;
                ArrayList arrayList = cl0Var.d;
                cl0Var.f25267b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof al0)) {
                    ((al0) view).f(((tk0) arrayList.get(R)).f30659c, true);
                    return;
                }
                return;
            default:
                if (view instanceof al0) {
                    al0 al0Var = (al0) view;
                    zk0 zk0Var = al0Var.f24657b;
                    al0Var.N = false;
                    float f10 = 1.0f;
                    zk0Var.setAlpha(1.0f);
                    if (this.f28997b.N0) {
                        float f11 = al0Var.I;
                        if (al0Var.f24663w) {
                            f7 = 0.76f;
                        } else {
                            f7 = 1.0f;
                        }
                        zk0Var.setScaleX(f11 * f7);
                        float f12 = al0Var.I;
                        if (al0Var.f24663w) {
                            f10 = 0.76f;
                        }
                        zk0Var.setScaleY(f12 * f10);
                        return;
                    }
                    al0Var.d();
                    return;
                }
                return;
        }
    }
}
