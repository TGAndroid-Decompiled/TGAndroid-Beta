package org.telegram.ui.ActionBar;

import android.view.View;

public final class b implements View.OnClickListener {

    public final int f22736a;

    public final k f22737b;

    public b(k kVar, int i10) {
        this.f22736a = i10;
        this.f22737b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f22736a) {
            case 0:
                k kVar = this.f22737b;
                if (!kVar.f23578j0 && (runnable = kVar.f23570f0) != null) {
                    runnable.run();
                }
                break;
            default:
                k kVar2 = this.f22737b;
                if (!kVar2.F && kVar2.f23578j0) {
                    kVar2.h(true);
                } else {
                    j jVar = kVar2.f23590q0;
                    if (jVar != null) {
                        jVar.b(-1);
                    }
                }
                break;
        }
    }
}
