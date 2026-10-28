package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f22424a;
    public final k f22425b;

    public b(k kVar, int i10) {
        this.f22424a = i10;
        this.f22425b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f22424a) {
            case 0:
                k kVar = this.f22425b;
                if (!kVar.f22775n0 && (runnable = kVar.f22768j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f22425b;
                if (!kVar2.J && kVar2.f22775n0) {
                    kVar2.g(true);
                    return;
                }
                j jVar = kVar2.f22791u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
