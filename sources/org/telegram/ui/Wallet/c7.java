package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class c7 implements View.OnClickListener {
    public final int f34752a;
    public final ci.d f34753b;
    public final Utilities.Callback f34754c;
    public final org.telegram.ui.ActionBar.f3 d;
    public final org.telegram.ui.ActionBar.e6 f34755e;

    public c7(ci.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f34752a = i10;
        this.f34753b = dVar;
        this.f34754c = callback;
        this.d = f3Var;
        this.f34755e = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34752a) {
            case 0:
                ci.d dVar = this.f34753b;
                dVar.setLoading(true);
                this.f34754c.run(new o3(dVar, this.d, this.f34755e, 1));
                return;
            default:
                ci.d dVar2 = this.f34753b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.f34754c.run(new o3(this.d, this.f34755e, dVar2));
                    return;
                }
                return;
        }
    }
}
