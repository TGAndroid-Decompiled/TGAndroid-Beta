package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class e7 implements View.OnClickListener {
    public final int f34871a;
    public final ci.d f34872b;
    public final Utilities.Callback f34873c;
    public final org.telegram.ui.ActionBar.e3 d;
    public final org.telegram.ui.ActionBar.d6 f34874e;

    public e7(ci.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f34871a = i10;
        this.f34872b = dVar;
        this.f34873c = callback;
        this.d = e3Var;
        this.f34874e = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34871a) {
            case 0:
                ci.d dVar = this.f34872b;
                dVar.setLoading(true);
                this.f34873c.run(new q3(dVar, this.d, this.f34874e, 1));
                return;
            default:
                ci.d dVar2 = this.f34872b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.f34873c.run(new q3(this.d, this.f34874e, dVar2));
                    return;
                }
                return;
        }
    }
}
