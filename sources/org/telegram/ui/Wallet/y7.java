package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class y7 implements View.OnClickListener {
    public final int f35154a;
    public final ei.d f35155b;
    public final Utilities.Callback f35156c;
    public final org.telegram.ui.ActionBar.f3 d;
    public final org.telegram.ui.ActionBar.d6 e;

    public y7(ei.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f35154a = i10;
        this.f35155b = dVar;
        this.f35156c = callback;
        this.d = f3Var;
        this.e = d6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35154a) {
            case 0:
                ei.d dVar = this.f35155b;
                dVar.setLoading(true);
                this.f35156c.run(new u3(dVar, this.d, this.e, 1));
                return;
            default:
                ei.d dVar2 = this.f35155b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.f35156c.run(new u3(this.d, this.e, dVar2));
                    return;
                }
                return;
        }
    }
}
