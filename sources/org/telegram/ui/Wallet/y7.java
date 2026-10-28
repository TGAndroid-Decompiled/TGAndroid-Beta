package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class y7 implements View.OnClickListener {
    public final int f37548a;
    public final fi.d f37549b;
    public final Utilities.Callback f37550c;
    public final org.telegram.ui.ActionBar.k3 d;
    public final org.telegram.ui.ActionBar.u6 e;

    public y7(fi.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        this.f37548a = i10;
        this.f37549b = dVar;
        this.f37550c = callback;
        this.d = k3Var;
        this.e = u6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37548a) {
            case 0:
                fi.d dVar = this.f37549b;
                dVar.setLoading(true);
                this.f37550c.run(new t3(dVar, this.d, this.e, 1));
                return;
            default:
                fi.d dVar2 = this.f37549b;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    this.f37550c.run(new t3(this.d, this.e, dVar2));
                    return;
                }
                return;
        }
    }
}
