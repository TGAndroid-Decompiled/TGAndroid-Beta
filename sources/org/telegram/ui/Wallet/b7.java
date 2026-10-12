package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class b7 implements View.OnClickListener {
    public final int f32987a;
    public final di.d f32988b;
    public final Utilities.Callback f32989c;
    public final org.telegram.ui.ActionBar.e3 d;
    public final org.telegram.ui.ActionBar.c6 e;

    public b7(di.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.f32987a = i10;
        this.f32988b = dVar;
        this.f32989c = callback;
        this.d = e3Var;
        this.e = c6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32987a) {
            case 0:
                di.d dVar = this.f32988b;
                dVar.setLoading(true);
                this.f32989c.run(new o3(dVar, this.d, this.e, 1));
                return;
            default:
                di.d dVar2 = this.f32988b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.f32989c.run(new o3(this.d, this.e, dVar2));
                    return;
                }
                return;
        }
    }
}
