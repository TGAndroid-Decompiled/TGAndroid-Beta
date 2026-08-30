package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
public final class j60 implements h5.d {
    public final int f35241a;
    public final int f35242b;
    public final Object f35243c;

    public j60(Object obj, int i10, int i11) {
        this.f35241a = i11;
        this.f35243c = obj;
        this.f35242b = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        switch (this.f35241a) {
            case 0:
                m60.e1((m60) this.f35243c, this.f35242b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                ph.r3 r3Var = (ph.r3) this.f35243c;
                View view = (View) obj;
                ph.m3 m3Var = r3Var.f42240b;
                if (view instanceof ph.q3) {
                    m3Var.getClass();
                    int R = RecyclerView.R(view);
                    org.telegram.ui.Components.i51 G = m3Var.V2.G(R);
                    if (G != null) {
                        ph.q3 q3Var = (ph.q3) view;
                        q3Var.setPosition(r3Var.b(R));
                        if (this.f35242b == G.d) {
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
