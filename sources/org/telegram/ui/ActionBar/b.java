package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f22421a;
    public final k f22422b;

    public b(k kVar, int i10) {
        this.f22421a = i10;
        this.f22422b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f22421a) {
            case 0:
                k kVar = this.f22422b;
                if (!kVar.f22772n0 && (runnable = kVar.f22765j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f22422b;
                if (!kVar2.J && kVar2.f22772n0) {
                    kVar2.g(true);
                    return;
                }
                j jVar = kVar2.f22788u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
