package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
public final class l60 implements h5.d {
    public final int f35652a;
    public final int f35653b;
    public final Object f35654c;

    public l60(Object obj, int i10, int i11) {
        this.f35652a = i11;
        this.f35654c = obj;
        this.f35653b = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        switch (this.f35652a) {
            case 0:
                o60.e1((o60) this.f35654c, this.f35653b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                ph.r3 r3Var = (ph.r3) this.f35654c;
                View view = (View) obj;
                ph.m3 m3Var = r3Var.f42276b;
                if (view instanceof ph.q3) {
                    m3Var.getClass();
                    int R = RecyclerView.R(view);
                    org.telegram.ui.Components.i51 G = m3Var.V2.G(R);
                    if (G != null) {
                        ph.q3 q3Var = (ph.q3) view;
                        q3Var.setPosition(r3Var.b(R));
                        if (this.f35653b == G.d) {
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
