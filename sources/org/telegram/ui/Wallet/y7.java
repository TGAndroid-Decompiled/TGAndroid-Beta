package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class y7 implements View.OnClickListener {
    public final int f37524a;
    public final fi.d f37525b;
    public final Utilities.Callback f37526c;
    public final org.telegram.ui.ActionBar.k3 d;
    public final org.telegram.ui.ActionBar.u6 e;

    public y7(fi.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        this.f37524a = i10;
        this.f37525b = dVar;
        this.f37526c = callback;
        this.d = k3Var;
        this.e = u6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37524a) {
            case 0:
                fi.d dVar = this.f37525b;
                dVar.setLoading(true);
                this.f37526c.run(new t3(dVar, this.d, this.e, 1));
                return;
            default:
                fi.d dVar2 = this.f37525b;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    this.f37526c.run(new t3(this.d, this.e, dVar2));
                    return;
                }
                return;
        }
    }
}
