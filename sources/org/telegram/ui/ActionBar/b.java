package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f27330a;
    public final k f27331b;

    public b(k kVar, int i7) {
        this.f27330a = i7;
        this.f27331b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f27330a) {
            case 0:
                k kVar = this.f27331b;
                if (!kVar.f27676n0 && (runnable = kVar.f27669j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f27331b;
                if (!kVar2.J && kVar2.f27676n0) {
                    kVar2.l(true);
                    return;
                }
                j jVar = kVar2.f27691u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
