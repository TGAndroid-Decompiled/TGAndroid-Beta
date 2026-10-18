package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class y7 implements View.OnClickListener {
    public final int f35143a;
    public final ei.d f35144b;
    public final Utilities.Callback f35145c;
    public final org.telegram.ui.ActionBar.f3 d;
    public final org.telegram.ui.ActionBar.d6 e;

    public y7(ei.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f35143a = i10;
        this.f35144b = dVar;
        this.f35145c = callback;
        this.d = f3Var;
        this.e = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35143a) {
            case 0:
                ei.d dVar = this.f35144b;
                dVar.setLoading(true);
                this.f35145c.run(new t3(dVar, this.d, this.e, 1));
                return;
            default:
                ei.d dVar2 = this.f35144b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.f35145c.run(new t3(this.d, this.e, dVar2));
                    return;
                }
                return;
        }
    }
}
