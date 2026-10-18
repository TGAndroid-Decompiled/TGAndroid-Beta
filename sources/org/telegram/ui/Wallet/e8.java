package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class e8 implements View.OnClickListener {
    public final int f34206a;
    public final ei.d f34207b;
    public final Utilities.Callback f34208c;
    public final org.telegram.ui.ActionBar.f3 d;
    public final org.telegram.ui.ActionBar.d6 e;

    public e8(ei.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f34206a = i10;
        this.f34207b = dVar;
        this.f34208c = callback;
        this.d = f3Var;
        this.e = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34206a) {
            case 0:
                ei.d dVar = this.f34207b;
                dVar.setLoading(true);
                this.f34208c.run(new r3(dVar, this.d, this.e, 1));
                return;
            default:
                ei.d dVar2 = this.f34207b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.f34208c.run(new r3(this.d, this.e, dVar2));
                    return;
                }
                return;
        }
    }
}
