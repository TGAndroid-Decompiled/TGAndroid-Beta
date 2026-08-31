package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
public final class k60 implements h5.d {
    public final int f38285a;
    public final int f38286b;
    public final Object f38287c;

    public k60(Object obj, int i10, int i11) {
        this.f38285a = i11;
        this.f38287c = obj;
        this.f38286b = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        switch (this.f38285a) {
            case 0:
                n60.e1((n60) this.f38287c, this.f38286b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                qh.r3 r3Var = (qh.r3) this.f38287c;
                View view = (View) obj;
                qh.m3 m3Var = r3Var.f45935b;
                if (view instanceof qh.q3) {
                    m3Var.getClass();
                    int R = RecyclerView.R(view);
                    org.telegram.ui.Components.j51 G = m3Var.V2.G(R);
                    if (G != null) {
                        qh.q3 q3Var = (qh.q3) view;
                        q3Var.setPosition(r3Var.b(R));
                        if (this.f38286b == G.d) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        q3Var.b(z4, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
