package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class d7 implements View.OnClickListener {
    public final int f34841a;
    public final ci.d f34842b;
    public final Utilities.Callback f34843c;
    public final org.telegram.ui.ActionBar.f3 d;
    public final org.telegram.ui.ActionBar.e6 f34844e;

    public d7(ci.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f34841a = i10;
        this.f34842b = dVar;
        this.f34843c = callback;
        this.d = f3Var;
        this.f34844e = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34841a) {
            case 0:
                ci.d dVar = this.f34842b;
                dVar.setLoading(true);
                this.f34843c.run(new p3(dVar, this.d, this.f34844e, 1));
                return;
            default:
                ci.d dVar2 = this.f34842b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.f34843c.run(new p3(this.d, this.f34844e, dVar2));
                    return;
                }
                return;
        }
    }
}
