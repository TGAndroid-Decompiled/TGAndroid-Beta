package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f22423a;
    public final k f22424b;

    public b(k kVar, int i10) {
        this.f22423a = i10;
        this.f22424b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f22423a) {
            case 0:
                k kVar = this.f22424b;
                if (!kVar.f22774n0 && (runnable = kVar.f22767j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f22424b;
                if (!kVar2.J && kVar2.f22774n0) {
                    kVar2.g(true);
                    return;
                }
                j jVar = kVar2.f22790u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
