package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class tt extends Dialog {
    public final kg.q1 f30689a;

    public tt(kg.q1 q1Var, Context context) {
        super(context);
        this.f30689a = q1Var;
    }

    @Override
    public final void dismiss() {
        ut utVar = (ut) this.f30689a.f11251b;
        utVar.f31037a.k(false);
        utVar.f31037a.e();
    }
}
