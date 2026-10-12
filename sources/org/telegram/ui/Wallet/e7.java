package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class e7 implements View.OnClickListener {
    public final int f34682a;
    public final ci.d f34683b;
    public final Utilities.Callback f34684c;
    public final org.telegram.ui.ActionBar.e3 d;
    public final org.telegram.ui.ActionBar.c6 f34685e;

    public e7(ci.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.f34682a = i10;
        this.f34683b = dVar;
        this.f34684c = callback;
        this.d = e3Var;
        this.f34685e = c6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34682a) {
            case 0:
                ci.d dVar = this.f34683b;
                dVar.setLoading(true);
                this.f34684c.run(new q3(dVar, this.d, this.f34685e, 1));
                return;
            default:
                ci.d dVar2 = this.f34683b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.f34684c.run(new q3(this.d, this.f34685e, dVar2));
                    return;
                }
                return;
        }
    }
}
