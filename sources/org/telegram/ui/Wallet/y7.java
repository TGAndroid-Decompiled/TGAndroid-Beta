package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class y7 implements View.OnClickListener {
    public final int f35148a;
    public final ei.d f35149b;
    public final Utilities.Callback f35150c;
    public final org.telegram.ui.ActionBar.f3 d;
    public final org.telegram.ui.ActionBar.d6 e;

    public y7(ei.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f35148a = i10;
        this.f35149b = dVar;
        this.f35150c = callback;
        this.d = f3Var;
        this.e = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35148a) {
            case 0:
                ei.d dVar = this.f35149b;
                dVar.setLoading(true);
                this.f35150c.run(new u3(dVar, this.d, this.e, 1));
                return;
            default:
                ei.d dVar2 = this.f35149b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.f35150c.run(new u3(this.d, this.e, dVar2));
                    return;
                }
                return;
        }
    }
}
