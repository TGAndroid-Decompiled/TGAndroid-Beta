package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class c7 implements View.OnClickListener {
    public final int f32763a;
    public final di.d f32764b;
    public final Utilities.Callback f32765c;
    public final org.telegram.ui.ActionBar.e3 d;
    public final org.telegram.ui.ActionBar.c6 e;

    public c7(di.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.f32763a = i10;
        this.f32764b = dVar;
        this.f32765c = callback;
        this.d = e3Var;
        this.e = c6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32763a) {
            case 0:
                di.d dVar = this.f32764b;
                dVar.setLoading(true);
                this.f32765c.run(new p3(dVar, this.d, this.e, 1));
                return;
            default:
                di.d dVar2 = this.f32764b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.f32765c.run(new p3(this.d, this.e, dVar2));
                    return;
                }
                return;
        }
    }
}
