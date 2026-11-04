package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f27391a;
    public final k f27392b;

    public b(k kVar, int i3) {
        this.f27391a = i3;
        this.f27392b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f27391a) {
            case 0:
                k kVar = this.f27392b;
                if (!kVar.f27728o0 && (runnable = kVar.f27722k0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f27392b;
                if (!kVar2.K && kVar2.f27728o0) {
                    kVar2.l(true);
                    return;
                }
                j jVar = kVar2.f27744v0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
