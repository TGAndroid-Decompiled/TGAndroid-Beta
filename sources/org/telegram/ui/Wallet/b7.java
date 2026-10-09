package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class b7 implements View.OnClickListener {
    public final int f34681a;
    public final ci.d f34682b;
    public final Utilities.Callback f34683c;
    public final org.telegram.ui.ActionBar.f3 d;
    public final org.telegram.ui.ActionBar.e6 f34684e;

    public b7(ci.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f34681a = i10;
        this.f34682b = dVar;
        this.f34683c = callback;
        this.d = f3Var;
        this.f34684e = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34681a) {
            case 0:
                ci.d dVar = this.f34682b;
                dVar.setLoading(true);
                this.f34683c.run(new n3(dVar, this.d, this.f34684e, 1));
                return;
            default:
                ci.d dVar2 = this.f34682b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.f34683c.run(new n3(this.d, this.f34684e, dVar2));
                    return;
                }
                return;
        }
    }
}
