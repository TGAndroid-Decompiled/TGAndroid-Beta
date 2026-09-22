package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class gu extends Dialog {
    public final ai.y3 f24459a;

    public gu(ai.y3 y3Var, Context context) {
        super(context);
        this.f24459a = y3Var;
    }

    @Override
    public final void dismiss() {
        hu huVar = (hu) this.f24459a.f1746b;
        huVar.f24808a.k(false);
        huVar.f24808a.e();
    }
}
