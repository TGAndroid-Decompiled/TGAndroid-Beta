package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
public final class k60 implements h5.d {
    public final int f38194a;
    public final int f38195b;
    public final Object f38196c;

    public k60(Object obj, int i10, int i11) {
        this.f38194a = i11;
        this.f38196c = obj;
        this.f38195b = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        switch (this.f38194a) {
            case 0:
                n60.e1((n60) this.f38196c, this.f38195b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                qh.q3 q3Var = (qh.q3) this.f38196c;
                View view = (View) obj;
                qh.l3 l3Var = q3Var.f45914b;
                if (view instanceof qh.p3) {
                    l3Var.getClass();
                    int R = RecyclerView.R(view);
                    org.telegram.ui.Components.h51 G = l3Var.V2.G(R);
                    if (G != null) {
                        qh.p3 p3Var = (qh.p3) view;
                        p3Var.setPosition(q3Var.b(R));
                        if (this.f38195b == G.d) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        p3Var.b(z4, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
