package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ht implements Runnable {
    public final int f26905a;
    public final jt f26906b;

    public ht(jt jtVar, int i10) {
        this.f26905a = i10;
        this.f26906b = jtVar;
    }

    @Override
    public final void run() {
        switch (this.f26905a) {
            case 0:
                jt jtVar = this.f26906b;
                jtVar.f27642c = false;
                jtVar.f27641b.run();
                ArrayList arrayList = jtVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - jtVar.f27644f > 3600000) {
                    arrayList.clear();
                    jtVar.f27643e = false;
                    jtVar.f27645g = null;
                    jtVar.a();
                    return;
                }
                return;
            default:
                this.f26906b.f27646i = false;
                return;
        }
    }
}
