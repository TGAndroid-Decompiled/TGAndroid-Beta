package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class b8 implements View.OnClickListener {
    public final int f34051a;
    public final ei.d f34052b;
    public final Utilities.Callback f34053c;
    public final org.telegram.ui.ActionBar.f3 d;
    public final org.telegram.ui.ActionBar.d6 e;

    public b8(ei.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f34051a = i10;
        this.f34052b = dVar;
        this.f34053c = callback;
        this.d = f3Var;
        this.e = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34051a) {
            case 0:
                ei.d dVar = this.f34052b;
                dVar.setLoading(true);
                this.f34053c.run(new q3(dVar, this.d, this.e, 1));
                return;
            default:
                ei.d dVar2 = this.f34052b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.f34053c.run(new q3(this.d, this.e, dVar2));
                    return;
                }
                return;
        }
    }
}
