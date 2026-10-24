package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class y7 implements View.OnClickListener {
    public final int f35459a;
    public final ei.d f35460b;
    public final Utilities.Callback f35461c;
    public final org.telegram.ui.ActionBar.h3 d;
    public final org.telegram.ui.ActionBar.g6 e;

    public y7(ei.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f35459a = i10;
        this.f35460b = dVar;
        this.f35461c = callback;
        this.d = h3Var;
        this.e = g6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35459a) {
            case 0:
                ei.d dVar = this.f35460b;
                dVar.setLoading(true);
                this.f35461c.run(new t3(dVar, this.d, this.e, 1));
                return;
            default:
                ei.d dVar2 = this.f35460b;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    this.f35461c.run(new t3(this.d, this.e, dVar2));
                    return;
                }
                return;
        }
    }
}
