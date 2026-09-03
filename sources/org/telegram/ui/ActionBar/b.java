package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f19493a;
    public final k f19494b;

    public b(k kVar, int i10) {
        this.f19493a = i10;
        this.f19494b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f19493a) {
            case 0:
                k kVar = this.f19494b;
                if (!kVar.f20305k0 && (runnable = kVar.f20297g0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f19494b;
                if (!kVar2.G && kVar2.f20305k0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f20318r0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
