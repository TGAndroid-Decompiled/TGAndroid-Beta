package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class e7 implements View.OnClickListener {
    public final int f34905a;
    public final ci.d f34906b;
    public final Utilities.Callback f34907c;
    public final org.telegram.ui.ActionBar.e3 d;
    public final org.telegram.ui.ActionBar.d6 f34908e;

    public e7(ci.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f34905a = i10;
        this.f34906b = dVar;
        this.f34907c = callback;
        this.d = e3Var;
        this.f34908e = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34905a) {
            case 0:
                ci.d dVar = this.f34906b;
                dVar.setLoading(true);
                this.f34907c.run(new q3(dVar, this.d, this.f34908e, 1));
                return;
            default:
                ci.d dVar2 = this.f34906b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.f34907c.run(new q3(this.d, this.f34908e, dVar2));
                    return;
                }
                return;
        }
    }
}
